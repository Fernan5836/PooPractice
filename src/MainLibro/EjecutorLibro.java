package MainLibro;

import LibroClass.Libro;

public class EjecutorLibro {
    public static void main(String[] args) {
        //Inicia un objeto nuevo "libro1" usando el constructor sin parámetros
        Libro libro1 = new Libro();

        //Mostrar los elementos del libro
        System.out.println("Los elementos del 1er libro son: ");
        libro1.mostrarDetalles();

        //Inicia un objeto nuevo "libro2" usando el constructor sin parámetros
        Libro libro2 = new Libro(
                "Paulo Coelho",
                "11 Minutos",
                272,
                2021,
                225
        );
        //MOstrar los elementos del libro2
        System.out.println("\nLos elementos del 2do libro son: ");
        libro2.mostrarDetalles();

        //Cambiar precio del libro
        libro2.actualizarCosto(175);
    }
}
