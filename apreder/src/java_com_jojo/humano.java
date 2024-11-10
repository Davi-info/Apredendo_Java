package java_com_jojo;

public class Humano {

    private String nome ;

    //Criando uma composição.
    private UserStand stand ;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para adquirir um Stand, se o humano ainda não tiver um.
    public void adquirirStand(String nomeStand, String poder){
        if (this.stand == null) {
            this.stand = new UserStand(nomeStand, poder);
            System.out.println(nome + " adquiriu o Stand: " + nomeStand);
        } else {
            System.out.println(nome + " já possui um Stand: " + stand.getNomeStand());
        }
    }

    // Método para mostrar informações do humano
    public void mostrarInfo() {
        System.out.println("Eu sou " + nome);
        if (stand != null) {
            stand.mostrarPoder();
        } else {
            System.out.println(nome + " não possui Stand.");
        }
    }

}
