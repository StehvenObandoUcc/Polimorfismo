public class Notificacion {

    protected int codigo;
    protected String mensaje;
    protected Usuario destinatario;

    public Notificacion(int codigo, Usuario destinatario) {
        this.codigo = codigo;
        this.destinatario = destinatario;
    }

    public void enviar() {
        System.out.println("Enviando notificacion a: " + destinatario.getNombre());
    }

    public void notificarCalificacion(Usuario u, Clase c) {
        this.mensaje = "Hola " + u.getNombre() + ", tu calificacion en "
                + c.getNombreMateria() + " es: " + c.getCalificacion();
        enviar();
    }

    public void notificarPagoMatricula(Usuario u, Matricula m) {
        this.mensaje = "Hola " + u.getNombre() + ", tu matricula del periodo "
                + m.getPeriodo() + " tiene un valor de: $" + m.getValor();
        enviar();
    }

    public void notificarCancelacionClase(Usuario u, Clase c) {
        this.mensaje = "Hola " + u.getNombre() + ", la clase "
                + c.getNombreMateria() + " ha sido cancelada.";
        enviar();
    }

    public void notificarInscripcion(Usuario u, String descripcion) {
        this.mensaje = "Hola " + u.getNombre() + ", " + descripcion;
        enviar();
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}