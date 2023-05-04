public class Main {

    /* This program defines four methods, drawBox(), drawOval(), drawArrow(),
    and drawDiamond(), each of which prints a specific shape using asterisks.
    In the main method,these methods are called to display each shape
     */
    public static void main(String[] args) {
        drawBox();
        drawOval();
        drawArrow();
        drawDiamond();
    }

    private static void drawBox() {
        System.out.println("******");
        System.out.println("*    *");
        System.out.println("*    *");
        System.out.println("******");
    }

    private static void drawOval() {
        System.out.println("  ***  ");
        System.out.println(" *   * ");
        System.out.println("*     *");
        System.out.println(" *   * ");
        System.out.println("  ***  ");
    }

    private static void drawArrow() {
        System.out.println("    *   ");
        System.out.println("   ***  ");
        System.out.println("  ***** ");
        System.out.println("    *   ");
        System.out.println("    *   ");
        System.out.println("    *   ");
    }

    private static void drawDiamond() {
        System.out.println("    *   ");
        System.out.println("   ***  ");
        System.out.println("  ***** ");
        System.out.println("   ***  ");
        System.out.println("    *   ");
    }
}
