public class ResultadoEscolar {
    public static void main(String[] args) {
        // int nota = 8;
        
        // Condicional Composta:
           
        // if(nota >= 7)
        //  System.out.println("Aprovado");
 
        // else
        //  System.out.println("Reprovado");

        // Condicional Encadeada:
    
        // if (nota >= 7)
		//     System.out.println("Aprovado");

	    // else if (nota >= 5 && nota < 7)
        //     System.out.println("Recuperação");
	    
        // else
		//     System.out.println("Reprovado");
    
        // Condição Ternária: 
        // cenário 1)

        // int nota = 5;
		// String resultado = nota >=7 ? "Aprovado" : "Reprovado";
		// System.out.println(resultado);

        // cenario 2)

        int nota = 3;
		String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado);

    }
}
