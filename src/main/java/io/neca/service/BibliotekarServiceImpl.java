package io.neca.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.neca.dao.BibliotekarRepository;

@Service
public class BibliotekarServiceImpl {

	@Autowired
	BibliotekarRepository bibliotekarRepo;
	
	@Autowired
	ModelMapper modelMapper;
	
}
