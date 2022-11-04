package com.recicla.ga.ReCicla_WS.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.recicla.ga.ReCicla_WS.entities.Types;

import java.util.List;

@Repository
public interface ITypesDAO extends JpaRepository<Types, Integer> {
    @Query("from Types t where t.Name like %:TypeNames%")
    List<Types> findNameType(@Param("TypeNames") String nameTypes);

}
