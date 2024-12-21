package com.hackaboss.gestiondeempleados;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import logica.Empleado;

import persistencia.ControladoraPersistencia;
public class GestionDeEmpleados {

    public static void main(String[] args) throws ParseException {

        ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Random random = new Random();
        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
        Scanner teclado = new Scanner(System.in);

        for (int i = 1; i <= 20; i++) {
            Date fechaIngreso = formato.parse(String.format("%02d/%02d/%04d", random.nextInt(28) + 1, random.nextInt(12) + 1, 2020));
            String nombre = "Empleado" + i;
            String apellido = "Apellido" + i;
            double salario = 1000.0 + (random.nextDouble() * 10000.0);
            listaEmpleados.add(new Empleado(i, nombre, apellido, salario, fechaIngreso));
        }

        for (Empleado empleado : listaEmpleados) {
            System.out.println(empleado);
        }

        Empleado nuevoEmpleado = new Empleado(21, "Nuevo", "Empleado", 5000.0, new Date());
        controladoraPersistencia.crearEmpleado(nuevoEmpleado);

        listaEmpleados.add(nuevoEmpleado);
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