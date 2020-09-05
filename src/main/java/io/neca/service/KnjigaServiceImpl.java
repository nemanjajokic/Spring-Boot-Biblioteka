package io.neca.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.neca.dao.KnjigaRepository;

@Service
public class KnjigaServiceImpl {

	@Autowired
	KnjigaRepository knjigaRepo;
	
	@Autowired
	ModelMapper modelMapper;
	
}
