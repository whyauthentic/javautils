package me.whyauthentic.javautils;


public class ConsoleMessages {

    public static void SYSTEM(String message) {
        System.out.println(AnsiColors.CYAN_BOLD + "[SYSTEM] " + message + AnsiColors.RESET);
    }

    public static void INFO(String message) {
        System.out.println(AnsiColors.GREEN_BOLD + "[INFO] " + message + AnsiColors.RESET);
    }

    public static void ERROR (String message) {
        System.out.println(AnsiColors.RED_BOLD + "[ERROR] " + message + AnsiColors.RESET);
    }

   public static void WARNING (String message) {
        System.out.println(AnsiColors.YELLOW_BOLD + "[WARNING] " + message + AnsiColors.RESET);
   }

   public static void DEBUG (String message) {
        System.out.println(AnsiColors.PURPLE_BOLD + "[DEBUG] " + message + AnsiColors.RESET);
   }

}
