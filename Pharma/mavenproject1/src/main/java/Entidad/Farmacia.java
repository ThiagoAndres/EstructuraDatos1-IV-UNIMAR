/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Asus 1
 */
public class Farmacia implements Serializable{
    
    private String nombre;
    private ArrayList<Medicamento> medicamentos = new ArrayList<>();;

    public Farmacia(String nombre) {
        this.nombre = nombre;
        //medicamentos = new ArrayList<>();
    }

    public Farmacia() {
    }
        
    public void addMedicamento(Medicamento medicamento){
        getMedicamentos().add(medicamento);
        System.out.println("guardando a "+ medicamento.getNombre());
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the medicamentos
     */
    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    /**
     * @param medicamentos the medicamentos to set
     */
    public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }
    
    
    

    
    
    
    
    
}
