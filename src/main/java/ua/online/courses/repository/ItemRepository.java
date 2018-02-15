package ua.online.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.online.courses.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer>{

}
