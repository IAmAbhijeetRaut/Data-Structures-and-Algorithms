package INTERMEDIATE_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created By Abhijeet Raut on || Date : 15-03-2023 ||  Time : 10:43 AM.
 */
public class ArraysIntermediate {
    public static void main(String[] args) {

        //Array To ArrayList ---------------------------------

        //Note : Manually You can add all the elements from an array to list using a for loop and calling add()
        //method of arraylist while passing array element to it

        //Arrays.asList() method - convert an array to list
        //Also in this method changes in source i.e. array affects the dest i.e. ArrayList or List
        String[] arrayOfString = {"John","Danny","Amit","Bob","Carl","David","Erick"};
        List<String> listOfString = Arrays.asList(arrayOfString);
        listOfString.forEach((str)->{
            System.out.println(" "+str);
        });
        //changing the array
        arrayOfString[0] = "Jacobs";
        arrayOfString[6] = "Enrique";
        //checking the changes in arrayList
        listOfString.forEach((str)->{
            System.out.println(" "+str);
        }); // changes occur in the arrayList


        //Collection.addAll() - Elements to be added can be specified individually in comma
        // separated values or can be specified as an array
        //changes in source i.e. array doesn't affect the dest i.e. ArrayList
        String[] arrayOfString_2 = {"Joel","David","Ash","Becky","Carl","Dan","Emily"};
        ArrayList<String> strList_2 = new ArrayList<>();
        Collections.addAll(strList_2, arrayOfString_2);
        strList_2.forEach((str)->{
            System.out.println(" "+str);
        });
        //changing the array arrayOfString_2
        arrayOfString_2[0] = "Jacobs";
        arrayOfString_2[6] = "Enrique";
        //checking the changes in arrayList
        strList_2.forEach((str)->{
            System.out.println(" "+str);
        }); // changes doesn't occur in the arrayList
        //addAll method doesnt work with primitive types like int, double.. i.e. i have used the string example
        //you need to use stream to deal with primitive array to be converted to ArrayList



        //ArrayList to Array ---------------------------

        //toArray() method -  toArray() method returns an array containing all of the elements in this list in proper
        //sequence (from first to the last element); the runtime type of the returned array is that of
        //the specified array.
        List<String> stringList_2 = new ArrayList<>();
        stringList_2.add("Hello");
        stringList_2.add("Hi");
        stringList_2.add("Welcome");
        stringList_2.add("To");
        stringList_2.add("DSA - Arrays Topic");
        String[] stringArray_2 = strList_2.toArray(new String[stringList_2.size()]);
        System.out.println(Arrays.toString(stringArray_2));
    }
}
