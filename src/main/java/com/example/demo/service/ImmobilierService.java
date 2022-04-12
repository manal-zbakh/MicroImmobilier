package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Immobilier;

public interface ImmobilierService {
public Immobilier save(Immobilier im);
public Immobilier update(Immobilier im);
public void delete(String id);
public Immobilier getById(String id);
public List<Immobilier>getAll();
public Immobilier getBycode(String code);
}
