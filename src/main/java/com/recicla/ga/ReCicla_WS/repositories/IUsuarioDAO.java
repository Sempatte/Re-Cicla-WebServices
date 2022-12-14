package com.recicla.ga.ReCicla_WS.repositories;

import com.recicla.ga.ReCicla_WS.entities.Score;
import com.recicla.ga.ReCicla_WS.entities.Ubication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.recicla.ga.ReCicla_WS.entities.Usuario;

import java.util.List;

@Repository
public interface IUsuarioDAO extends JpaRepository<Usuario, Integer>{


    List<Usuario> findByNombreContains(String namePropietario);

    @Query("from Usuario u where u.ubication.Direccion like %:direccion%")
    List<Usuario> buscarUbicacion(@Param("direccion") String direccion);


    @Query("from Usuario u where u.historial.busquedas like %:busquedas%")
    List <Usuario> buscarHistorial(@Param("busquedas") String busquedas);

    @Query("from Usuario r where r.esReciclador = false")
    List <Usuario> ListarRecolectores();

    List <Usuario> findByEsRecicladorIsTrue(); // Listar Recolectores
    List <Usuario> findByEsRecicladorIsFalse(); // Listar Recicladores

    // Obtener todos los usuarios que tengan un score mayor a 3.5, y ordenarlo de mayor a menor - QUERY SEBASTIAN
    @Query("from Score r where r.nEstrellas > 3.5 order by r.nEstrellas asc" )
    List<Score> obtenerScoreMayorA3_5();

    @Query(value="SELECT * from Ubication ub join usuario us on ub.id=us.ubication_id where distrito like '%Surco%'", nativeQuery = true)
    List <Ubication> ListarQueryDistrito();

    @Query(value="SELECT * from usuario u join ticket ti on ti.user_id = u.id join tipo_ticket tt on ti.tipo_ticket_id = tt.id where importancia in ('Alta', 'Baja')", nativeQuery = true)
    List <Usuario> ListarQuery2();


    @Query(value="select u.nombre, u.apellido, re.name_reward, re.description\n" +
            "from usuario u join rewards_user ru on ru.user_id = u.id join reward re on re.id = ru.reward_id\n" +
            "group by u.nombre, u.apellido, re.name_reward, re.description", nativeQuery = true)
    List <Usuario> ListarQuery3();

}
