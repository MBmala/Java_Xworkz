package com.xworkz.example.dto;

public class CountryDTO {
	private String name;
	private String continent;
	private String[] states;
	private long population;
	private String primeMinister;
	private String president;
	private String[] languages;

	public CountryDTO() {
		
	}
	
	public CountryDTO(String name,String continent,long population,String primeMinister,String president) {
		this.name=name;
		this.continent=continent;
		this.population=population;
		this.primeMinister=primeMinister;
		this.president=president;
	}

	public CountryDTO(String name,String continent,String[] states,long population,String primeMinister,String president,String[] languages) 
	{
		this.name=name;
		this.continent=continent;
		this.states=states;
		this.population=population;
		this.primeMinister=primeMinister;
		this.president=president;
		this.languages=languages;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String[] getStates() {
		return states;
	}

	public void setStates(String[] states) {
		this.states = states;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public String getPrimeMinister() {
		return primeMinister;
	}

	public void setPrimeMinister(String primeMinister) {
		this.primeMinister = primeMinister;
	}

	public String getPresident() {
		return president;
	}

	public void setPresident(String president) {
		this.president = president;
	}

	public String[] getLanguages() {
		return languages;
	}

	public void setLanguages(String[] languages) {
		this.languages = languages;
	}

		

}
