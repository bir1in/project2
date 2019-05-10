package com.revature.model;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class SwapiStarship {

	private String name;

	@JsonProperty("cost_in_credits")
	private int cost_in_credits;

	@JsonProperty("passengers")
	private int passengers;

	@JsonProperty("cargo")
	private int cargo;

	// no args constructor
	public SwapiStarship() {
	}

	/**
	 * @param name
	 * @param cost_in_credits
	 * @param passengers
	 * @param cargo
	 */
	public SwapiStarship(String name, int cost_in_credits, int passengers, int cargo) {
		super();
		this.name = name;
		this.cost_in_credits = cost_in_credits;
		this.passengers = passengers;
		this.cargo = cargo;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCost_in_credits() {
		return cost_in_credits;
	}

	public void setCost_in_credits(int cost_in_credits) {
		this.cost_in_credits = cost_in_credits;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public int getCargo() {
		return cargo;
	}

	public void setCargo(int cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Starship [name=" + name + ", cost_in_credits=" + cost_in_credits + ", passengers=" + passengers
				+ ", cargo=" + cargo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cargo;
		result = prime * result + cost_in_credits;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + passengers;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SwapiStarship other = (SwapiStarship) obj;
		if (cargo != other.cargo)
			return false;
		if (cost_in_credits != other.cost_in_credits)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (passengers != other.passengers)
			return false;
		return true;
	}
	



}
