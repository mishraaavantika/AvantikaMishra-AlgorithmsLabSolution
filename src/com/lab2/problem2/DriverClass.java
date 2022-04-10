package com.lab2.problem2;

import java.util.Scanner;

public class DriverClass {

        public static void main(String[] args) {
            bubbleSortImplementation sort=new bubbleSortImplementation();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of currency denominations");
            int size = sc.nextInt();
            System.out.println("Enter the currency denominations value");
            int[] notes = new int[size];
            for (int i = 0; i < size; i++)
                notes[i] = sc.nextInt();
            System.out.println("Enter the amount you want to pay");
            int amount = sc.nextInt();
            sc.close();
            sort.bubbleSort(notes);
            notesCount.notesCountImplementation(notes,amount);


        }
}
