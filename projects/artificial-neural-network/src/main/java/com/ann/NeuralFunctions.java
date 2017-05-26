/**
 * 
 */
package com.ann;

import java.util.function.Function;

/**
 * @author Sophie
 *
 */
public class NeuralFunctions {

	Function<Double, Double> sigmod = 
			(Double x) -> (Double)(1/(1 + Math.pow(Math.E, -x)));

	Function<Double, Double> hyperbolicTangeant = 
			(Double x) -> (1 - Math.pow(Math.E, -x))/(1 + Math.pow(Math.E, -x));
			
	Function<Double, Double> hardLimitingThresold =
			(Double x) -> x < 0. ? 0. : 1.;
			
	Function<Double, Double> linear =
			(Double x) -> x;

}
