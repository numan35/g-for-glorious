package org.example;

/*Instructions from your teacher:

The last ArrayList method we are going to learn is... .add() again!

Except this time, instead of .add() taking one parameter (the thing we want to add), this time,
 we will be giving it two parameters.The two parameters are:

.add(i,element)
// i ==> the index you want to insert at
// element ==> the element you want to insert at index i
For example, if you had an ArrayList called nums with the values (4,2,5,6), and you run the following:

nums.add(1,100);

The result will be (4,100,2,5,6)


In main method create a words arrayList and add the following string values into it.
Values: Washington,	Virginia, Maryland, California, Nebraska


test() method will take an argument of String ArrayLists called words, and then insert "hey"
 in the 0th index and then insert "yo" in the 3rd index.*/

import java.util.ArrayList;

public class MethodsWithArrayList7_185 {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<String>();

        //Add words to the ArrayList


        test(words);
        System.out.println(words);

    }


    public static void test(ArrayList<String> words)	{
        //write code here


    }
}
