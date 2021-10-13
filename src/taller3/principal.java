package taller3;

import trabajo.poo.persona;

/**
 *
 * @author Administrador
 */
public class principal {
    public static void main(String[] args) {
     
        // Declaracion de variables  para crear el objeto principal
     persona people;
     profesor teacher;
     alumno alumn;
     
     // Crear los objetos para las superclases alumno y profesor
     
     teacher = new  profesor("Karen Dayanna", "Alvarez Rojas", 2000, "F", 0, 0,"Desarrollador en software", "Fronted y Backend", "Cinco", 10000000);
     alumn= new alumno("David", "Diaz", 2010, "M", 1.50,63, "P-2021", "david@gmail.com", "Quinto");


     
     
     //Se imprime la informacion para mostrar al usuario
        System.out.println(teacher);
        System.out.println(alumn);
     
           
       

        
    }
}
