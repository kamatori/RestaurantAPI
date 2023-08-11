package com.example.MyTestApplication;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Optional;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class DiningReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "SUBMITTEDBY")
    private String submittedBy;

    @Column(name = "PEANUTSCORE")
    private Boolean peanut;

    @Column(name = "EGGSCORE")
    private Boolean egg;

    @Column(name = "DAIRYSCORE")
    private Boolean dairy;

    @Column(name = "COMMENTARY")
    private String commentary;

    @Enumerated(EnumType.STRING)
    @Column(name="REVIEW_STATUS")
    private ReviewStatus reviewStatus;


}
