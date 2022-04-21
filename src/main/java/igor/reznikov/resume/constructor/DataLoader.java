package igor.reznikov.resume.constructor;

import igor.reznikov.resume.constructor.entities.Achievement;
import igor.reznikov.resume.constructor.entities.BasicInformation;
import igor.reznikov.resume.constructor.entities.Course;
import igor.reznikov.resume.constructor.entities.CustomizableSection;
import igor.reznikov.resume.constructor.entities.Education;
import igor.reznikov.resume.constructor.entities.Hobby;
import igor.reznikov.resume.constructor.entities.Language;
import igor.reznikov.resume.constructor.entities.PersonalInformation;
import igor.reznikov.resume.constructor.entities.Publication;
import igor.reznikov.resume.constructor.entities.Recommendation;
import igor.reznikov.resume.constructor.entities.Resume;
import igor.reznikov.resume.constructor.entities.Skill;
import igor.reznikov.resume.constructor.entities.WorkExperience;
import igor.reznikov.resume.constructor.enums.DegreeOfEducationEnum;
import igor.reznikov.resume.constructor.enums.EmploymentTypeEnum;
import igor.reznikov.resume.constructor.enums.FormOfEducationEnum;
import igor.reznikov.resume.constructor.enums.GenderEnum;
import igor.reznikov.resume.constructor.enums.LanguageLevelEnum;
import igor.reznikov.resume.constructor.enums.MaritalStatusEnum;
import igor.reznikov.resume.constructor.enums.MigrationEnum;
import igor.reznikov.resume.constructor.enums.SkillLevelEnum;
import igor.reznikov.resume.constructor.enums.WorkScheduleEnum;
import igor.reznikov.resume.constructor.mappers.DateMapper;
import igor.reznikov.resumeconstructor.repositories.ResumeRepository;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    ResumeRepository resumeRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        DateMapper dateMapper = new DateMapper();
        if (resumeRepository.findAll().size() == 0){
            Resume resume1 = new Resume();

            PersonalInformation personalInformation1 = createPersonalInformation("Moscow", "РФ", dateMapper.asDate("12.05.1996"), GenderEnum.MALE, MaritalStatusEnum.NOT_MARRIED, false, MigrationEnum.IMPOSSIBLE, DegreeOfEducationEnum.HIGHER, resume1);
            BasicInformation basicInformation = createBasicInformation(EmploymentTypeEnum.FULL, "100.000", "test@mail.ru", "Александр", "Радионович", "Барадач", "+79998989898", WorkScheduleEnum.FULL_TIME, resume1);

            Achievement achievement1 = createAchievement("Что-то сделал хорошее", resume1);
            Achievement achievement2 = createAchievement("Что-то сделал хорошее2", resume1);
            Collection<Achievement> achievementList = Arrays.asList(achievement1, achievement2);

            Course course1 = createCourse("С нуля до гуру за 5 минут", "Институт бичей", dateMapper.asDate("10.10.2020"), dateMapper.asDate("10.12.2020"), "стань бичом за 5 минут", resume1);
            Course course2 = createCourse("научить ходить за 80 минут", "Институт бичей", dateMapper.asDate("12.10.2020"), dateMapper.asDate("10.12.2021"), "научить ходить за 80 минут", resume1);
            Collection<Course>courseList =  Arrays.asList(course1, course2);

            CustomizableSection customizableSection1 = createCustomizableSection("Моя кастомная категория1", "я есть грут", resume1);
            CustomizableSection customizableSection2 = createCustomizableSection("Моя кастомная категория2", "я есть калбаса", resume1);
            Collection<CustomizableSection> customizableSectionList = Arrays.asList(customizableSection1, customizableSection2);

            Education education1 = createEducation("Бауманка", "факультет изучения резиновых пик", "как с резиновой пикой захватить мир?", FormOfEducationEnum.INTRAMURAL, 2024, resume1);
            Education education2 = createEducation("МГУ", "Информационные технологии", "И всё же как захватить мир с реиновой пикой?", FormOfEducationEnum.INTRAMURAL, 2020, resume1);
            Collection<Education> educationList = Arrays.asList(education1, education2);

            Hobby hobby1 = createHobby("Бросать ружью на дальность", resume1);
            Hobby hobby2 = createHobby("Писать лёжа", resume1);
            Collection<Hobby> hobbyList = Arrays.asList(hobby1, hobby2);

            Language language1 = createLanguage("Аллкашный", LanguageLevelEnum.ADVANCED, resume1);
            Language language2 = createLanguage("Русский", LanguageLevelEnum.ADVANCED, resume1);
            Collection<Language> languageList = Arrays.asList(language1, language2);

            Publication publication1 =createPublication("Подкаты к Иринке", "https://stackoverflow.com/", "Научу как подкатывать к любой Иринке на районе", resume1);
            Publication publication2 =createPublication("О Маринке", "https://stackoverflow.com/", "Маринка наше всё", resume1);
            Collection<Publication> publicationList = Arrays.asList(publication1, publication2);

            Recommendation recommendation1 = createRecommendation("Google", "pedro avacado", "+79999999999", "pedro@mail.ru", resume1);
            Recommendation recommendation2 = createRecommendation("Yandex", "pedro innokentiev", "+79999999999", "innokentiev@mail.ru", resume1);
            Collection<Recommendation> recommendationList = Arrays.asList(recommendation1, recommendation2);

            Skill skill1 = createSkill("java", SkillLevelEnum.NOVICE, resume1);
            Skill skill2 = createSkill("javaScript", SkillLevelEnum.BEGINNER, resume1);
            Collection<Skill> skillList = Arrays.asList(skill1, skill2);

            WorkExperience workExperience1 = createWorkExperience("Google", "java-developer", dateMapper.asDate("10.10.2020"), dateMapper.asDate("10.12.2020"), "уронил прод", resume1);
            WorkExperience workExperience2 = createWorkExperience("Yandex", "Yandex-developer", dateMapper.asDate("10.12.2020"), dateMapper.asDate("10.02.2021"), "уронил прод", resume1);
            Collection<WorkExperience> workExperienceList = Arrays.asList(workExperience1, workExperience2);

            resume1 = createResume(resume1, basicInformation, personalInformation1, workExperienceList, educationList, courseList, achievementList, publicationList, skillList, languageList, hobbyList, customizableSectionList, recommendationList);

            resumeRepository.save(resume1);
        }
    }

    private Achievement createAchievement(String description, Resume resume) {
        return Achievement.builder()
                .description(description)
                .resume(resume)
                .build();
    }

    private BasicInformation createBasicInformation(EmploymentTypeEnum employmentTypeEnum,
                                                    String desiredSalary,
                                                    String email,
                                                    String name,
                                                    String patronymic,
                                                    String surname,
                                                    String telephoneNumber,
                                                    WorkScheduleEnum workScheduleEnum,
                                                    Resume resume) {
        return BasicInformation.builder()
                .employmentTypeEnum(employmentTypeEnum)
                .desiredSalary(desiredSalary)
                .email(email)
                .name(name)
                .patronymic(patronymic)
                .surname(surname)
                .telephoneNumber(telephoneNumber)
                .workScheduleEnum(workScheduleEnum)
                .resume(resume)
                .build();
    }

    private Course createCourse(String name, String institution, Date startOfCourse, Date endOfCourse, String description, Resume resume) {
        return Course.builder()
                .name(name)
                .institution(institution)
                .startOfCourse(startOfCourse)
                .endOfCourse(endOfCourse)
                .description(description)
                .resume(resume)
                .build();
    }

    private CustomizableSection createCustomizableSection(String sectionName, String text, Resume resume) {
        return CustomizableSection.builder()
                .sectionName(sectionName)
                .text(text)
                .resume(resume)
                .build();
    }

    private Education createEducation(String institution, String faculty, String specialization, FormOfEducationEnum formOfEducationEnum, Integer yearOfGraduation, Resume resume) {
        return Education.builder()
                .institution(institution)
                .faculty(faculty)
                .specialization(specialization)
                .formOfEducationEnum(formOfEducationEnum)
                .yearOfGraduation(yearOfGraduation)
                .resume(resume)
                .build();
    }

    private Hobby createHobby(String name, Resume resume) {
        return Hobby.builder()
                .name(name)
                .resume(resume)
                .build();
    }

    private Language createLanguage(String name, LanguageLevelEnum languageLevelEnum, Resume resume) {
        return Language.builder()
                .name(name)
                .languageLevelEnum(languageLevelEnum)
                .resume(resume)
                .build();
    }

    private PersonalInformation createPersonalInformation(String city,
                                                          String citizenship,
                                                          Date date,
                                                          GenderEnum genderEnum,
                                                          MaritalStatusEnum maritalStatusEnum,
                                                          boolean existenceOfChildren,
                                                          MigrationEnum migrationEnum,
                                                          DegreeOfEducationEnum degreeOfEducationEnum,
                                                          Resume resume) {
        return PersonalInformation.builder()
                .cityOfResidence(city)
                .citizenship(citizenship)
                .dateOfBirth(date)
                .genderEnum(genderEnum)
                .maritalStatusEnum(maritalStatusEnum)
                .existenceOfChildren(existenceOfChildren)
                .migrationEnum(migrationEnum)
                .degreeOfEducationEnum(degreeOfEducationEnum)
                .resume(resume)
                .build();
    }

    private Publication createPublication(String name, String link, String description, Resume resume) {
        return Publication.builder()
                .name(name)
                .link(link)
                .description(description)
                .resume(resume)
                .build();
    }

    private Recommendation createRecommendation(String companyName, String contactPerson, String telephoneNumber, String email, Resume resume) {
        return Recommendation.builder()
                .companyName(companyName)
                .contactPerson(contactPerson)
                .telephoneNumber(telephoneNumber)
                .email(email)
                .resume(resume)
                .build();
    }

    private Skill createSkill(String name, SkillLevelEnum skillLevelEnum, Resume resume) {
        return Skill.builder()
                .name(name)
                .skillLevelEnum(skillLevelEnum)
                .resume(resume)
                .build();
    }

    private WorkExperience createWorkExperience(String organization, String position, Date startOfWork, Date endOfWork, String jobResponsibilitiesAndAchievements, Resume resume) {
        return WorkExperience.builder()
                .organization(organization)
                .position(position)
                .startOfWork(startOfWork)
                .endOfWork(endOfWork)
                .jobResponsibilitiesAndAchievements(jobResponsibilitiesAndAchievements)
                .resume(resume)
                .build();
    }

    private Resume createResume(Resume resume,
                                BasicInformation basicInformation,
                                PersonalInformation personalInformation,
                                Collection<WorkExperience> workExperienceList,
                                Collection<Education> educationList,
                                Collection<Course> courseList,
                                Collection<Achievement> achievementList,
                                Collection<Publication> publicationList,
                                Collection<Skill> skillList,
                                Collection<Language> languageList,
                                Collection<Hobby> hobbyList,
                                Collection<CustomizableSection> customizableSectionList,
                                Collection<Recommendation> recommendationList) {

        resume.setBasicInformation(basicInformation);
        resume.setPersonalInformation(personalInformation);
        resume.setWorkExperienceList(workExperienceList);
        resume.setEducationList(educationList);
        resume.setCourseList(courseList);
        resume.setAchievementList(achievementList);
        resume.setPublicationList(publicationList);
        resume.setSkillList(skillList);
        resume.setLanguageList(languageList);
        resume.setHobbyList(hobbyList);
        resume.setCustomizableSectionList(customizableSectionList);
        resume.setRecommendationList(recommendationList);

        return resume;
    }

}
