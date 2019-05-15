package com.revature.dto;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Screen {


    private @Id @GeneratedValue int id;
    private @Column(nullable = false) int userId;
    private @Column(nullable = false) int candidateId;
    private  float screeningScore;
    private String screeningNotes;

}