package com.sam.Set;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Example One: Insert Elements to HashSet using addAll().

//        ExampleOne one = new ExampleOne();
//        one.addElement();

        //Example Two: Union of Sets.

//        ExampleTwo exampleTwo = new ExampleTwo();
//        exampleTwo.useAddALL();


//       //Example Three: Difference of Sets.
////
//        ExampleThree obj = new ExampleThree();
//        obj.removeElement();

        // Example Four: Enhanced for() Loop

//        ExampleFour obj = new ExampleFour();
//        obj.enhanceForLoop();

        // Example one: Iterate Through TreeSet.
//
//        TreeSetExampleOne treeSetExampleOne = new TreeSetExampleOne();
//        treeSetExampleOne.treeSetExample();

        // Example two: Remove Elements

//        TreeSetExampleTwo t = new TreeSetExampleTwo();
//        t.treeSetExample();

        // Example three: Methods for Navigation.

//        TreeSetExampleThree e = new TreeSetExampleThree();
//        e.treeSetExample();

        //Example four: sort the given TreeSet alphabetically in reverse order.

        // Create a TreeSet with user-defined comparator
        TreeSet<String> cities = new TreeSet<>(new CitiesComparator());

        //add elements to the comparator
        cities.add("UAE");
        cities.add("Mumbai");
        cities.add("NewYork");
        cities.add("Hyderabad");
        cities.add("Karachi");
        cities.add("Xanadu");
        cities.add("Lahore");
        cities.add("Zagazig");
        cities.add("Yingkou");

        //print the contents of TreeSet
        System.out.println("TreeSet: " + cities);
    }


}