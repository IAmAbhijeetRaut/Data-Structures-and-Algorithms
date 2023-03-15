package BASICS_2;

import com.sun.org.apache.xml.internal.security.utils.HelperNodeList;

/**
 * Created By Abhijeet Raut on || Date : 14-03-2023 ||  Time : 11:02 AM.
 */
public class ArrayBasics {
    public static void main(String[] args) {
        //2-Dimensional Array

        //Declaration of 2d array
        int[][] array_1 = new int[2][3]; // rows=2  and columns=3
        // int[2][3] -> int[row_index][column_index]

        //so basically each row has 3 columns
        //Adding elements in row-1 i.e. at 0th index of row-index
        array_1[0][0] = 1; // 1st row - 1st element
        array_1[0][1] = 2; // 1st row - 2nd element
        array_1[0][2] = 3; // 1st row - 3rd element

        //Adding elements in row-2 i.e. 1st index of the row-index
        array_1[1][0] = 4; // 2nd row - 1st element
        array_1[1][1] = 5; // 2nd row - 2nd element
        array_1[1][2] = 6; // 2nd row - 3rd element

        //How to Access the elements
        //Remember [row-index][column-index]

        //Accessing 1st element of 1st row
        System.out.println("Accessing 1st Element in 1st Row = "+array_1[0][0]);

        //Accessing 3rd element of 1st row
        System.out.println("Accessing 3rd element of 1st Row = "+array_1[0][2]);

        //looping through the entire array
        for (int i = 0; i < array_1.length; i++) {
            for (int j = 0; j < array_1[i].length; j++) {
                System.out.printf("\nTwo Dimensional Array || array[%d][%d] = %d",i,j,array_1[i][j]);
            }
        }
        // this above for-loop can also be used to initialize it , it is upto the programmer, anything can be done
    }
}
