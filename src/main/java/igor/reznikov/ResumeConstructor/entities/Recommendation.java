package igor.reznikov.ResumeConstructor.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "recommendations")
public class Recommendation extends AbstractPersistable<Long> {

    @Column(name = "company_name")
    String companyName;

    @Column(name = "contact_person")
    String contactPerson;

    @Column(name = "telephone_number")
    String telephoneNumber;

    String email;

    @ManyToOne
    @JoinColumn(name = "resume_id")
    Resume resume;
}
