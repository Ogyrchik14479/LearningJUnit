package igor.reznikov.resumeconstructor.repositories;

import igor.reznikov.resume.constructor.entities.PersonalInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalInformationRepository extends JpaRepository<PersonalInformation, Long> {
}
