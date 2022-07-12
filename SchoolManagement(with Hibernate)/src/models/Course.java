import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String cName;
    private String cCode;
    private int cScore;

    public Course() {
    }

    public Course(String cName, String cCode, int cScore) {
        this.cName = cName;
        this.cCode = cCode;
        this.cScore = cScore;
    }
    @ManyToMany
    private List<Student> studentList = new ArrayList<>();

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Instructor getInstructor() {
        return instructor;
    }
    public void setStudent(List<Student> studentList){
        this.studentList=studentList;
    }
    @ManyToOne
    private Instructor instructor;


    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcCode() {
        return cCode;
    }

    public void setcCode(String cCode) {
        this.cCode = cCode;
    }

    public int getcScore() {
        return cScore;
    }

    public void setcScore(int cScore) {
        this.cScore = cScore;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return cCode.equals(course.cCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cCode);
    }

    @Override
    public String toString() {
        return "Course{" +
                "cName='" + cName + '\'' +
                ", cCode='" + cCode + '\'' +
                ", cScore=" + cScore +
                '}';
    }


}
