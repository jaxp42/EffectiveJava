package creatingObjects.builderPattern;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final int id;
    private final String address, comment;
    private final List<String> products;

    public Order(Builder builder){
        this.id = builder.id;
        this.address = builder.address;
        this.comment = builder.comment;
        this.products = builder.products;
    }

    public static class Builder{
        //required attributes
        private final int id;
        private final String address;

        //optional attributes
        private List<String> products = new ArrayList<>();
        private String comment = "";

        public Builder(int id, String address){
            this.id = id;
            this.address = address;
        }

        public Builder addProduct(String product){
            products.add(product);
            return this;
        }

        public Builder comment(String comment){
            this.comment = comment;
            return this;
        }

        public Order build(){
            return new Order(this);
        }
    }
}
