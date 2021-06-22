package com.example.race_horse_using_stream.repository;

import com.example.race_horse_using_stream.model.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
