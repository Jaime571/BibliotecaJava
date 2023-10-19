package biblioteca;

public class PilaAlumnoCompartida {
    private Pila<Alumno> pila;

    public PilaAlumnoCompartida() {
        this.pila = new Pila<Alumno>();
    }

    public synchronized void agregarElemento(Alumno elemento) {
        pila.push(elemento);
    }

    public synchronized Alumno obtenerElemento() {
        if (!pila.isEmpty()) {
            return pila.pop();
        }
        return null;
    }
}
