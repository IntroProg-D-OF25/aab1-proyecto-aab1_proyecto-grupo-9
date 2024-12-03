// AUTOR evelynlizzethe

import java.util.*;

public class SimuladorFutbol {

    public static void main(String[] args) {

        int jugadoresPorEquipo = 4;
        int contador = 0;
        int golesEquipoA, golesEquipoB;
        String[] posiciones = {"Arquero", "Defensa", "Mediocampo", "Delantero"};
        Random random = new Random();

        String[][] equipoA = new String[jugadoresPorEquipo][4];
        String[][] equipoB = new String[jugadoresPorEquipo][4];

        while (contador < jugadoresPorEquipo) {
            equipoA[contador] = generarEquipo("Jugador A" + (contador + 1),
                    posiciones, random);
            equipoB[contador] = generarEquipo("Jugador B" + (contador + 1),
                    posiciones, random);
            contador++;
        }
        
        System.out.println("Listado de Jugadores por Equipo");

        System.out.println("Equipo A");
        mostrarJugadores(equipoA);

        System.out.println("Equipo B");
        mostrarJugadores(equipoB);

        golesEquipoA = calcularGoles(equipoA);
        golesEquipoB = calcularGoles(equipoB);

        System.out.println("Estadisticas del Partido: ");
        System.out.println("Goles Equipo A: " + golesEquipoA);
        System.out.println("Goles Equipo B: " + golesEquipoB);

        if (golesEquipoA > golesEquipoB) {
            System.out.println("Equipo Ganador: Equipo A");
        } else if (golesEquipoB < golesEquipoA) {
            System.out.println("Equipo Ganador: Equipo B");
        } else if (golesEquipoA == golesEquipoB) {
            System.out.println("!Empate!");
            simularPenales();
        }
    }

    public static String[] generarEquipo(String nombre, String[] posiciones,
            Random random) {
        String posicion;
        int edad, goles;
        posicion = posiciones[random.nextInt(posiciones.length)];
        edad = random.nextInt(23) + 18; // Edad entre los 18 y los 40
        goles = random.nextInt(3);
        return new String[]{nombre, posicion, "" + edad, "" + goles};
    }

    public static void mostrarJugadores(String[][] equipo) {
        int contador = 0;
        System.out.printf("%s\t\t | %s\t\t | %s\t | %s\t%n", "NOMBRE",
                "POSICION", "EDAD", "GOLES");
        while (contador < equipo.length) {
            String[] jugador = equipo[contador];
            System.out.printf("%s\t | %s\t\t | %s\t | %s\t%n", jugador[0],
                    jugador[1], jugador[2], jugador[3]);
            contador++;
        }
    }

    public static int calcularGoles(String[][] equipo) {
        int totalGolesEquipos = 0;
        int contador = 0;
        while (contador < equipo.length) {
            totalGolesEquipos = ((contador));
            contador++;
        }
        return totalGolesEquipos;
    }

    public static void simularPenales() {
        int golesEquipoA, golesEquipoB;
        Random random = new Random();

        golesEquipoA = random.nextInt(3);
        golesEquipoB = random.nextInt(3);

        System.out.println("Penales Equipo A: " + golesEquipoA);
        System.out.println("Penales Equipo B: " + golesEquipoB);

        if (golesEquipoA > golesEquipoB) {
            System.out.println("Equipo Ganador: Equipo A");
        } else if (golesEquipoB < golesEquipoA) {
            System.out.println("Equipo Ganador: Equipo B");
        } else {
            System.out.println("!Empate en Penales!");
            simularPenales();
        }
    }
}

/***
* Listado de Jugadores por Equipo
* Equipo A
* NOMBRE	 | POSICION		 | EDAD	 | GOLES	
* Jugador A1	 | Arquero		 | 30	 | 1	
* Jugador A2	 | Mediocampo		 | 26	 | 2	
* Jugador A3	 | Mediocampo		 | 20	 | 2	
* Jugador A4	 | Delantero		 | 25	 | 0	
* Equipo B
* NOMBRE         | POSICION		 | EDAD	 | GOLES	
* Jugador B1	 | Delantero		 | 29	 | 0	
* Jugador B2	 | Mediocampo		 | 18	 | 0	
* Jugador B3	 | Defensa		 | 23	 | 2	
* Jugador B4	 | Arquero		 | 23	 | 2	
* Estadisticas del Partido: 
* Goles Equipo A: 3
* Goles Equipo B: 3
* !Empate!
* Penales Equipo A: 2
* Penales Equipo B: 1
* Equipo Ganador: Equipo A
 */
