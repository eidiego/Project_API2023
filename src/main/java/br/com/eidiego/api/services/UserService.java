package br.com.eidiego.api.services;

import br.com.eidiego.api.domain.User;
import br.com.eidiego.api.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();

    User create(UserDTO obj);

}
