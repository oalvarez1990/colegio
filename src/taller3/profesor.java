package taller3;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.LocalAttribute;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

/**
 *
 * @author Administrador
 */

// Se crea los atributos para clase profesor
public class profesor extends persona{// se extiende a la clase persona
private String titulo;
private String especialista;
private String escalafon;
private int salario;

// Se crea constructor para la clase y supersclase
public profesor (String nombre, String apellido, Date fechaNacimiento, String genero, double estatura, int peso,
        String titulo, String especialista, String escalafon, int salario){
super(nombre,apellido,fechaNacimiento,genero,estatura,peso );// Se indica que tome atributos de clase persona
// Se inicia los atributos que falta de clase profesor
this.titulo= titulo;
this.especialista= especialista;
this.salario= salario;

}


public void mostrarDatos(){
    System.out.println("Nombre: " +getNombre()+
            "\nApeliido: "+getApellido()+
            "\nFecha de nacimiento: "+getFechaNacimiento()+
            "\ngenero: "+getGenero()+
            "\neEstatura: " +getEstatura()+
            "\nPeso: "+getPeso()+
            "\nTitulo: "+titulo+ 
            "\nEspecializacion: "+especialista+
            "\nEscalafon: "+escalafon+            
            "\nSalario: "+ salario);    
    
}

public String toString(){
return "profesor: "+ super.toString();
}
    
}
