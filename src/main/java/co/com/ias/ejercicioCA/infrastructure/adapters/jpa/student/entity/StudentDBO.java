package co.com.ias.ejercicioCA.infrastructure.adapters.jpa.student.entity;

import co.com.ias.ejercicioCA.domain.model.student.*;
import co.com.ias.ejercicioCA.domain.model.student.attributes.StudentId;
import co.com.ias.ejercicioCA.domain.model.student.attributes.StudentMail;
import co.com.ias.ejercicioCA.domain.model.student.attributes.StudentName;
import co.com.ias.ejercicioCA.domain.model.student.attributes.StudentPhone;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Entity
@Table(name="student")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StudentDBO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer phone;
    private String mail;



    public Student studentDBOtoDomain (StudentDBO studentDBO) {
        return new Student(
                new StudentId(studentDBO.getId()),
                new StudentName(studentDBO.getName()),
                new StudentPhone(studentDBO.getPhone()),
                new StudentMail(studentDBO.getMail())
        );
    }
    public static StudentDBO studentDBOfromDomain (Student student) {
        return new StudentDBO(
                student.getId().getValue(),
                student.getName().getValue(),
                student.getPhone().getValue(),
                student.getMail().getValue()
        );
    }
}
