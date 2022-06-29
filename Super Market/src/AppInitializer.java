import entity.Lecturer;
import entity.Subject;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

import java.util.ArrayList;

public class AppInitializer {
    public static void main(String[] args) {

//        Student s1=new Student();
//        s1.setId("S001");
//        s1.setName("kamani");
//
//        Student s2=new Student();
//        s2.setId("S002");
//        s2.setName("piyumal");
//
//        Laptop l1=new Laptop();
//        l1.setlId("L001");
//        l1.setDescription("Dell");
//        l1.setStudentId(s1);
//
//        Laptop l2=new Laptop();
//        l2.setlId("L002");
//        l2.setDescription("Dell");
//        l2.setStudentId(s2);

        ////////////////////////////////////////

//        Owner o1 = new Owner();
//        o1.setoId("O001");
//        o1.setName("Bashini");
//
//        Pet p1 = new Pet();
//        p1.setpId("P001");
//        p1.setName("Dog");
//        p1.setOwnerId(o1);
//
//        Pet p2 = new Pet();
//        p2.setpId("P002");
//        p2.setName("Rabbit");
//        p2.setOwnerId(o1);
//
//        o1.getPet_list().add(p1);
//        o1.getPet_list().add(p2);

        ////////////////////////////////////////

//        Lecturer l1 = new Lecturer();
//        l1.setlId("Loo1");
//        l1.setName("Niroth");
//
//        Lecturer l2 = new Lecturer();
//        l2.setlId("Loo2");
//        l2.setName("prasad");
//
//        Subject sub1 = new Subject();
//        sub1.setsId("S001");
//        sub1.setName("PRF");
//
//        Subject sub2 = new Subject();
//        sub2.setsId("S002");
//        sub2.setName("ORM");
//
//        ArrayList<Subject> subjectList = new ArrayList<>();
//        subjectList.add(sub1);
//        subjectList.add(sub2);
//
//        ArrayList<Lecturer> lecturerList = new ArrayList<>();
//        lecturerList.add(l1);
//        lecturerList.add(l2);
//
//        l1.setSubjectList(subjectList);
//        l2.setSubjectList(subjectList);
//
//        sub1.setLecturersList(lecturerList);
//        sub1.setLecturersList(lecturerList);


        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

//        session.save(s1);
//        session.save(s2);
//        session.save(l1);
//        session.save(l2);

        ////////////////////////////////////////

//        session.save(o1);
//        session.save(p1);
//        session.save(p2);

        ////////////////////////////////////////

//        session.save(sub1);
//        session.save(sub2);
//        session.save(l1);
//        session.save(l2);

        transaction.commit();
        session.close();

    }
}
