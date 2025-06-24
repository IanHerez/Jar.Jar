/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;

import java.util.Scanner;


public class Biblioteca {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Crear objetos de las diferentes clases
        Autor autor = new Autor();
        Lector lector = new Lector();
        Libros libro = new Libros();

        // Solicitar datos del autor
        System.out.println("--- REGISTRO DEL AUTOR ---");
        System.out.print("Ingrese el nombre del autor: ");
        autor.setNombre(leer.nextLine());

        System.out.print("Ingrese el apellido paterno del autor: ");
        autor.setApellidoPaterno(leer.nextLine());

        System.out.print("Ingrese el apellido materno del autor: ");
        autor.setApellidoMaterno(leer.nextLine());

        System.out.println();

        // Solicitar datos del lector
        System.out.println("--- REGISTRO DEL LECTOR ---");
        System.out.print("Ingrese la matricula del lector: ");
        lector.setMatricula(leer.nextLine());

        System.out.print("Ingrese el nombre del lector: ");
        lector.setNombre(leer.nextLine());

        System.out.print("Ingrese el apellido paterno del lector: ");
        lector.setApellidoPaterno(leer.nextLine());

        System.out.print("Ingrese el apellido materno del lector: ");
        lector.setApellidoMaterno(leer.nextLine());

        System.out.println();

        // Solicitar datos del libro
        System.out.println("--- REGISTRO DEL LIBRO ---");
        System.out.print("Ingrese el tiolatulo del libro: ");
        libro.setTitulo(leer.nextLine());

        System.out.print("Ingrese el ISBN del libro: ");
        libro.setIsbn(leer.nextLine());

        // Usar los mismos datos del autor para el libro
        libro.setNombre(autor.getNombre());
        libro.setApellidoPaterno(autor.getApellidoPaterno());
        libro.setApellidoMaterno(autor.getApellidoMaterno());

        System.out.println();

        // Mostrar resumen de toda la información registrada
        System.out.println("=== RESUMEN DE INFORMACIÓN REGISTRADA ===");
        System.out.println();

        autor.mostrarAutor();
        lector.mostrarLector();
        libro.mostrarLibro();

        System.out.println("=== FIN DEL PROGRAMA ===");
        System.out.println("Gracias por usar el sistema de biblioteca");

        
    }

}
