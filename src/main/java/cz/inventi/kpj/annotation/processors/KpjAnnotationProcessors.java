package cz.inventi.kpj.annotation.processors;

import java.util.Objects;

public class KpjAnnotationProcessors {

  /**
   * 1. Implement necessary getters, setters etc. in the class {@link User}. <br/>
   * 2. Create an interface {@link UserMapper} with two methods<br/>
   * 2.1 {@link UserMapper#userToUserDTO(User) } <br/>
   * 2.2 {@link UserMapper#userDTOToUser(UserDTO) } <br/>
   * 3. Create a static field {@link UserMapper#INSTANCE} with the instance of
   * this mapper
   */
  public static void main(String[] args) {
    User user = new User("tpoledny", "Tomas", "Poledny", "777123456");

    UserMapper mapper = UserMapper.INSTANCE;

    UserDTO userDTO = mapper.userToUserDTO(user);

    assertEquals(user.getUsername(), userDTO.getUsername());
    assertEquals(user.getFirstname(), userDTO.getName());
    assertEquals(user.getLastname(), userDTO.getSurname());
    assertEquals(user.getPhone(), userDTO.getPhone());
    System.out.println("Mapping to DTO: Success");

    User mappedUser = mapper.userDTOToUser(userDTO);

    assertEquals(user, mappedUser);
    System.out.println("Mapping back: Success");

    System.out.println("Done");
  }

  static void assertEquals(Object first, Object second) {
    if (!Objects.equals(first, second)) {
      throw new AssertionError();
    }
  }
}
