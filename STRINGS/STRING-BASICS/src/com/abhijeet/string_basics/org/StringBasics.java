package com.abhijeet.string_basics.org;

/**
 * Created By Abhijeet Raut on || Date : 11-03-2023 ||  Time : 10:33 am.
 */
public class StringBasics {

   public static void main(String[]args){
       // creating string
       //1) using string literal : String will be chekced on the String Coonstant Pool
       // if the string already exists then the same string on SCP will be referred otherwise
       // new String will be created on the SCP
       String str1 = "Hello";
       String str1_1 = "heLLO"; // case-sensitivity
       String str2 = "India";
       String str2_1 = "India";
       //2) using new Keyword : string will always be created on the heap section
       String str3 = new String("Hello");
       String str4 = new String("India");

       System.out.println(System.identityHashCode(str1));
       System.out.println(System.identityHashCode(str1_1)); // this proves case-sensitivity
       System.out.println(System.identityHashCode(str2));
       System.out.println(System.identityHashCode(str2_1));
       System.out.println(System.identityHashCode(str3));
       System.out.println(System.identityHashCode(str4));

   }
}
