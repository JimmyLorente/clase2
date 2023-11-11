package com.example.clase2.Instituto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Instituto
{
    // Atributos de la clase instituto
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO) //Generar automaticamente el id

    private long id;
    private String Nombre;
    private String Apellido;
    
}
