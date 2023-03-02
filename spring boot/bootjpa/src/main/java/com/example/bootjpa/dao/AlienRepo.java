package com.example.bootjpa.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.bootjpa.Alien;

public interface AlienRepo extends CrudRepository<Alien,Integer>
{
	
}
