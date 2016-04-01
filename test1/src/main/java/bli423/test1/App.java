package bli423.test1;

import java.util.Scanner;

import test_hw.Calculate;
import test_hw.Run;

/**
 * Hello world!
 *
 */
public class App 
{
	private void main(){		
	}	
	private static void run(){
		Scanner aScanner = new Scanner(System.in);
		String name;
		int minute;
		int line;
		double bill;
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
	public static void main( String[] args )
	{
		run();
	}
}
