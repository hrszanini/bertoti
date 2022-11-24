package src.controller;

import src.model.Base;
import src.model.Turma;

public class TurmaController implements Controller<Turma>{

    private Integer turmaId = 0;

    @Override
    public Turma create(Turma turma) {
        turma.setId(++turmaId);
        Base.getInstance().addTurma(turma);
        return turma;
    }

    @Override
    public Turma search(Integer id) {
        return Base.getInstance().getTurma(id);
    }    
}
