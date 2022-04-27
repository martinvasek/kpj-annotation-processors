package cz.inventi.kpj.annotation.processors;

import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-27T19:00:29+0200",
    comments = "version: 1.5.0.RC1, compiler: javac, environment: Java 17.0.2 (Eclipse Adoptium)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDTO userToUserDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setName( user.getFirstname() );
        userDTO.setSurname( user.getLastname() );
        userDTO.setUsername( user.getUsername() );
        userDTO.setPhone( user.getPhone() );

        return userDTO;
    }

    @Override
    public User userDTOToUser(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        User user = new User();

        user.setFirstname( userDTO.getName() );
        user.setLastname( userDTO.getSurname() );
        user.setUsername( userDTO.getUsername() );
        user.setPhone( userDTO.getPhone() );

        return user;
    }
}
