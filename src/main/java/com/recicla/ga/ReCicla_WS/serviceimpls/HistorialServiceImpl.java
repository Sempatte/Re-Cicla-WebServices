package com.recicla.ga.ReCicla_WS.serviceimpls;
import com.recicla.ga.ReCicla_WS.entities.Historial;
import com.recicla.ga.ReCicla_WS.repositories.IHistorialDAO;
import com.recicla.ga.ReCicla_WS.services.IHistorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RestController
public class HistorialServiceImpl implements IHistorialService {

    @Autowired
    private IHistorialDAO historialService;

    @Override
    @Transactional
    public boolean Insert(Historial historial) {
        Historial objHistorial = historialService.save(historial);
        if (objHistorial == null) {
            return  false;
        }
        return true;
    }

    @Override
    public List<Historial> list() {
        return historialService.findAll();
    }

    @Override
    @Transactional
    public void delete(int idHistorial) {
        historialService.deleteById(idHistorial);
    }

    @Override
    public Optional<Historial> findHistoryById(int idHistorial) {
        return Optional.empty();
    }

    @Override
    public List<Historial> findHistorial(String H) {
        return historialService.findHistorial(H);
    }
}
