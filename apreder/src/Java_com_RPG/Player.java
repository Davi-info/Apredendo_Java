package Java_com_RPG;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String nome;
    private int vida;
    private int vidaMaxima;
    private int nivel;
    private int ataque;
    private List<Item> inventario;

    // Construtor
    public Player(String nome, int vida, int ataque, int nivel) {
        this.nome = nome;
        this.vida = vida;
        this.vidaMaxima = vida;  // Define o valor inicial como vida máxima
        this.ataque = ataque;
        this.nivel = nivel;
        this.inventario = new ArrayList<>();
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getNivel() {
        return nivel;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void atacar() {
        System.out.println(nome + " atacou o inimigo com " + ataque + " de dano!");
    }

    public void adicionarItem(Item item) {
        inventario.add(item);
        System.out.println(item.getNomeItem() + " adicionado ao inventário.");
    }

    // Método para curar o jogador
    public void cura(int valor) {
        // Verifica se a vida está abaixo do máximo e cura se possível
        if (this.vida < this.vidaMaxima) {
            this.vida += valor;
            if (this.vida > this.vidaMaxima) {
                this.vida = this.vidaMaxima;  // Garante que a vida não passe do máximo
            }
            System.out.println("Vida restaurada. Vida atual: " + this.vida);
        } else {
            System.out.println("Você está com a vida cheia e não pode usar cura.");
        }
    }

    // Método para usar um item
    public void usarItem(String nomeItem) {
        for (Item item : inventario) {
            if (item.getNomeItem().equals(nomeItem)) {
                item.usar(this);
                inventario.remove(item);
                System.out.println(nomeItem + " foi usado.");
                return;
            }
        }
        System.out.println(nomeItem + " não encontrado no inventário.");
    }
}
