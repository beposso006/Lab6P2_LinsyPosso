/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_linsyposso;

/**
 *
 * @author 29164
 */
public class Equipos {
    private String pais;
    private String nEquipo;
    private String ciudad;
    private String estadio;

    public Equipos() {
    }

    public Equipos(String pais, String nEquipo, String ciudad, String estadio) {
        this.pais = pais;
        this.nEquipo = nEquipo;
        this.ciudad = ciudad;
        this.estadio = estadio;
    }

    public Equipos(String pais) {
        this.pais = pais;
    }
    
    

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getnEquipo() {
        return nEquipo;
    }

    public void setnEquipo(String nEquipo) {
        this.nEquipo = nEquipo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    @Override
    public String toString() {
        return nEquipo;
    }
    
    
}
