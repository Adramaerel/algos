  /**
 * 
 */
package com.ann;

import java.util.List;

import com.ann.layer.HiddenLayer;
import com.ann.layer.InputLayer;
import com.ann.layer.OutputLayer;

/**
 * @author Sophie
 *
 */
public class NeuralNet {

	
	private InputLayer inputLayer;
	
	private HiddenLayer hiddenLayer;
	
	private	List<HiddenLayer> listOfHiddenLayer;
	
	private OutputLayer outputLayer;
	
	/**
	 * Integer number to store the quantity of layers that are part of the hidden layer.
	 */
	private int	numberOfHiddenLayers;
	
	/**
	 * Initializes the neural net as a whole. Layers are built, 
	 * and each list of the weights of neurons is built randomly.
	 */
	public void initNet() {
		
	}
	
	/**
	 * Prints the neural net as a whole. Each input and output weight of each layer is shown.
	 */
	public void printNet() {
		
	}
}
