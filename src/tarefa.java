import java.util.Scanner;

public class tarefa {
    public static void main(String[] args) {

        System.out.print("Digite um numero: ");
        Scanner ler = new Scanner(System.in);
        int numero = ler.nextInt();
        int multiplicador = 0;
        while (multiplicador <= 10) {
            System.out.println(numero + " x " + multiplicador  + " = " + (numero * multiplicador) );
            multiplicador++;
        }

    }
}
