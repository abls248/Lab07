public class Task5 {
    public static void main(String[] args) {
        for (int rowNumber = 1; rowNumber <= 6; rowNumber++) {
            for (int asteriskCount = 1; asteriskCount <= rowNumber; asteriskCount++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

