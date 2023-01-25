package co.com.ias.ejercicioCA.domain.usecase;

import co.com.ias.ejercicioCA.domain.model.course.Course;
import co.com.ias.ejercicioCA.domain.model.course.dto.CourseDTO;
import co.com.ias.ejercicioCA.domain.model.gateway.ICourseRepository;

public class CourseUseCase {
    private final ICourseRepository iCourseRepository;


    public CourseUseCase(ICourseRepository iCourseRepository) {
        this.iCourseRepository = iCourseRepository;
    }
    public CourseDTO saveCourse(CourseDTO courseDTO){
        Course course = courseDTO.fromCourseDTOtoCourseValueObject(courseDTO);
        return courseDTO.fromCourseValueObjectToCourseDTO(iCourseRepository.saveCourse(course));
    }
}
