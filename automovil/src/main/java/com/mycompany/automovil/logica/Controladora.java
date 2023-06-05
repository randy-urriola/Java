package com.mycompany.automovil.logica;

import com.mycompany.automovil.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void agregarAutomovil(String modelo, String marca, String motor, String color, String patente, int cantPuerta) {
        
        Automovil auto = new Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuerta(cantPuerta);
        
        controlPersis.agregarAutomovil(auto);
        
    }

    public List<Automovil> traerAutos() {
        
        return controlPersis.traerAutos();
        
    }

    public void borrarAuto(int idAuto) {
        controlPersis.borrarAuto(idAuto);
    }

    public Automovil traerAuto(int idAuto) {
        return controlPersis.traerAuto(idAuto);
    }

    public void modificarAuto(Automovil auto, String modelo, String marca, String motor, String color, String patente, int cantPuerta) {
        auto.setColor(color);
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setPatente(patente);
        auto.setMotor(motor);
        auto.setCantPuerta(cantPuerta);
        
        controlPersis.modificarAuto(auto);
    }
    
    
    
}
