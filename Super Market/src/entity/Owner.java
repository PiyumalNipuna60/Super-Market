package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Owner {
    @Id
    String oId;
    String name;

    @OneToMany(mappedBy = "ownerId")
    List<Pet> pet_list=new ArrayList();

    public Owner() {
    }

    public Owner(String oId, String name, List<Pet> pet_list) {
        this.oId = oId;
        this.name = name;
        this.pet_list = pet_list;
    }

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pet> getPet_list() {
        return pet_list;
    }

    public void setPet_list(List<Pet> pet_list) {
        this.pet_list = pet_list;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "oId='" + oId + '\'' +
                ", name='" + name + '\'' +
                ", pet_list=" + pet_list +
                '}';
    }
}
