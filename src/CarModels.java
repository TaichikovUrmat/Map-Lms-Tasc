public class CarModels {
    private int  got;
    private String model;
    private  int price;
    private String color;

    public CarModels(int got, String model, int price, String color) {
        this.got = got;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public int getGot() {
        return got;
    }

    public void setGot(int got) {
        this.got = got;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "CarModels{" +
                "got=" + got +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
