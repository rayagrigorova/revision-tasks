package pregovor;

import java.util.*;

public class zad8 {
	public static void printSpiral(int[][] arr) {
		int rowLimit = arr.length;
		int colLimit = arr[0].length;
		int rowBegin = 0;
		int colBegin = 0;
		
		while(rowLimit > rowBegin && colLimit > colBegin) {
			//->
			for(int i = colBegin; i < colLimit; i++) {
				System.out.print(arr[rowBegin][i] + " ");
			}
			rowBegin++;
			
			// |
			// V
			
			for(int i = rowBegin; i < rowLimit; i++) {
				System.out.print(arr[i][colLimit - 1] + " ");
			}
			colLimit--;
			
			//<-
			if(rowBegin < rowLimit) {
				for(int i = colLimit - 1; i >= colBegin; i--) {
					System.out.print(arr[rowLimit - 1][i] + " ");
				}
				rowLimit--;
			}
			
			//  ^
			//  |
			if(colBegin < colLimit) {
				for(int i = rowLimit - 1; i >= rowBegin; i--) {
					System.out.print(arr[i][colBegin] + " ");
				}
				colBegin++;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] a = new int[r][c];
		
		for(int i = 0 ; i < r; i++) {
			for(int j = 0 ; j < c; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Array:");
		for(int i = 0 ; i < r; i++) {
			for(int j = 0 ; j < c; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.print("Spiral: ");
		printSpiral(a);
	}

}
