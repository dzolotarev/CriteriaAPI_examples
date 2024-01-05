package org.example;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class Main {
    public static void main(String[] args) {
        try (Session sessionFactory = HibernateUtil.getSessionFactory().openSession();
        ) {

            CriteriaBuilder builder = sessionFactory.getCriteriaBuilder();

//-------------------Get All Humans----------------

//            CriteriaQuery<Human> criteriaQuery = builder.createQuery(Human.class);
//
//            criteriaQuery.select(criteriaQuery.from(Human.class));
//            //            select      *        from Human
//
//            List<Human> humanList = sessionFactory.createQuery(criteriaQuery).getResultList();
//            System.out.println(humanList);

// -------------------Like Example----------------

//            CriteriaQuery<Human> criteriaQuery = builder.createQuery(Human.class);
//            Root<Human> root=criteriaQuery.from(Human.class); // select * from Human
//            criteriaQuery.where(builder.like(root.get("name"),"%oh%")); // where name like "%oh%"
//
//            List<Human> humanList = sessionFactory.createQuery(criteriaQuery).getResultList();
//            System.out.println(humanList);

//
// -------------------Count----------------
//
//            CriteriaQuery<Long> critQuery = builder.createQuery(Long.class);
//
//            critQuery.select(builder.count(critQuery.from(Human.class)));
//
//            Long count = sessionFactory.createQuery(critQuery).getSingleResult();
//            System.out.println(count);


// --------------   CriteriaDelete    ----------------------

//            CriteriaDelete<Human> criteriaDelete= builder.createCriteriaDelete(Human.class);
//
//            Root<Human> root= criteriaDelete.from(Human.class);// delete from human
//            criteriaDelete.where(builder.equal(root.get("id"),2)); // where id =2
//
//            Transaction transaction= sessionFactory.beginTransaction();
//            sessionFactory.createQuery(criteriaDelete).executeUpdate();
//            transaction.commit();

// --------------   CriteriaUpdate    ----------------------

//            CriteriaUpdate<Human> criteriaUpdate = builder.createCriteriaUpdate(Human.class);
//            Root<Human> root = criteriaUpdate.from(Human.class);
//
//            criteriaUpdate.set(root.get("age"), 343);
//            criteriaUpdate.where(builder.equal(root.get("id"), 1));
//
//            Transaction transaction = sessionFactory.beginTransaction();
//            sessionFactory.createQuery(criteriaUpdate).executeUpdate();
//            transaction.commit();
        }
    }
}
