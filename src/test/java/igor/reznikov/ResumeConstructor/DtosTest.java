package igor.reznikov.ResumeConstructor;

import igor.reznikov.ResumeConstructor.dtos.BasicInformationDto;
import igor.reznikov.ResumeConstructor.dtos.CourseDto;
import igor.reznikov.ResumeConstructor.dtos.PersonalInformationDto;
import igor.reznikov.ResumeConstructor.dtos.ResumeDto;
import igor.reznikov.ResumeConstructor.dtos.WorkExperienceDto;
import igor.reznikov.ResumeConstructor.entities.BasicInformation;
import igor.reznikov.ResumeConstructor.entities.Course;
import igor.reznikov.ResumeConstructor.entities.PersonalInformation;
import igor.reznikov.ResumeConstructor.entities.Resume;
import igor.reznikov.ResumeConstructor.entities.WorkExperience;
import igor.reznikov.ResumeConstructor.enums.DegreeOfEducationEnum;
import igor.reznikov.ResumeConstructor.enums.EmploymentTypeEnum;
import igor.reznikov.ResumeConstructor.enums.GenderEnum;
import igor.reznikov.ResumeConstructor.enums.MaritalStatusEnum;
import igor.reznikov.ResumeConstructor.enums.MigrationEnum;
import igor.reznikov.ResumeConstructor.enums.WorkScheduleEnum;
import igor.reznikov.ResumeConstructor.mappers.BasicInformationMapper;
import igor.reznikov.ResumeConstructor.mappers.CourseMapper;
import igor.reznikov.ResumeConstructor.mappers.DateMapper;
import igor.reznikov.ResumeConstructor.mappers.PersonalInformationMapper;
import igor.reznikov.ResumeConstructor.mappers.ResumeMapper;
import igor.reznikov.ResumeConstructor.mappers.WorkExperienceMapper;
import igor.reznikov.ResumeConstructor.repositories.ResumeRepository;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DtosTest {

    @Test
    void toBasicInformationDtoTest() {
        BasicInformation basicInformation = BasicInformation.builder()
                .employmentTypeEnum(EmploymentTypeEnum.FULL)
                .desiredSalary("1000000")
                .email("reznikov.igor@mail.ru")
                .name("Igor")
                .patronymic("Olegovich")
                .surname("Reznikov")
                .telephoneNumber("+79001111111")
                .workScheduleEnum(WorkScheduleEnum.FULL_TIME)
                .build();

        BasicInformationDto basicInformationDto = BasicInformationMapper.INSTANCE.toBasicInformationDto(basicInformation);
        System.out.println(basicInformationDto);
    }

    @Test
    void toBasicInformationTest() {
        BasicInformationDto basicInformationDto = BasicInformationDto.builder()
                .employmentType("FULL")
                .desiredSalary("1000000")
                .email("reznikov.igor@mail.ru")
                .name("Igor")
                .patronymic("Olegovich")
                .surname("Reznikov")
                .telephoneNumber("+79001111111")
                .workSchedule("FULL_TIME")
                .build();

        BasicInformation basicInformation = BasicInformationMapper.INSTANCE.toBasicInformation(basicInformationDto);
        System.out.println(basicInformation);
    }

    @Test
    void toPersonalInformationTest() {
        PersonalInformationDto personalInformationDto = PersonalInformationDto.builder()
                .cityOfResidence("Moscow")
                .citizenship("РФ")
                .dateOfBirth("14.08.1996")
                .gender("MALE")
                .maritalStatus("SINGLE")
                .existenceOfChildren("false")
                .migration("IMPOSSIBLE")
                .degreeOfEducation("HIGHER")
                .build();

        PersonalInformation personalInformation = PersonalInformationMapper.INSTANCE.toPersonalInformation(personalInformationDto);
        System.out.println("");
    }

    @Test
    void toPersonalInformationDtoTest() {
        PersonalInformation personalInformation = PersonalInformation.builder()
                .cityOfResidence("Moscow")
                .citizenship("РФ")
                .dateOfBirth(new Date(839966400000L))
                .genderEnum(GenderEnum.MALE)
                .maritalStatusEnum(MaritalStatusEnum.NOT_MARRIED)
                .existenceOfChildren(false)
                .migrationEnum(MigrationEnum.DESIRABLE)
                .degreeOfEducationEnum(DegreeOfEducationEnum.AVERAGE)
                .build();

        PersonalInformationDto personalInformationDto = PersonalInformationMapper.INSTANCE.toPersonalInformationDto(personalInformation);
        System.out.println("");
    }

    @Test
    void toCourseDto() {
//        DateMapper dateMapper = new DateMapper();

        Course course1 = Course.builder()
                .name("Java developer")
                .institution("SkillBox")
                .startOfCourse(new Date(839966400000L))
                .endOfCourse(new Date(839966400000L))
                .description("A quick way to become a programmer")
                .build();

        CourseDto courseDto = CourseMapper.INSTANCE.toCourseDto(course1);
        System.out.println();
    }

    @Test
    void toWorkExperienceDtoListTest() {
        DateMapper dateMapper = new DateMapper();

        List<WorkExperience> workExperienceList = new ArrayList<>();

        WorkExperience workExperience1 = WorkExperience.builder()
                .organization("Company")
                .position("Java developer")
                .startOfWork(dateMapper.asDate("20.10.2021"))
                .endOfWork(dateMapper.asDate("20.12.2021"))
                .jobResponsibilitiesAndAchievements("write code")
                .build();

        WorkExperience workExperience2 = WorkExperience.builder()
                .organization("Company")
                .position("JavaScript developer")
                .startOfWork(dateMapper.asDate("20.10.2021"))
                .endOfWork(dateMapper.asDate("20.12.2021"))
                .jobResponsibilitiesAndAchievements("write code")
                .build();

        workExperienceList.add(workExperience1);
        workExperienceList.add(workExperience2);

        List<WorkExperienceDto> workExperienceDtoList = WorkExperienceMapper.INSTANCE.toWorkExperienceDtoList(workExperienceList);
        System.out.println();

    }


    @Autowired
    ResumeRepository resumeRepository;

    @Test
    void toResumeDto() {
        DateMapper dateMapper = new DateMapper();
        BasicInformation basicInformation = BasicInformation.builder()
                .employmentTypeEnum(EmploymentTypeEnum.FULL)
                .desiredSalary("1000000")
                .email("reznikov.igor@mail.ru")
                .name("Igor")
                .patronymic("Olegovich")
                .surname("Reznikov")
                .telephoneNumber("+79001111111")
                .workScheduleEnum(WorkScheduleEnum.FULL_TIME)
                .build();

        PersonalInformation personalInformation = PersonalInformation.builder()
                .cityOfResidence("Moscow")
                .citizenship("РФ")
                .dateOfBirth(new Date(839966400000L))
                .genderEnum(GenderEnum.MALE)
                .maritalStatusEnum(MaritalStatusEnum.NOT_MARRIED)
                .existenceOfChildren(false)
                .migrationEnum(MigrationEnum.DESIRABLE)
                .degreeOfEducationEnum(DegreeOfEducationEnum.AVERAGE)
                .build();

        Resume resume = Resume.builder()
                .courseList(new ArrayList<>())
                .personalInformation(personalInformation)
                .basicInformation(basicInformation)
                .build();

        Course course1 = Course.builder()
                .name("Java developer")
                .institution("SkillBox")
                .startOfCourse(dateMapper.asDate("04.09.2021"))
                .endOfCourse(dateMapper.asDate("04.10.2021"))
                .description("A quick way to become a programmer")
                .resume(resume)
                .build();

        Course course2 = Course.builder()
                .name("Java developer")
                .institution("Coursera")
                .startOfCourse(dateMapper.asDate("04.10.2021"))
                .endOfCourse(dateMapper.asDate("04.11.2021"))
                .description("A quick way to become a programmer")
                .resume(resume)
                .build();
        resume.getCourseList().add(course1);
        resume.getCourseList().add(course2);

        ResumeDto resumeDto = ResumeMapper.INSTANCE.toResumeDTO(resume);
        resumeRepository.save(resume);
        System.out.println("");
    }

}
