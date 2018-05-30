package model.usuario;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import model.Model;

@Entity
public class Usuario extends Model {
  @Id
  private Integer id;

  @Column
  private String username;

  @Column
  private String password;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
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

  public String toString() {
    return username;
  }
}
