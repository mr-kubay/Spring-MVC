package ua.online.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ua.online.courses.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer>{

	@Query("select i from Item i where i.name = :name")
	Item findItemByName(@Param("name")String name);
}
