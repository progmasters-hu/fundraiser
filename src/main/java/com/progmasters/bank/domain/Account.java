package com.progmasters.bank.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Account {

    @Id
    @GeneratedValue
    Long id;

    @NotNull
    @Size(min = 4, max = 30)
    String userName;

    String ipAddress;

    @NotNull
    @Size(min = 5, max = 100)
    String goalName;

    Integer balance;

    Integer funds;

    @OneToMany(mappedBy = "from")
    private List<Transfer> targetTransfers;

    @OneToMany(mappedBy = "to")
    private List<Transfer> sourceTransfers;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getGoalName() {
        return goalName;
    }

    public void setGoalName(String goalName) {
        this.goalName = goalName;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Integer getFunds() {
        return funds;
    }

    public void setFunds(Integer funds) {
        this.funds = funds;
    }

    public List<Transfer> getTargetTransfers() {
        return targetTransfers;
    }

    public void setTargetTransfers(List<Transfer> targetTransfers) {
        this.targetTransfers = targetTransfers;
    }

    public List<Transfer> getSourceTransfers() {
        return sourceTransfers;
    }

    public void setSourceTransfers(List<Transfer> sourceTransfers) {
        this.sourceTransfers = sourceTransfers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        return id != null ? id.equals(account.id) : account.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return goalName + "(" + userName + ")" + " - balance: " + balance + ", funds: " + funds;
    }
}
