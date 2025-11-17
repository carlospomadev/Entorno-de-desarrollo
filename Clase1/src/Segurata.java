import java.util.Scanner;

public class Segurata {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        String discoMayores = "Coco Loco";
        String discoMenores = "Coquito Loquito";

        System.out.println("Dime tu nombre");
        String nombre = scanner.nextLine();

        System.out.println("Dime tu edad");
        int edad = scanner.nextInt();

        if ( && edad >=18){
            System.out.println("Puedes pasar");
        } else {
            System.out.println("You shall not pass");
        }
    }
}
