import org.hyperskill.hstest.dynamic.DynamicTest;
import org.hyperskill.hstest.stage.StageTest;
import org.hyperskill.hstest.testcase.CheckResult;
import org.hyperskill.hstest.testing.TestedProgram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Bubblegum: $202.0
// Toffee: $118.0
// Ice cream: $2250.0
// Milk chocolate: $1680.0
// Doughnut: $1075.0
// Pancake: $80.0
//
// Income: $5405.0

public class MyFirstProjectTest extends StageTest {
    @DynamicTest
    CheckResult testFirstProject() {
        TestedProgram pr = new TestedProgram();

        String output = pr.start().toLowerCase().strip();
        int outputLength = (int) Arrays.stream(output.split("\n")).filter(line -> !line.isEmpty()).count();
        if (output.isEmpty()) {
            return CheckResult.wrong("Your program didn't print any output.");
        } else if (outputLength != 8) {
            return CheckResult.wrong(String.format("Your program should output 8 lines, but %s lines were found.",
                    outputLength));
        }
        if (!output.contains("earned")) {
            return CheckResult.wrong("Your program didn't print the 'Earned amount' line");
        }
        Map<String, String> map = new HashMap<>() {{
            put("Bubblegum", "202");
            put("Toffee", "118");
            put("Ice cream", "2250");
            put("Milk chocolate", "1680");
            put("Doughnut", "1075");
            put("Pancake", "80");
        }};
        int totalCalculatedIncome = 0;
        for (String name : map.keySet()) {
            if (!output.contains(name.toLowerCase())) {
                return CheckResult.wrong(String.format("Your program should print the '%s' as an item", name));
            }
            String expectedPrice = map.get(name);
            if (!output.contains("$" + expectedPrice)) {
                return CheckResult.wrong(String.format("Incorrect or missing dollar sign for '%s' price. " +
                        "Expected output: '%s: $%s'", name, name, expectedPrice));
            }
            totalCalculatedIncome += Integer.parseInt(expectedPrice);
        }
        if (!output.contains("income")) {
            return CheckResult.wrong("Your program should print the 'Income' on a separate line");
        }
        if (!output.contains("$5405") || totalCalculatedIncome != 5405) {
            return CheckResult.wrong("Your program did not calculate the total income correctly. Expected 'Income: $5405'");
        }
        return CheckResult.correct();
    }
}
