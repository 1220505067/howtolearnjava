// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    sayiBulmaca();
    }
    public static void sayiBulmaca(){
        int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak =6;
        boolean varMı=false;
        for (int sayi: sayilar){
            if (sayi==aranacak){
                varMı=true;
                break;
            }
        }
        String mesaj="";
        if (varMı){
            mesaj = "sayi mevcut: " + aranacak;
            mesajVer("sayi mevcut: " + aranacak);

        }else {
            System.out.println("sayi mevcut değil: " + aranacak);
        }

    }

        public static void mesajVer(String mesaj){
            System.out.println(mesaj);
        }

}