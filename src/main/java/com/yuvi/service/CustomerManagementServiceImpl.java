package com.yuvi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuvi.Entity.Movie;
import com.yuvi.repository.ICustomerRepository;

@Service("movieService")
public class CustomerManagementServiceImpl implements ICustomerManagementService {
	@Autowired
	private ICustomerRepository movieRepo;

	@Override
	public Movie searchMovieById(Integer id) {
	Movie movie = movieRepo.getById(id);
		return movie;
	}
	
	}
