package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Immobilier;
import com.example.demo.repository.ImmobilierRepository;
@Service
public class ImmobilierServiceImp implements ImmobilierService{
   @Autowired
   ImmobilierRepository imo;
	@Override
	public Immobilier save(Immobilier im) {
		// TODO Auto-generated method stub
		return imo.save(im);
	}

	@Override
	public Immobilier update(Immobilier im) {
		// TODO Auto-generated method stub
		return imo.save(im);
	}

	@Override
	public void delete(String id) {
		imo.deleteById(id);
		
	}

	@Override
	public Immobilier getById(String id) {
		// TODO Auto-generated method stub
		return imo.findById(id).get();
	}

	@Override
	public List<Immobilier> getAll() {
		// TODO Auto-generated method stub
		return imo.findAll();
	}

	@Override
	public Immobilier getBycode(String code) {
		// TODO Auto-generated method stub
		return imo.getImmobilierByCodeImmobilier(code);
	}

}
