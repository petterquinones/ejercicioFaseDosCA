package co.com.ias.ejercicioCA.domain.model.course.atributes;

public class CourseName {

    private final String value;

    //Builder
    public CourseName(String value) {
        this.value = value;
    }

    //Getter
    public String getValue() {
        return value;
    }
}
