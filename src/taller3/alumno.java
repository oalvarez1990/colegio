
package taller3;

import java.util.Date;

/**
 *
 * @author Administrador
 */
public class alumno extends persona {

    private String matricula;
    private String correoElectronico;
    private String curso;

    public alumno(String nombre, String apellido, Date fechaNacimiento, String genero, double estatura, int peso,
            String matricula, String correoElectronico, String curso) {
        // Se inicia el constructor para alumno 
        this.matricula = matricula;
        this.correoElectronico = correoElectronico;
        this.curso = this.curso;
    }

    public String toString() {
        return "alumno: " + super.toString();
    }
}
