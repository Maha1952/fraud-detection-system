package com.maha.fraudsystem;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
    private final TransactionRepository repository;
    private final TransactionService transactionService;

    public TransactionController(TransactionRepository repository,
                                 TransactionService transactionService) {
        this.repository = repository;
        this.transactionService = transactionService;
    }
    @PostMapping
    public Transaction create(@RequestBody Transaction transaction) {

            Transaction evaluated = transactionService.evaluate(transaction);

            return repository.save(evaluated);
        }


    @GetMapping
    public List<Transaction> getAll() {
        return repository.findAll();
    }
}


