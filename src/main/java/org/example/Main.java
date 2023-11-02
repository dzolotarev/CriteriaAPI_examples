package org.example;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaUpdate;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        try (Session sessionFactory = HibernateUtil.getSessionFactory().openSession();
        ) {
            CriteriaBuilder builder = sessionFactory.getCriteriaBuilder();
//            CriteriaQuery<Long> critQuery = builder.createQuery(Long.class);
//
//            critQuery.select(builder.count(critQuery.from(Human.class)));
//
//            Long count = sessionFactory.createQuery(critQuery).getSingleResult();
//            System.out.println(count);


// --------------   CriteriaDelete    ----------------------

//            CriteriaDelete<Human> criteriaDelete= builder.createCriteriaDelete(Human.class);
//
//            Root<Human> root= criteriaDelete.from(Human.class);
//            criteriaDelete.where(builder.equal(root.get("id"),2));
//
//            Transaction transaction= sessionFactory.beginTransaction();
//            sessionFactory.createQuery(criteriaDelete).executeUpdate();
//            transaction.commit();

// --------------   CriteriaUpdate    ----------------------

            CriteriaUpdate<Human> criteriaUpdate = builder.createCriteriaUpdate(Human.class);
            Root<Human> root = criteriaUpdate.from(Human.class);

            criteriaUpdate.set(root.get("age"), 12);
            criteriaUpdate.where(builder.equal(root.get("id"), 1));

            Transaction transaction = sessionFactory.beginTransaction();
            sessionFactory.createQuery(criteriaUpdate).executeUpdate();
            transaction.commit();


        }
    }
}
