package com.generation.jbay.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Merch extends BaseEntity
{
	private String name,type;
	private int cost;

	@ManyToOne
	@JoinColumn(name = "seller_id")
	private Seller seller;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public int getCost()
	{
		return cost;
	}

	public void setCost(int cost)
	{
		this.cost = cost;
	}

	public Seller getSeller()
	{
		return seller;
	}

	public void setSeller(Seller seller)
	{
		this.seller = seller;
	}


	//	MERCH (item in vendita)
//-id
//-name
//-type
//-cost
//-seller (riferimento padre)
}
