package com.irfan.spring.springcore.reftypes;

public class Student {
	private Scores scores;

	public Scores getScores() {
		return scores;
	}

	public void setScores(Scores scores) {
		this.scores = scores;
	}

	@Override
	public String toString() {
		return String.format("Student [scores=%s]", scores);
	}
	
}
