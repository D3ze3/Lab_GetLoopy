class Main {
    public static void main(String[] args) {
        // Task 1: Count up by 1 from 0 to 30
        System.out.print("Task 1: ");
        for (int i = 0; i <= 30; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Task 2: Count down by 1 from 30 to 0
        System.out.print("Task 2: ");
        for (int i = 30; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Task 3: Count up by 3 from 0 to 18
        System.out.print("Task 3: ");
        for (int i = 0; i <= 18; i += 3) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Task 4: Count down by 2 from 10 to 0
        System.out.print("Task 4: ");
        for (int i = 10; i >= 0; i -= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        // Task 5: Right-angled Triangle
        System.out.println("Task 5:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Task 6: Inverted Triangle
        System.out.println("\nTask 6:");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Task 7: Square Pattern
        System.out.println("\nTask 7:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    }

