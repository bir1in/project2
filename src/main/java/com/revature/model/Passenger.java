package com.revature.model;

import javax.persistence.Entity;

@Entity
public class Passenger {

	private String name;
	
	private String homeWorld;

	//need films as importance here
	
	
	
	/**
	 * no args constructor
	 */
	public Passenger() {
		super();
	}

	/**
	 * all args constructor
	 * @param name
	 * @param homeWorld
	 */
	public Passenger(String name, String homeWorld) {
		super();
		this.name = name;
		this.homeWorld = homeWorld;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHomeWorld() {
		return homeWorld;
	}

	public void setHomeWorld(String homeWorld) {
		this.homeWorld = homeWorld;
	}

	@Override
	public String toString() {
		return "Passenger [name=" + name + ", homeWorld=" + homeWorld + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((homeWorld == null) ? 0 : homeWorld.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Passenger other = (Passenger) obj;
		if (homeWorld == null) {
			if (other.homeWorld != null)
				return false;
		} else if (!homeWorld.equals(other.homeWorld))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
	
}
