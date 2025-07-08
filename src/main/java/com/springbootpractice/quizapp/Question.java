package com.springbootpractice.quizapp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String questionTitle;
    private String object1;
    private String object2;
    private String object3;
    private String object4;
    private String rightAnswer;
    private String difficultyLevel;
    private String category;

}
