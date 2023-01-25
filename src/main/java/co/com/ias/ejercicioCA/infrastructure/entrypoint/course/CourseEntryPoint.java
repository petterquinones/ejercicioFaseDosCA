package co.com.ias.ejercicioCA.infrastructure.entrypoint.course;

import co.com.ias.ejercicioCA.domain.model.course.dto.CourseDTO;
import co.com.ias.ejercicioCA.domain.usecase.CourseUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
@AllArgsConstructor
public class CourseEntryPoint {

    private final CourseUseCase courseUseCase;

    @PostMapping("/saveCourse")
    public CourseDTO saveCourse(CourseDTO courseDTO){
        return courseUseCase.saveCourse(courseDTO);
    }

}
