//selection sort - finding the smallest and the position and swap according to index

package com.k2js.arrays.practice;

import java.util.Arrays;
import java.util.List;

class Selectionsort{
	public static void selectionSort(int [] abc){
		for(int i=0; i<abc.length-1; i++){
			int smallvalue=abc[i];
			int index=0;
			for(int j=i+1; j<abc.length;j++){
				if(smallvalue>abc[j]){
					smallvalue=abc[j];
					index=j;
				}
			}
			if(i<index){
				int temp=abc[i];
				abc[i]=smallvalue;
				abc[index]=temp;
			}
			
		}
		System.out.println(Arrays.toString(abc));
	}
}

class SelectionSortTest{
	public static void main(String...abc){
		Selectionsort.selectionSort(new int[]{10,30,20,15});
	
	}
}