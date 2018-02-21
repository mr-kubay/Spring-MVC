package ua.online.courses.service;

import java.util.List;

import ua.online.courses.entity.Questionairre;

public interface QuestionService {

	void saveQuest(Questionairre q);
	
	List<Questionairre> findAll();
}
