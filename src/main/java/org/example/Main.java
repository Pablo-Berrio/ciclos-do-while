package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaTeclado=new Scanner(System.in);

        Integer contadorDeBuenas=0;
        Integer contadorDeMalas=0;
        int numeroDeContrasenas=0;
        int contadorDeIntentos=0;
        String contrasenaIngresada;

        System.out.print("Cuantas contraseñas deseas ingresar: ");
        numeroDeContrasenas=entradaTeclado.nextInt();

        do {
            contadorDeIntentos=contadorDeIntentos+1;
            System.out.println("Ingrese su contraseña: ");
            contrasenaIngresada=entradaTeclado.next();
            int contadorDeLetrasDeLaContrasena=contrasenaIngresada.length();

            if (contadorDeLetrasDeLaContrasena>=8){
                contadorDeBuenas=contadorDeBuenas+1;
                System.out.println("contraseña buena");

            }else {
                System.out.println("contraseña mala");
                contadorDeMalas=contadorDeMalas+1;

            }

        }while (contadorDeIntentos<numeroDeContrasenas);
        System.out.println("usted tiene: "+contadorDeBuenas+" contraseñas buenas");
        System.out.println("usted tiene: "+contadorDeMalas+" contraseñas malas");

        }
    }
