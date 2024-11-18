package com.example.ServidorSura5.CONTROLADORES;

import com.example.ServidorSura5.MODELOS.Enfermedad;
import com.example.ServidorSura5.MODELOS.Paciente;
import com.example.ServidorSura5.SERVICIOS.ServicioEnfermedad;
import com.example.ServidorSura5.SERVICIOS.ServivioPaciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Enfermedad")

public class ControladorEnfermedad {
    @Autowired
    ServicioEnfermedad servivioEnfermedad;

    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody Enfermedad datos){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servivioEnfermedad.guardarEnfermedad(datos));

        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());

        }
    }
}
