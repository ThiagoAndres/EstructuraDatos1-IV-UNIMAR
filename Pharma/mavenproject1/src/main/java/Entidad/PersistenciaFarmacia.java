/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Asus 1
 */
public class PersistenciaFarmacia {
    
    public void guardar (Farmacia x) throws FileNotFoundException, IOException{
        ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream ("farmacia.obj"));
        ous.writeObject(x);
        ous.close();
    }
    
    public Farmacia recuperar () throws ClassNotFoundException, IOException{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream ("farmacia.obj"));
        Farmacia farmacia = (Farmacia) ois.readObject();
        ois.close();
        return farmacia;
    }
    
}
