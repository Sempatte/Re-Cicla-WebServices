package com.recicla.ga.ReCicla_WS.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import com.recicla.ga.ReCicla_WS.entities.Ubication;
import com.recicla.ga.ReCicla_WS.repositories.IUbicationDAO;
import com.recicla.ga.ReCicla_WS.services.IUbicationService;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RestController
public class UbicationServiceImpl  implements IUbicationService{
    @Autowired
    private IUbicationDAO uR;
    @Override
    @Transactional
    public boolean Insert(Ubication ubication) {
        Ubication objUbicaciones = uR.save(ubication);
        if (objUbicaciones == null) {
            return false;
        }
        return true;
    }
    @Override
    public List<Ubication> list() {return uR.findAll();}

    @Override
    @Transactional
    public void delete(int idUbication) { uR.deleteById(idUbication);

    }

    @Override
    public Optional<Ubication> findUbicationByID(int idUbication) {
        return Optional.of(uR.findById(idUbication).orElse(new Ubication()));
    }

    @Override
    public List<Ubication> findUbication(String Ubication) {
        return uR.findUbication(Ubication);
    }


}
