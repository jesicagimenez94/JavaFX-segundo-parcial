package sample;

import javafx.beans.property.SimpleStringProperty;

public class Alumnos {

    private String nombre;
    private String apellido ;
    private  String dni;
    private   String mail;
    private int nota;
    private double promedio;

    private   String materia;

    public Alumnos(String nombre, String apellido, String dni, String mail, int nota,  String materia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.mail = mail;
        this.nota = nota;
        this.materia = materia;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public Alumnos(String nombre, String apellido, String dni, String mail, String materia) {
        this.nombre =nombre;
        this.apellido=apellido;
        this.dni =dni;
        this.mail=mail;
        this.materia=materia;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Alumnos(){}
}
