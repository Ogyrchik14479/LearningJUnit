package igor.reznikov.ResumeConstructor.mappers;

import igor.reznikov.ResumeConstructor.dtos.response.CourseView;
import igor.reznikov.ResumeConstructor.entities.Course;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = DateMapper.class)
public interface CourseMapper {

    CourseMapper INSTANCE = Mappers.getMapper(CourseMapper.class);

    CourseView toCourseDto(Course course);

    Course toCourse(CourseView courseView);

    List<CourseView> toCourseDtoList(List<Course> courseList);

    List<Course> toCourseList(List<CourseView> courseViewList);
}
