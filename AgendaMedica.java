package com.mycompany.agendamedica;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

import java.util.List;
import model.dao.ConsultaDAO;
import model.dao.MedicoDAO;
import model.dao.PacienteDAO;

/**
 *
 * @author super
 */
public class AgendaMedica {
    //ano/mes/dia
    public static void main(String[] args) {
        //focar nos ids
//        Medico m = new Medico("RONALICE", "Cardiologia", "12345", "0723");
//        m.setId(13);
//        
//        MedicoDAO daom = new MedicoDAO();
//        daom.delete(m);
//        Paciente p = new Paciente("ITALO","02/02/04","M", "12345", "087621");
//        p.setId(5);
//        PacienteDAO daop = new PacienteDAO();
//        daop.create(p);
        Consulta c = new Consulta(14, 10, "24/05/02", "10:00", "realizada");
        ConsultaDAO dao = new ConsultaDAO();
        dao.create(c);
        //dao.delete(c);
        /*
        for(Consulta consulta : consultas){
            System.out.println(consulta.getStatus());
        }
*/
        
    }
}
