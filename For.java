import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroEntrada;
        
        System.out.print("Ingrese el número a calcular: ");
        
        try {
            numeroEntrada = scanner.nextInt();
            int resultado = 0;
            
            for (int i = 1; i <= numeroEntrada; i++) {
                resultado += i;
            }
            
            System.out.println("La suma de los primeros " + numeroEntrada + " números naturales es igual a " + resultado);
            
        } catch (Exception e) {
            System.out.println("Por favor ingrese un número válido");
        }
        
        scanner.close();
    }
}
