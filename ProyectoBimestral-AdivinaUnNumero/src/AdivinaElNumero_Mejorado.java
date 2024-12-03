
import java.util.Scanner;

public class AdivinaElNumero_Mejorado {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numAdiv = (int) (Math.random() * 100) + 1;
        int intentos = 0, tipopista = 0;
        boolean adivinado = false;
        while (true) {
            intentos = 10;
            System.out.println("ADIVINA EL NUMERO QUE ESTOY PENSANDO");
            System.out.println("Te quedan " + intentos + " intentos ");

            while (intentos > 0 && !adivinado) {
                System.out.println("Introduce tu numero: ");
                int numero = teclado.nextInt();
                if (numero == numAdiv) {
                    adivinado = true;
                    System.out.println("FELICIDADES! El numero era: " + numAdiv);
                } else {
                    intentos--;
                    if (numero > numAdiv) {
                        System.out.println("El numero es menor");
                    } else {
                        System.out.println("El numero es mayor");
                    }
                    if (intentos > 0) {
                        System.out.println("Te quedan " + intentos + " intentos.");
                        System.out.println("Deseas una pista secreta? (1)Si (0)No");
                        int opcion = teclado.nextInt();

                        if (opcion == 1) {
                            intentos--;
                            System.out.println("Que pista secreta deseas?: (1) (2) (3) (4) (5) (6) (7)");
                            tipopista = teclado.nextInt();
                            switch (tipopista) {
                                case 1:
                                    if (numAdiv % 2 == 0) {
                                        System.out.println("El numero es par");
                                    } else {
                                        System.out.println("El numero es impar");
                                    }
                                    break;
                                case 2:
                                    if (numAdiv % 3 == 0) {
                                        System.out.println("El numero es multiplo de 3");
                                    } else {
                                        System.out.println("El numero no es multiplo de 3");
                                    }
                                    break;
                                case 3:
                                    if (numAdiv % 5 == 0) {
                                        System.out.println("El numero es multiplo de 5");
                                    } else {
                                        System.out.println("El numero no es multiplo de 5");
                                    }
                                    break;
                                case 4:
                                    if (numAdiv <= 50) {
                                        System.out.println("El numero esta entre 1 y 50");
                                    } else {
                                        System.out.println("El numero esta entre 51 y 100");
                                    }
                                    break;
                                case 5:
                                    if (numAdiv < 25) {
                                        System.out.println("El numero es menor que 25");
                                    } else {
                                        System.out.println("El numero es mayor o igual que 25");
                                    }
                                    break;
                                case 6:
                                    if (numAdiv % 10 == 0) {
                                        System.out.println("El numero es multiplo de 10");
                                    } else {
                                        System.out.println("El numero no es multiplo de 10");
                                    }
                                    break;
                                case 7:
                                    int numeroAleat = (int) (Math.random() * 100) + 1;
                                    if (numAdiv < numeroAleat) {
                                        System.out.println("El numero es menor que " + numeroAleat);
                                    } else {
                                        System.out.println("El numero es mayor que " + numeroAleat);
                                    }
                                    break;

                            }

                        }
                    }
                    System.out.println("Te quedan " + intentos + " intentos");
                }
            }

            if (!adivinado) {
                System.out.println("Te has quedado sin intentos");
                System.out.println("El numero era: " + numAdiv);
            }

            System.out.println("FIN DEL JUEGO");
            System.out.println("Desea seguir Jugando? (1) Si (2) No");
            int opcion;
            opcion = teclado.nextInt();
            if (opcion != 1) {
                break;
            }

        }
    }

}
