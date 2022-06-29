package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Subject {
    @Id
    String sId;
    String name;

    @ManyToMany
    List<Lecturer> lecturersList=new ArrayList<>();

    public Subject() {
    }

    public Subject(String sId, String name, ArrayList<Lecturer> lecturersList) {
        this.sId = sId;
        this.name = name;
        this.lecturersList = lecturersList;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Lecturer> getLecturersList() {
        return lecturersList;
    }

    public void setLecturersList(ArrayList<Lecturer> lecturersList) {
        this.lecturersList = lecturersList;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "sId='" + sId + '\'' +
                ", name='" + name + '\'' +
                ", lecturersList=" + lecturersList +
                '}';
    }
}
