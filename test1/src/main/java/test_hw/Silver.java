package test_hw;

public class Silver extends Plan {
	public Silver(int user_used_min, int user_num_line){
		super();
		this.user_plan = "silver";
		this.basic_rate = 29.95;
		this.add_rate = 21.5;
		this.excess_min = 0.54;
		this.included_min = 500;
		used_min = user_used_min;
		num_line = user_num_line;
	}
}
