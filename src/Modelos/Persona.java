package Modelos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class Persona implements Serializable {

    private static final long serialVersionUID = 1L;

    protected int id_persona;

    protected String nombre;

    protected String apellido;

    protected int dni;

    protected String codigo;

    protected String clave;

    protected String correo_electronico;

    protected String telefono;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int dni, String codigo, String clave) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.codigo = codigo;
        this.clave = clave;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona [id_persona=" + id_persona + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni
                + ", codigo=" + codigo + ", clave=" + clave + ", correo_electronico=" + correo_electronico
                + ", telefono=" + telefono + "]";
    }

}
