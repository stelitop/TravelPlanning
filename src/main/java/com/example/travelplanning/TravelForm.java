package com.example.travelplanning;

public class TravelForm {
	public float budget;
	public int numPeople;
	public Climate climate;

	public void setBudget(float budget) {
		this.budget = budget;
	}

	public void setClimate(Climate climate) {
		this.climate = climate;
	}

	public void setNumPeople(int numPeople) {
		this.numPeople = numPeople;
	}

	public TravelForm() {
		budget = 0.0f;
		numPeople = 0;
		climate = Climate.Mild;
	}
}
