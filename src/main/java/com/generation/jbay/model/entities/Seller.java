package com.generation.jbay.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Seller extends BaseEntity
{
	private String username,address;

	@OneToMany(mappedBy = "seller",fetch = FetchType.EAGER)
	private List<Merch> merchs = new ArrayList<>();

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public List<Merch> getMerchs()
	{
		return merchs;
	}

	public void setMerchs(List<Merch> merchs)
	{
		this.merchs = merchs;
	}
}
