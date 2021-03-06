package com.example.demo.models;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private Long id;

  @NotBlank
  @NotEmpty(message = "* Please enter username")
  @Size(min = 6, max = 100)
  @Column(name = "username", unique = true)
  private String username;

  @NotBlank
  @NotEmpty(message = "* Please enter password")
  @Size(min = 6, max = 100)
  @Column(name = "password")
  private String password;

  @Size(max = 50)
  @NotEmpty(message = "* Please enter First Name")
  @Column(name = "first_name")
  private String firstName;

  @Size(max = 50)
  @NotEmpty(message = "* Please enter Last Name")
  @Column(name = "last_name")
  private String lastName;

  public Long getId() {
    return id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}