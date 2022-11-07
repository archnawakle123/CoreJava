package main.bean;

public class Quetions {
	private int id;
	private String quetion;
	private String OptionA;
	private String OptionB;
	private String OptionC;
	private String OptionD;
	private String ans;
	public Quetions(int id, String quetion, String optionA, String optionB, String optionC, String optionD,
			String ans) {
		super();
		this.id = id;
		this.quetion = quetion;
		OptionA = optionA;
		OptionB = optionB;
		OptionC = optionC;
		OptionD = optionD;
		this.ans = ans;
	}
	public int getId() {
		return id;
	}
	public String getQuetion() {
		return quetion;
	}
	public String getOptionA() {
		return OptionA;
	}
	public String getOptionB() {
		return OptionB;
	}
	public String getOptionC() {
		return OptionC;
	}
	public String getOptionD() {
		return OptionD;
	}
	public String getAns() {
		return ans;
	}

}
