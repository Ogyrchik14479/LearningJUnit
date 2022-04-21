package igor.reznikov.resumeconstructor.repositories;

import igor.reznikov.resume.constructor.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
