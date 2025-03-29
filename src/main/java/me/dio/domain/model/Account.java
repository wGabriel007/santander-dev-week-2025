package me.dio.domain.model;

import jakarta.persistence.Entity;

import java.math.BigDecimal;

@Entity(name = "tb_account")
public class Account {

    private Long id;
    private String number;
    private String agency;
    private BigDecimal balance;
    private BigDecimal limit;

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getNumber() {return number;}

    public void setNumber(String number) { this.number = number; }

    public String getAgency() { return agency; }

    public void  setAgency(String agency) { this.agency = agency; }

    public BigDecimal getBalance() { return balance; }

    public void setBalance() {this.balance = balance; }

    public BigDecimal getLimit() {return limit;}

    public void setLimit() { this.limit = limit; }
}
