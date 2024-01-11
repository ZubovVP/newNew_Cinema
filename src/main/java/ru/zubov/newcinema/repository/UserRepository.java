package ru.zubov.newcinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.zubov.newcinema.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
