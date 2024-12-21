
package logica;

import java.util.Date;

public class Empleado {
    int id;
    String nombre;
    String apellido;
    double salario;
    private Date fecha_ingreso; //No tengo idea de como hacerlo

    public Empleado() {
    }

    public Empleado(int id, String nombre, String apellido, double salario, Date fecha_ingreso) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.fecha_ingreso = fecha_ingreso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }
    
    
    

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + 
                apellido + ", salario=" + salario + ", fecha_ingreso=" + fecha_ingreso + '}';
    }
}
