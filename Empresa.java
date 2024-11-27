import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float ve,sm, v, co, c;
        short sa;
        sa=1000;
         System.out.println("Ingrese los carros vendidos");
        c=entrada.nextFloat();
        co= c*150;
        System.out.println("Ingrese el monto de la venta");
        ve= entrada.nextFloat();
        v=(float)(ve*0.05)/100;
        sm=sa+co+v;
        System.out.println("El salario mensual es:"+sm);
    }
}

