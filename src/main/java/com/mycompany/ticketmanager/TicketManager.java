package com.mycompany.ticketmanager;

import Controller.ControladorCliente;
import Model.Cliente;
import Model.TipoServicio;
import persistencia.ControladoraPersistencia;

public class TicketManager {

    public static void main(String[] args) {

        //ControladoraPersistencia controlpersis = new ControladoraPersistencia();//Para crear tabla en base de datos

        ControladorCliente controlCliente=new ControladorCliente();//Instancia para hacer llamar métodos CRUD de "cliente"
        
        //se instancia un cliente...
        Cliente cliente0=new Cliente("2010500400", "HardSoft S.A.", true, TipoServicio.TANGO, "Av. Cabildo 1035", "011456456", "hardsoft@hardsoft.com");
        Cliente cliente1=new Cliente("1622500500", "Java S.A.", true, TipoServicio.RHEL, "Av. Siempre Viva 3055", "011999999", "java@java.com");
       
        //se llama el método crearCliente desde una instancia del controlador de Cliente y se le pasa el cliente creado...
        //controlCliente.crearCliente(cliente0);
        //controlCliente.crearCliente(cliente1);
        
    }
}
