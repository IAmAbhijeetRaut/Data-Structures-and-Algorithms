package BASICS_1;

/**
 * Created By Abhijeet Raut on || Date : 14-03-2023 ||  Time : 09:52 am.
 */
public class ArrayBasics {
    public static void main(String[] args) {
        //Single Dimension Array
        //Declare an array
        int[] array_1;

        //allocate memory to the array
        array_1 = new int[10];

        //add elements to the array
        // initialize first element
        array_1[0] = 100;
        // initialize second element
        array_1[1] = 200;
        // and so forth
        //initializing the inttger array
        array_1[2] = 300;
        array_1[3] = 400;
        array_1[4] = 500;
        array_1[5] = 600;

        //Declaration and Intitialization at the same time
        int[] array_2 = new int[10];
        String[] array_3 = new String[10];

        //initialize the string array
        array_3[0] = "Hello";
        array_3[1] = "Welcome";
        array_3[2] = "To This";
        array_3[3] = "Repo";
        array_3[4] = "Where We";
        array_3[5] = "Are";
        array_3[6] = "Practicing";
        array_3[7] = "Array";
        array_3[8] = "For Learning";
        array_3[9] = "Data Structures and Algorithms";

        //Accessing the array elements
        System.out.printf("\nThe %s element is : %s","1st",array_3[0]);
        System.out.printf("\nThe %s element is : %s","2nd",array_3[1]);

        //Shortcut syntax to create and initialize an array
        int[] array_4 = {1,2,3,4,5,6,7,8,9,10};


    }
}
