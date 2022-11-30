package src.model;

public class Aluno {
    private Integer ra;
    private String nome;
    private Turma turma;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getRa() {
        return ra;
    }
    public void setRa(Integer ra) {
        this.ra = ra;
    }
    public Turma getTurma() {
        return turma;
    }
    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
