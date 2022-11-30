package src.view;

import src.controller.AlunoController;
import src.controller.Controller;
import src.controller.TurmaController;
import src.model.Aluno;
import src.model.Base;
import src.model.Turma;

public class CreateView implements Observer{
    private Controller<Aluno> alunoController = new AlunoController();
    private Controller<Turma> turmaController = new TurmaController();

    public CreateView(){
        Base.getInstance().registerObserver(this);
    }

    public void createTurma(Integer ano){
        Turma turma = new Turma();
        turma.setAno(ano);
        turma = turmaController.create(turma);
    }

    public void createAluno(String nome){
        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        aluno = alunoController.create(aluno);
    }

    @Override
    public void update(Integer alunoRa, Integer turmaId) {
        System.out.println("Aluno: " + alunoRa + " foi inserido na turma " + turmaId);
    }

}
