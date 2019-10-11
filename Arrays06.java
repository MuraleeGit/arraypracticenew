//6234567 - Nth highest number ->Very very impotant program.

package com.k2js.arrays.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class ArraySrt2{
	 
	public static void mSort(){
		Integer[] i= {10,5,8,30,76,90,54};
		Stream<Integer> si= Stream.of(i).sorted();
		si.forEach(x->System.out.println(x));//forEach is a metho. -> Lamda 
	}
}

class Arraysrt2test{
	public static void main(String...abc){
		ArraySrt2.mSort();
	}
}

/*
D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\arrays\src>javac -d ..\bin com\k2js\arrays\practice\Arrays05.java

D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\arrays\src>javac -d ..\bin com\k2js\arrays\practice\Arrays05.java

D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\arrays\src>java -cp ..\bin com.k2js.arrays.practice.Arraysrt2test
5
8
10
30
54
76
90
*/
