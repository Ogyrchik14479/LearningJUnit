package igor.reznikov.resume.constructor.mappers;

import igor.reznikov.resume.constructor.dtos.request.CoursePost;
import igor.reznikov.resume.constructor.dtos.response.CourseView;
import igor.reznikov.resume.constructor.entities.Course;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = DateMapper.class)
public interface CourseMapper {

    CourseView toCourseDto(Course course);

    Course toCourse(CourseView courseView);

    @Mapping(target = "resume.id", source = "resumeId")
    Course toCourse(CoursePost courseVPost);

    List<CourseView> toCourseDtoList(List<Course> courseList);

    List<Course> toCourseList(List<CourseView> courseViewList);
}
