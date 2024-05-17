public class ExemploForArray {
    public static void main(String[] args) {

        // Em arrays o indice inicia em 0
        String alunos [] = {"GABRIEL", "MIGUEL", "FELIPE", "AUGUSTO" };

        for(int x= 0; x < alunos.length; x++){
 
            System.out.println("O aluno no indice x = " + x + " é " + alunos [ x ]);

        }
        //ouu
        for(String aluno : alunos){
 
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
    
}
