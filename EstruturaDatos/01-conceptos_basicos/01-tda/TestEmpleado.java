
import javax.swing.JOptionPane;

public class TestEmpleado {

    private static Empleado empl;

    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar() {

        String numeroNomina = solicitarTexto("Numero Nomina");
        String nombre = solicitarTexto("Nombre Completo");

        empl = new Empleado(
                numeroNomina,
                nombre,
                "Masculino",
                34000.56,
                false
        );

        imprimir();
    }

    public static String solicitarTexto(String valor) {
        return JOptionPane.showInputDialog(
                "Introduce el " + valor
        );
    }

    public static void imprimir() {
        String salida = "Datos del Empleado: " +
                empl.toString() +
                "\nNumero de Objetos Creados: " +
                Empleado.getContarObjetos();

        JOptionPane.showMessageDialog(null, salida);
    }
}