import java.util.Scanner;

public class sansliYas {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);

        System.out.println("Büyük ödül çekilişine hoş geldin!");
        System.out.println("Bakalım sistemin seçtiği şanslı yaşın sahibi sen misin?");
        System.out.println("Yarısmamıza Sadece 15-60 Yas Aralığı katıla Bilir");

        int rastgeleYas =(int) (Math.random() * (60 - 15 + 1)) + 15;

        System.out.println("Lutfen Yasnızı Giriniz :");

        if(s.hasNextInt()){
            int girilenYas =s.nextInt();

           if(girilenYas >= 15 && girilenYas <= 60){

             if(girilenYas == rastgeleYas ){
                System.out.println("TEBRİKLER ODULU KAZANDINIZ!");
            }else{
                System.out.println("MALESEF KAZANAMDADINIZ SANSLI YAS :" + rastgeleYas + " idi.");
            }

           }else{
            System.out.println("Üzgünüz, yasiniz yarısma kurallarına uymuyor. Sadece 15-60 yas arasi katilabilir.");
           }

        }else{
            System.out.println("Hata! Lütfen yasinizi sadece rakam kullanarak girin.");
        }
        
    }
    
}
