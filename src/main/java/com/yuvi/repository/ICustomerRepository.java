package com.yuvi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.yuvi.Entity.Movie;

public interface ICustomerRepository extends JpaRepository<Movie, Integer> {

	

}
