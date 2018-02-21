package ua.online.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.online.courses.entity.Questionairre;

@Repository
public interface QuestionRepository extends JpaRepository<Questionairre, Integer>{

}
