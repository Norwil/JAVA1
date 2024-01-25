import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        int vowelCount = 0, spaceCount = 0, tabCount = 0, newlineCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            switch (ch) {
                case 'a': case 'e': case 'i': case 'o': case 'u':
                case 'A': case 'E': case 'I': case 'O': case 'U':
                    vowelCount++; break;
                case ' ': spaceCount++; break;
                case '\t': tabCount++; break;
                case '\n': newlineCount++; break;
            }
        }

        System.out.println("Vowels: " + vowelCount);
        System.out.println("Spaces: " + spaceCount);
        System.out.println("Tabs: " + tabCount);
        System.out.println("Newlines: " + newlineCount);

        scanner.close();
    }
}
