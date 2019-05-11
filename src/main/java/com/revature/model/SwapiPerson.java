package com.revature.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

//in project2
@JsonIgnoreProperties(ignoreUnknown = true)
public class SwapiPerson 
{
	private String name;
	private int height;

	@JsonProperty("hair_color")
	private String hairColor;

	@JsonProperty("skin_color")
	private String skinColor;

	@JsonProperty("eye_color")
	private String eyeColor;

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

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	public String getSkinColor() {
		return skinColor;
	}

	public void setSkinColor(String skinColor) {
		this.skinColor = skinColor;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SwapiPerson [name=");
		builder.append(name);
		builder.append(", height=");
		builder.append(height);
		builder.append(", hairColor=");
		builder.append(hairColor);
		builder.append(", skinColor=");
		builder.append(skinColor);
		builder.append(", eyeColor=");
		builder.append(eyeColor);
		builder.append("]");
		return builder.toString();
	}

}