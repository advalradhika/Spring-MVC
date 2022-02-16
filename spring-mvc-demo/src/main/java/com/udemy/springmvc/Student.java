package com.udemy.springmvc;

import java.util.LinkedHashMap;

public class Student {

	String firstName;
	String lastName;
	String country;
	String favouriteLanguage;
	String[] operatingSystems;
	private LinkedHashMap<String, String> countryList;

	public Student() {
		countryList = new LinkedHashMap<>();
		countryList.put("India", "India");
		countryList.put("Australia", "Australia");
		countryList.put("England", "England");
		countryList.put("New Zealand", "New Zealand");
		countryList.put("Germany", "Germany");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryList() {
		return countryList;
	}

	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}

	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

}
