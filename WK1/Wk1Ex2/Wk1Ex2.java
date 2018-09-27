import java.util.Arrays;
import java.util.Collections;

class Wk1Ex2 {
    public static void main(String[] args) {
        int[] aryNums = new int[6];
        aryNums[0] = 23;
        aryNums[1] = 6;
        aryNums[2] = 47;
        aryNums[3] = 35;
        aryNums[4] = 2;
        aryNums[5] = 14;

        int i;
        Integer[] integerArray = new Integer[aryNums.length];

		//Instantiates the values of integerArray by looping through aryNums and adds the values
        for(i = 0; i < aryNums.length; i++) {
        	integerArray[i] = new Integer(aryNums[i]);
        }

		Display the arrays in reverse order
        for(i = 0; i < aryNums.length; i++) {
        	System.out.println("Num: " + integerArray[i]);
        }

        //Exercise G
        int totalValue = 0;
        for(i = 0; i < aryNums.length; i++) {
        	totalValue += aryNums[i];
        }
        System.out.println("Exercise G: " + totalValue);
         System.out.println();

        //Exercise H
        //Sort the array by reversing the values from high to low
        Arrays.sort(integerArray, Collections.reverseOrder());
        System.out.println("Exercise H: " + integerArray[0]);
        System.out.println();

        //Exercise I
        for(i = 0; i < aryNums.length; i++) {
        	if(aryNums[i] % 2 != 0) {
        		System.out.println("Exercise I: " + aryNums[i]);
        	}
        }

    }
}
