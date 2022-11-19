package com.devmountain.noteApp.noteApp.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Note {
  @Id
  @GeneratedValue
  private long id;
  @Column(columnDefinition = "text")
  private String body;

  @ManyToOne
  @JsonBackReference
  private User user;

}
