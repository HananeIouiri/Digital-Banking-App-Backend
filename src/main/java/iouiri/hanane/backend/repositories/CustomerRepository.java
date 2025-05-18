package iouiri.hanane.backend.repositories;

import iouiri.hanane.backend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CustomerRepository extends JpaRepository<Customer, Long> {
}