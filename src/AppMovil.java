public class AppMovil extends Notificacion {

    public AppMovil(int codigo, Usuario destinatario) {
        super(codigo, destinatario);
    }

    @Override
    public void enviar() {
        System.out.println("[APP PUSH] Para: " + destinatario.getNombre()
                + " | Push: " + mensaje);
    }

    @Override
    public void notificarCalificacion(Usuario u, Clase c) {
        this.mensaje = "Nueva calificacion en " + c.getNombreMateria()
                + ": " + c.getCalificacion();
        enviar();
    }

    @Override
    public void notificarPagoMatricula(Usuario u, Matricula m) {
        this.mensaje = "Pago pendiente periodo " + m.getPeriodo()
                + ": $" + m.getValor();
        enviar();
    }

    @Override
    public void notificarCancelacionClase(Usuario u, Clase c) {
        this.mensaje = "Clase cancelada: " + c.getNombreMateria();
        enviar();
    }

    @Override
    public void notificarInscripcion(Usuario u, String descripcion) {
        this.mensaje = "Inscripcion confirmada: " + descripcion;
        enviar();
    }
}