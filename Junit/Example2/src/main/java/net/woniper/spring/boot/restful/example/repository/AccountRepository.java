package net.woniper.spring.boot.restful.example.repository;

import net.woniper.spring.boot.restful.example.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByUsername(String username);
}
