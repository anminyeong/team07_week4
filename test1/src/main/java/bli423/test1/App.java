package bli423.test1;

import java.util.Scanner;
import java.util.logging.*;

import test_hw.Calculate;
/**
 * Hello world!
 *
 */
public class App 
{
	private void main(){	
		//this nothing
	}	
	private static void run(){
		Logger logger = Logger.getLogger(App.class.getName());
		Scanner aScanner = new Scanner(System.in);
		String name;
		int minute;
		int line;
		double bill;
		logger.log(Level.INFO,"plan을 입력해주세요.");
		name = aScanner.next();
		logger.log(Level.INFO,"총 사용시간을 입력해주세요.");
		minute = aScanner.nextInt();
		logger.log(Level.INFO,"사용회선 수를 입력해주세요.");
		line = aScanner.nextInt();
		Calculate aCalculate = new Calculate(name,minute,line);
		bill = aCalculate.calculate();
		logger.log(Level.INFO,"사용한 금액은:"+bill+"입니다.");
	}
	public static void main( String[] args )
	{
		run();
	}
}
