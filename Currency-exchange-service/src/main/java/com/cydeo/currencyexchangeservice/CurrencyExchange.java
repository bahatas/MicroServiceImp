package com.cydeo.currencyexchangeservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class CurrencyExchange {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name="currency_from")
    private String from;

    @Column(name="currency_to")
    private String to;
    private BigDecimal conversionMultiple;
    private String environment;
}
