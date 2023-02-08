import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class Main {

    /**
     *  public static String reverse(String texto) { }
     * Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
     * 1. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
     * 2. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
     * 3. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
     * 4. Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
     * 5. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
     * 6. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
     * 7. Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
     * 8. Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
     * 9. Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
     *
     */
    public static void main(String[] args) {
        String holaMundo = "hola mundo";
        String reves = "";
        for (int i = holaMundo.length()-1;i>=0; i--){
                reves += holaMundo.charAt(i);
        }

        System.out.println("Cadena Invertida :" + reves);

        //1.

        String [] palabras = {"Uno", "Dos","Tres","Cuatro"};

        for (String leePalabra: palabras
             ) {
            System.out.println(leePalabra);
        }
        System.out.println("\n" +
                "---------------");
        //2.
        int[][] arrBid = new int[2][3];
        arrBid [0][0] = 1;
        arrBid [0][1] = 2;
        arrBid [0][2] = 3;
        arrBid [1][0] = 4;
        arrBid [1][1] = 5;
        arrBid [1][2] = 6;

        for (int i = 0; i < arrBid.length; i++){
            for (int j= 0; j < arrBid[i].length; j++){
                System.out.println("Los valores del arreglo bidimensional son: "+arrBid[i][j]);
            }
        }
        System.out.println("\n" +
                "---------------");

        //3.

        Vector<String> vectore = new Vector(5);
            vectore.add("Gracias");
            vectore.add("Microsoft");
            vectore.add("Google");
            vectore.add("Open-Bootcamp");
            vectore.add("Por los Cursos");

            vectore.remove(1);
            vectore.remove(2);

        for (String resu : vectore){
            System.out.println("El resultado es: "+resu);
        }
        System.out.println("\n" +
                "---------------");
        //4. Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
        /*
        El problema de utilizar un Vector con la capacidad por defecto (10) es que se tiene que ampliar y copiar tantas veces para llegar a 1000 elementos. Hará un consumo excesivo de recursos.
         */

        //5. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
        ArrayList<String> arrayList = new ArrayList<String>(4);
        arrayList.add("Hola");
        arrayList.add("Mundo");
        arrayList.add("Como");
        arrayList.add("estas?");

        LinkedList<String> linkedList = new LinkedList<String>(arrayList);
        for (String arrList : arrayList){
            System.out.println("El valor del ArrayList es :"+ arrList);
        }
        System.out.println("----------------");
        for (String linked : linkedList){
            System.out.println("Valores de LinkedList son :"+ linked);
        }
        System.out.println("----------------");
        //6.Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
        ArrayList<Integer> numero = new ArrayList<Integer>();

        int i = 1;
        while(i<=10){
            numero.add(i-1,i);
            i++;

        }
        System.out.println("El Arraylist quedo relleno asi: "+ numero);

        numero.removeIf(valorNumero -> valorNumero % 2 == 0);
        System.out.println("Se eliminaron los numeros pares");

        System.out.println("El ArrayList quedó Finalmente sin pares con los siguientes valores :"+ numero);

        System.out.println("----------------");
        //7. Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo).
        // Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
        DividePorCero(6,0);
        DividePorCero(6,2);


        }

        public static int DividePorCero(int a, int b) throws ArithmeticException{
            int result =0;
            try {
                result= a / b;

            } catch (ArithmeticException e){
                System.out.println("Esto no puede hacerse");
            }finally {
                System.out.println("Demo de código");
            }
            return result;
        }
    }
