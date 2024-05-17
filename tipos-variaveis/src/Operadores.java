public class Operadores {

    public static void main(String[] args) {
        String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);
        
        int numero = 5;

        numero= - numero; //tornando numero negativo

        System.out.println(numero);

        numero = numero * -1; //tornando numero positivo

        System.out.println(numero);

        //iteracao
        numero = 10;

        numero = numero + 10;

        System.out.println(++ numero); //iteracao soma1

        System.out.println(-- numero); //iteracao subtrai 1


        //utilizando not
        boolean variavel = true; //valor sempre continua true ate q a variavel seja modificada

        System.out.println(!variavel); //not variavel = 

        System.out.println(variavel);


        //operador ternario (escolher 1 entre 2 ou mais valores) abreviando if e else 
        int a, b;

        a = 5;
        b = 6;

        /*
        String resultado = ""; 
        if (a==b)
            resultado = "VERDADEIRO";
        else
            resultado = "FALSO";
            */

        String resultado = a==b ? "VERDADEIRO" : "FALSO"; // abreviacao

        System.out.println(resultado);


        String nomeUm = "GABRIEL";
        String nomeDois = "GABRIEL";

        System.out.println( nomeUm == nomeDois); //true


        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2; //compara se numero1 = numero2

        
        System.out.println("NumeroUm eh igual a numeroDois? " + simNao); 

        simNao = numero1 != numero2; //compara se numero1 = numero2
        System.out.println("NumeroUm eh igual a numeroDois? " + simNao); 

        simNao = numero1 > numero2; //compara se numero1 = numero2
        System.out.println("NumeroUm eh igual a numeroDois? " + simNao); 




        boolean condicao1 = true;

        boolean condicao2 = true;

        if(condicao1 && condicao2 && ( 7 > 4)){
            System.out.println("as duas condicoes sao verdadeiras");
        }

        if(condicao1|| condicao2){
            System.out.println("Uma das condicoes eh verdadeira");
        }

        System.out.println("Fim");



        









    }
}
