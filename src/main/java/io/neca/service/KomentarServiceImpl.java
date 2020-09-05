package io.neca.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.neca.dao.KomentarRepository;

@Service
public class KomentarServiceImpl implements KomentarService {

	@Autowired
	KomentarRepository komentarRepo;
	
	@Autowired
	ModelMapper modelMapper;
	
}
