package ejercicio_Chat;

public class Mensaje {
    private int idMensaje;

    private String fecha;

    private String hora;

    private Contacto emisor;

    private Contacto receptor;

    public int getIdMensaje() {
        return idMensaje;
    }

    public void setIdMensaje(int idMensaje) {
        this.idMensaje = idMensaje;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Contacto getEmisor() {
        return emisor;
    }

    public void setEmisor(Contacto emisor) {
        this.emisor = emisor;
    }

    public Contacto getReceptor() {
        return receptor;
    }

    public void setReceptor(Contacto receptor) {
        this.receptor = receptor;
    }

    public Mensaje(int idMensaje, String fecha, String hora, Contacto emisor, Contacto receptor) {
        this.idMensaje = idMensaje;
        this.fecha = fecha;
        this.hora = hora;
        this.emisor = emisor;
        this.receptor = receptor;
    }

    public Mensaje() {
        this.idMensaje = 0;
        this.fecha = null;
        this.hora = null;
        this.emisor = null;
        this.receptor = null;
    }
}
