public class SalesChallenge {
    public static void main(String[] args) {
       int updatedPrice = productPrice(20, "SPRING20");
    System.out.println("Your price is " + updatedPrice  );
    }

    public static int productPrice(int price, String promocode) {
        int updatedPrice = price;
        switch (promocode) {
            case "WELCOME10" -> updatedPrice = price - (price * 10 / 100);
            case "SPRING20" -> updatedPrice = price - (price * 20 / 100);
            case "VIP30" -> updatedPrice = price - (price * 30 / 100);
            default -> System.out.println("No sales ");
        }
        return updatedPrice;
    }

}
