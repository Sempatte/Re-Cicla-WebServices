package com.recicla.ga.ReCicla_WS.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.recicla.ga.ReCicla_WS.entities.Ubication;
import com.recicla.ga.ReCicla_WS.repositories.IUbicationRepository;
import com.recicla.ga.ReCicla_WS.serviceinterfaces.IUbicationService;

import java.util.List;

@Service
public class UbicationServiceImpl  implements IUbicationService{
    @Autowired
    private IUbicationRepository uR;
    @Override
    public void Insert(Ubication ubication) {}
    @Override
    public List<Ubication> list() {return uR.findAll();}
}
