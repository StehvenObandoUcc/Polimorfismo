import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Usuario usuario = new Usuario(1, "Stehven Obando", "stehven@email.com", 3001234567L);
        Matricula matricula = new Matricula(20261, 4500000, LocalDate.of(2026, 5, 15));
        Clase clase = new Clase(101, "Ingenieria de Software", true, 4.5);

        SistemaUniversidad sistema = new SistemaUniversidad(
            List.of(usuario),
            List.of(matricula),
            List.of(clase)
        );

        Notificacion porCorreo = new Correo(1, usuario);
        Notificacion porSMS    = new MensajeTexto(2, usuario);
        Notificacion porApp    = new AppMovil(3, usuario);

        System.out.println("=== Notificar Calificacion ===");
        sistema.notificarCalificacion(usuario, clase, porCorreo);
        sistema.notificarCalificacion(usuario, clase, porSMS);
        sistema.notificarCalificacion(usuario, clase, porApp);

        System.out.println("\n=== Notificar Pago Matricula ===");
        sistema.notificarPagoMatricula(usuario, matricula, porCorreo);
        sistema.notificarPagoMatricula(usuario, matricula, porSMS);
        sistema.notificarPagoMatricula(usuario, matricula, porApp);

        System.out.println("\n=== Notificar Cancelacion de Clase ===");
        sistema.notificarCancelacionClase(usuario, clase, porCorreo);
        sistema.notificarCancelacionClase(usuario, clase, porSMS);
        sistema.notificarCancelacionClase(usuario, clase, porApp);

        System.out.println("\n=== Notificar Inscripcion ===");
        sistema.notificarInscripcion(usuario, "tu inscripcion al semestre 2026-1 fue exitosa.", porCorreo);
        sistema.notificarInscripcion(usuario, "inscripcion semestre 2026-1 confirmada.", porSMS);
        sistema.notificarInscripcion(usuario, "semestre 2026-1 confirmado.", porApp);
    }
}