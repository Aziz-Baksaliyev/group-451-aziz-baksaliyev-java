package classwork_5;

import java.util.Arrays;

public class Main {
	public static void main (String[] args) {
		double[] tempArr = {-8.3, -1.2, 3.5, 9.7, 15.8};
		double maxTemp = tempArr[0];
		for (int i = 1; i < tempArr.length; i++) {
			if(tempArr[i] > maxTemp) {
			maxTemp = tempArr[i];
		}
		}
		System.out.print("Наибольшая температура:" + maxTemp);
		double minTemp = tempArr[0];
		for (int i = 1; i < tempArr.length; i++) {
			if(tempArr[i] < minTemp) {
				minTemp = tempArr[i];
			}
		}
		System.out.print("Наименьшая температура:" + minTemp);
	}
}
