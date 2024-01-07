package ru.zubov.newcinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.zubov.newcinema.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
