
package Logica;

/**
 *
 * @author ANDRES
 */
public class Usuario {
    private String dni;
    private String nombre;
    private String correo;
    private String edad;
    private String telefono;

    public Usuario() {
    }

    public Usuario(String dni, String nombre, String correo, String edad, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.correo = correo;
        this.edad = edad;
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    

    
}
