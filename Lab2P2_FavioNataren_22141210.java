/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TcLab;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author favio
 */
public class Lab2P2_FavioNataren_22141210 {

    public static Scanner leer = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static ArrayList<Animal> lista = new ArrayList();                    
    public static Animal animala = new Animal();
    public static Animal animalb = new Animal();
    public static Animal animalc = new Animal();

    public static void main(String[] args) {
                            
        animala = new Animal("Lechuza", "Tyto alba", "llanuras ", "animales pequenos", "‎", "Centroamérica y América del Sur", 3);
        animalb = new Animal("Panthera leo", "León", "selvas", "carnivora", "centroamerica ", "selvas", 2);
        animalc = new Animal("Panthera pardus", "Leopardo", "selvas ", "Carnívora", "tienen manchas", "América del Sur", 17 );
        lista.add(animala);
        lista.add(animalb);
        lista.add(animalc);
        do {
            opcion(menu());
        } while (true);
    }


}
