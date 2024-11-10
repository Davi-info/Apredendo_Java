package Java_com_naruto;

public class Uchiha extends Ninja {


    String nivelSharingan = "Sharingan 2";

    public void SharinganAtivado(){
        System.out.println("Sharingan Ativado");
    }
    
    @Override
    public void ataqueBase(){
        System.out.println("Eu taquei Kunai de FOGO!!!!!");
    }

    public void ataqueBase(int nivelChacra){

        if(nivelChacra >= 2){
            System.out.println("Susano Ativado!!");
        }
        else if(nivelChacra < 1 ){
            System.out.println("Sharingan Ativado!!");
        }
        else{
            System.out.println("Eu estou sem chacra!!");
        }
    }

    
}
