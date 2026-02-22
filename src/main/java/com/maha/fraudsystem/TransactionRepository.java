package com.maha.fraudsystem;
import org.springframework.data.jpa.repository.JpaRepository;
public interface TransactionRepository
        extends JpaRepository<Transaction, Long> {
}