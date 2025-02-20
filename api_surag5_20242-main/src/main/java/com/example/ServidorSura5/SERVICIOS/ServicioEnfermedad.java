package com.example.ServidorSura5.SERVICIOS;

import com.example.ServidorSura5.MODELOS.Enfermedad;
import com.example.ServidorSura5.MODELOS.Medicamento;
import com.example.ServidorSura5.REPOSITORIOS.IRepositorioEnfermedad;
import com.example.ServidorSura5.REPOSITORIOS.IRepositorioMedicamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ServicioEnfermedad {
    @Autowired
    IRepositorioEnfermedad iRepositorioEnfermedad;
    public Enfermedad guardarEnfermedad(Enfermedad datosEnfermedad)throws Exception{
        try{
            return iRepositorioEnfermedad.save(datosEnfermedad);

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
