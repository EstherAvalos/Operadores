import java.util.Scanner;

public class operadores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float num1, num2, suma, resta, mult, div, resto;
        System.out.print("Digite dos números: ");
        num1=entrada.nextFloat();
        num2= entrada.nextFloat();
        suma=num1+num2;
        resta= num1-num2;
        mult=num1*num2;
        div=num1/num2;
        resto=num1%num2;

        System.out.println("la suma es: " + suma);
        System.out.println("la resta es:" + resta);
        System.out.println("la multiplicacion es: "+ mult);
        System.out.println("la divicion es:" + div);
        System.out.println("el restante es:" + resto);
    }
}