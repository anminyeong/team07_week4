package test_hw;

import java.util.Scanner;

public class Run {
	Scanner aScanner = new Scanner(System.in);
	private String name;
	private int minute;
	private int line;
	private double bill;
	public Run(){
		System.out.println("plan을 입력해주세요.");
		name = aScanner.next();
		System.out.println("총 사용시간을 입력해주세요.");
		minute = aScanner.nextInt();
		System.out.println("사용회선 수를 입력해주세요.");
		line = aScanner.nextInt();
		Calculate aCalculate = new Calculate(name,minute,line);
		bill = aCalculate.calculate();
		System.out.println("사용한 금액은:"+bill+"입니다.");
	}
}
