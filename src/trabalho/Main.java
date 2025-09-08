package trabalho;

public class Main {
    public static void main(String[] args) {

        Turma turma1 = new Turma(1, "2025/1");

        Disciplina disciplina1 = new Disciplina("POO 2", 52);
        Disciplina disciplina2 = new Disciplina("BD 1", 52);

        Aluno aluno1 = new Aluno("Pedro Augusto Pereira Costa", "123.456.789-00");
        Aluno aluno2 = new Aluno("Stephen Pereira Costa", "234.567.890-11");

        
        System.out.println("********* LISTANDO STATUS INICIAL ANTES DA MATRICULA *********\n");
        aluno1.listarMatriculas();
        System.out.println("***");
        aluno2.listarMatriculas();
        System.out.println("_____________________________________________________________________");

        System.out.println("\n\n********* LISTANDO STATUS INICIAL DA MATRICULA *********\n");
        Matricula matricula1 = new Matricula(turma1, aluno1, disciplina1);
        Matricula matricula2 = new Matricula(turma1, aluno2, disciplina2);
        aluno1.listarMatriculas();
        System.out.println("***");
        aluno2.listarMatriculas();
        System.out.println("_____________________________________________________________________");

        System.out.println("\n\n********* LISTANDO STATUS DO CONFIRMAR MATRICULA *********\n");
        matricula1.confirmarMatricula();
        matricula2.confirmarMatricula();
        aluno1.listarMatriculas();
        System.out.println("***");
        aluno2.listarMatriculas();
        System.out.println("_____________________________________________________________________");

        System.out.println("\n\n********* LISTANDO STATUS DO APROVAR MATRICULA *********\n");
        matricula1.aprovarMatricula();
        aluno1.listarMatriculas();
        System.out.println("_____________________________________________________________________");

        System.out.println("\n\n********* LISTANDO STATUS DO REPROVAR MATRICULA *********\n");
        matricula2.reprovarMatricula();
        aluno2.listarMatriculas();
        System.out.println("_____________________________________________________________________");
    }
}
