package com.irfan.spring.springcore.reftypes;

public class Scores {
	private Double maths;
	private Double physics;
	private Double chemistry;

	public Double getMaths() {
		return maths;
	}

	public void setMaths(Double maths) {
		this.maths = maths;
	}

	public Double getPhysics() {
		return physics;
	}

	public void setPhysics(Double physics) {
		this.physics = physics;
	}

	public Double getChemistry() {
		return chemistry;
	}

	public void setChemistry(Double chemistry) {
		this.chemistry = chemistry;
	}

	@Override
	public String toString() {
		return String.format("Scores [maths=%s, physics=%s, chemistry=%s]", maths, physics, chemistry);
	}
	
}
