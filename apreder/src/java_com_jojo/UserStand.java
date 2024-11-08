package java_com_jojo;

public class UserStand {

    private String nomeStand;
    private String poder;

    // Construtor da classe UserStand
    public UserStand(String nomeStand, String poder) {
        this.nomeStand = nomeStand;
        this.poder = poder;
    }

    public String getNomeStand() {
        return nomeStand;
    }

    public void setNomeStand(String nomeStand) {
        this.nomeStand = nomeStand;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public void mostrarPoder() {
        System.out.println("Stand: " + nomeStand + " - Poder: " + poder);
    }
}
