package igor.reznikov.LearnJUnit.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class User extends AbstractPersistable<Long> {

    String name;

    String patronymic;

    String surname;

    @Enumerated(EnumType.STRING)
    Gender gender;
}
