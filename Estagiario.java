
public class {
    
    private String nome;
    private double salario;
    private int cargaHoraria;
    private int porcentagemTreinamento;

    public Estagiario(String nome, double salario, int cargaHoraria){
        this.nome = nome;
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
    }

    public void aprenderTrabalhando(){
        this.porcentagemTreinamento += 1;
    }

    public int getPorcentagemTreinamento(){
        return this.porcentagemTreinamento;
    }
    
}
