
package testpruebatecnica;

import java.util.ArrayList;
import java.util.Scanner;
import logica.Empleado;


public class TestPruebaTecnica {

    public static void main(String[] args) {
        
        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
        Scanner teclado=new Scanner(System.in);
        
        
        /*listaEmpleados.add(new Empleado(1, "Erika", "Morales", 12000.0, 05/01/2020));
        listaEmpleados.add(new Empleado(2, "Jose", "Tapia", 13000.0, 13/06/2022));
        listaEmpleados.add(new Empleado(3, "Lucero", "Gonzalez", 15000.0, 24/08/2015));*/
            
        
        System.out.println("Bienvenido al sistema de Gestión de Empleados\n");
        mostrarMenu();
        
        
    }
        
     private static void mostrarMenu() {
        System.out.println(" ______________________________________");
        System.out.println("|      Menú de Gestión de Empleados    |");
        System.out.println("|______________________________________|");
        System.out.println("|  1. Agregar Empleado                 |");
        System.out.println("|  2. Listar Empleados                 |");
        System.out.println("|  3. Actualizar Empleado              |");
        System.out.println("|  4. Eliminar Empleado                |");
        System.out.println("|  5. Buscar Empleados por Cargo       |");
        System.out.println("|  6. Salir                            |");
        System.out.println("|______________________________________|");
    }  
    
     
     
   
}
