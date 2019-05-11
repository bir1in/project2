package com.revature.model;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SwapiStarship {

	private String name;
	private String model;
	private String manufacturer;
	
	@JsonProperty("cost_in_credits")
	private String costincredits;
	private String length;
	
	@JsonProperty("max_atmosphering_speed")
	private String maxatmostpheringspeed;
	private String crew;
	private String passengers;
	
	@JsonProperty("cargo_capacity")
	private String cargo;
	
	private String consumables;
	
	@JsonProperty("hyperdrive_rating")
	private String hyperdriverating;
	
	private String MGLT;
	
	@JsonProperty("starship_class")
	private String starshipclass;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getCostincredits() {
		return costincredits;
	}
	public void setCostincredits(String costincredits) {
		this.costincredits = costincredits;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getMaxatmostpheringspeed() {
		return maxatmostpheringspeed;
	}
	public void setMaxatmostpheringspeed(String maxatmostpheringspeed) {
		this.maxatmostpheringspeed = maxatmostpheringspeed;
	}
	public String getCrew() {
		return crew;
	}
	public void setCrew(String crew) {
		this.crew = crew;
	}
	public String getPassengers() {
		return passengers;
	}
	public void setPassengers(String passengers) {
		this.passengers = passengers;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getConsumables() {
		return consumables;
	}
	public void setConsumables(String consumables) {
		this.consumables = consumables;
	}
	public String getHyperdriverating() {
		return hyperdriverating;
	}
	public void setHyperdriverating(String hyperdriverating) {
		this.hyperdriverating = hyperdriverating;
	}
	public String getMGLT() {
		return MGLT;
	}
	public void setMGLT(String mGLT) {
		MGLT = mGLT;
	}
	public String getStarshipclass() {
		return starshipclass;
	}
	public void setStarshipclass(String starshipclass) {
		this.starshipclass = starshipclass;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((MGLT == null) ? 0 : MGLT.hashCode());
		result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
		result = prime * result + ((consumables == null) ? 0 : consumables.hashCode());
		result = prime * result + ((costincredits == null) ? 0 : costincredits.hashCode());
		result = prime * result + ((crew == null) ? 0 : crew.hashCode());
		result = prime * result + ((hyperdriverating == null) ? 0 : hyperdriverating.hashCode());
		result = prime * result + ((length == null) ? 0 : length.hashCode());
		result = prime * result + ((manufacturer == null) ? 0 : manufacturer.hashCode());
		result = prime * result + ((maxatmostpheringspeed == null) ? 0 : maxatmostpheringspeed.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((passengers == null) ? 0 : passengers.hashCode());
		result = prime * result + ((starshipclass == null) ? 0 : starshipclass.hashCode());
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
		if (MGLT == null) {
			if (other.MGLT != null)
				return false;
		} else if (!MGLT.equals(other.MGLT))
			return false;
		if (cargo == null) {
			if (other.cargo != null)
				return false;
		} else if (!cargo.equals(other.cargo))
			return false;
		if (consumables == null) {
			if (other.consumables != null)
				return false;
		} else if (!consumables.equals(other.consumables))
			return false;
		if (costincredits == null) {
			if (other.costincredits != null)
				return false;
		} else if (!costincredits.equals(other.costincredits))
			return false;
		if (crew == null) {
			if (other.crew != null)
				return false;
		} else if (!crew.equals(other.crew))
			return false;
		if (hyperdriverating == null) {
			if (other.hyperdriverating != null)
				return false;
		} else if (!hyperdriverating.equals(other.hyperdriverating))
			return false;
		if (length == null) {
			if (other.length != null)
				return false;
		} else if (!length.equals(other.length))
			return false;
		if (manufacturer == null) {
			if (other.manufacturer != null)
				return false;
		} else if (!manufacturer.equals(other.manufacturer))
			return false;
		if (maxatmostpheringspeed == null) {
			if (other.maxatmostpheringspeed != null)
				return false;
		} else if (!maxatmostpheringspeed.equals(other.maxatmostpheringspeed))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (passengers == null) {
			if (other.passengers != null)
				return false;
		} else if (!passengers.equals(other.passengers))
			return false;
		if (starshipclass == null) {
			if (other.starshipclass != null)
				return false;
		} else if (!starshipclass.equals(other.starshipclass))
			return false;
		return true;
	}
	public SwapiStarship(String name, String model, String manufacturer, String costincredits, String length,
			String maxatmostpheringspeed, String crew, String passengers, String cargo, String consumables,
			String hyperdriverating, String mGLT, String starshipclass) {
		super();
		this.name = name;
		this.model = model;
		this.manufacturer = manufacturer;
		this.costincredits = costincredits;
		this.length = length;
		this.maxatmostpheringspeed = maxatmostpheringspeed;
		this.crew = crew;
		this.passengers = passengers;
		this.cargo = cargo;
		this.consumables = consumables;
		this.hyperdriverating = hyperdriverating;
		MGLT = mGLT;
		this.starshipclass = starshipclass;
	}
	
	public SwapiStarship() {
		
	}
}
	
	

	
	



