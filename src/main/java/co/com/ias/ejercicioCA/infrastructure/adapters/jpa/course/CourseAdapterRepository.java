package co.com.ias.ejercicioCA.infrastructure.adapters.jpa.course;

import co.com.ias.ejercicioCA.domain.model.course.Course;
import co.com.ias.ejercicioCA.domain.model.gateway.ICourseRepository;
import co.com.ias.ejercicioCA.infrastructure.adapters.jpa.course.entity.CourseDBO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class CourseAdapterRepository implements ICourseRepository {
    private final ICourseAdapterRepository iCourseAdapterRepository;

    @Override
    public Course saveCourse(Course course) {
        CourseDBO courseDBO = CourseDBO.fromCourseValueObjectToCourseDBO(course);
        CourseDBO saveCourse = iCourseAdapterRepository.save(courseDBO);
        Course courseConverted = saveCourse.fromCourseDBOToCourseValueObject(saveCourse);
        return courseConverted;
    }
}
