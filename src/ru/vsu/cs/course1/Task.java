package ru.vsu.cs.course1;


import java.util.List;

public class Task {
	public static void process(List<Integer> list) {
		if (list == null || list.size() <= 3) return;
		int max = findMax(list);
		int min = findMin(list);
		if (max == min) return;
		int firstMax = firstIndexOf(list, max);
		int lastMin = lastIndexOf(list, min);
		int minOfTwoIndices = Math.min(lastMin, firstMax);
		int maxOfTwoIndices = Math.max(lastMin, firstMax);
		int actualDiffInIndices = maxOfTwoIndices - minOfTwoIndices - 1;

		if (actualDiffInIndices < 2) return;

		int subSequenceStart = minOfTwoIndices + 1;
		int subSequenceEnd = maxOfTwoIndices - 1;

		int repeatTimes = actualDiffInIndices/2 - (1 - actualDiffInIndices % 2);
		for (int i = 0; i <= repeatTimes; i++) {
			int temp = list.get(minOfTwoIndices + 1 + i);
			list.set(subSequenceStart + i, list.get(subSequenceEnd - i));
			list.set(subSequenceEnd - i, temp);
		}
	}
	public static int findMax(List<Integer> list){
		Integer currentMax = list.get(0);
		for (Integer value: list) {
			if (value > currentMax){
				currentMax = value;
			}
		}
		return currentMax;
	}
	public static int findMin(List<Integer> list){
		Integer currentMin = list.get(0);
		for (Integer value: list) {
			if (value < currentMin){
				currentMin = value;
			}
		}
		return currentMin;
	}
	public static int firstIndexOf(List<Integer> list, int value){
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == value) return i;
		}
		return -1; // Чтобы что-то было
	}
	public static int lastIndexOf(List<Integer> list, int value){
		for (int i = list.size() - 1; i >= 0; i--) {
			if (list.get(i) == value) return i;
		}
		return -1; // Чтобы что-то было
	}
}