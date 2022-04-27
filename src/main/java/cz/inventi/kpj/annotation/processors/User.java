package cz.inventi.kpj.annotation.processors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

  private String username;
  private String firstname;
  private String lastname;
  private String phone;

}
