//Bubble sort - very important in ascending order.

package com.k2js.arrays.practice;

import java.util.Arrays;
import java.util.List;

class Bubblesort{
	public static void bubbleSort(int[] abc){
		for(int i=0; i<abc.length-1; i++){
			for(int j=i+1; j<abc.length;j++){
				if(abc[i]>abc[j]){
					int temp=abc[i];
					abc[i]=abc[j];
					abc[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(abc));
	}
	
}	
class BubblesrtTest{
	public static void main(String...abc){
		Bubblesort.bubbleSort(new int[]{10,20,30,11,13,42,87,67});
	}
}

/*D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\arrays\src>javac -d ..\bin com\k2js\arrays\practice\Arrays08.java

D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\arrays\src>java -cp ..\bin com.k2js.arrays.practice.BubblesrtTest
[10, 11, 13, 20, 30, 42, 67, 87]
*/
