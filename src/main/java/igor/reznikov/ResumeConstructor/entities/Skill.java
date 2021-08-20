package igor.reznikov.ResumeConstructor.entities;

import igor.reznikov.ResumeConstructor.enums.SkillLevelEnum;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
@Table(name = "skills")
public class Skill extends AbstractPersistable<Long> {

    String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "skill_level")
    SkillLevelEnum skillLevelEnum;

    @ManyToOne
    @JoinColumn(name = "resume_id")
    Resume resume;
}
