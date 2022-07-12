import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;
@Entity
public class VisitingResearcher extends Instructor {
    private double hSalary;

    public VisitingResearcher(String name, String address, String phNum, double hSalary) {
        super(name, address, phNum);
        this.hSalary = hSalary;
    }

    public VisitingResearcher() {

    }

    public double gethSalary() {
        return hSalary;
    }

    public void sethSalary(double hSalary) {
        this.hSalary = hSalary;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        VisitingResearcher that = (VisitingResearcher) o;
        return Double.compare(that.hSalary, hSalary) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hSalary);
    }

    @Override
    public String toString() {
        return "VisitingResearcher{" +
                "hSalary=" + hSalary +
                "} " + super.toString();
    }
}
