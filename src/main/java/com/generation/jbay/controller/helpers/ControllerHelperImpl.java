package com.generation.jbay.controller.helpers;

import com.generation.jbay.model.entities.Merch;
import com.generation.jbay.model.entities.Seller;
import com.generation.jbay.model.repositories.MerchRepository;
import com.generation.jbay.model.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ControllerHelperImpl implements ControllerHelper
{
	@Autowired
	private MerchRepository mRepo;
	@Autowired
	private SellerRepository sRepo;

	@Override
	public List<Merch> findAllMerchs()
	{
		return mRepo.findAll();
	}

	@Override
	public void saveMerch(Merch merch, Integer sellerId)
	{
		merch.setSeller(sRepo.findById(sellerId).get());
		mRepo.save(merch);
	}

	@Override
	public List<Seller> findAllSellers()
	{
		return sRepo.findAll();
	}

	@Override
	public void saveSeller(Seller seller)
	{
		sRepo.save(seller);
	}
}
