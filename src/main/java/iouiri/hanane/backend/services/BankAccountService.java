package iouiri.hanane.backend.services;





import iouiri.hanane.backend.dtos.CustomerDTO;
import iouiri.hanane.backend.entities.BankAccount;
import iouiri.hanane.backend.entities.CurrentAccount;
import iouiri.hanane.backend.entities.Customer;
import iouiri.hanane.backend.entities.SavingAccount;


import iouiri.hanane.backend.exeptions.BankAccountNotFoundException;
import iouiri.hanane.backend.exeptions.CustomerNotFoundException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;


@Service
@Transactional



public interface BankAccountService {
    CustomerDTO saveCustomer(CustomerDTO customerDTO);
    CurrentAccount saveCurrentBankAccount(double initialBalance, double overDraft, Long customerId) throws CustomerNotFoundException;
    SavingAccount saveSavingBankAccount(double initialBalance, double interestRate, Long customerId) throws CustomerNotFoundException;
    List<CustomerDTO> listCustomers();
    List<BankAccount> bankAccountList();
    BankAccount getBankAccount(String accountId) throws BankAccountNotFoundException;
    void debit(String accountId, double amount, String description) throws BankAccountNotFoundException, ma.enset.ebankingbackend.exceptions.BalanceNotSufficientException;
    void credit(String accountId, double amount, String description) throws BankAccountNotFoundException;
    void transfer(String accountIdSource, String accountIdDestination, double amount) throws BankAccountNotFoundException, ma.enset.ebankingbackend.exceptions.BalanceNotSufficientException;
    CustomerDTO getCustomer(Long customerId) throws CustomerNotFoundException;
    CustomerDTO updateCustomer(CustomerDTO customerDTO);
    void deleteCustomer(Long customerId);
}