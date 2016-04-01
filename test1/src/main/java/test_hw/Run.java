package test_hw;

import java.util.Scanner;

public class Run {
	Scanner aScanner = new Scanner(System.in);
	private String name;
	private int minute;
	private int line;
	private double bill;
	public Run(){
		System.out.println("plan�� �Է����ּ���.");
		name = aScanner.next();
		System.out.println("�� ���ð��� �Է����ּ���.");
		minute = aScanner.nextInt();
		System.out.println("���ȸ�� ���� �Է����ּ���.");
		line = aScanner.nextInt();
		Calculate aCalculate = new Calculate(name,minute,line);
		bill = aCalculate.calculate();
		System.out.println("����� �ݾ���:"+bill+"�Դϴ�.");
	}
}
