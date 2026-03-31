package loco;
public class Alumno {
	
	    // Atributos de la clase
	    String titulo;
	    String autor;
	    public static void main(String[] args) {
	        // Crear un objeto llamado miLibro
	        Alumno miLibro = new Alumno();
	        // Asignar valores a los atributos del objeto
	        miLibro.titulo = "100 años de soledad";
	        miLibro.autor = "Gabriel García Márquez";
	        // Mostrar los datos del libro
	        System.out.println("Título: " + miLibro.titulo);
	        System.out.println("Autor: " + miLibro.autor);
	    }
