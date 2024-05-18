public class ExemploBreakContinue {
    public static void main(String[] args) {
        
        // Para a execução do bloco de repetiçaõ quando é chamado.
        
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                break;
            
            System.out.println(numero);
            
        }

        // Continue ignora a iteração onde ele foi mencionado condicionalmente e continua as próximas iterações.

        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                continue;
            
            System.out.println(numero);
        }            
    }
}
