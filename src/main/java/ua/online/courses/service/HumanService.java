package ua.online.courses.service;

import java.util.List;

import ua.online.courses.entity.Human;


public interface HumanService {
	void saveHuman(Human h);
	List<Human> findAll();
}
