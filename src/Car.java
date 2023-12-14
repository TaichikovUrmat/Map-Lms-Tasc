public class Car {
    private  long id;
    private  int carNamber;

    public Car(long id, int carNamber) {
        this.id = id;
        this.carNamber = carNamber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCarNamber() {
        return carNamber;
    }

    public void setCarNamber(int carNamber) {
        this.carNamber = carNamber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", carNamber=" + carNamber +
                '}';
    }
}
