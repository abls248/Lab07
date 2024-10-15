public class Task6 {
    public static void main(String[] args) {
        for (int rowNumber = 6; rowNumber > 0; rowNumber--) {
            for (int asteriskCount = 0; asteriskCount < rowNumber; asteriskCount++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

