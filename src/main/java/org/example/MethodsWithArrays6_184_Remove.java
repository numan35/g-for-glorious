package org.example;

/*Instructions from your teacher:

1). Add values( 8.2, 3.1, 4.9, 5.5, 8.3, 0.2 ) to dubs arraylist in main method.

2)pass dubs arraylist to test() method and call it in main method

At the end, print dubs in console.

test() method will remove the first two elements in an ArrayList of doubles (be careful, this is a little tricky! :-) )

Note: You should use remove() method to remove elements*/

import java.util.ArrayList;

public class MethodsWithArrays6_184_Remove {

    public static void main(String[] args) {
        // Creating object of ArrayList<Integer>
        ArrayList<Double> dubs = new ArrayList<Double>();

        // Populating dubs(Write Your code)

        // print dubs before removal
        System.out.println(dubs);

        // run the removal method
        test(dubs);

        // print dubs after removal
        System.out.println(dubs);
    }

    public static void test(ArrayList<Double> dubs)	{
        //write code here


    }


}
