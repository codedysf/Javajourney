public class Main {
    public static void main(String[] args)
    {
       drawBox();
       drawOval();
       drawArrow();
       drawDiamond();

    }

    private static void drawBox(){
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