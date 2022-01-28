/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TcLab;

/**
 *
 * @author favio
 */
public class Animal {
    private String nombreCientifico;
    private String nombreComun;
    private String habitat;
    private String alimentacion;
    private String rasgos;
    private String geografica;
    private int vida;
    
    public Animal() {
    }


    public Animal(String nombreCientifico, String nombreComun, String habitat, String alimentacion, String rasgos, String geografica, int vida) {
        this.nombreCientifico = nombreCientifico;
        this.nombreComun = nombreComun;
        this.habitat = habitat;
        this.alimentacion = alimentacion;
        this.rasgos = rasgos;
        this.geografica = geografica;
        this.vida = vida;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getRasgos() {
        return rasgos;
    }

    public void setRasgos(String rasgos) {
        this.rasgos = rasgos;
    }

    public String getGeografica() {
        return geografica;
    }

    public void setGeografica(String geografica) {
        this.geografica = geografica;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Animales" + "Nombre Cientifico: " + nombreCientifico + ", Nombre comun: " + nombreComun + ", habitat" + habitat + ", alimentacion" + alimentacion + ", rasgos" + rasgos + ", geografia" + geografica + ", vida" + vida;
    }
    
    
}
