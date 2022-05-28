public class Operation {
    protected double x;
    protected double y;

    public Operation(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calcular(char opt) {
        
        if (opt == '+') {
            return x + y;
        } else if (opt == '-') {
            return x - y;
        } else if (opt == '*') {
            return x * y;
        } else if (opt == '/') {
            return x / y;
        } else if (opt == '%') {
            return x % y;
        } else if (opt == '^') {
            return Math.pow(x, y);
        }
        
        return y;
    }
}