import controllers.BusquedaBinaria;
import controllers.PersonController;
import models.Person;
import views.ShowConsole;

public class App {
    public static void main(String[] args) throws Exception {

        ShowConsole sC = new ShowConsole();
        BusquedaBinaria bB = new BusquedaBinaria();
        int[] arr = new int[] { 10, 2, 4, 6, 7, 8, 13, 20 };
        Integer result = bB.sortBurbuja(arr);
        result = bB.busquedaBinaria(arr, 10);

        sC.showArray(arr);
        sC.showResult(result);

        // Instanciamos PersonaController
        // creamos el arreglo
        Person[] people = new Person[] {
                new Person("Pablo", 4),
                new Person("Maria", 5),
                new Person("Juan", 18),
                new Person("David", 60),
                new Person("Mateo", 25),
                new Person("Diego", 12),
                new Person("Ana", 8),
                new Person("Alicia", 9),
                new Person("Jaime", 40),
        };
        // Orednamso el arreglo por nombre
        PersonController personaController = new PersonController();
        personaController.sortBurbuja(people);
        sC.showArray(people);

        // mandamos a buscar a Pedro
        Person encontrada = personaController.findByName(people, "Pedro");

        // mostramos el resultado
        sC.showPersonResult(encontrada, "Pedro");
       
        // ordenamos el arreglo por edad
        personaController.sortBurbujaPorEdad(people);
        sC.showArray(people); // Muestra el arreglo ordenado por edad

        // buscamos por edad
        Person encontradaPorEdad = personaController.findByAge(people, 18);

        // mostramos el resultado
        sC.showPersonResultAge(encontradaPorEdad, 18);
        

    }
}
