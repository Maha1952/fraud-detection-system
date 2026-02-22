package com.maha.fraudsystem;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
    public Transaction evaluate(Transaction transaction) {

        if (transaction.getAmount() > 10000) {
            transaction.setFlagged(true);
        } else {
            transaction.setFlagged(false);
        }

        return transaction;
    }

}


