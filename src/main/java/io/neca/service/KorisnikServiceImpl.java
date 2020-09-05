package io.neca.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.neca.dao.KorisnikRepository;

@Service
public class KorisnikServiceImpl implements KorisnikService {

	@Autowired
	KorisnikRepository korisnikRepo;
	
	@Autowired
	ModelMapper modelMapper;
	
}
