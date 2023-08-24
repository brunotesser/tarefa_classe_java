package tarefa_wrapper;

public class VariavelWrapper {

    public static void main(String[] args) {

        int num1 = 10;

        System.out.println("Variável primitiva: " + num1);

        Integer num2 = Integer.valueOf(num1);

        System.out.println("Variável Wrapper: " + num2);
    }
}