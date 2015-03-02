package org.cap1.model;

// Generated Mar 1, 2015 2:09:19 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Transaction generated by hbm2java
 */
@Entity
@Table(name = "Transaction", catalog = "cap1")
public class Transaction implements java.io.Serializable {

    private Integer id;
    private Date date;
    private String description;
    private BigDecimal amount;

    public Transaction() {
    }

    public Transaction(Date date, String description, BigDecimal amount) {
        this.date = date;
        this.description = description;
        this.amount = amount;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date", length = 19)
    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Column(name = "description", length = 4000)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "amount", precision = 20)
    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

}
