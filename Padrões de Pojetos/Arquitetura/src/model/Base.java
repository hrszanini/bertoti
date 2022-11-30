package src.model;

import java.util.ArrayList;
import java.util.List;

import src.view.Observer;

public class Base implements Subject{

    private List<Aluno> alunos;
    private List<Turma> turmas;

    private List<Observer> observers;

    private static Base instance;

    private Base(){
        alunos = new ArrayList<Aluno>();
        turmas = new ArrayList<Turma>();
    }

    public static Base getInstance(){
        if(instance == null){
            instance = new Base();
        }

        return instance;
    }

    public Turma getTurma(Integer id) {
        for(Turma t: turmas){
            if(t.getId().equals(id)){
                return t;
            }
        }

        return null;
    }

    public Turma getTurmaByAno(Integer ano) {
        for(Turma t: turmas){
            if(t.getAno().equals(ano)){
                return t;
            }
        }

        return null;
    }

    public Aluno getAluno(Integer ra) {
        for(Aluno a: alunos){
            if(a.getRa().equals(ra)){
                return a;
            }
        }

        return null;
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void addTurma(Turma turma){
        turmas.add(turma);
    }

    public void setAlunoTurma(Integer alunoRa, Integer turmaId){
        Aluno aluno = getAluno(alunoRa);
        Turma turma = getTurma(turmaId);

        if(aluno != null && turma != null){
            aluno.setTurma(turma);
            notifyObservers(alunoRa, turmaId);
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers(Integer alunoRa, Integer turmaId) {
        for(Observer o: observers){
            o.update(alunoRa, turmaId);
        }
    }
}