package com.example.ServidorSura5.SERVICIOS;

import com.example.ServidorSura5.MODELOS.Medicamento;
import com.example.ServidorSura5.MODELOS.Medico;
import com.example.ServidorSura5.REPOSITORIOS.IRepositorioMedicamento;
import com.example.ServidorSura5.REPOSITORIOS.IRepositorioSignoVital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ServicioMedicamento {
    @Autowired
    IRepositorioMedicamento iRepositorioMedicamento;
    public Medicamento guardarMedicamento(Medicamento datosMedicamento)throws Exception{
        try{
            return iRepositorioMedicamento.save(datosMedicamento);

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
