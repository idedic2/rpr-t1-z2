package ba.unsa.etf.rpr;
import java.util.*;



public class Main {

   public static int sumaCifara(int b){
        int x=0;
        while(b!=0){
            x+=b%10;
            b/=10;
        }
        return x;
    }

    public static void main(String[] args) {
	Scanner ulaz=new Scanner(System.in);
	System.out.println("Unesi broj n: ");
	int n=ulaz.nextInt();
	for(int i=1;i<=n;i++) {
        if (i % sumaCifara(i) == 0) {
            System.out.print(i+" ");
        }
    }
    }
}
