public class {
    private String nome;
    private double salario;
    private int porcentagemTreinamento;

    public Estagiario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void aprenderTrabalhando(){
        this.porcentagemTreinamento += 1;
    }

    public int getPorcentagemTreinamento(){
        return this.porcentagemTreinamento;
    }
    
}