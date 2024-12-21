
package com.hackaboss.gestiondeempleados;

import java.util.ArrayList;
import java.util.Scanner;
import logica.Empleado;

public class GestionDeEmpleados {

    public static void main(String[] args) {
        
             
        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
        Scanner teclado=new Scanner(System.in);
        
        listaEmpleados.add(new Empleado(1, "Erika", "Morales", 12000.0));
        listaEmpleados.add(new Empleado(2, "Jose", "Tapia", 13000.0));
        listaEmpleados.add(new Empleado(3, "Lucero", "Gonzalez", 15000.0));
            
        
        System.out.println("Bienvenido al sistema de Gestión de Empleados\n");
        mostrarMenu();
        
        
    }
        
     private static void mostrarMenu() {
        System.out.println("\n--- Menú de Gestión de Empleados ---");
        System.out.println("1. Agregar Empleado");
        System.out.println("2. Listar Empleados");
        System.out.println("3. Actualizar Empleado");
        System.out.println("4. Eliminar Empleado");
        System.out.println("5. Buscar Empleados por Cargo");
        System.out.println("6. Salir");
        System.out.print("Selecciona una opción: ");
    }   
    
}
