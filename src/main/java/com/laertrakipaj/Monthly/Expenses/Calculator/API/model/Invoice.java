package com.laertrakipaj.Monthly.Expenses.Calculator.API.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Invoice {
    private Long id;
    private String iic;
    private LocalDateTime dateTimeCreated;
    private String tin;
    private List<Item> items;
    private BigDecimal totalPrice;

}
