package com.codigofacilito.AnimalShelter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/api/mascotas")
    public String postMethodName(@RequestBody String entity) {
        //TODO: process POST request
        
        return entity;
    }
    
    // ENDPOINTS:
    // Registro de mascota: POST /api/mascotas
    // Consulta de mascotas disponibles para adopciön: Endpoint GET /api/mascotas 
    // Actualización de datos de una mascota: Endpoint PUT /api/mascotas/{id}
    // Eliminación de mascota: Endpoint DELETE /api/mascotas/{id}
    // Registro de usuarios: Endpoint POST /api/usuarios
    // Adopciön de mascota: Endpoint POST /api/adopciones
}
