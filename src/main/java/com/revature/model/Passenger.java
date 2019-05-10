package com.revature.model;

import java.util.Arrays;

import javax.persistence.Entity;

//the one in project2
@Entity
public class Passenger {

	private String name;
	
	private int height;
	
	private int mass;
	
	private String hair_color;
	
	private String skin_color;

	private String birth_year;
	
	private String gender;
	
	private String homeWorld;
	
	private Object[] films;
	
	private Object[] species;
	
	private Object[] vehicles;
	
	private Object[] starships;
	
	private String created;
	
	private String edited;
	
	private String url;
	
	
	/*example
	 * 
	 * "name": "Luke Skywalker", 
            "height": "172", 
            "mass": "77", 
            "hair_color": "blond", 
            "skin_color": "fair", 
            "eye_color": "blue", 
            "birth_year": "19BBY", 
            "gender": "male", 
            "homeworld": "https://swapi.co/api/planets/1/", 
            "films": [
                "https://swapi.co/api/films/2/", 
                "https://swapi.co/api/films/6/", 
                "https://swapi.co/api/films/3/", 
                "https://swapi.co/api/films/1/", 
                "https://swapi.co/api/films/7/"
            ], 
            "species": [
                "https://swapi.co/api/species/1/"
            ], 
            "vehicles": [
                "https://swapi.co/api/vehicles/14/", 
                "https://swapi.co/api/vehicles/30/"
            ], 
            "starships": [
                "https://swapi.co/api/starships/12/", 
                "https://swapi.co/api/starships/22/"
            ], 
            "created": "2014-12-09T13:50:51.644000Z", 
            "edited": "2014-12-20T21:17:56.891000Z", 
            "url": "https://swapi.co/api/people/1/"
        }
	 */
	
	
	
	



	public Passenger(String name, int height, int mass, String hair_color, String skin_color, String birth_year,
			String gender, String homeWorld, Object[] films, Object[] species, Object[] vehicles, Object[] starships,
			String created, String edited, String url) {
		super();
		this.name = name;
		this.height = height;
		this.mass = mass;
		this.hair_color = hair_color;
		this.skin_color = skin_color;
		this.birth_year = birth_year;
		this.gender = gender;
		this.homeWorld = homeWorld;
		this.films = films;
		this.species = species;
		this.vehicles = vehicles;
		this.starships = starships;
		this.created = created;
		this.edited = edited;
		this.url = url;
	}
	
	
	
	public Passenger() {
		super();
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getMass() {
		return mass;
	}

	public void setMass(int mass) {
		this.mass = mass;
	}

	public String getHair_color() {
		return hair_color;
	}

	public void setHair_color(String hair_color) {
		this.hair_color = hair_color;
	}

	public String getSkin_color() {
		return skin_color;
	}

	public void setSkin_color(String skin_color) {
		this.skin_color = skin_color;
	}

	public String getBirth_year() {
		return birth_year;
	}

	public void setBirth_year(String birth_year) {
		this.birth_year = birth_year;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHomeWorld() {
		return homeWorld;
	}

	public void setHomeWorld(String homeWorld) {
		this.homeWorld = homeWorld;
	}

	public Object[] getFilms() {
		return films;
	}

	public void setFilms(Object[] films) {
		this.films = films;
	}

	public Object[] getSpecies() {
		return species;
	}

	public void setSpecies(Object[] species) {
		this.species = species;
	}

	public Object[] getVehicles() {
		return vehicles;
	}

	public void setVehicles(Object[] vehicles) {
		this.vehicles = vehicles;
	}

	public Object[] getStarships() {
		return starships;
	}

	public void setStarships(Object[] starships) {
		this.starships = starships;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getEdited() {
		return edited;
	}

	public void setEdited(String edited) {
		this.edited = edited;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birth_year == null) ? 0 : birth_year.hashCode());
		result = prime * result + ((created == null) ? 0 : created.hashCode());
		result = prime * result + ((edited == null) ? 0 : edited.hashCode());
		result = prime * result + Arrays.deepHashCode(films);
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((hair_color == null) ? 0 : hair_color.hashCode());
		result = prime * result + height;
		result = prime * result + ((homeWorld == null) ? 0 : homeWorld.hashCode());
		result = prime * result + mass;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((skin_color == null) ? 0 : skin_color.hashCode());
		result = prime * result + Arrays.deepHashCode(species);
		result = prime * result + Arrays.deepHashCode(starships);
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		result = prime * result + Arrays.deepHashCode(vehicles);
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
		if (birth_year == null) {
			if (other.birth_year != null)
				return false;
		} else if (!birth_year.equals(other.birth_year))
			return false;
		if (created == null) {
			if (other.created != null)
				return false;
		} else if (!created.equals(other.created))
			return false;
		if (edited == null) {
			if (other.edited != null)
				return false;
		} else if (!edited.equals(other.edited))
			return false;
		if (!Arrays.deepEquals(films, other.films))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (hair_color == null) {
			if (other.hair_color != null)
				return false;
		} else if (!hair_color.equals(other.hair_color))
			return false;
		if (height != other.height)
			return false;
		if (homeWorld == null) {
			if (other.homeWorld != null)
				return false;
		} else if (!homeWorld.equals(other.homeWorld))
			return false;
		if (mass != other.mass)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (skin_color == null) {
			if (other.skin_color != null)
				return false;
		} else if (!skin_color.equals(other.skin_color))
			return false;
		if (!Arrays.deepEquals(species, other.species))
			return false;
		if (!Arrays.deepEquals(starships, other.starships))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		if (!Arrays.deepEquals(vehicles, other.vehicles))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Passenger [name=" + name + ", height=" + height + ", mass=" + mass + ", hair_color=" + hair_color
				+ ", skin_color=" + skin_color + ", birth_year=" + birth_year + ", gender=" + gender + ", homeWorld="
				+ homeWorld + ", films=" + Arrays.toString(films) + ", species=" + Arrays.toString(species)
				+ ", vehicles=" + Arrays.toString(vehicles) + ", starships=" + Arrays.toString(starships) + ", created="
				+ created + ", edited=" + edited + ", url=" + url + "]";
	}
	
	


	
	
	
	
}
