package com.revature.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class SwapiPlanet {
	private String name;
	@JsonProperty("rotation_period")
	private String rotationperiod;
	@JsonProperty("orbital_period")
	private String orbitalperiod;
	private String diameter;
	private String climate;
	private String gravity;
	private String terrain;
	@JsonProperty("surface_water")
	private String surfacewater;
	private String population;
	public SwapiPlanet() {
		
	}
	public SwapiPlanet(String name, String rotationperiod, String orbitalperiod, String diameter, String climate,
			String gravity, String terrain, String surfacewater, String population) {
		super();
		this.name = name;
		this.rotationperiod = rotationperiod;
		this.orbitalperiod = orbitalperiod;
		this.diameter = diameter;
		this.climate = climate;
		this.gravity = gravity;
		this.terrain = terrain;
		this.surfacewater = surfacewater;
		this.population = population;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRotationperiod() {
		return rotationperiod;
	}
	public void setRotationperiod(String rotationperiod) {
		this.rotationperiod = rotationperiod;
	}
	public String getOrbitalperiod() {
		return orbitalperiod;
	}
	public void setOrbitalperiod(String orbitalperiod) {
		this.orbitalperiod = orbitalperiod;
	}
	public String getDiameter() {
		return diameter;
	}
	public void setDiameter(String diameter) {
		this.diameter = diameter;
	}
	public String getClimate() {
		return climate;
	}
	public void setClimate(String climate) {
		this.climate = climate;
	}
	public String getGravity() {
		return gravity;
	}
	public void setGravity(String gravity) {
		this.gravity = gravity;
	}
	public String getTerrain() {
		return terrain;
	}
	public void setTerrain(String terrain) {
		this.terrain = terrain;
	}
	public String getSurfacewater() {
		return surfacewater;
	}
	public void setSurfacewater(String surfacewater) {
		this.surfacewater = surfacewater;
	}
	public String getPopulation() {
		return population;
	}
	public void setPopulation(String population) {
		this.population = population;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((climate == null) ? 0 : climate.hashCode());
		result = prime * result + ((diameter == null) ? 0 : diameter.hashCode());
		result = prime * result + ((gravity == null) ? 0 : gravity.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((orbitalperiod == null) ? 0 : orbitalperiod.hashCode());
		result = prime * result + ((population == null) ? 0 : population.hashCode());
		result = prime * result + ((rotationperiod == null) ? 0 : rotationperiod.hashCode());
		result = prime * result + ((surfacewater == null) ? 0 : surfacewater.hashCode());
		result = prime * result + ((terrain == null) ? 0 : terrain.hashCode());
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
		SwapiPlanet other = (SwapiPlanet) obj;
		if (climate == null) {
			if (other.climate != null)
				return false;
		} else if (!climate.equals(other.climate))
			return false;
		if (diameter == null) {
			if (other.diameter != null)
				return false;
		} else if (!diameter.equals(other.diameter))
			return false;
		if (gravity == null) {
			if (other.gravity != null)
				return false;
		} else if (!gravity.equals(other.gravity))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (orbitalperiod == null) {
			if (other.orbitalperiod != null)
				return false;
		} else if (!orbitalperiod.equals(other.orbitalperiod))
			return false;
		if (population == null) {
			if (other.population != null)
				return false;
		} else if (!population.equals(other.population))
			return false;
		if (rotationperiod == null) {
			if (other.rotationperiod != null)
				return false;
		} else if (!rotationperiod.equals(other.rotationperiod))
			return false;
		if (surfacewater == null) {
			if (other.surfacewater != null)
				return false;
		} else if (!surfacewater.equals(other.surfacewater))
			return false;
		if (terrain == null) {
			if (other.terrain != null)
				return false;
		} else if (!terrain.equals(other.terrain))
			return false;
		return true;
	}
	
	
	
	
	
}
