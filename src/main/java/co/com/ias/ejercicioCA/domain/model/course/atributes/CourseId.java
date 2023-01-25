package co.com.ias.ejercicioCA.domain.model.course.atributes;

public class CourseId {
    private final Long value;

    //Builder
    public CourseId(Long value) {
        this.value = value;
    }

    //Getter
    public Long getValue() {
        return value;
    }
}
