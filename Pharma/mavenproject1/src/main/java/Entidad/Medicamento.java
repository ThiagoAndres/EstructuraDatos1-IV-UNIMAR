/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.io.Serializable;

/**
 *
 * @author Asus 1
 */
public class Medicamento implements Serializable{
    private int código;
    private String nombre;
    private String tipo;
    private float precio;

    public Medicamento(int código, String nombre, String tipo, float precio) {
        this.código = código;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }

    /**
     * @return the código
     */
    public int getCódigo() {
        return código;
    }

    /**
     * @param código the código to set
     */
    public void setCódigo(int código) {
        this.código = código;
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
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        return "codigo: "+código + " nombre: "+ nombre + "\n"; 
        /*StringBuilder sb = new StringBuilder();                                                                   
        sb.append("\nCódigo: ");
        sb.append(código);
        sb.append("\nNombre: ");
        sb.append(nombre);
        sb.append("\nTipo: ");
        sb.append(tipo);
        sb.append("\nprecio: ");
        sb.append(precio);    
        return sb.toString();*/
    }
    
    
    
    
   
            
    
}
