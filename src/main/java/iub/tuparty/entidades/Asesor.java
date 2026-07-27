
package iub.tuparty.entidades;

public class Asesor extends Persona {
    private long codigoEmpleado;
    private double salario;

    public long getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(long codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}