/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Nathan Moeller
 * CSCI 295 Data Structures
 * Homework 16-Generic Heap Part II
 * This program uses the heap program we created and uses the three comparators to sort them.
 * Dr. Lillis
 */
public class Part_2 {
    public static void main(String[] args) {
        String[] strings = { "Jack Harkness", "The Doctor", "Martha Jones", "Mickey Smith", "Donna Noble", "Rose Tyler", "Sally Sparrow", "River Song", "Sarah Jane Smith", "Amy Pond"};
        Heap<String> heap1 = new Heap<>(new StringComparator());
        for (String s : strings) {
            heap1.add(s);
        }
        while (!heap1.isEmpty()) {
            System.out.println(heap1.remove()); 
        }
        // Adding this line so that it better separates the three comparators
        System.out.println("-----------------------------");
        
        Integer[] numbers1 = {12, 5, 43, 54, 23, 43, 12, 65, 76, 45, 34, 54, 23, 43, 54};
        Heap<Integer> heap2 = new Heap<>(new IntegerComparator1());  
        for(Integer i : numbers1){
            heap2.add(i);
        }
        while(!heap2.isEmpty()){
            System.out.println(heap2.remove());
        }
        // Adding this line so that it better separates the three comparators
        System.out.println("-----------------------------");
        
        Integer[] numbers2 = {12, 5, 43, 54, 23, 43, 12, 65, 76, 45, 34, 54, 23, 43, 54};
        Heap<Integer> heap3 = new Heap<>(new IntegerComparator2()); 
        for(Integer i : numbers2){
            heap3.add(i);
        }
        while(!heap3.isEmpty()){
            System.out.println(heap3.remove());
        }

    }
}

