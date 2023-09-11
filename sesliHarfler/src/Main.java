// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
     // a kalın e ince
        char harf='E';

        switch (harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli bir harftir");
                break;
            default:
                System.out.println("İnce Sesli Harf");
        }


    }
}