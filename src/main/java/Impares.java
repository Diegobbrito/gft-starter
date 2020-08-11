import java.util.Scanner;

public class Impares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número inicial");
        int numInicio = scan.nextInt();
        System.out.println("Digite o final");
        int numFinal= scan.nextInt();
        if( numInicio % 2 == 0){
            numInicio++;
        }
        for(int i = numInicio; i <= numFinal; i += 2){
            System.out.print( i + " ");
        }

    }
}
