package SistemaDeFuncionarios.Class;

public abstract class Funcionario {
    protected String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.salario = salario;
        this.nome = nome;
    }

    public double calcularBonus(){

        return 0;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void mostrarInformacoes(){
        double aumento = this.calcularBonus();
        double salarioFinal = this.salario + aumento;

        System.out.println("Nome: "+nome);
        System.out.println("Salário inicial: "+getSalario());
        System.out.println("Bônus recebido: "+aumento);
        System.out.println("Salário final: " +salarioFinal);
    }


}
