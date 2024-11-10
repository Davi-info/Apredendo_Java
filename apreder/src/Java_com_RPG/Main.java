package Java_com_RPG;

public class Main {
    public static void main(String[] args) {
        
        // Criando o jogador (Player 01)
        Player player = new Player("Herói", 100, 20, 1);

        // Criando itens
        Item pocaoDeCura = new Item("Poção de Cura", "Poção", "cura", 50);

        // Adicionando itens ao inventário
        player.adicionarItem(pocaoDeCura);

        // Testando o uso dos itens
        player.setVida(90); // O jogador perde vida
        System.out.println("Vida antes de usar a poção: " + player.getVida());

        // Usando a poção de cura
        player.usarItem("Poção de Cura");

       

        // Testando o ataque do jogador
        player.atacar();
    }
}
