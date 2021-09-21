package spring.pag060.spel;

import java.util.List;

public class City {
	private String name;
	private String state;
	private int population;
	private List<String> itemList;
	private String chosenCity;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public String getChosenCity() {
		return chosenCity;
	}
	public void setChosenCity(String chosenCity) {
		this.chosenCity = chosenCity;
	}
	public List<String> getItemList() {
		return itemList;
	}
	public void setItemList(List<String> itemList) {
		this.itemList = itemList;
	}
	
}
