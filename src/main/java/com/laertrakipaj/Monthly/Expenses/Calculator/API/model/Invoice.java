package com.laertrakipaj.Monthly.Expenses.Calculator.API.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "invoice")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String iic;
    private LocalDateTime dateTimeCreated;
    private String tin;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invoice")
    private List<Item> items;
    private BigDecimal totalPrice;

}
