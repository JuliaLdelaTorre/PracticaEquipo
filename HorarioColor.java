/**
 * HorarioColor
 * Ejercicio 5
 *
 * Escribe un programa que muestre tu horario de clase.
 * Modifica el programa anterior añadiendo colores. Puedes mostrar cada asignatura de un color diferente.
 *
 * @author Martos Ruiz, David
 * Fecha: 26/09/2022
 */
public class HorarioColor {
  public static void main (String[] args) {
    System.out.println("┌─────────────┬─────────────┬─────────────┬─────────────┬─────────────┬─────────────┐");
    System.out.println("│    Horas    │    Lunes    │    Martes   │  Miércoles  │    Jueves   │   Viernes   │");
    System.out.println("├─────────────┼─────────────┼─────────────┼─────────────┼─────────────┼─────────────┤");
    System.out.println("│  8:15-9:15  │\033[31m Programación\033[37m│\033[93m Sist. Infor.\033[37m│\033[34m     BBDD    \033[37m│\033[31m Programación\033[37m│\033[93m Sist. Infor.\033[37m│");
    System.out.println("├─────────────┼─────────────┼─────────────┼─────────────┼─────────────┼─────────────┤");
    System.out.println("│  9:15-10:15 │\033[31m Programación\033[37m│\033[93m Sist. Infor.\033[37m│\033[34m     BBDD    \033[37m│\033[31m Programación\033[37m│\033[93m Sist. Infor.\033[37m│");
    System.out.println("├─────────────┼─────────────┼─────────────┼─────────────┼─────────────┼─────────────┤");
    System.out.println("│ 10:15-11:15 │\033[92m Entorno Des.\033[37m│\033[93m Sist. Infor.\033[37m│\033[34m     BBDD    \033[37m│\033[31m Programación\033[37m│\033[93m Sist. Infor.\033[37m│");
    System.out.println("├─────────────┼─────────────┼─────────────┼─────────────┼─────────────┼─────────────┤");
    System.out.println("│ 11:15-11:45 │    Recreo   │    Recreo   │    Recreo   │    Recreo   │    Recreo   │");
    System.out.println("├─────────────┼─────────────┼─────────────┼─────────────┼─────────────┼─────────────┤");
    System.out.println("│ 11:45-12:45 │\033[92m Entorno Des.\033[37m│\033[34m     BBDD    \033[37m│\033[31m Programación\033[37m│\033[92m Entorno Des.\033[37m│\033[95m     FOL     \033[37m│");
    System.out.println("├─────────────┼─────────────┼─────────────┼─────────────┼─────────────┼─────────────┤");
    System.out.println("│ 12:45-13:45 │\033[96m Leng. Marcas\033[37m│\033[34m     BBDD    \033[37m│\033[31m Programación\033[37m│\033[96m Leng. Marcas\033[37m│\033[95m     FOL     \033[37m│");
    System.out.println("├─────────────┼─────────────┼─────────────┼─────────────┼─────────────┼─────────────┤");
    System.out.println("│ 13:45-14:45 │\033[96m Leng. Marcas\033[37m│\033[34m     BBDD    \033[37m│\033[31m Programación\033[37m│\033[96m Leng. Marcas\033[37m│\033[95m     FOL     \033[37m│");
    System.out.println("└─────────────┴─────────────┴─────────────┴─────────────┴─────────────┴─────────────┘");
  }
}