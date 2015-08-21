package com.journaldev.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity(name = "Address")
@Table(name = "Address", uniqueConstraints = { @UniqueConstraint(columnNames = { "ADD_ID" }) })
public class Address {

	@Id
	@Column(name = "ADD_ID")
	private int id;

	@Column(name = "ADD_STREET", length = 50)
	private String street;

	@Column(name = "ADD_CITY", length = 30)
	private String city;

	@Column(name = "ADD_COUNTRY")
	private String country;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city + ", country=" + country + "]";
	}

}
