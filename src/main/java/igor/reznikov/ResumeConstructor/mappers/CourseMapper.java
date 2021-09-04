package igor.reznikov.ResumeConstructor.mappers;

import igor.reznikov.ResumeConstructor.dtos.CourseDto;
import igor.reznikov.ResumeConstructor.entities.Course;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = DateMapper.class)
public interface CourseMapper {

    CourseMapper INSTANCE = Mappers.getMapper(CourseMapper.class);

    CourseDto toCourseDto(Course course);

    Course toCourse(CourseDto courseDto);

    List<CourseDto> toCourseDtoList(List<Course> courseList);

    List<Course> toCourseList(List<CourseDto> courseDtoList);
}
