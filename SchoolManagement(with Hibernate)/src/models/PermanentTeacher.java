import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;
@Entity
public class PermanentTeacher extends Instructor {

    private double fSalary;

    public PermanentTeacher(String name, String address, String phNum, double fSalary) {
        super(name, address, phNum);
        this.fSalary = fSalary;
    }

    public PermanentTeacher() {

    }

    public double getfSalary() {
        return fSalary;
    }

    public void setfSalary(double fSalary) {
        this.fSalary = fSalary;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PermanentTeacher that = (PermanentTeacher) o;
        return Double.compare(that.fSalary, fSalary) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fSalary);
    }

    @Override
    public String toString() {
        return "PermanentTeacher{" +
                "fSalary=" + fSalary +
                "} " + super.toString();
    }
}
