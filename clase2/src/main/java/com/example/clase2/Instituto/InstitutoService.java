package com.example.clase2.Instituto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class InstitutoService 
{
    //Consumir el repositorio
    @Autowired
    private InstitutoRepository institutoRepository;

    //Metodo para el Create
    public Instituto save(Instituto entity)
    {
        return institutoRepository.save(entity);
        
    }


}

