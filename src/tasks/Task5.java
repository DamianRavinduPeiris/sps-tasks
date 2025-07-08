package tasks;

public class Task5 {
    public static void main(String[] args) {
        findExpressions("", 1, 0, 0, 0);
    }

    // Recursive function to generate and evaluate expressions
    private static void findExpressions(String expr, int pos, long prev, long curr, int sign) {
        if (pos == 10) { // All digits used
            long result = curr + sign * prev;
            if (result == 100) {
                System.out.println(expr + " = 100");
            }
            return;
        }
        // Next digit
        String numStr = Integer.toString(pos);
        long num = pos;
        if (pos == 1) {
            // Start the expression
            findExpressions(numStr, pos + 1, num, 0, 1);
        } else {
            // Add '+'
            findExpressions(expr + "+" + numStr, pos + 1, num, curr + sign * prev, 1);
            // Add '-'
            findExpressions(expr + "-" + numStr, pos + 1, num, curr + sign * prev, -1);
            // Concatenate (no operator)
            long newPrev = prev * 10 + num * (prev >= 0 ? 1 : -1);
            findExpressions(expr + numStr, pos + 1, newPrev, curr, sign);
        }
    }
}
