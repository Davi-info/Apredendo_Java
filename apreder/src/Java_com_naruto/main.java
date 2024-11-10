package Java_com_naruto;

public class Main {
    public static void main(String[] args) {
      
        //obj_1
        Uzumaki naruto = new Uzumaki();
        naruto.SetNome("Naruto Uzumaki");
        naruto.getNome();

        System.out.println("Meu nome é "  + naruto.getNome());

        naruto.temBiju = true;
        naruto.chacraInfinito();
        naruto.ataqueBase();
        
       

        //obj_2
        Uchiha sasuke = new Uchiha();
        sasuke.SetNome("Sasuke Uchiha");
        sasuke.SharinganAtivado();
        sasuke.ataqueBase();
        sasuke.ataqueBase(3);



    }
    
}
