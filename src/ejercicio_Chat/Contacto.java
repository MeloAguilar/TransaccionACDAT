package ejercicio_Chat;

public class Contacto {
    private int idContacto;

    private String nombre;

    private boolean bloqueado;

    public Contacto() {
        this.idContacto = 0;
        this.nombre = null;
        this.bloqueado = false;
    }

    public Contacto(int idContacto, String nombre, boolean bloqueado) {
        this.idContacto = idContacto;
        this.nombre = nombre;
        this.bloqueado = bloqueado;
    }

}
