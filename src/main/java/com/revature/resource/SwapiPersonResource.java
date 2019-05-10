package com.revature.resource;

import java.util.List;
import com.revature.model.SwapiPerson;

public class SwapiPersonResource {

	private int count;
	private String next;
	private String previous;
	private List<SwapiPerson> results;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getNext() {
		return next;
	}

	public void setNext(String next) {
		this.next = next;
	}

	public String getPrevious() {
		return previous;
	}

	public void setPrevious(String previous) {
		this.previous = previous;
	}

	public List<SwapiPerson> getResults() {
		return results;
	}

	public void setResults(List<SwapiPerson> results) {
		this.results = results;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SwapiPersonResource [count=");
		builder.append(count);
		builder.append(", next=");
		builder.append(next);
		builder.append(", previous=");
		builder.append(previous);
		builder.append(", results=");
		builder.append(results);
		builder.append("]");
		return builder.toString();
	}

	
	
	
	
}

