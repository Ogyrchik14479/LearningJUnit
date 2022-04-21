package igor.reznikov.resume.constructor.repositories;

import igor.reznikov.resume.constructor.entities.BasicInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasicInformationRepository extends JpaRepository<BasicInformation, Long> {
}
