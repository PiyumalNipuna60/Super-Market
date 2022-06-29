package entity;

import javax.persistence.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Lecturer {
    @Id
    String lId;
    String name;

    @ManyToMany(mappedBy = "lecturersList")
    List<Subject> subjectList=new ArrayList();

    public Lecturer() {
    }

    public Lecturer(String lId, String name, ArrayList<Subject> subjectList) {
        this.lId = lId;
        this.name = name;
        this.subjectList = subjectList;
    }

    public String getlId() {
        return lId;
    }

    public void setlId(String lId) {
        this.lId = lId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(ArrayList<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "lId='" + lId + '\'' +
                ", name='" + name + '\'' +
                ", subjectList=" + subjectList +
                '}';
    }
}
