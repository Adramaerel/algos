/**
 * 
 */
package com.ann.layer;

import java.util.List;

import com.ann.Neuron;

/**
 * @author Sophie
 *
 */
public abstract class Layer {
	
	/**
	 * list of neurons belonging to the layer.
	 */
	private List<Neuron> listOfNeurons;
	
	private int numberOfNeuronsInLayer;
	
	/**
	 * Accesseur en lecture de listOfNeurons.
	 * @return the listOfNeurons
	 */
	public List<Neuron> getListOfNeurons() {
		return listOfNeurons;
	}

	/**
	 * Accesseur en ecriture de listOfNeurons
	 * @param listOfNeurons the listOfNeurons to set
	 */
	public void setListOfNeurons(List<Neuron> listOfNeurons) {
		this.listOfNeurons = listOfNeurons;
	}

	/**
	 * Accesseur en lecture de numberOfNeuronsInLayer.
	 * @return the numberOfNeuronsInLayer
	 */
	public int getNumberOfNeuronsInLayer() {
		return numberOfNeuronsInLayer;
	}

	/**
	 * Accesseur en ecriture de numberOfNeuronsInLayer
	 * @param numberOfNeuronsInLayer the numberOfNeuronsInLayer to set
	 */
	public void setNumberOfNeuronsInLayer(final int numberOfNeuronsInLayer) {
		this.numberOfNeuronsInLayer = numberOfNeuronsInLayer;
	}


}
