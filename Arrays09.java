//Bubble sort - very important in descending order.

package com.k2js.arrays.practice;

import java.util.Arrays;
import java.util.List;

class Bubblesort1{
	public static void bubbleSort(int[] abc){
		for(int i=0; i<abc.length-1; i++){
			for(int j=i+1; j<abc.length;j++){
				if(abc[i]<abc[j]){
					int temp=abc[i];
					abc[i]=abc[j];
					abc[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(abc));
	}
	
}	
class BubblesrtTest1{
	public static void main(String...abc){
		Bubblesort1.bubbleSort(new int[]{10,20,30,11,13,42,87,67});
	}
}


/*D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\arrays\src>javac -d ..\bin com\k2js\arrays\practice\Arrays09.java

D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\arrays\src>java -cp ..\bin com.k2js.arrays.practice.BubblesrtTest1
[87, 67, 42, 30, 20, 13, 11, 10]
*/
