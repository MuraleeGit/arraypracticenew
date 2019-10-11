//6234567 - Nth highest number ->Very very impotant program.

package com.k2js.arrays.practice;

import java.util.Arrays;
import java.util.List;

class ArraySrt{
	 
	public static void msort(){
		Integer[] i= new Integer[]{10,15,20,7,8,17,14,70,56};
		Arrays.sort(i,(a,b)->b-a);
		System.out.println(Arrays.toString(i));
	}
}
class Arraysrttest{
	public static void main(String...abc){
		ArraySrt.msort();
	}
}

/*

D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\arrays\src>javac -d ..\bin com\k2js\arrays\practice\Arrays07.java

D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\arrays\src>java -cp ..\bin com.k2js.arrays.practice.Arraysrttest
[70, 56, 20, 17, 15, 14, 10, 8, 7]

D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\arrays\src>

*/