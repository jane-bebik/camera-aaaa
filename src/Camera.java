public class Camera {
    private String brand;
    private String model;
    private double price;
    private int resolution;

    public Camera(String brand, String model, double price, int resolution) {
        setBrand(brand);
        setModel(model);
        setPrice(price);
        setResolution(resolution);
    }
    // this get the configs
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
// forget it did worked!
    public int getResolution() {
        return resolution;
    }


    public void setBrand(String brand) {
        if (brand == null || brand.trim().isEmpty()) {
            throw new IllegalArgumentException("Brand cannot be null or empty.");
        }
        this.brand = brand;
    }

    public void setModel(String model) {
        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException("Model cannot be null or empty.");
        }
        this.model = model;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than zero.");
        }
        this.price = price;
    }

    public void setResolution(int resolution) {
        if (resolution <= 0) {
            throw new IllegalArgumentException("Resolution must be a positive integer.");
        }
        this.resolution = resolution;
    }
}
// ok now i need to figure it out how to turn this into a desktop app....
