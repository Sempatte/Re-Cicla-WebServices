package com.recicla.ga.ReCicla_WS.repositories;

import com.recicla.ga.ReCicla_WS.entities.AdminUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdminUserDAO extends JpaRepository<AdminUser, Integer> {
    AdminUser findByUsername(String username);

}
