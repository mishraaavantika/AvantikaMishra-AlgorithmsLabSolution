package com.lab2.problem2;

public class bubbleSortImplementation {
    public void bubbleSort(int [] array)
    {
        for(int i=array.length;i>0;i--) {
            for(int j=1;j<i;j++) {
                if(array[j-1]<array[j])
                {
                    int t=array[j];
                    array[j]=array[j-1];
                    array[j-1]=t;
                }
            }
        }
    }
}
