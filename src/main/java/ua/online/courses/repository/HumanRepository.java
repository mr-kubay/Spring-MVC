package ua.online.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.online.courses.entity.Human;


@Repository
public interface HumanRepository extends JpaRepository<Human, Integer>{

}