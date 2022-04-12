package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Client;
import com.example.demo.entities.Immobilier;
import com.example.demo.service.ImmobilierService;

@RestController
@RequestMapping("immobilier")
public class ImmobilierController {
@Autowired
ImmobilierService i;
	@GetMapping("all")
	public List<Immobilier> getAll(){
		return i.getAll();
	}
	@GetMapping("/{id}")
	public Immobilier getById(@PathVariable String id) {
		return i.getById(id);
	}
	
	@PostMapping("save")
	public Immobilier save(@RequestBody Immobilier im) {
		return i.save(im);
	}
	@GetMapping("code/{code}")
	public Immobilier getByode(@PathVariable String code) {	
		return i.getBycode(code);
	}
	@GetMapping("delete/{code}")
	public void deleteByode(@PathVariable String code) {	
		 i.delete(code);
	}	
}
