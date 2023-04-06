package creatingObjects.builderPattern;

public class Client {
    public static void main(String[] args){
        Order order = new Order.Builder(1, "My address")
                .addProduct("Graphic card")
                .addProduct("Mother board")
                .addProduct("SSD drive")
                .comment("Phone before deliver")
                .build();
    }
}
