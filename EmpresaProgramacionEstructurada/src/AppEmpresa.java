import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AppEmpresa {
    public static void main(String[] args) {
        double total = 0;
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<String> cargos = new ArrayList<>();
        ArrayList<Double> salarios = new ArrayList<>();

        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de empleados"));

        for (int emp = 0; emp < cantidad; emp++) {
            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado");
            String cargo = JOptionPane.showInputDialog(null, "Ingrese el cargo del empleado");
            double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el salario del empleado"));

            // Almacenamiento de los datos en el ArrayList
            nombres.add(nombre);
            cargos.add(cargo);
            salarios.add(salario);
        }

        // Mostrar el número total de empleados
        System.out.println("El número de empleados es: " + cantidad);

        // Mostrar nombres y salarios de los empleados
        System.out.println("Los nombres y salarios de los empleados son: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Nombre: " + nombres.get(i) + " Salario: " + salarios.get(i));
            total += salarios.get(i); // Calcular el total aquí
        }

        // Mostrar el total del dinero pagado por todos los empleados
        System.out.println("El total del dinero pagado por todos los empleados es: " + total);
    }
}
