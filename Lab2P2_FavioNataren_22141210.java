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
        System.out.println("\n1. Crear Animales"
                + "\n2. Editar Animales"
                + "\n3. Eliminar Animales"
                + "\n4. Listar Animales"
                + "\n0. salir"
                + "\nIngrese la opcion: ");
        return leer.nextInt();
    }

    public static void opcion(int opcion) {
        switch (opcion) {
            case 1:
                crearAnimal();
                break;
            case 2:
                editarAnimal();
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

    public static void crearAnimal() {
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

    public static void editarAnimal() {
        System.out.print("Ingrese la posicion: ");
        int pos = leer.nextInt();
        
        System.out.println("1. Un atributo"
                +"2. Todos los atributos");
        System.out.print("Ingrese la opcion: ");
        int opcion = leer.nextInt();
        
        if (opcion == 1) {
            editarAtributo(pos);
        } else if (opcion == 2) {
            editarAtributos(pos);
        }
    }

    public static void editarAtributo(int pos) {
        
        System.out.println("1. Nombre Cientifico"
                +"2. Nombre Comun"
                +"3. Habitat"
                +"4. Alimentacion"
                +"5. Rasgos"
                +"6. Geografica"
                +"7. Vida"
                +"Ingrese la opcion: ");
        int opcion = leer.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.print("Nombre Cientifico: ");
                lista.get(pos).setNombreCientifico(leer.next());
                break;
                
            case 2:
                System.out.print("Nombre Comun: ");
                lista.get(pos).setNombreComun(leer.next());
                break;
                
            case 3:
                System.out.print("Habitat: ");
                lista.get(pos).setHabitat(leer.next());
                break;
                
            case 4:
                System.out.println("Alimentacion: ");
                lista.get(pos).setAlimentacion(leer.next());
                break;
                
            case 5:
                System.out.print("Descripcion de rasgos: ");
                lista.get(pos).setRasgos(leer.next());
                break;
                
            case 6:
                System.out.print("Descripcion Geografica: ");
                lista.get(pos).setDescripcionGeo(leer.next());
                break;
                
            case 7:
                System.out.println("Vida: ");
                lista.get(pos).setVida(leer.nextInt());
                break;
                
            default:
                break;
        }
    }

    

}
