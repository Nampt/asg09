package asg09;

import java.util.*;
import java.io.*;

public class ArrayAlg {
	Exception Exception = null;
	int i;
	public <T> void printArray(T[] a) {
		for(i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
	}
	
	public <T> void printArray(T[] a,int start,int end) throws Exception {
		for(i = start; i < end; i++) {
			if(start < 0 || start >= end || end > a.length)
				throw Exception;
			System.out.println(a[i]);
		}
	}
	
	public static <T extends Comparable> Pair<T> maxTwo(T[] a) {
		if (a == null || a.length == 0) {
			return null;
		}
		T min = a[0];
		T max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (min.compareTo(a[i]) > 0) min = a[i];
			if (max.compareTo(a[i]) < 0) max = a[i];
		}
		return new Pair<T>(min, max);
	}
}
