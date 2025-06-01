package trabalho;

import trabalho.enums.StatusEnum;

import java.util.Date;
import java.util.Objects;

public class Matricula {

    private Date dataMatricula;
    private Turma turma;
    private StatusEnum status;
    private Aluno aluno;
    private Disciplina disciplina;

    public Matricula(Turma turma, Aluno aluno, Disciplina disciplina) {
        super();
        this.dataMatricula = new Date();
        this.turma = turma;
        this.status = StatusEnum.MATRICULADO;
        this.aluno = aluno;
        this.disciplina = disciplina;

        if(aluno != null){
            aluno.adicionarMatricula(this);
        }
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public Turma getTurma() {
        return turma;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void confirmarMatricula(){
        if(status == StatusEnum.MATRICULADO || status == StatusEnum.TRANCADO){
            status = StatusEnum.CURSANDO;
            System.out.println("Matricula do aluno " + aluno.getNome() + " na disciplina " + disciplina.getNome() + " confirmada, status: Cursando");
        } else {
            System.out.println("Não foi possivel confirmar matricula. O status atual é: " + status);
        }
    }

    public void trancarMatricula(){
        if(status == StatusEnum.CURSANDO){
            status = StatusEnum.TRANCADO;
            System.out.println("Matricula do aluno " + aluno.getNome() + " trancada, status: Trancada");
        } else {
            System.out.println("Nao foi possivel trancar a matricula do aluno " + aluno.getNome());
        }
    }

    public void aprovarMatricula(){
        if(status == StatusEnum.CURSANDO){
            status = StatusEnum.CONCLUIDO;
            System.out.println("Matricula do aluno " + aluno.getNome() + " aprovado, status: Concluido");
        } else {
            System.out.println("Nao foi possivel aprocar a matricula do aluno " + aluno.getNome());
        }
    }

    public void reprovarMatricula(){
        if(status == StatusEnum.CURSANDO){
            status = StatusEnum.REPROVADO;
            System.out.println("Matricula do aluno " + aluno.getNome() + " reprovado, status: Reprovado");
        } else {
            System.out.println("Nao foi possivel reprovar a matricula do aluno " + aluno.getNome());
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(turma, aluno, disciplina);
    }

    @Override
    public String toString() {
        return "Matricula{" +
                "dataMatricula=" + dataMatricula +
                ", turma=" + turma +
                ", status=" + status +
                ", aluno=" + aluno +
                ", disciplina=" + disciplina +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matricula matricula = (Matricula) o;
        return Objects.equals(turma, matricula.turma) && Objects.equals(aluno, matricula.aluno) && Objects.equals(disciplina, matricula.disciplina);
    }
}
