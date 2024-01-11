package ru.zubov.newcinema.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.zubov.newcinema.model.User;
import ru.zubov.newcinema.repository.UserRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public Optional<User> findById(Long id) {
       return userRepository.findById(id);
    }

}
