package igor.reznikov.ResumeConstructor.repositories;

import igor.reznikov.ResumeConstructor.entities.Resume;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResumeRepository extends JpaRepository<Resume, Long> {
}
