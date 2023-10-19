package biblioteca;

public class Alumno {
    private int registro;
    private String nombre;
    private String apellido;
    private int edad;

    public Alumno(int registro, String nombre, String apellido, int edad) {
        this.registro = registro;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Alumno() {
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String toString(){
        String res = "";
        res = this.getRegistro() + "\t" + this.getNombre() + "\t" + this.getApellido() + "\t" + this.getEdad() + "\n";
        return res;
    }
}
