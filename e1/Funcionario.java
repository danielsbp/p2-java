public class Funcionario {
    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    private double salario;
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public Funcionario() {

    }

    public Funcionario(String cargo, double salario) {
        this.cargo = cargo;
        this.salario = salario;
    }
}