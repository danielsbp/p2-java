public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Gerente", 5000.0);
        System.out.println(funcionario.getCargo());
        System.out.println(funcionario.getSalario());
    }    
}
