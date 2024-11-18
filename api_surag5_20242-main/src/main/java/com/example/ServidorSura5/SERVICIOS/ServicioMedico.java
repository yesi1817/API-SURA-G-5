package com.example.ServidorSura5.SERVICIOS;

import com.example.ServidorSura5.MODELOS.Medico;
import com.example.ServidorSura5.MODELOS.SignoVital;
import com.example.ServidorSura5.REPOSITORIOS.IRepositorioMedico;
import com.example.ServidorSura5.REPOSITORIOS.IRepositorioSignoVital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ServicioMedico {
    @Autowired
    IRepositorioMedico iRepositorioMedico;
    public Medico guardarMedico(Medico datosMedico)throws Exception{
        try{
            return iRepositorioMedico.save(datosMedico);

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
