# Palindromo
### 
En JavaScript seria:
*

```
  function esPalindromo(cadena) {
        let resultado = "";
        resultado = cadena.split('').reverse().join('');
      return cadena === resultado;
    }
```
*   ¿Qué hace el método?:
  - El metodo permite el ingreso de un parametro tipo String (aunque no esta declarado), y con este trabaja para verificar que es un palindromo

    ¿Cómo lo hace?
   - A traves de el ingreso de parametro se trabaja de manera que se pueda separar por caracter y estos datos seran ingresados en un arreglo de caracteres, posterior a este se da vuelta el arreglo, es decir el arreglo 01234 pasa a ser 43210 y con el join(''), Elimina los espacios de la cadena.
   
   ¿Cómo lo uso?
    - Metodo para ingresar
    - Metodo para dar vuelta
    - Una Funcion para Establecer una cadena unida.
    - Validador
