package com.generation.jbay.controller.helpers;

import com.generation.jbay.model.entities.Merch;
import com.generation.jbay.model.entities.Seller;

import java.util.List;

public interface ControllerHelper
{
	List<Merch> findAllMerchs();

	void saveMerch(Merch merch, Integer sellerId);

	List<Seller> findAllSellers();

	void saveSeller(Seller seller);
}
