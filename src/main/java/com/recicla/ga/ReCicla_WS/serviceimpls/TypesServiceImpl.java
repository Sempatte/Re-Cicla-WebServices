package com.recicla.ga.ReCicla_WS.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.recicla.ga.ReCicla_WS.entities.Types;
import com.recicla.ga.ReCicla_WS.repositories.ITypesRepository;
import com.recicla.ga.ReCicla_WS.serviceinterfaces.ITypesService;

import java.util.List;

@Service
public class TypesServiceImpl implements ITypesService {
    @Autowired
    private ITypesRepository tR;
    @Override
    public void Insert(Types type) {}
    @Override
    public List<Types> list() { return tR.findAll();}
}
