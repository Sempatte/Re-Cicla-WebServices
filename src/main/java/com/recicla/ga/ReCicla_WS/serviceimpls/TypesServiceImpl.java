package com.recicla.ga.ReCicla_WS.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.recicla.ga.ReCicla_WS.entities.Types;
import com.recicla.ga.ReCicla_WS.repositories.ITypesRepository;
import com.recicla.ga.ReCicla_WS.serviceinterfaces.ITypesService;

import java.util.List;
import java.util.Optional;

@Service
public class TypesServiceImpl implements ITypesService {
    @Autowired
    private ITypesRepository typeService;

    @Override
    public void Insert(Types types) {
        typeService.save(types);
    }
    @Override
    public List<Types> list() {
        return typeService.findAll();
    }

    @Override
    public void delete(int idTypes) {
    typeService.deleteById(idTypes);
    }

    @Override
    public Optional<Types> findTypesByID(int idTypes) {
        return Optional.of(typeService.findById(idTypes).orElse(new Types()));
    }

    @Override
    public List<Types> findTypeName(String TypesName) {
        return typeService.findNameType(TypesName);
    }


}
