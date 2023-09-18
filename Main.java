import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
        int value ;
        Scanner inp = new Scanner(System.in);
        System.out.print("Değer giriniz :");
        value=inp.nextInt();
        for ( int i = 1 ; i <=value ; i++){
            if (i%5==0 && i%4==0){
                System.out.println(i);
            }
        }
    }
}