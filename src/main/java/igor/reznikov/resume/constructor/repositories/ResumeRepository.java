package igor.reznikov.resume.constructor.repositories;

import igor.reznikov.resume.constructor.entities.Resume;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResumeRepository extends JpaRepository<Resume, Long> {
}
