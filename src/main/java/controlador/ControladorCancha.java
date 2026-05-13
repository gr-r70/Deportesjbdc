/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Cancha;
import modelo.CanchaDAO;
import vista.VistaCancha;
import java.util.List;

public class ControladorCancha {

    private VistaCancha vista;
    private CanchaDAO modeloDAO;

    public ControladorCancha(VistaCancha vista, CanchaDAO modeloDAO) {
        this.vista = vista;
        this.modeloDAO = modeloDAO;
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    registrarNuevaCancha();
                    break;
                case 2: 
                    mostrarCanchas();
                    break;
                case 3: 
                    editarCancha();
                    break;
                case 4: 
                    eliminarCancha();
                    break;
                case 5: 
                        vista.mostrarMensaje("Saliendo...");
                    break;
                default:
                    vista.mostrarMensaje("Opción inválida.");
            }
        } while (opcion != 5);
    }

    private void registrarNuevaCancha() {
        String nombre   = vista.pedirNombre();
        String deporte  = vista.pedirDeporte();
        int capacidad   = vista.pedirCapacidad();

        boolean exito = modeloDAO.guardarCancha(new Cancha(nombre, deporte, capacidad));
        vista.mostrarMensaje(exito
            ? "Registro Exitoso"
            : "Error al registrar la cancha.");
    }

    private void mostrarCanchas() {
        List<Cancha> lista = modeloDAO.obtenerCanchas();
        vista.mostrarCanchas(lista);
    }

    private void editarCancha() {
        mostrarCanchas();
        int id          = vista.pedirId();
        String nombre   = vista.pedirNombre();
        String deporte  = vista.pedirDeporte();
        int capacidad   = vista.pedirCapacidad();

        boolean exito = modeloDAO.editarCancha(id, new Cancha(nombre, deporte, capacidad));
        vista.mostrarMensaje(exito
            ? "¡Cancha actualizada exitosamente!"
            : "Error al actualizar la cancha.");
    }

    private void eliminarCancha() {
        mostrarCanchas();
        int id = vista.pedirId();

        boolean exito = modeloDAO.eliminarCancha(id);
        vista.mostrarMensaje(exito
            ? "¡Cancha eliminada exitosamente!"
            : "Error al eliminar la cancha.");
    }
}