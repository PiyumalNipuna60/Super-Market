package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Pet {
    @Id
    String pId;
    String name;

    @ManyToOne
    Owner ownerId;

    public Pet() {
    }

    public Pet(String pId, String name, Owner ownerId) {
        this.pId = pId;
        this.name = name;
        this.ownerId = ownerId;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Owner getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Owner ownerId) {
        this.ownerId = ownerId;
    }

    @Override
    public String toString() {
        return "pet{" +
                "pId='" + pId + '\'' +
                ", name='" + name + '\'' +
                ", ownerId=" + ownerId +
                '}';
    }
}
