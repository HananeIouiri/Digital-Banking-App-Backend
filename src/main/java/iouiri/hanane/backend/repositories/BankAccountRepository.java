package iouiri.hanane.backend.repositories;

import iouiri.hanane.backend.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount ,String> {
    // This interface will automatically provide CRUD operations for the BankAccount entity
    // You can add custom query methods if needed
}

