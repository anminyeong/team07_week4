package test_hw;

public class Gold extends Plan {
	public Gold(int user_used_min, int user_num_line){
		super();
		this.user_plan = "gold";
		this.basic_rate = 49.95;
		this.add_rate = 14.5;
		this.excess_min = 0.45;
		this.included_min = 1000;
		used_min = user_used_min;
		num_line  =  user_num_line;
	}
}
