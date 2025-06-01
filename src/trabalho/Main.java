package trabalho;

public class Main {
    public static void main(String[] args) {

        Turma turma1 = new Turma(1, "2025/1");

        Disciplina disciplina1 = new Disciplina("POO 2", 52);
        Disciplina disciplina2 = new Disciplina("ES 2", 52);

        Aluno aluno1 = new Aluno("123.456.789-00", "Daniel");
        Aluno aluno2 = new Aluno("234.567.890-11", "Bruna");

        //Listar status inicial antes das matriculas
        System.out.println("***Listando status inicial antes da matricula***");
        aluno1.listarMatriculas();
        aluno2.listarMatriculas();
        System.out.println("***Listando status inicial antes da matricula***");

        System.out.println("\n\n***Listando status inicial da matricula***");
        Matricula matricula1 = new Matricula(turma1, aluno1, disciplina1);
        Matricula matricula2 = new Matricula(turma1, aluno2, disciplina2);
        aluno1.listarMatriculas();
        aluno2.listarMatriculas();
        System.out.println("***Listando status inicial da matricula***");

        System.out.println("\n\n***Listando status do confirmar matricula***");
        matricula1.confirmarMatricula();
        matricula2.confirmarMatricula();
        aluno1.listarMatriculas();
        aluno2.listarMatriculas();
        System.out.println("\n\n***Listando status do confirmar matricula***");

        System.out.println("\n\n***Listando status do aprovar matricula***");
        matricula1.aprovarMatricula();
        aluno1.listarMatriculas();
        System.out.println("\n\n***Listando status do aprovar matricula***");

        System.out.println("\n\n***Listando status do reprovar matricula***");
        matricula2.reprovarMatricula();
        aluno2.listarMatriculas();
        System.out.println("\n\n***Listando status do reprovar matricula***");
    }
}
