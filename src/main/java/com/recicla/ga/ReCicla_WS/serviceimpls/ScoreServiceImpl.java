package com.recicla.ga.ReCicla_WS.serviceimpls;

import com.recicla.ga.ReCicla_WS.entities.Score;
import com.recicla.ga.ReCicla_WS.entities.Usuario;
import com.recicla.ga.ReCicla_WS.repositories.IScoreDAO;
import com.recicla.ga.ReCicla_WS.repositories.IUsuarioDAO;
import com.recicla.ga.ReCicla_WS.services.IScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ScoreServiceImpl  implements IScoreService {

    @Autowired
    private IScoreDAO scoreService;

    @Override
    public boolean insertar(Score score) {
        Score objScore = scoreService.save(score);
        if (objScore == null) {
            return false;
        }
        return true;
    }

    @Override
    public void eliminar(int idScore) {

    }

    @Override
    public Optional<Score> listarId(int idScore) {
        return Optional.empty();
    }

    @Override
    public List<Score> listar() {
        return null;
    }

    @Override
    public List<Score> buscarUsuario(String nombreUsuario) {
        return null;
    }
}
