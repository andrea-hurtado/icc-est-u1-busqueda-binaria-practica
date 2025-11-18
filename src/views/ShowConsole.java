package views;

import models.Person;

public class ShowConsole {

    public void showArray(int[] arr){
        System.out.print(" Arreglo ordenado: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void showArray(Person[] people){
        System.out.print(" Arreglo ordenado: ");
        System.out.print("[");
        for (Person person : people) {
            System.out.print(person.getName() + ", " );
        }
        System.out.println("]");
    }

    public void showResult(Integer resultado){
        if (resultado != null) {
            System.out.println(" Número encontrado: " + resultado);
        } else {
            System.out.println(" Número no encontrado en el arreglo.");
        }
    }

    public void showPersonResult(Person people, String nombreBuscado){
        if (people != null) {
            System.out.println(" Persona encontrada: " + people.getName());
        } else {
            System.out.println(" No se encontró ninguna persona con el nombre: " + nombreBuscado);
        }
    }
    
    public void showPersonResultAge(Person person, int edadBuscada) {
        if (person != null) {
            System.out.println("La persona con la edad " + person.getAge() + " es " + person.getName());
        } else {
            System.out.println("No se encontró ninguna persona con edad " + edadBuscada);
        }
    }

}