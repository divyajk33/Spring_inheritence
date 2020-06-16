package com.shiva.beans;

public class Child extends Parent{
	String badHabbits;
	public String getBadHabbits() {
		return badHabbits;
	}
	public void setBadHabbits(String badHabbits) {
		this.badHabbits = badHabbits;
	}
	public String getKnowledge() {
		return knowledge;
	}
	public void setKnowledge(String knowledge) {
		this.knowledge = knowledge;
	}
	String knowledge;
	public void displayDetails()
	{
		System.out.println(getMoney());
		System.out.println(getPropDocs());
		System.out.println(getDiseases());
		System.out.println(badHabbits);
		System.out.println(knowledge);
	}

}
