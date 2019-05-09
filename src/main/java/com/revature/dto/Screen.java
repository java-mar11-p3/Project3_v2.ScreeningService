package com.revature.dto;

import lombok.*;

import javax.persistence.*;

@Data
@Entity @Table(name = "tbl_screen")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Screen {


    private @Id @GeneratedValue int id;
    private @Column(name = "user_id") int userId;
    private @Column(name = "candidate_id") int candidateId;
    private @Column(name = "screening_score") double screeningScore;
    private @Column(name = "screening_notes") String screeningNotes;

}