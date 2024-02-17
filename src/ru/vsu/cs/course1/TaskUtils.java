package ru.vsu.cs.course1;

import java.util.ArrayList;

public class TaskUtils {
	public static ArrayList<Integer> convertMatrixToList(int[][] matrix){
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < matrix[0].length; i++) {
			list.add(matrix[0][i]);
		}
		return list;
	}
	public static ArrayList<Integer> convertArrayToList(int[] array){
		ArrayList<Integer> list = new ArrayList<>();
		for (int j : array) {
			list.add(j);
		}
		return list;
	}
	public static int[] convertListToArray(ArrayList<Integer> arrayList) {
		int[] arr = new int[arrayList.size()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arrayList.get(i);
		}
		return arr;
	}
}