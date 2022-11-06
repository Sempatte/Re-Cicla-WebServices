package com.recicla.ga.ReCicla_WS.services;


import com.recicla.ga.ReCicla_WS.entities.Types;

import java.util.List;
import java.util.Optional;

public interface ITypesService {
    public void Insert(Types types);
    List<Types> list();
    public void delete(int idTypes);
    public Optional<Types> findTypesByID(int idTypes);
    List<Types> findTypeName(String TypesName);
}
