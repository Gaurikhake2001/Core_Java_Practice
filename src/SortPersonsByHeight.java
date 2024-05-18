import java.util.*;

public class SortPersonsByHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Read array size
            int N = scanner.nextInt();
            scanner.nextLine(); // consume newline

            // Read names
            String[] names = scanner.nextLine().split(",");

            // Read heights
            String[] heightsStr = scanner.nextLine().split(",");
            int[] heights = new int[N];
            for (int i = 0; i < N; i++) {
                try {
                    heights[i] = Integer.parseInt(heightsStr[i].trim()); // trim whitespace
                } catch (NumberFormatException e) {
//                    System.out.println("Invalid height value at index " + i);
                    return; // exit the program if there's a parsing error
                }
            }

            // Sort persons by height
            String[] sortedNames = sortPersonsByHeight(names, heights);

            // Print sorted names
            for (int i = 0; i < N; i++) {
                System.out.print(sortedNames[i]);
                if (i != N - 1) {
                    System.out.print(",");
                }
            }
            System.out.println(); // print newline after output
        } finally {
            scanner.close();
        }
    }

    // Function to sort persons by height
    public static String[] sortPersonsByHeight(String[] names, int[] heights) {
        int N = names.length;
        String[] sortedNames = new String[N];

        // Create a list of Person objects to store names and heights together
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            persons.add(new Person(names[i], heights[i]));
        }

        // Sort persons based on heights in descending order
        Collections.sort(persons, Collections.reverseOrder());

        // Populate sorted names array
        for (int i = 0; i < N; i++) {
            sortedNames[i] = persons.get(i).name;
        }

        return sortedNames;
    }

    static class Person implements Comparable<Person> {
        String name;
        int height;

        public Person(String name, int height) {
            this.name = name;
            this.height = height;
        }

        // Compare persons based on height in descending order
        @Override
        public int compareTo(Person other) {
            return Integer.compare(other.height, this.height);
        }
    }
}
