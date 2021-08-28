package com.roytuts.spring.boot.auth.service.repository;


import com.roytuts.spring.boot.auth.service.models.ERole;
import com.roytuts.spring.boot.auth.service.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}
