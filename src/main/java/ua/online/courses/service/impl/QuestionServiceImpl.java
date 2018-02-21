package ua.online.courses.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.online.courses.entity.Questionairre;
import ua.online.courses.repository.QuestionRepository;
import ua.online.courses.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService{

	@Autowired
	private QuestionRepository questionRepository;
	
	@Override
	public void saveQuest(Questionairre q) {
		questionRepository.save(q);
	}

	@Override
	public List<Questionairre> findAll() {
		return questionRepository.findAll();
	}
}
