class PercentDiscountItem extends Item {

    // Private fields demonstrate encapsulation
    private int threshold;
    private double percentOff;

    
    public PercentDiscountItem(
            String name,
            double price,
            int threshold,
            double percentOff) {

        // super() must be the first statement
        super(name, price);

        this.threshold = threshold;
        this.percentOff = percentOff;
    }

    @Override
    public double calculateTotal(int quantity) {

        // Get the normal subtotal from the superclass
        double subtotal = super.calculateTotal(quantity);

        // Apply discount when quantity reaches threshold
        if (quantity >= threshold) {
            subtotal = subtotal * (1 - percentOff / 100.0);
        }

        return subtotal;
    }
}
