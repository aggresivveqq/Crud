package kz.chingiskhanakhmetov.crud.repository;

import kz.chingiskhanakhmetov.crud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
