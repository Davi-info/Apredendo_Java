package Java_com_naruto;

public class main {
    public static void main(String[] args) {
      
        //obj_1
        uzumaki naruto = new uzumaki();
        naruto.SetNome("Naruto Uzumaki");
        naruto.getNome();

        System.out.println("Meu nome é "  + naruto.getNome());

        naruto.temBiju = true;
        naruto.chacraInfinito();
        naruto.ataqueBase();
        
       

        //obj_2
        uchiha sasuke = new uchiha();
        sasuke.SetNome("Sasuke Uchiha");
        sasuke.SharinganAtivado();
        sasuke.ataqueBase();
        sasuke.ataqueBase(3);



    }
    
}
