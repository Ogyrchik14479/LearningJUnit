package igor.reznikov.resume.constructor;

import igor.reznikov.resume.constructor.dtos.response.BasicInformationView;
import igor.reznikov.resume.constructor.dtos.response.CourseView;
import igor.reznikov.resume.constructor.dtos.response.PersonalInformationView;
import igor.reznikov.resume.constructor.dtos.response.ResumeView;
import igor.reznikov.resume.constructor.dtos.response.WorkExperienceView;
import igor.reznikov.resume.constructor.entities.BasicInformation;
import igor.reznikov.resume.constructor.entities.Course;
import igor.reznikov.resume.constructor.entities.PersonalInformation;
import igor.reznikov.resume.constructor.entities.Resume;
import igor.reznikov.resume.constructor.entities.WorkExperience;
import igor.reznikov.resume.constructor.enums.DegreeOfEducationEnum;
import igor.reznikov.resume.constructor.enums.EmploymentTypeEnum;
import igor.reznikov.resume.constructor.enums.GenderEnum;
import igor.reznikov.resume.constructor.enums.MaritalStatusEnum;
import igor.reznikov.resume.constructor.enums.MigrationEnum;
import igor.reznikov.resume.constructor.enums.WorkScheduleEnum;
import igor.reznikov.resume.constructor.mappers.BasicInformationMapper;
import igor.reznikov.resume.constructor.mappers.CourseMapper;
import igor.reznikov.resume.constructor.mappers.DateMapper;
import igor.reznikov.resume.constructor.mappers.PersonalInformationMapper;
import igor.reznikov.resume.constructor.mappers.ResumeMapper;
import igor.reznikov.resume.constructor.mappers.WorkExperienceMapper;
import igor.reznikov.resumeconstructor.repositories.ResumeRepository;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DtosTest {

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

        BasicInformationView basicInformationView = BasicInformationMapper.INSTANCE.toBasicInformationDto(basicInformation);
        System.out.println(basicInformationView);
    }

    @Test
    void toBasicInformationTest() {
        BasicInformationView basicInformationView = BasicInformationView.builder()
                .employmentType("FULL")
                .desiredSalary("1000000")
                .email("reznikov.igor@mail.ru")
                .name("Igor")
                .patronymic("Olegovich")
                .surname("Reznikov")
                .telephoneNumber("+79001111111")
                .workSchedule("FULL_TIME")
                .build();

        BasicInformation basicInformation = BasicInformationMapper.INSTANCE.toBasicInformation(basicInformationView);
        System.out.println(basicInformation);
    }

    @Test
    void toPersonalInformationTest() {
        PersonalInformationView personalInformationView = PersonalInformationView.builder()
                .cityOfResidence("Moscow")
                .citizenship("РФ")
                .dateOfBirth("14.08.1996")
                .gender("MALE")
                .maritalStatus("SINGLE")
                .existenceOfChildren("false")
                .migration("IMPOSSIBLE")
                .degreeOfEducation("HIGHER")
                .build();

        PersonalInformation personalInformation = PersonalInformationMapper.INSTANCE.toPersonalInformation(personalInformationView);
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

        PersonalInformationView personalInformationView = PersonalInformationMapper.INSTANCE.toPersonalInformationDto(personalInformation);
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

        CourseView courseView = CourseMapper.INSTANCE.toCourseDto(course1);
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

        List<WorkExperienceView> workExperienceViewList = WorkExperienceMapper.INSTANCE.toWorkExperienceDtoList(workExperienceList);
        System.out.println();

    }


    @Autowired
    ResumeRepository resumeRepository;

    @Test
    void toResumeDto() {
        DateMapper dateMapper = new DateMapper();

        Resume resume = Resume.builder()
                .courseList(new ArrayList<>())
                .build();


        BasicInformation basicInformation = BasicInformation.builder()
                .employmentTypeEnum(EmploymentTypeEnum.FULL)
                .desiredSalary("1000000")
                .email("reznikov.igor@mail.ru")
                .name("Igor")
                .patronymic("Olegovich")
                .surname("Reznikov")
                .telephoneNumber("+79001111111")
                .workScheduleEnum(WorkScheduleEnum.FULL_TIME)
                .resume(resume)
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
                .resume(resume)
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
        resume.setBasicInformation(basicInformation);
        resume.setPersonalInformation(personalInformation);

        ResumeView resumeView = ResumeMapper.INSTANCE.toResumeDTO(resume);
        Resume resume1 = resumeRepository.save(resume);
        System.out.println("");
    }

}
