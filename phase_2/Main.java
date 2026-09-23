import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Item[] items = {
            new PercentDiscountItem("Shirt", 25000.00, 4, 5),
            new NoDiscountItem("Trousers", 40000.00),
            new FlatDiscountItem("Shoes (pair)", 60000.00, 2, 10000.00),
            new PercentDiscountItem("Dress", 55000.00, 3, 10)
        };

        int[] quantities = {3, 2, 1, 3};

        System.out.println("==== CHIC BOUTIQUE RECEIPT ====");

        double grandTotal = 0;

        for (int i = 0; i < items.length; i++) {

            double lineTotal =
                items[i].calculateTotal(quantities[i]);

            System.out.printf(
                Locale.US,
                "%-14s x%-3d = UGX %,10.2f%n",
                items[i].getName(),
                quantities[i],
                lineTotal
            );

            grandTotal += lineTotal;
        }

        System.out.println("-----------------------------------------------");

        System.out.printf(
            Locale.US,
            "TOTAL = UGX %,10.2f%n",
            grandTotal
        );
    }
}