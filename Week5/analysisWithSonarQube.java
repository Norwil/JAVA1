public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divider cannot be zero");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Subtraction: " + calc.subtract(10, 5));
        System.out.println("Multiplication: " + calc.multiply(10, 5));
        System.out.println("Division: " + calc.divide(10, 5));
    }
}


public class StringReverser {
    public String reverse(String input) {
        if (input == null) {
            return null;
        }
        return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {
        StringReverser reverser = new StringReverser();
        String original = "Hello World";
        String reversed = reverser.reverse(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}


/*

1. Introduction
Briefly introduce static code analysis and its importance.
Mention the tools used (SonarQube) and the Java programs analyzed.
2. Code Smells
Definition: Code smells are indicators of possible issues in your code. They aren't bugs but can signify poor design or coding practices that might hinder maintenance or scaling.
Interpretation: High numbers of code smells can indicate complex, confusing code that may be hard to maintain or extend. Discuss examples found in your code and how they could be refactored.
3. Bugs
Definition: Bugs are coding errors that can cause your program to behave unexpectedly or to crash.
Interpretation: The presence of bugs directly affects the reliability of the software. Highlight any bugs found in your code and discuss the potential impact they might have on program functionality.
4. Vulnerabilities
Definition: Vulnerabilities are weaknesses in the code that can be exploited to cause harm, such as security breaches or data loss.
Interpretation: Discuss the severity of any vulnerabilities found and the importance of security in software development. Even small vulnerabilities can lead to significant risks.
5. Duplications
Definition: Duplications refer to repeated code blocks. High levels of duplication can make your code harder to maintain because a change in one place might require changes in all duplicated places.
Interpretation: Highlight how reducing duplication can improve maintainability and reduce the risk of inconsistent changes or bugs.
6. Coverage
Definition: Coverage measures the percentage of your code that is covered by automated tests.
Interpretation: Explain the importance of testing in ensuring code reliability and quality. Discuss how higher test coverage can lead to more robust and reliable software.
7. Technical Debt
Definition: Technical debt quantifies the cost of choosing an easy or quick solution now over a better approach that would take longer.
Interpretation: Relate this to the long-term impact on project maintenance and scalability. Discuss the technical debt identified in your programs and potential strategies to reduce it.
8. Conclusion
Summarize the key findings from your code analysis.
Emphasize the importance of addressing these metrics to maintain high-quality, sustainable, and secure software.
Suggest potential improvements or next steps based on the analysis.

  */


