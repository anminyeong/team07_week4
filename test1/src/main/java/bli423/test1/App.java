package bli423.test1;

import test_hw.Run;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try{
    		new Run(); 
    	}
    	catch(Exception e){
    		throw new IllegalArgumentException("run error");
    	}
    }
}
