package main.bean;

public class Student {
	private int id;
	private String name;
	private int score;
	
	public Student(int id, String name, int score ) {
		this.name=name;
		this.id=id;
		this.score=score;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
	
}
