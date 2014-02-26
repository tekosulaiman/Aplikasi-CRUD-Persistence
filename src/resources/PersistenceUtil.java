package resources;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceUtil {
    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY;

    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("Aplikasi-CRUD-PersistencePU");
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
       }
    }

    public static EntityManagerFactory getFactory() {
	return ENTITY_MANAGER_FACTORY;
    }
}