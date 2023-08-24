package tarefa_controleDeFluxo;


public class ValidandoNota {

    public static void main(String args[]){
        notaFinal();
    }

    private static void notaFinal() {
        int nota1 = 10;
        int nota2 = 5;
        int nota3 = 10;
        int nota4 = 8;

        int resultadoNota = (nota1 + nota2 + nota3 + nota4) / 4;

        if (resultadoNota >= 7) {
            System.out.println("Você está aprovado");

        } else if (resultadoNota >= 5) {
            System.out.println("Você está de recuperação");

        } else {
            System.out.println("Você está reprovado");

        }

    }
}