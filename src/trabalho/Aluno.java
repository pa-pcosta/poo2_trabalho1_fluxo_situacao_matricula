package trabalho;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {

    private String nome;
    private String cpf;
    private List<Matricula> matriculas;

    public Aluno(String nome, String cpf) {
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.matriculas = new ArrayList<>();
    }

    public void adicionarMatricula(Matricula matricula) {
        if(matricula != null && !matriculas.contains(matricula)) {
            matriculas.add(matricula);
        }
    }

    public void removerMatricula(Matricula matricula) {
        if(matricula != null && !matriculas.contains(matricula)) {
            matriculas.remove(matricula);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        Aluno other = (Aluno) obj;
        return Objects.equals(cpf, other.cpf);
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void listarMatriculas() {
        if(matriculas.isEmpty()){
            System.out.println("Aluno " + nome + " não possui matriculas!");
        } else {
            System.out.println("Matriculas do aluno " + nome + " CPF: " + cpf + "\n");
            for(Matricula matricula : matriculas){
                System.out.println(matricula.toString());
            }
        }
    }

    @Override
    public String toString() {
        return "Aluno [cpf=" + cpf + ", nome=" + nome + ", numeroDeMatriculas=" + matriculas.size() + "]";
    }
}
