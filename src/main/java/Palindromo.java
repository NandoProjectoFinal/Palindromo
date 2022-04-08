import java.util.Locale;
import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        System.out.println("Ingrese Palabra");
        System.out.println(Validador(inversopalindromo(ingresarpalabra())));
    }

    public static String ingresarpalabra() {
        Scanner teclado = new Scanner(System.in);
        String a = teclado.next()+teclado.nextLine();
        return teclado.nextLine().replace(" ","").toLowerCase(Locale.ROOT);
    }

    public static String inversopalindromo(String a) {
        StringBuilder b = new StringBuilder(a);
        a= b.reverse().toString().replace(" ","").toLowerCase(Locale.ROOT);
        return a;
    }

    public static boolean Validador(String a){
        String b = inversopalindromo(a);
        return a.equals(b);
    }


}

/* En JavaScript seria:
*
*   function esPalindromo(cadena) {

        let resultado = "";
        resultado = cadena.split('').reverse().join('');

      return cadena === resultado;
    }
*
*   ¿Qué hace el método?:
*  - El metodo permite el ingreso de un parametro tipo String (aunque no esta declarado),
*   y con este trabaja para verificar que es un palindromo

    ¿Cómo lo hace?
   - A traves de el ingreso de parametro se trabaja de manera que se pueda separar por caracter
   y estos datos seran ingresados en un arreglo de caracteres, posterior a este se da vuelta el arreglo
   es decir el arreglo 01234 pasa a ser 43210 y con el join(''), Elimina los espacios de la cadena.

   ¿Cómo lo uso?
    - Metodo para ingresar
    - Metodo para dar vuelta
    - Una Funcion para Establecer una cadena unida.
    - Validador
* */