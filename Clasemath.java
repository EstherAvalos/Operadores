public class Clasemath {
    public static void main(String[] args) {
        double raiz = Math.sqrt(9); // para sacar la raiz de un número
        int raiz2= (int)Math.sqrt(42);// el double se va a trasformar en entero 
       
        double base= 5, exponente =2;
        double resultado =Math.pow(base, exponente);// clase para elevar un número al cuadrado

        Float numero= 7.58f;
        int r=Math.round(numero); // clase para redondear un número
        
        double num= Math.random();// esta clase te va a imprimir un número al alazar al ejecutar el programa 

        System.out.println(raiz);
        System.out.println(raiz2);
        System.out.println(resultado);
        System.out.println(r);
        System.out.println(num);

    }
}
