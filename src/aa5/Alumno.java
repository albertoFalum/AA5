
package aa5;


public class Alumno {
    private String nombre;
    private String apellido;
    private String materia;
    private int nota;

    public Alumno(String nombre, String apellido, String materia, int nota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.materia = materia;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
    
}
