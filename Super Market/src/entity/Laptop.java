package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Laptop {
    @Id
    String lId;
    String description;

    @OneToOne
    Student studentId;

    public Laptop() {
    }

    public Laptop(String lId, String description, Student studentId) {
        this.lId = lId;
        this.description = description;
        this.studentId = studentId;
    }

    public String getlId() {
        return lId;
    }

    public void setlId(String lId) {
        this.lId = lId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Student getStudentId() {
        return studentId;
    }

    public void setStudentId(Student studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lId='" + lId + '\'' +
                ", description='" + description + '\'' +
                ", studentId=" + studentId +
                '}';
    }
}
