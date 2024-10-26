package ma.ezzakri.bankaccountservice.sevice;

import ma.ezzakri.bankaccountservice.dto.BankAccountRequestDTO;
import ma.ezzakri.bankaccountservice.dto.BankAccountResponseDTO;

public interface AccountService {

    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);
    public BankAccountResponseDTO updateAccount(String id, BankAccountRequestDTO bankAccountDTO);
}
