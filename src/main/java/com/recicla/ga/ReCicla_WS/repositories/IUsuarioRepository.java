package com.recicla.ga.ReCicla_WS.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.recicla.ga.ReCicla_WS.entities.Usuario;

@Repository
public interface IUsuarioRepository  extends JpaRepository<Usuario, Integer>{
}
