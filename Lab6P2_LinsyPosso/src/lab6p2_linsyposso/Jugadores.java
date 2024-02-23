/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_linsyposso;

/**
 *
 * @author 29164
 */
public class Jugadores {
    private String nombre;
    private int edad;
    protected String pos;

    public Jugadores() {
    }

    public Jugadores(String nombre, int edad, String pos) {
        this.nombre = nombre;
        this.edad = edad;
        this.pos = pos;
    }

    public Jugadores(String pos) {
        this.pos = pos;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
