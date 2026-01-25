package Bai3.b3_2;
import java.util.Arrays;

public class MyPolynomial {
    private double[] coeffs; // c0, c1, c2,...

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    public double evaluate(double x) {
        double sum = 0;
        for (int i = coeffs.length - 1; i >= 0; i--) {
            sum = sum * x + coeffs[i];
        }
        return sum;
    }

    public MyPolynomial add(MyPolynomial right) {
        int max = Math.max(coeffs.length, right.coeffs.length);
        double[] res = new double[max];
        for (int i = 0; i < max; i++) {
            double a = i < coeffs.length ? coeffs[i] : 0;
            double b = i < right.coeffs.length ? right.coeffs[i] : 0;
            res[i] = a + b;
        }
        return new MyPolynomial(res);
    }

    public MyPolynomial multiply(MyPolynomial right) {
        double[] res = new double[coeffs.length + right.coeffs.length - 1];
        for (int i = 0; i < coeffs.length; i++)
            for (int j = 0; j < right.coeffs.length; j++)
                res[i + j] += coeffs[i] * right.coeffs[j];
        return new MyPolynomial(res);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = coeffs.length - 1; i >= 0; i--) {
            if (coeffs[i] == 0) continue;
            if (sb.length() > 0) sb.append(" + ");
            sb.append(coeffs[i]);
            if (i > 0) sb.append("x");
            if (i > 1) sb.append("^").append(i);
        }
        return sb.toString();
    }
}
