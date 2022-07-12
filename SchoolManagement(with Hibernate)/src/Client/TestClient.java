import javax.persistence.EntityManager;
import java.util.List;

public class TestClient {
    public static void main(String[] args) {
        saveData();

    }
    public static void saveData(){
        Student student1 = new Student("Gheorge Hagi","Florya Metin Oktay Tesisleri","Male","05-02-1965");
        Student student2 = new Student("Wesley Sneijder","Florya Metin Oktay Tesisleri","Male","06-06-1984");
        Student student3 = new Student("Bülent Korkmaz","Florya Metin Oktay Tesisleri","Male","24.11.1968");
        Course course1=new Course("Futbol","1905",23);
        Course course2=new Course("Disiplin","1453",100);
        Instructor instructor1=new PermanentTeacher("Fatih Terim","Ali Sami Yen Stadı","1905",0.1905);
        Instructor instructor2=new VisitingResearcher("Jupp Derwall","Uefa Kupası","2000",4);

        course1.setInstructor(instructor1);
        course2.setInstructor(instructor2);
        course1.getStudentList().add(student1);
        course1.getStudentList().add(student3);
        course2.getStudentList().add(student2);

        EntityManager em = EntityManagerUtils.getEntityManager("mysqlPU");

        try {
            em.getTransaction().begin();

            em.persist(course1);
            em.persist(course2);
            em.persist(student1);
            em.persist(student2);
            em.persist(student3);
            em.persist(instructor1);
            em.persist(instructor2);

            em.getTransaction().commit();

            System.out.println("All data persisted...");
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            EntityManagerUtils.closeEntityManager(em);
        }

    }

    }

