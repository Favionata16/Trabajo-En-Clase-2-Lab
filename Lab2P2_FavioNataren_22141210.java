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
         
        //animales por defecto
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

    public static int menu() {
        System.out.println("----- MENU -----");
        System.out.println("\n1. Crear alumnos"
                + "\n2. Editar alumnos"
                + "\n3. Eliminar alumno"
                + "\n4. Listar alumnos"
                + "\n0. salir"
                + "\nIngrese la opcion: ");
        return leer.nextInt();
    }

    public static void opcion(int opcion) {
        switch (opcion) {
            case 1:
                crearAlumnos();
                break;
            case 2:
                editarAlumno();
                break;
            case 3:
                eliminarAnimal();
                break;
            case 4:
                listarAnimal();
                break;
            case 0:
                System.exit(0);    
            default:
                break;
        }
    }

    public static void crearAlumnos() {
        System.out.print("Nombre Cientifico: ");
        String nombreCientifico = leer.nextLine();
        
        System.out.print("Nombre Comun: ");
        String nombreComun = leer.next(); 
        
        System.out.print("Habitat: ");
        String habitat = leer.next();
        
        System.out.print("Alimentacion: ");
        String alimentacion = leer.next();
        
        System.out.print("Rasgos: ");
        String rasgos = leer.nextLine();
        
        System.out.print("Geografica: ");
        String geografica = leer.nextLine();
        
        System.out.print("Vida: ");
        int vida = leer.nextInt();
        
        lista.add(new Animal(nombreCientifico, nombreComun, habitat, alimentacion, rasgos, geografica, vida));
    }

    

}
