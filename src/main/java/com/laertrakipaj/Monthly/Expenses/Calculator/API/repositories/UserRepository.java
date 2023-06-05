package com.laertrakipaj.Monthly.Expenses.Calculator.API.repositories;

import com.laertrakipaj.Monthly.Expenses.Calculator.API.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
