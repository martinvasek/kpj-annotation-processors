package cz.inventi.kpj.annotation.processors;

import java.util.Objects;

public class UserDTO {

  private String username;
  private String name;
  private String surname;
  private String phone;

  public UserDTO() {
  }

  public UserDTO(String username, String name, String surname, String phone) {
    this.username = username;
    this.name = name;
    this.surname = surname;
    this.phone = phone;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  @Override
  public int hashCode() {
    int hash = 5;
    hash = 97 * hash + Objects.hashCode(this.username);
    hash = 97 * hash + Objects.hashCode(this.name);
    hash = 97 * hash + Objects.hashCode(this.surname);
    hash = 97 * hash + Objects.hashCode(this.phone);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final UserDTO other = (UserDTO) obj;
    if (!Objects.equals(this.username, other.username)) {
      return false;
    }
    if (!Objects.equals(this.name, other.name)) {
      return false;
    }
    if (!Objects.equals(this.surname, other.surname)) {
      return false;
    }
    return Objects.equals(this.phone, other.phone);
  }

  @Override
  public String toString() {
    return "UserDTO{" + "username=" + username + ", name=" + name + ", surname=" + surname + ", phone=" + phone + '}';
  }

}
