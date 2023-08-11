package com.example.MyTestApplication;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "RESTAURANTSCORE")
    private Integer restaurantScore;

    @Column(name = "PEANUTSCORE")
    private Integer peanutScore;

    @Column(name = "EGGSCORE")
    private Integer eggScore;

    @Column(name = "DAIRYSCORE")
    private Integer dairyScore;

}
