public class Main {
    public static void main(String[] args) {
     System.out.println("Hello world!");
     //Declarar variable e incrementarla
     int numero = 0;
     numero = numero + 1;
     System.out.println(numero);
     numero += 1;
     System.out.println(numero);
     numero++;
     System.out.println(numero);
     //declarar variable y decrementar

     int numero2 = 100;
     numero2 = numero2 - 5;
     System.out.println(numero2);
     numero2 -= 5;
     System.out.println(numero2);
     numero2--;
     System.out.println(numero2);

     //Multiplicar
     int numero3 = 7;
     numero3 = numero3 = 3;
     System.out.println("numero3 -> " + numero3);
     numero3 *= 2;
     System.out.println("numero3 -> " + numero3);

     //division - dividir entre 10 y luego entre 5
     int numero4 = 100;
     numero4 = numero4 / 10;
     System.out.println("numero4 -> " + numero4);
     numero4 /= 5;
     System.out.println("numero4 -> " + numero4);

        /*Declarar una varaible con el numero5 asignar un valor de 8
        obtener el resto de dividirlo entre 3
         */
     int numero5 = 8;
     numero5 = numero5 % 3;
     System.out.println("resto de 8 entre3==>" + numero5);

     //Caso de asignar Valores
     int num1 = 10, num2 = 2, num3 = 0;
     num3 = num1 + ++num2;
     System.out.println(num3);

     int nume1 = 10, nume2 = 2, nume3 = 0;
     nume3 = nume1 + ++nume2;
     System.out.println(nume3);

     //operadores de comparacion
     //Declarar una variable con el valor de 10 y decir si es par
     //Tip -> operador comparacion y algun operador aritmetrico

     int valor = 11;
     System.out.println("es par? " + (valor % 2 == 0));
     System.out.println("es impar? " + (valor % 2 == 0));

     //Decir si un munero es multiplo de tres
     System.out.println("¿es multiplo de 3 ?" + (valor % 3 == 0));

     //declarar una variable y asignarle el numero  -5
     int variable = -5;
     //decir si es positivo
     System.out.println("¿es positivo?" + (variable >= 0));
// decir si es negativo
     System.out.println("¿es positivo?" + (variable <= 0));

     //Declarar una variable importe con el 50
     //Si el importe es mayor o igual que 100 calcular el 10% de descuento
     //pero si el import es menor calcular el 3%
     float importe = 50f;
     if (importe >= 100) {
      System.out.println("entra al if");
      System.out.println(importe * 10);
     } else {
      System.out.println("entra al else");
      System.out.println(importe * 0.03);
     }

     //Declarar una variable de numero de hijos
     // Decir si es familia numerosa o No es familia numerosa

int hijos = 10;
     if (hijos <=3){
      System.out.println("no es familia numerossa");

     }else{
      System.out.println("es familia numerosa");
     }

    //una variable que guarde la edad
    //Decir si es mayor o menor de edad

    int edad =18;
     if (edad >=18){
      System.out.println("es mayor de edad");
          }
    else {
      System.out.println("no es mayor de edad");
     }
//operadores logicos
   //  && and || or

     //Declarar una variable para el dia del mes
     byte mes = 8;
    if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
     System.out.println("el mes tiene 31 dias");

    }else {
     System.out.println("el mes tiene 30 dias");
    }

//Si el numero esta entre 5 y 15 mostrar que se ha ganado un ordenador

    }}



