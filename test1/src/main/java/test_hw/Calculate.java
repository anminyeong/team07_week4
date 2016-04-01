package test_hw;

public class Calculate {
	private Plan user_used_plan;
	public Calculate(String user_plan, int user_time, int num_line){
		if(user_plan.equals("gold"))
			user_used_plan = new Gold(user_time,num_line);
		else if(user_plan.equals("silver"))
			user_used_plan = new Silver(user_time,num_line);
		else{
			System.out.println("plan�� �߸� �Է���ϴ�.");
			System.exit(0);
		}			
	}
	
	public double calculate(){
		double expected_bill;
		int excess_min = 0;
		if(user_used_plan.isExcess()){
			excess_min = user_used_plan.used_min-user_used_plan.included_min;			
		}
		user_used_plan.overLine();
		expected_bill = 
				user_used_plan.basic_rate+(excess_min*user_used_plan.excess_min)+((user_used_plan.num_line-1)*user_used_plan.add_rate)
				+(user_used_plan.over_line*5.0);
		return expected_bill;				
	}
}
