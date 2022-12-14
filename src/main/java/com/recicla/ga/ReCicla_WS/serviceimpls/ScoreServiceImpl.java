package com.recicla.ga.ReCicla_WS.serviceimpls;

import com.recicla.ga.ReCicla_WS.entities.Score;
import com.recicla.ga.ReCicla_WS.entities.Usuario;
import com.recicla.ga.ReCicla_WS.repositories.IScoreDAO;
import com.recicla.ga.ReCicla_WS.repositories.IUsuarioDAO;
import com.recicla.ga.ReCicla_WS.services.IScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RestController
public class ScoreServiceImpl  implements IScoreService {

    @Autowired
    private IScoreDAO scoreService;

    @Override
    @Transactional
    public boolean insertar(Score score) {
        Score objScore = scoreService.save(score);
        if (objScore == null) {
            return false;
        }
        return true;
    }

    @Override
    @Transactional
    public void eliminar(int idScore) {
        scoreService.deleteById((idScore));
    }

    @Override
    public Optional<Score> listarId(int idScore) {
        return Optional.of(scoreService.findById(idScore).orElse(new Score()));
    }

    @Override
    public List<Score> listar() {
        return scoreService.findAll();
    }

    @Override
    @Transactional
    public void deleteScoreByUsuario(int idUsuario) {
        scoreService.deleteScoreByUsuario(idUsuario);
    }

    @Override
    public List<Score> buscarUsuario(String nombreUsuario) {
        return scoreService.buscarUsuario(nombreUsuario);
    }

    @Override
    public List<Score> buscarnEstrellas(float nEstrellas) {
        return scoreService.buscarnEstrellas(nEstrellas);
    }

    @Override
    public Optional<Score> findScoreByID(int idScore) {
        return Optional.of(scoreService.findById(idScore).orElse(new Score()));
    }
}