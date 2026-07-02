package com.cpsystem.projetowebservice.repositories;

import com.cpsystem.projetowebservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
