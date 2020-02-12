package com.fedex.pojo;

public class OrderMaster {
	private int itemId;
	private int weight;
	private String source;
	private String destination;
	private int price;
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "OrderMaster [itemId=" + itemId + ", weight=" + weight + ", source=" + source + ", destination="
				+ destination + ", price=" + price + "]";
	}
	
}
