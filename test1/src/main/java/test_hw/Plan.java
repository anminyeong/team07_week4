package test_hw;

public class Plan {
	protected String user_plan;
	protected double basic_rate;
	protected double add_rate;
	protected double excess_min;
	protected int included_min;
	protected int used_min;
	protected int num_line;
	protected int over_line = 0;

	public boolean isExcess(){
		if(used_min>included_min)
			return true;
		else
			return false;
	}

	public void overLine(){
		if(num_line>3){
			over_line = num_line-3;
			num_line = num_line-over_line;
		}
		else
			return;
	}
}
