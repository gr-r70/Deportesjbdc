/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.deportejdbc;

import controlador.ControladorCancha;
import modelo.CanchaDAO;
import vista.VistaCancha;

public class Deportejdbc {
    public static void main(String[] args) {
        VistaCancha vista       = new VistaCancha();
        CanchaDAO dao           = new CanchaDAO();
        ControladorCancha ctrl  = new ControladorCancha(vista, dao);
        ctrl.iniciar();
    }
}