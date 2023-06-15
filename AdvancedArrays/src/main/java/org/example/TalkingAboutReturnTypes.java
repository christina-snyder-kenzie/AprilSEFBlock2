package org.example;

import java.util.ArrayList;

public class TalkingAboutReturnTypes {
    public static void main(String[] args) {
        //typically, void methods get print statements

        ArrayList<Integer> numbers = fizzArrayList(10);
        System.out.println(numbers);
        ArrayList<Integer> toTest = new ArrayList<Integer>();
        toTest.add(2);
        toTest.add(2);
        toTest.add(2);
        toTest.add(2);
        toTest.add(2);
        System.out.println(sum28(toTest));
    }

    //Given an array of ints, return true if
    // the sum of all the 2's in the array is exactly 8.
    // [2, 2, 2, 2, 2, 2, 2, 2] -> return false
    // [1, 2, 3, 2, 4, 2, 5, 2] -> return true
    // 2 x 4 -> 8
    public static boolean sum28(ArrayList<Integer> list){
        int count = 0;
        for (int i = 0; i < list.size(); i++){
            int currNumber = list.get(i);
            if (currNumber == 2){
                count++;
            }
        }
        if (count == 4) {
            return true;
        } else {
            return false;
        }
    }


    // Given a number n, create and return a new integer arrayList of length n,
    // containing the numbers 0, 1, 2, ... n-1.
    // The given n may be 0, in which case just return a length 0 array.
    public static ArrayList<Integer> fizzArrayList(int n){
        ArrayList<Integer> bookshelf = new ArrayList<Integer>();
       // for (int i = n - 1; i >= 0 ; i--){
        for (int i = 0; i < n; i++){
            //System.out.println(i);
            bookshelf.add(0, i);
        }

        return bookshelf;
    }


    public static String findLongestWord(String sentence){
        return "";
    }

    public static void exerciseOne(String sentence){
        if (sentence.length() == 0) {
            return;
        }
    }

    public static ArrayList<Integer> getNumbers(){
        return null;
    }
}
