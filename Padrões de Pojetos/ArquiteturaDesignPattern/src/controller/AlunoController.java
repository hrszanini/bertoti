package src.controller;

import src.model.Aluno;
import src.model.Base;

public class AlunoController implements Controller<Aluno>{

    private Integer alunoRa = 0;

    @Override
    public Aluno create(Aluno aluno) {
        aluno.setRa(++alunoRa);
        Base.getInstance().addAluno(aluno);
        return aluno;
    }

    @Override
    public Aluno search(Integer id) {
        return Base.getInstance().getAluno(id);
    }
}
