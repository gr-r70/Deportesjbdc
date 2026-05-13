/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import javax.swing.JOptionPane;
import java.util.List;
import modelo.Cancha;

public class VistaCancha {

    public int mostrarMenu() {
        String menu = """
                === SISTEMA DE CANCHAS ===
                1. Registrar nueva cancha
                2. Ver canchas registradas
                3. Actualizar cancha existente
                4. Eliminar cancha existente
                5. Salir
                
                Elige una opción:
                """;
        return Integer.parseInt(JOptionPane.showInputDialog(null, menu));
    }

    public String pedirNombre() {
        return JOptionPane.showInputDialog("Ingrese el nombre de la cancha:");
    }

    public String pedirDeporte() {
        return JOptionPane.showInputDialog("Ingrese el deporte (ej. Fútbol, Tenis):");
    }

    public int pedirCapacidad() {
        return Integer.parseInt(
            JOptionPane.showInputDialog("Ingrese la capacidad (número de jugadores):")
        );
    }

    public int pedirId() {
        return Integer.parseInt(
            JOptionPane.showInputDialog("Ingrese el ID de la cancha:")
        );
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public void mostrarCanchas(List<Cancha> lista) {
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay canchas registradas.");
            return;
        }

        StringBuilder sb = new StringBuilder("=== CANCHAS REGISTRADAS ===\n\n");
        for (Cancha c : lista) {
            sb.append("ID: ").append(c.getId())
              .append(" | Nombre: ").append(c.getNombre())
              .append(" | Deporte: ").append(c.getDeporte())
              .append(" | Capacidad: ").append(c.getCapacidad())
              .append("\n");
        }

        JOptionPane.showMessageDialog(null, sb.toString());
    }
}