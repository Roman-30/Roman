package untitled;
 import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          System.out.print("Введите сторону треугольника: ");
           double x = scanner.nextDouble();
            double a = x * x + x * x;
                   a = Math.sqrt(a);
             double r = a / 2;
            double S = Math.PI * r * r;
        System.out.print("При стороне равной " + x + " См" + " площадь окружности равна " + S + " См^2");
    }
}
