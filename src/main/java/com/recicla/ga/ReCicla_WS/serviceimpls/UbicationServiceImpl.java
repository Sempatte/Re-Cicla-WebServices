package com.recicla.ga.ReCicla_WS.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.recicla.ga.ReCicla_WS.entities.Ubication;
import com.recicla.ga.ReCicla_WS.repositories.IUbicationDAO;
import com.recicla.ga.ReCicla_WS.services.IUbicationService;

import java.util.List;
import java.util.Optional;

@Service
public class UbicationServiceImpl  implements IUbicationService{
    @Autowired
    private IUbicationDAO uR;
    @Override
    public void Insert(Ubication ubication) {}
    @Override
    public List<Ubication> list() {return uR.findAll();}

    @Override
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
