import javax.swing.*;
import java.util.Scanner;

public class entradaDatos {
    public static void main(String[] args) {
        //Solicitando datos por consola:
        //Scanner sc = new Scanner(System.in);
        /*Cómo solicitar datos int por consola
        System.out.println("Ingrese número: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese número: ");
        int num2 = sc.nextInt();
        int resultado = num1 + num2;
        System.out.println("El resultado es: " + resultado);
         */
        /*
        System.out.println("Ingrese el nombre de un color: ");
        String color = sc.nextLine();
        System.out.println("El color es: " + color);
         */

        //Utilizando cuadros de dialogo
        //Solicitando datos:
        String strNum1 = JOptionPane.showInputDialog("Ingrese el número: ");
        String strNum2 = JOptionPane.showInputDialog("Ingrese otro número: ");
        //Parseamos para convertir los datos tipos string que nos pase el usuario se conviertan en este caso a int
        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);
        //Almacenamos el resultado en otra variable y hacemos de las variables ya parseadas:
        int resultado = num1 + num2;
        //Mostramos el resultado mediante el cuadro diálogo:
        JOptionPane.showMessageDialog(null, "El resultado es:" + resultado);


    }
}
