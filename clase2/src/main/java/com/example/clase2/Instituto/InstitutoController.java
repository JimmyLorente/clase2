package com.example.clase2.Instituto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app/ist")
@CrossOrigin(("*"))
public class InstitutoController 
{
 //Consumir el servicio
 @Autowired
 private InstitutoService institutoService;

 //Sub ruta para el create
 @PostMapping("/create")
 public Instituto save(@RequestBody Instituto entity)
 {
    return institutoService.save(entity);

 }

}
