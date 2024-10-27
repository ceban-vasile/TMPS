package Lab_1;

public class Order {
    private String bookTitle;
    private String customerName;
    private String deliveryAddress;
    private boolean expressDelivery;
    private double discount;

    private Order(Builder builder) {
        this.bookTitle = builder.bookTitle;
        this.customerName = builder.customerName;
        this.deliveryAddress = builder.deliveryAddress;
        this.expressDelivery = builder.expressDelivery;
        this.discount = builder.discount;
    }

    public static class Builder {
        private String bookTitle;
        private String customerName;
        private String deliveryAddress;
        private boolean expressDelivery = false;
        private double discount = 0.0;

        public Builder(String bookTitle, String customerName) {
            this.bookTitle = bookTitle;
            this.customerName = customerName;
        }

        public Builder deliveryAddress(String address) {
            this.deliveryAddress = address;
            return this;
        }

        public Builder expressDelivery(boolean express) {
            this.expressDelivery = express;
            return this;
        }

        public Builder discount(double discount) {
            this.discount = discount;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }

    public void displayOrder() {
        System.out.println("Order for: " + customerName);
        System.out.println("Book: " + bookTitle);
        System.out.println("Delivery Address: " + deliveryAddress);
        System.out.println("Express Delivery: " + (expressDelivery ? "Yes" : "No"));
        System.out.println("Discount: $" + discount);
    }
}
