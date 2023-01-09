package br.com.eidiego.api.services;

import br.com.eidiego.api.domain.User;

public interface UserService {

    User findById(Integer id);

}
