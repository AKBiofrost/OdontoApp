package com.example.proto_hd_odontologia;

public class ListElement {


public String paciente;
public String name;
public String tratamiento;
public String Dia;
public String color;


    public ListElement(String paciente, String name, String tratamiento, String dia, String color) {
        this.paciente = paciente;
        this.name = name;
        this.tratamiento = tratamiento;
        Dia = dia;
        this.color = color;
    }

    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }



    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getDia() {
        return Dia;
    }

    public void setDia(String dia) {
        Dia = dia;
    }




}
