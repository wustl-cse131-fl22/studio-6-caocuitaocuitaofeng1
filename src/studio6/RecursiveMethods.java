package studio6;
import java.util.Arrays;
import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		
			// FIXME compute the geometric sum for the first n terms recursively
		if(n==0) {
			return 0;
		}
		else {
			return Math.pow(0.5, n) + geometricSum(n-1);
		}
			
		
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		
			// FIXME compute the gcd of p and q using recursion
		if(p%q==0) {
			return q;
		}
		else {
			return gcd (q, p%q);
		}
			
		
	}

	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 * 
	 */
	public static int[] helpReversed(int[] array, int n, int[]newArray) {
		if(array.length==0||array.length==1) {
			newArray = array;
		}
		 if (n==-1) {
			 return newArray;
		 }		 
		 else {
		 newArray[n]=array[array.length-n-1];
		 newArray[array.length-n-1]=array[n]; 
		 return helpReversed(array, n-1, newArray);
		 }	 
		 		 
	}
	
	public static int[] toReversed(int[] array) {
		
			// FIXME create a helper method that can recursively reverse the given array
		int [] newArray = new int [array.length];
		if(array.length==0) {
			return newArray;
		}
		if(array.length==1) {
			newArray[0] = array[0];		
		}
		else {		
		newArray = helpReversed(array, array.length/2, newArray);
		
		}
		return newArray;
	}

	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		
		// FIXME
		if ()
	}
	public static void main(String[] args) {
	    int[] test = {1};
	    System.out.println(Arrays.toString(toReversed(test)));
	    //System.out.println(Arrays.toString(toReversed(copyOfXs)));
	}

}
