package com.example.ServidorSura5.SERVICIOS;

import com.example.ServidorSura5.MODELOS.Paciente;
import com.example.ServidorSura5.REPOSITORIOS.IRepositorioPaciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ServivioPaciente {

    //1. llamar a el repositoria respectivo
    @Autowired
    IRepositorioPaciente iRepositorioPaciente;

    //2.se programan las funciones para las distintas
    // operaciones en la BD

    //funcion para guardar DATOS
    public Paciente guardarPaciente(Paciente datosPaciente)throws Exception{
        try{
            return iRepositorioPaciente.save(datosPaciente);

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
