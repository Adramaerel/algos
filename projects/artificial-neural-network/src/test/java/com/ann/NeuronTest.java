/**
 * 
 */
package com.ann;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * @author Sophie
 *
 */
public class NeuronTest extends TestCase {
	
	/**
	 * Some test cases are checked on a large set of inputs. 
	 */
	private static final Integer numberOfTestCases = 100;
	
	public void testInitNeuronCheckReturnNumber() {
		for (int i = 0; i < numberOfTestCases; i++) {
			Neuron neuron = new Neuron();
			Assert.assertTrue("verifies the return value of "
					+ "the method i between 0 and 1", 
					neuron.initNeuron() >= 0 && neuron.initNeuron() <= 1);
			
		}
	}
	
	public void testInitNeuronChecksListOfWeightIn() {
		for(int i = 0; i < numberOfTestCases; i++) {
			Neuron neuron = new Neuron();
			neuron.initNeuron();
			Assert.assertTrue("size of ListOfWeightIn is between 1 and 5 size = " + 
			neuron.getListOfWeightIn().size(), neuron.getListOfWeightIn().size() <= 5 && neuron.getListOfWeightIn().size() >= 1);
		}
	}
	
	public void testInitNeuronChecksListOfWeightOut() {
		for(int i = 0; i < numberOfTestCases; i++) {
			Neuron neuron = new Neuron();
			neuron.initNeuron();
			Assert.assertTrue("size of ListOfWeightOut is between 1 and 5 size = " + 
			neuron.getListOfWeightOut().size(), neuron.getListOfWeightOut().size() <= 5 && neuron.getListOfWeightOut().size() >= 1);
		}
	}

}
