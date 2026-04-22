public class MensajeTexto extends Notificacion {

    public MensajeTexto(int codigo, Usuario destinatario) {
        super(codigo, destinatario);
    }

    @Override
    public void enviar() {
        System.out.println("[SMS] Para: " + destinatario.getTelefono()
                + " | Msg: " + mensaje);
    }

    @Override
    public void notificarCalificacion(Usuario u, Clase c) {
        this.mensaje = "Nota en " + c.getNombreMateria() + ": " + c.getCalificacion();
        enviar();
    }

    @Override
    public void notificarPagoMatricula(Usuario u, Matricula m) {
        this.mensaje = "Pago matricula periodo " + m.getPeriodo() + ": $" + m.getValor();
        enviar();
    }

    @Override
    public void notificarCancelacionClase(Usuario u, Clase c) {
        this.mensaje = "Clase cancelada: " + c.getNombreMateria();
        enviar();
    }

    @Override
    public void notificarInscripcion(Usuario u, String descripcion) {
        this.mensaje = "Inscripcion: " + descripcion;
        enviar();
    }
}