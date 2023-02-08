package com.urlhitcounter.urlHitCounter;

public class UrlHit {
	private String name;
	private int count;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public UrlHit(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}
	@Override
	public String toString() {
		return "UrlHit [name=" + name + ", count=" + count + "]";
	}
	

}
