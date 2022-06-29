package util;

import entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;

    private FactoryConfiguration() {
        Configuration configuration = new Configuration().configure().addAnnotatedClass(Item.class)
                .addAnnotatedClass(Customer.class)
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Laptop.class)
                .addAnnotatedClass(Owner.class)
                .addAnnotatedClass(Pet.class)
                .addAnnotatedClass(Lecturer.class)
                .addAnnotatedClass(Subject.class);

        sessionFactory = configuration.buildSessionFactory();
    }

    public static FactoryConfiguration getInstance() {
        return (factoryConfiguration == null) ? factoryConfiguration = new  FactoryConfiguration()
                : factoryConfiguration;
    }

    public Session getSession(){
        return sessionFactory.openSession();
    }
}
