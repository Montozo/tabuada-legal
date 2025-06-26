import java.util.Scanner;

public class tarefa {
    public static void main(String[] args) {

        System.out.print("Digite um numero: ");
        Scanner ler = new Scanner(System.in);
        int numero = ler.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i  + " = " + (numero * i) );
        }

    }
}
