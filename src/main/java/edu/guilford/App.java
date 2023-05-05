package edu.guilford;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // declare a constant for the number of elements in the list and set it equal to 1000.
        final int NUM_ELEMENTS = 10000;
        // create an arrayList of Water objects called waterArrayList
        ArrayList<Water> waterArrayList = new ArrayList<Water>();

        // use a loop to add NUM_ELEMENTS Water objects to the waterArrayList with a random number of moles
        long startTime = System.nanoTime();
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            waterArrayList.add(new Water(Math.random() * 100));
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Time to add " + NUM_ELEMENTS + " elements to an ArrayList:                          " + duration/1e6 + " milliseconds");

        // Sort the waterArrayList using the Collections.sort() method
        startTime = System.nanoTime();
        Collections.sort(waterArrayList);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Time to sort " + NUM_ELEMENTS + " elements in an ArrayList:                         " + duration/1e6 + " milliseconds");

        // Shuffle the waterArrayList using the Collections.shuffle() method
        startTime = System.nanoTime();
        Collections.shuffle(waterArrayList);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Time to shuffle " + NUM_ELEMENTS + " elements in an ArrayList:                      " + duration/1e6 + " milliseconds");

        // Use a loop to get a random element from the list 1,000,000 times.
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            waterArrayList.get((int) (Math.random() * NUM_ELEMENTS));
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Time to get a random element from an ArrayList " + 1000000 + " times:       " + duration/1e6 + " milliseconds");

        // Use a loop to get each element from the loop sequentially. (In other words, get the first element, then get the second element, then get the third element.)
        startTime = System.nanoTime();
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            waterArrayList.get(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Time to get each element from an ArrayList sequentially " + NUM_ELEMENTS + " times: " + duration/1e6 + " milliseconds");

        // REPEAT THE ABOVE FOR A LINKED LIST
        // create a linkedList of Water objects called waterLinkedList
        LinkedList<Water> waterLinkedList = new LinkedList<Water>();
        // use a loop to add NUM_ELEMENTS Water objects to the waterLinkedList with a random number of moles
        startTime = System.nanoTime();
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            waterLinkedList.add(new Water(Math.random() * 100));
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Time to add " + NUM_ELEMENTS + " elements to a LinkedList:                          " + duration/1e6 + " milliseconds");

        // Sort the waterLinkedList using the Collections.sort() method
        startTime = System.nanoTime();
        Collections.sort(waterLinkedList);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Time to sort " + NUM_ELEMENTS + " elements in a LinkedList:                         " + duration/1e6 + " milliseconds");

        // Shuffle the waterLinkedList using the Collections.shuffle() method
        startTime = System.nanoTime();
        Collections.shuffle(waterLinkedList);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Time to shuffle " + NUM_ELEMENTS + " elements in a LinkedList:                      " + duration/1e6 + " milliseconds");

        // Use a loop to get a random element from the list 1,000,000 times.
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            waterLinkedList.get((int) (Math.random() * NUM_ELEMENTS));
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Time to get a random element from a LinkedList " + 1000000 + " times:       " + duration/1e6 + " milliseconds");

        // Use a loop to get each element from the loop sequentially. (In other words, get the first element, then get the second element, then get the third element.)
        startTime = System.nanoTime();
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            waterLinkedList.get(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Time to get each element from a LinkedList sequentially " + NUM_ELEMENTS + " times: " + duration/1e6 + " milliseconds");


    }
}
