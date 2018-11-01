package com.dong.algorithms.puzzle.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * ToeplitzMatrix
 * @version 1.0 2018/11/01
 * @author dongliyang
 */
public class ToeplitzMatrix {
	public static void main(String[] args) {
		
		/*
		 * 在线性代数中，常对角矩阵(又称特普利茨矩阵)是指每条左上至右下的对角线均为常数的矩阵，不论是正方形或长方形的。
		 * 特性:给出两个坐标(r1,c1)、(r2,c2)，如何确定在同一条对角线?
		 * 可以得出结论：如果两个坐标在同一条对角线上，则r1 - c1 == r2 - c2
		 */
		
		int[][] matrixA = {
				{ 1, 2, 3, 4 },
				{ 5, 1, 2, 3 },
				{ 9, 5, 1, 2 }
		};
		
		System.out.println(isToeplitzMatrix(matrixA));

		int[][] matrixB = {
				{ 1, 2 },
				{ 2, 2 }
		};
		
		System.out.println(isToeplitzMatrix(matrixB));
	}
	
	public static boolean isToeplitzMatrix(int[][] matrix) {
		
		Map<Integer, Integer> groups = new HashMap<>();
		for(int r = 0; r < matrix.length; r++) {
			for(int c = 0; c < matrix[0].length; c++) {
				if(!groups.containsKey(r - c)) {
					groups.put(r - c, matrix[r][c]);
				} else if(groups.get(r - c) != matrix[r][c]){
					return false;
				}
			}
		}
		return true;
	}
}
