package com.recicla.ga.ReCicla_WS.serviceinterfaces;


import com.recicla.ga.ReCicla_WS.entities.Types;
import java.util.List;
public interface ITypesService {
    public void Insert(Types type);
    List<Types> list();
}
