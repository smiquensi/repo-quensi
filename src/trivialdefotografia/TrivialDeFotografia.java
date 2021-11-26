/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trivialdefotografia;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author santimiquel
 */
public class TrivialDeFotografia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final String nombreTrivial = "Trivial de Fotografía";
        Scanner teclado = new Scanner(System.in);
        String respuesta;
        final String pregunta1 = "El ISO en las cámaras fotográficas es la capacidad que tiene el sensor para ser mas o menos sensible a la luz que capta. \nRecuerda responder con ¿V o F?";
        final String pregunta2 = "¿El obturador es el responsable de la profundidad de campo? \nRecuerda responder con ¿V o F?";
        final String pregunta3 = "¿A qué velocidad de obturación máxima se puede sincronizar la cámara con un flash?\nA) 1/125\nB) 1/60\nB) 1/60\nC) 1/250\nD) Cualquier velocidad si el flash tiene HSS. \nEscribre la letra correcta.";
        final String pregunta4 = "¿Se conoce cómo simpatía la técnica para sincronizar el disparo de varios flashes mediante sus células fotosensibles? \nRecuerda responder con ¿V o F?";
        final String pregunta5 = "¿Sabes que es la hiperfocal? \nA) Una focal hiper larga.\nB) Una marca de tripodes. \nC) Una técnica para aprovechar la máxima profundidad de campo de una optica.\nEscribre la letra correcta.";
        final String pregunta6 = "¿Con que apertura de diafragma entra mas luz? \nA) f1.4 \nB) f16 \nC) f5.6\nEscribre la letra correcta.";
        final String pregunta7 = "¿Que apertura de diafragma se acerca mas al punto dulce de un objetivo de luminosidad 1.4? \nA) f1.4 \nB) f16 \nC) f5.6\nEscribre la letra correcta.";
        final String pregunta8 = "¿Que óptica tiene un efecto de comprimir mas la perspectiva? \nA) Gran Angular \nB) Objetivo normal (50 mmm) \nC) Teleobjetivo \nEscribre la letra correcta.";
        final String pregunta9 = "¿Cual es la mejor hora del día para hacer retratos en exterior? \nA) El amanecer y el atardecer de los dias soleados \nB) Los dias nublados \nC) A medio día de un dia soleado. Que hay mas luz. \nD) A y B son correctas. \nEscribre la letra correcta.";
        final String pregunta10 = "¿Cuales son los principales modos de disparo de la rueda de selección de modos? \nA) Interior y exterior \nB) Deportes, retratos y atardecer\nC) P, Av, Sv y M.\nEscribre la letra correcta.";
        int numeroPreguntas = 0;
        double contadorAciertos = 0.0;
        double mediaAciertos;
        boolean errorNumeroPreguntas = true;
        boolean otraPartida = false;
        // Hasta aqui he inicializado las variables y las constantes que voy a utilizar en el programa.

        System.out.println("Hola!! Bienvenido al " + nombreTrivial);
        do {
            System.out.println("¿De cuantas preguntas quieres que se componga la partida? Recuerda que debes elegir un minimo de 3 preguntas y un maximo de 10");
            do {
                try {
                    teclado = new Scanner(System.in);
                    numeroPreguntas = teclado.nextInt();
                    errorNumeroPreguntas = false;
                    if (numeroPreguntas < 3 || numeroPreguntas > 10) {
                        System.out.println("El numero introducido debe ser mayor o igual a 3 y menor o igual a 10.");
                        errorNumeroPreguntas = true;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Introduce un numero:");
                }
            } while (errorNumeroPreguntas == true); // Creo un bucle en el que pregunto el numero de preguntas con las que quiere jugar el usuario, en caso de que responda con una letra salta el trycatch y reinicia el bucle. En caso de que el numero de preguntas sea inferior o superior a las estipuladas tambine reinicia el bucle mediante el cambio del valor boolenao en la variable errorNumeroPreguntas mediante el if
            teclado = new Scanner(System.in);
            for (int contador = 0; contador < numeroPreguntas; contador++) { // Creo un bucle para el numero de preguntas q se van a responder.
                int numRamdom = (int) (Math.random() * numeroPreguntas + 1);   // Casteo la variable numRandom para obtener numeros enteros aleatorios, que apuntaran a un case concreto dentro del switch.
                switch (numRamdom) {
                    case 1 -> {                                              // Cada case tiene un if para verificar si la respuesta dada por el ususario es verdadera o falsa.
                        System.out.println(pregunta1);                          
                        respuesta = teclado.nextLine();
                        if (respuesta.equalsIgnoreCase("v")) {
                            System.out.println("Respuesta correcta\n");
                            ++contadorAciertos;                             // En caso que la respuesta sea correcta se suma 1 a la variable contadorAciertos para posteriormente sacar la media de aciertos.    
                        } else {
                            System.out.println("Respuesta incorrecta\n");
                        }
                    }
                    case 2 -> {
                        System.out.println(pregunta2);
                        respuesta = teclado.nextLine();
                        if (respuesta.equalsIgnoreCase("f")) {
                            System.out.println("Respuesta correcta\n");
                            ++contadorAciertos;
                        } else {
                            System.out.println("Respuesta incorrecta\n");
                        }
                    }
                    case 3 -> {
                        System.out.println(pregunta3);
                        respuesta = teclado.nextLine();
                        if (respuesta.equalsIgnoreCase("d")) {
                            System.out.println("Respuesta correcta\n");
                            ++contadorAciertos;
                        } else {
                            System.out.println("Respuesta incorrecta\n");
                        }
                    }
                    case 4 -> {
                        System.out.println(pregunta4);
                        respuesta = teclado.nextLine();
                        if (respuesta.equalsIgnoreCase("v")) {
                            System.out.println("Respuesta correcta\n");
                            ++contadorAciertos;
                        } else {
                            System.out.println("Respuesta incorrecta\n");
                        }
                    }
                    case 5 -> {
                        System.out.println(pregunta5);
                        respuesta = teclado.nextLine();
                        if (respuesta.equalsIgnoreCase("c")) {
                            System.out.println("Respuesta correcta\n");
                            ++contadorAciertos;
                        } else {
                            System.out.println("Respuesta incorrecta\n");
                        }
                    }
                    case 6 -> {
                        System.out.println(pregunta6);
                        respuesta = teclado.nextLine();
                        if (respuesta.equalsIgnoreCase("a")) {
                            System.out.println("Respuesta correcta\n");
                            ++contadorAciertos;
                        } else {
                            System.out.println("Respuesta incorrecta\n");
                        }
                    }
                    case 7 -> {
                        System.out.println(pregunta7);
                        respuesta = teclado.nextLine();
                        if (respuesta.equalsIgnoreCase("c")) {
                            System.out.println("Respuesta correcta\n");
                            ++contadorAciertos;
                        } else {
                            System.out.println("Respuesta incorrecta\n");
                        }
                    }
                    case 8 -> {
                        System.out.println(pregunta8);
                        respuesta = teclado.nextLine();
                        if (respuesta.equalsIgnoreCase("c")) {
                            System.out.println("Respuesta correcta\n");
                            ++contadorAciertos;
                        } else {
                            System.out.println("Respuesta incorrecta\n");
                        }
                    }
                    case 9 -> {
                        System.out.println(pregunta9);
                        respuesta = teclado.nextLine();
                        if (respuesta.equalsIgnoreCase("d")) {
                            System.out.println("Respuesta correcta\n");
                            ++contadorAciertos;
                        } else {
                            System.out.println("Respuesta incorrecta\n");
                        }
                    }
                    case 10 -> {
                        System.out.println(pregunta10);
                        respuesta = teclado.nextLine();
                        if (respuesta.equalsIgnoreCase("c")) {
                            System.out.println("Respuesta correcta\n");
                            ++contadorAciertos;
                        } else {
                            System.out.println("Respuesta incorrecta\n");
                        }
                    }

                }

            }
            mediaAciertos = (contadorAciertos / numeroPreguntas) * 100;         // Se calcula la media de aciertos y dependiendo del resultado se muestra un mensaje por pantalla diferente.
            if (mediaAciertos < 34) {
                System.out.printf("Deberías ver más video en YouTube de fotografía, solo has acertado un %.2f%% de respuestas correctas.%n", mediaAciertos);
            } else if (mediaAciertos < 67) {
                System.out.printf("Veo que has cogido alguna vez una cámara. Aunque deberías profundizar un poco más en la teoría. Has acertado un %.2f%% de repuestas correctas.%n", mediaAciertos);
            } else if (mediaAciertos < 99) {
                System.out.printf("Muy bien!! Podrías abrir tu canal de fotografía para que otros aprendieran de ti. Has acertado un %.2f%% de repuestas correctas.%n", mediaAciertos);
            } else if (mediaAciertos == 100) {
                System.out.printf("Genial!! Has acertado el %.2f%% de las respuesta. Eres todo un/a Maestro/a de la fotografía.%n", mediaAciertos);
            }
            System.out.println("\n¿Quieres jugar otra partida? (V/F)");         // Se pregunta si quiere jugar otra partida. En caso afirmativo se modifica el valor boolenao de la variable otraPartida y se reinicia el bucle doWhile.
            respuesta = teclado.nextLine();
            if (respuesta.equalsIgnoreCase("v")) {
                System.out.println("Genial!! Vamos a ello.");
                otraPartida = true;
            } else {
                System.out.println("Ya volveremos a jugar otro día. Adios!!");
            }
        } while (otraPartida == true);
    }
}
