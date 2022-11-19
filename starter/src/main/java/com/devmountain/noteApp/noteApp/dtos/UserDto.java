package com.devmountain.noteApp.noteApp.dtos;

import com.devmountain.noteApp.noteApp.entities.Note;
import com.devmountain.noteApp.noteApp.entities.User;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class UserDto implements Serializable {
  private Long id;
  private String username;
  private String password;
  private Set<Note> noteSet = new HashSet<>();

  public UserDto(User user){
    if(user.getId() != null) this.id = user.getId();
    if(user.getUsername() != null) this.username = user.getUsername();
    if(user.getPassword() != null) this.password = user.getPassword();
  }
}
