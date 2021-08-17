package igor.reznikov.LearnJUnit.repositories;

import igor.reznikov.LearnJUnit.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
