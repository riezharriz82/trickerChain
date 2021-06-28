package com.austral.jibberjabberusers.repositories;

import com.austral.jibberjabberusers.models.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<AppUser,String> {
    Optional<AppUser> findByUsername(String username);
}
