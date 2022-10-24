import java.util.*;

public class proxectoEmpresaXogo {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double price;
        int age;
        System.out.println("Indica la edad del cliente");
        age = input.nextInt();
        if (age < 0) {
            System.out.println("Edad no válida");
        } else {
            if (age < 4) {
                if (age<0){
                    System.out.println("Edad no valida");
                }
                price = 0;
            } else {
                if (age < 18) {
                    price = 5;
                } else {
                    price = 10;
                }
            }
            System.out.println("El precio de la entrada para el cliente es de " + price + " euros");
        }
        
    }
}
