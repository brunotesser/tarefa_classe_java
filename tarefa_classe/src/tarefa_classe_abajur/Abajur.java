package tarefa_classe_abajur;

public class Abajur {

    //Aqui vamos indicar se o abajur está ligado (true) ou desligado (false)
    private boolean ligado;


    //Por padrão iniciar desligado
    public Abajur() {
    ligado = false;
}

   //Aqui é para ligar
    public void ligar() {
    ligado = true;
    System.out.println("Abajur ligado.");

}
    //Aqui é para desligar
    public void desligar() {
        ligado = false;
        System.out.println("Abajur desligado.");

    }

}






