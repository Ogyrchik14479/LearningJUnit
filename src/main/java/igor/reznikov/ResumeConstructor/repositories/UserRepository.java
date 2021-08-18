package igor.reznikov.ResumeConstructor.repositories;

import igor.reznikov.ResumeConstructor.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
