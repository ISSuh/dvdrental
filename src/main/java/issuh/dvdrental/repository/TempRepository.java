package issuh.dvdrental.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import issuh.dvdrental.entity.Address;
import issuh.dvdrental.entity.Staff;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class TempRepository {

  private final EntityManager em;

  public List<Address> findAddress() {
    String jpql =
      "select a " +
      "from Address a";

    return em.createQuery(jpql, Address.class).getResultList();
  }

  public List<Staff> findStaff() {
    String jpql =
      "select s " +
      "from Staff s " +
      " join fetch s.store st";

    return em.createQuery(jpql, Staff.class).getResultList();
  }
}
