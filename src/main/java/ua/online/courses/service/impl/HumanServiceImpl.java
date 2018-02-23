package ua.online.courses.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.online.courses.entity.Human;
import ua.online.courses.repository.HumanRepository;
import ua.online.courses.service.HumanService;


@Service
public class HumanServiceImpl implements HumanService{

	@Autowired
	private HumanRepository hrep;
	
	@Override
	public void saveHuman(Human h) {
		hrep.save(h);
	}

	@Override
	public List<Human> findAll() {
		return hrep.findAll();
	}
	
}
