package ��9��;

import java.text.DecimalFormat;
import java.util.Scanner;

public class number2 {
	public static double event(double r) {
		return Math.PI * Math.pow(r, 2);
	}

	public static void simpleformat(String pattern, double value) {
		DecimalFormat myformat = new DecimalFormat(pattern);
		String output = myformat.format(value);
		System.out.println(output);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("������뾶ֵ��");
		int input = sc.nextInt();
		System.out.println(input);

		System.out.print("Բ�����Ϊ��");
		simpleformat("#.#####", event(input));
	}
}
