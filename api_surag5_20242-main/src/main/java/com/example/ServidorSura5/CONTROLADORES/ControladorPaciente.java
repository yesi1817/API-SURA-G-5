package com.example.ServidorSura5.CONTROLADORES;

import com.example.ServidorSura5.MODELOS.Paciente;
import com.example.ServidorSura5.SERVICIOS.ServivioPaciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/paciente")
public class ControladorPaciente {
    @Autowired
    ServivioPaciente servivioPaciente;

    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody Paciente datos){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servivioPaciente.guardarPaciente(datos));

        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());

        }
    }
}
