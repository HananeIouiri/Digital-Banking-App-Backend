package iouiri.hanane.backend.dtos;

import iouiri.hanane.backend.enums.AccountStatus;
import lombok.Data;
import java.util.Date;

@Data
public class CurrentBankAccountDTO extends BankAccountDTO {
    private String id;
    private double balance;
    private Date createdAt;
    private AccountStatus status;
    private String currency;
    private CustomerDTO customerDTO;
    private double overDraft;
}