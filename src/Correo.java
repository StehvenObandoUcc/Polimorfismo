public class Correo extends Notificacion {

    private String asunto;

    public Correo(int codigo, Usuario destinatario) {
        super(codigo, destinatario);
    }

    @Override
    public void enviar() {
        System.out.println("[CORREO] Para: " + destinatario.getCorreo()
                + " | Asunto: " + asunto
                + " | Mensaje: " + mensaje);
    }

    @Override
    public void notificarCalificacion(Usuario u, Clase c) {
        this.asunto = "Resultado academico - " + c.getNombreMateria();
        super.notificarCalificacion(u, c);
    }

    @Override
    public void notificarPagoMatricula(Usuario u, Matricula m) {
        this.asunto = "Pago de matricula periodo " + m.getPeriodo();
        super.notificarPagoMatricula(u, m);
    }

    @Override
    public void notificarCancelacionClase(Usuario u, Clase c) {
        this.asunto = "Cancelacion de clase - " + c.getNombreMateria();
        super.notificarCancelacionClase(u, c);
    }

    @Override
    public void notificarInscripcion(Usuario u, String descripcion) {
        this.asunto = "Confirmacion de inscripcion";
        super.notificarInscripcion(u, descripcion);
    }
}