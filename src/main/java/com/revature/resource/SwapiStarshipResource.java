package com.revature.resource;

import java.util.List;

import com.revature.model.SwapiStarship;

public class SwapiStarshipResource {

	private int count;
	private String next;
	private String previous;
	private List<SwapiStarship> results;
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
	public List<SwapiStarship> getResults() {
		return results;
	}
	public void setResults(List<SwapiStarship> results) {
		this.results = results;
	}
	@Override
	public String toString() {
		return "SwapiStarshipResource [count=" + count + ", next=" + next + ", previous=" + previous + ", results="
				+ results + "]";
	}
	
	
	
}
