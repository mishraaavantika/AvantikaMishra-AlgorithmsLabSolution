package com.lab2.problem1;

import java.util.Scanner;

public class PayMoney {
    static Scanner sc = new Scanner(System.in);

    static void totalTarget(int total_target,int [] arr)
    {
        int count=0;
        while (total_target != 0) {
            System.out.println();
            System.out.println("Enter the value of target");
            int target = sc.nextInt();
            int sum = arr[0];

            if (sum > target) {
                System.out.println("Target achieved after 1 transaction");
                break;
            }
            for(int i=1;i<arr.length;i++){
                if(sum<target){
                    sum+=arr[i];
                    count=i;
                }
                else
                    break;
            }
            if(sum>=target)
                System.out.println("Target achieved after "+ (count+1)+ " transactions");
            else
                System.out.println("Given target is not achieved");

            total_target--;
        }
    }
    public static void main(String[] args) {

        System.out.println("Enter the size of transaction array");
        int size = sc.nextInt();
        System.out.println("Enter the values of array");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter the total number of targets that needs to be achieved");
        int total_target = sc.nextInt();
        totalTarget(total_target,arr);

        sc.close();
    }


}
