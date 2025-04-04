package me.dio.domain.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Account account;

    @OneToOne(cascade = CascadeType.ALL)
    private Card card;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Feature> features;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<News> news;

    public Long getId() {return id;}

    public void setId(Long id) { this.id = id;}

    public String getName() {return name;}

    public void setName() { this.name = name;}

    public Account getAccount() {return account;}

    public void setAccount() { this.account = account;}

    public Card getCard() {return card;}

    public void setCard() { this.card = card;}

    public List getFeatures() {return features;}

    public void  setFeatures() { this.features = features;}

    public List getNews() {return news;}

    public void setNews() { this.news = news;}

}
