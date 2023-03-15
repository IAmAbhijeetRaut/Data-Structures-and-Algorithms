package INTERMEDIATE_1;

import java.util.Arrays;

/**
 * Created By Abhijeet Raut on || Date : 14-03-2023 ||  Time : 12:53 PM.
 */
public class ArraysIntermediate {
    public static void main(String[] args) {
        //Copy arrays using built-in System.arrayCopy() Method
       /*
       public static void arraycopy(Object src,
        int srcPos,
        Object dest,
        int destPos,
        int length)*
        /
        */
        /*src - This is the source array from which the elements are to be copied.
        srcPos - This is the starting index in the source array from where the copying starts. The first element of the array has an index of 0.
        dest - This is the destination array to which the elements are to be copied.
        destPos - This is the starting index in the destination array at which the elements are to be copied. The first element of the array has an index of 0.
        length - This is the number of elements to be copied from the source array to the destination array.*/
        int[] array_1_CopyTo = {1,2,3,4,5};
        int[] array_2_CopyFrom= {6,7,8,9,10};
        // create a new array with enough space to hold all elements
        int[] newArray = new int[array_1_CopyTo.length + array_2_CopyFrom.length];
        // copy elements from the first array to the new array
        System.arraycopy(array_1_CopyTo, 0, newArray, 0, array_1_CopyTo.length);
        // copy elements from the second array to the end of the new array
        System.arraycopy(array_2_CopyFrom, 0, newArray, array_1_CopyTo.length, array_2_CopyFrom.length);
        // print the contents of the new array
        System.out.println(Arrays.toString(newArray));



        //Object.clone() method
        int[] source_1 = {1,2,3,4,5,6,7,8,9,10};
        int[] dest_1 = source_1.clone();
        source_1[0] = 369; // to check whether changing source_1 affects the dest_1 or not
        System.out.println("source_1 ="+Arrays.toString(source_1));
        System.out.println("dest_1 ="+Arrays.toString(dest_1)); // source changes does not affect the dest


        //Arrays.copyOfRange() - internally uses the System.arrayCopy() method only
        int[] source_2 = {1,2,3,4,5,6,7,8,9,10};
        int[] dest_2 = Arrays.copyOfRange(source_2, source_2.length - 3, source_2.length);
        System.out.println("source_2 ="+Arrays.toString(source_2));
        System.out.println("dest_2 ="+Arrays.toString(dest_2)); // source_2 changes does not affect the dest

    }
}
