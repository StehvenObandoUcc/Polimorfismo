import java.util.List;

public class SistemaUniversidad {

    private List<Usuario> usuarios;
    private List<Matricula> matriculas;
    private List<Clase> clases;

    public SistemaUniversidad(List<Usuario> usuarios, List<Matricula> matriculas, List<Clase> clases) {
        this.usuarios = usuarios;
        this.matriculas = matriculas;
        this.clases = clases;
    }

    public void notificarCalificacion(Usuario u, Clase c, Notificacion n) {
        n.notificarCalificacion(u, c);
    }

    public void notificarPagoMatricula(Usuario u, Matricula m, Notificacion n) {
        n.notificarPagoMatricula(u, m);
    }

    public void notificarCancelacionClase(Usuario u, Clase c, Notificacion n) {
        n.notificarCancelacionClase(u, c);
    }

    public void notificarInscripcion(Usuario u, String descripcion, Notificacion n) {
        n.notificarInscripcion(u, descripcion);
    }
}