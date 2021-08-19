package igor.reznikov.ResumeConstructor.repositories;

import igor.reznikov.ResumeConstructor.entities.BasicInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasicInformationRepository extends JpaRepository<BasicInformation, Long> {
}
