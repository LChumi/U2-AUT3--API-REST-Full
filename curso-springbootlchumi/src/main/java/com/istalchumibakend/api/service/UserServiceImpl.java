package com.istalchumibakend.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.istalchumibakend.api.entity.User;
import com.istalchumibakend.api.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
    private UserRepository usuarioRepository;

    @Override
    @Transactional(readOnly = true)
    public Iterable<User> findAll() {

        return usuarioRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<User> findAll(Pageable pageable) {
        return usuarioRepository.findAll(pageable);
    }

    @Override
    @Transactional
    public Optional<User> findById(Long id) {
        return usuarioRepository.findById(id);
    }

    @Override
    @Transactional
    public User save(User usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        usuarioRepository.deleteById(id);

    }
}
