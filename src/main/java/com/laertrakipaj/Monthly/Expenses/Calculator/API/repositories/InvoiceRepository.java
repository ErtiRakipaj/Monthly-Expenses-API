package com.laertrakipaj.Monthly.Expenses.Calculator.API.repositories;

import com.laertrakipaj.Monthly.Expenses.Calculator.API.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice,Long> {

}
