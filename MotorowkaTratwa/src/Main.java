import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in)  ;

      int a,b;
      a = scanner.nextInt();
      b = scanner.nextInt();
      double y;

      y = (1.0/(2*a))-(1.0/(2*b));
        System.out.println("Prędkość tratwy " +1/y);
    }


}