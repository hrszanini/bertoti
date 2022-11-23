package src.model;

public class Base{

    private List<Aluno> alunos;
    private List<Professor> professores;
    private List<Turma> turmas;

    private static Base instance;

    private Base(){
        alunos = new ArrayList<Aluno>();
        professores = new ArrayList<Professor>();
        turmas = new ArrayList<Turma>();
    }

    public static Base getInstance(){
        if(instance == null){
            instance = new Base();
        }

        return instance;
    }
}