/**
 * 
 */
package com.ann;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.ann.layer.Layer;

/**
 * @author Sophie
 *
 */
public class Neuron {
	
	
	private List<Double> listOfWeightIn;
	
	private List<Double> listOfWeightOut;
	
	/**
	 * The layer in which the neuron belongs.
	 */
	private Layer layer;
	
	/**
	 * 
	 */
	public Neuron() {
		listOfWeightIn = new ArrayList<>();
		listOfWeightOut = new ArrayList<>();
	}
	
	/**
	 * initiate listOfWeightIn and listOfWeightOut 
	 * to a random decimal number list between 1 and 5
	 * @return a decimal random number between 0 and 1
	 */
	public Double initNeuron() {		
		return Math.random();
		
	}

	/**
	 * Accesseur en lecture de listOfWeightIn.
	 * @return the listOfWeightIn
	 */
	public List<Double> getListOfWeightIn() {
		return listOfWeightIn;
	}

	/**
	 * Accesseur en ecriture de listOfWeightIn
	 * @param listOfWeightIn the listOfWeightIn to set
	 */
	public void setListOfWeightIn(List<Double> listOfWeightIn) {
		this.listOfWeightIn = listOfWeightIn;
	}

	/**
	 * Accesseur en lecture de listOfWeightOut.
	 * @return the listOfWeightOut
	 */
	public List<Double> getListOfWeightOut() {
		return listOfWeightOut;
	}

	/**
	 * Accesseur en ecriture de listOfWeightOut
	 * @param listOfWeightOut the listOfWeightOut to set
	 */
	public void setListOfWeightOut(List<Double> listOfWeightOut) {
		this.listOfWeightOut = listOfWeightOut;
	}

	/**
	 * Accesseur en lecture de layer.
	 * @return the layer
	 */
	public Layer getLayer() {
		return layer;
	}

	/**
	 * Accesseur en ecriture de layer
	 * @param layer the layer to set
	 */
	public void setLayer(Layer layer) {
		this.layer = layer;
	}

}
