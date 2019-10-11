
package com.k2js.arrays.practice;

import java.util.Arrays;
import java.util.List;

class ArrayEx2{
	public static void m(int[]arr){
		for(int t : arr)
		System.out.println(t);		
	}
}

class TestArray02{
	public static void main(String...abc){
		//m(10);
		ArrayEx2.	m(new int[]{10,20,30});
		
	}
}

/*

D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\arrays\src>javac -d ..\bin com\k2js\arrays\practice\Arrays02.java

D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\arrays\src>java -cp ..\bin com.k2js.arrays.practice.TestArrays02
Error: Could not find or load main class com.k2js.arrays.practice.TestArrays02

D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\arrays\src>java -cp ..\bin com.k2js.arrays.practice.TestArray02
10
20
30
*/