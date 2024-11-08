package java_com_jojo;

public class main {  // A classe Main deve começar com a letra maiúscula em Java
    public static void main(String[] args) {
        
        // Criação do objeto Joestar e definindo o nome através do método setNome
        joestar joseph = new joestar();
        joseph.setNome("Jotaro kujo");  // Usando o método setNome para definir o nome

        // Mostrando informações antes de adquirir o Stand
        joseph.mostrarInfo();

        // Joseph adquire o Stand "Star Platinum"
        joseph.adquirirStand("Star Platinum", "Força e velocidade");

        // Mostrando informações após adquirir o Stand
        joseph.mostrarInfo();

        // Tentando adquirir um segundo Stand
        joseph.adquirirStand("The World", "Parar o tempo");
    }
}
