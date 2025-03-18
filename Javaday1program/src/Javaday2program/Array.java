package Javaday2program;
import java.util.*;
public class Array {
	public static void main(String[] args) {
		//Multidimensional array (matrix)
		int[][] matrix=new int[2][3];// Declare an 2*3 array
		//Assign values
		matrix[0][0]=1;matrix[0][1]=2;matrix[0][2]=3;
		matrix[1][0]=4;matrix[1][1]=5;matrix[1][2]=6;
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix.length;j++) {
				System.out.println(matrix[i][j]+"");
				}
			System.out.println();
		}
		//array copy
		int[] source= {1,2,3,4,5};
		int[] destination=new int[5];
		System.arraycopy(source, 0, destination, 0, source.length);
		for(int num:destination) {
			System.out.println(num+"");
		}
		// array sort
		int[] numbers= {40,10,20,30,40};
		Arrays.sort(numbers);
		System.out.println("Sorted Array:"+Arrays.toString(numbers));
		//for each-loop using array
		int[] number= {40,10,20,30,40};
		// using normal for loop
		//for(int i=1;i<=number.length;i++)
		//{
		// System.out.println(i);
		//}
		//using for-each loop
		for(int num:number) {
			System.out.println(num);
		}
		
	}

}
