package com.vaccinationcentre.Model;

import java.util.List;

public class Centre {
    private String name;
    private String address;
    private List<String> doses;
	public Centre(String name, String address, List<String> doses) {
		super();
		this.name = name;
		this.address = address;
		this.doses = doses;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<String> getDoses() {
		return doses;
	}
	public void setDoses(List<String> doses) {
		this.doses = doses;
	}
    
    
    
}
