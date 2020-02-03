/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_en_clase_empleado;

/**
 *
 * @author usuario
 */
public class Empleado_base_mas_comision extends Empleador_comision{
    
    private double salario_base;

    public double getSalario_base() {
        return salario_base;
    }

    public void setSalario_base(double salario_base) {
        this.salario_base = salario_base;
    }

    public Empleado_base_mas_comision(double salario_base, double ventas_brutas, double tarifa_comision) {
        super(ventas_brutas, tarifa_comision);
        this.salario_base = salario_base;
    }

    public Empleado_base_mas_comision(double salario_base, double ventas_brutas, double tarifa_comision, String nombre, String apellido, int ci) {
        super(ventas_brutas, tarifa_comision, nombre, apellido, ci);
        this.salario_base = salario_base;
    }

    public Empleado_base_mas_comision(double salario_base) {
        this.salario_base = salario_base;
    }

    public Empleado_base_mas_comision() {
    }
    
    public double ingresos(){
    
    return salario_base*super.calcular_ingresos();
    }

    @Override
    public String toString() {
        return "Empleado Asalariado: \n Nombre: "+ getNombre()+ " Apellido: "+ getApellido()+ " Comision:  "+ calcular_ingresos();
    }
    
    
}
