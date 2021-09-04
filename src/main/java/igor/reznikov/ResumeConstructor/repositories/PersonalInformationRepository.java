package igor.reznikov.ResumeConstructor.repositories;

import igor.reznikov.ResumeConstructor.entities.BasicInformation;
import igor.reznikov.ResumeConstructor.entities.PersonalInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalInformationRepository extends JpaRepository<PersonalInformation, Long> {
}
