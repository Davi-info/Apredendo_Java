package Java_com_RPG;

public class Item {

    private String nomeItem;
    private String tipo;
    private String efeito;
    private int valor;

     // Construtor
     public Item(String nomeItem, String tipo, String efeito, int valor) {
        this.nomeItem = nomeItem;
        this.tipo = tipo;
        this.efeito = efeito;
        this.valor = valor;
    }

    public String getNomeItem() {
        return nomeItem;
    }
    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getEfeito() {
        return efeito;
    }
    public void setEfeito(String efeito) {
        this.efeito = efeito;
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }


     // Método para usar o item (aplica o efeito do item)
     public void usar(Player player) {
        if (this.tipo.equals("Poção") && this.efeito.equals("cura")) {
            player.cura(this.valor);
        } else {
            System.out.println("Efeito do item não implementado.");
        }
    }
    
    
}
