package com.cakeshop.org.utils;

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

     // @PostConstruct
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

    public SessionFactory getSessionFactory() {
          if (sessionFactory == null)
              init();
        return sessionFactory;
    }
}
