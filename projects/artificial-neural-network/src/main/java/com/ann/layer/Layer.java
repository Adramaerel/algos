/**
 * 
 */
package com.ann.layer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

	public void initLayer(Layer layer) {

		setListOfNeurons(layer.getListOfNeurons());
		setNumberOfNeuronsInLayer(layer.getNumberOfNeuronsInLayer());
	}
	
	public void initLayer() {
		
		initLayer((new Random()).nextInt(4) + 1);
		
	}
	
	public void initLayer(int numberOfNeurons) {
		
		listOfNeurons = new ArrayList<>();
		
		for(int i = 0; i < numberOfNeurons; i++) {
			listOfNeurons.add(new Neuron());
		}
	}

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
