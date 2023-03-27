import java.util.Scanner;

public class Pravoagolnik {

public static void main(String[] args) {

double dolzina,shirina,visina, volumen;

Scanner tastatura = new Scanner(System.in);

System.out.println("Programata presmetuva povrsina i volumen na pravoagolnik");

System.out.println("Vnesete shirina: ");

shirina = tastatura.nextDouble();

System.out.print("Vnesete visina: ");

 visina = tastatura.nextDouble();

System.out.println("Vnesete dolzina: ");
dolzina=tastatura.nextDouble();

System.out.println("Volumenot e: "+ dolzina*visina*shirina );

}

}
