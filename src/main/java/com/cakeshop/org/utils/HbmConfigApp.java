package com.cakeshop.org.utils;

 import jakarta.annotation.PostConstruct;
 import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.stereotype.Component;

@Component
public class HbmConfigApp {
    private SessionFactory sessionFactory;

    //public HbmConfigApp() {
   //     createInstance();
   // }


    public void init() {

        try {
            StandardServiceRegistry standardRegistry =
                    new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
            Metadata metaData =
                    new MetadataSources(standardRegistry).getMetadataBuilder().build();
            sessionFactory = metaData.getSessionFactoryBuilder().build();
        } catch (Throwable th) {

            System.err.println("Enitial SessionFactory creation failed" + th);
            throw new ExceptionInInitializerError(th);

        }
       // Configuration cfg = new Configuration();
      //  cfg.configure("hibernate.cfg.xml");
      //  sessionFactory = cfg.buildSessionFactory();
    }
   // @PostConstruct
   /// public void inits() {
  //      System.out.println("PropertyLoader.init()");
  //  }
    public SessionFactory getSessionFactory() {
           if (sessionFactory == null)
               init();
        return sessionFactory;
    }
}
