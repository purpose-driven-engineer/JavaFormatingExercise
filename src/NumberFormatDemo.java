import java.text.DecimalFormat;

public class NumberFormatDemo {
    public static void main(String[] args) {
        double price = 1234567.891;
        double percent = 0.85;

        DecimalFormat df1 = new DecimalFormat("#,###.00");
        System.out.println("Price: " + df1.format(price));

        DecimalFormat df2 = new DecimalFormat("$#,###.00");
        System.out.println("Price: " + df2.format(price));

        DecimalFormat df3 = new DecimalFormat("0.00%");
        System.out.println("Discount: " + df3.format(percent));
    }
}