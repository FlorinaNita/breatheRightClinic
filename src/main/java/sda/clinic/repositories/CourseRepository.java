package sda.clinic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sda.clinic.entities.CourseEntity;

@Repository
public interface CourseRepository extends JpaRepository<CourseEntity, Integer> {

}
