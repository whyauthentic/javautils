package me.whyauthentic.utilsapi;


public class ConsoleMessages {

    public static void SYSTEM(String message) {
        System.out.println(ConsoleColors.CYAN_BOLD + "[SYSTEM] " + message + ConsoleColors.RESET);
    }

    public static void INFO(String message) {
        System.out.println(ConsoleColors.GREEN_BOLD + "[INFO] " + message + ConsoleColors.RESET);
    }

    public static void ERROR (String message) {
        System.out.println(ConsoleColors.RED_BOLD + "[ERROR] " + message + ConsoleColors.RESET);
    }

    public static void UPDATE (String message) {
        System.out.println(ConsoleColors.YELLOW_BOLD + "[UPDATE] " + message + ConsoleColors.RESET);
    }

}
