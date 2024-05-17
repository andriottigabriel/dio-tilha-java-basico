import java.util.concurrent.ThreadLocalRandom; //numeros aleatorios

public class ExemploWhile {
    public static void main(String[] args) {

        double mesada = 50.0;

        while(mesada > 0){
            Double valorDoce = valorAleatorio();
 
            if(valorDoce > mesada){
                valorDoce = mesada;
            }
                

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;


        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Gabriel gastou toda sua mesada em doces");
        
    }

    //metodo de retorno aleatorio entre 2 e 8
    private static double valorAleatorio(){
        return ThreadLocalRandom.current() .nextDouble(2, 8);
    }
    
}
