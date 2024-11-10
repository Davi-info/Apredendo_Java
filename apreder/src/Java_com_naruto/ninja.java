package Java_com_naruto;
public class Ninja {

    private String nome ;
    private String aldeia;
    private int idade;

    // Getter - Criando getter para mostrar para usuario.
    public String getNome(){
        return nome;
    }

    // Setter - Settar o valor da variavel.
    public void SetNome(String nome){
        this.nome = nome;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void ataqueBase(){
        System.out.println("EU Taquei kunai!!!!");
    }
    
     
}
