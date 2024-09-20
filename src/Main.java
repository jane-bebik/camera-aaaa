public class Main {
    public static void main(String[] args) {
        // Create a Camera object with valid inputs
        Camera camera = new Camera("Canon", "EOS 90D", 1199.99, 32);

        // Print out the details to verify it works
        System.out.println("Brand: " + camera.getBrand());
        System.out.println("Model: " + camera.getModel());
        System.out.println("Price: $" + camera.getPrice());
        System.out.println("Resolution: " + camera.getResolution() + " MP");

        // Test invalid input to trigger validation
        try {
            camera.setPrice(-500); // This should throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Caught validation error: " + e.getMessage());
        }
    }
}