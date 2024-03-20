package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio
{


    @Id
    @GeneratedValue()
    private long portfolioId;

    @ManyToOne
    @JoinColumn(name = "clientId")
    private Clients clients;

    @Column(nullable = false)
    private String creationDate;

    public Portfolio(String creationDate)
    {
        this.creationDate = creationDate;
    }


    public long getPortfolioId()
    {
        return portfolioId;
    }

    public void setCreationDate(String creationDate)
    {
        this.creationDate = creationDate;
    }

    public String getCreationDate()
    {
        return creationDate;
    }
}
