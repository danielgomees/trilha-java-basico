public class ExemploForArray {
    public static void main(String[] args) {
        
        // Em arrays, o índice sempre começa com 0
        
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        // Forma regular - For
        
        // for (int x=0; x<alunos.length; x++) {
        //     System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        // }

        // Forma abreviada - For Each

        for (String aluno : alunos){
            System.out.println("Nome do aluno é " + aluno);
        }
    }
}
