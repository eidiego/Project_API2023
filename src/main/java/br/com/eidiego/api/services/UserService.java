package br.com.eidiego.api.services;

import br.com.eidiego.api.domain.User;

import java.util.List;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();

}
