class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

class GoodsBogie {
    private String shape;
    private String cargoType;

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    public void assignCargo(String cargo) {
        try {
            // Safety check
            if (shape.equalsIgnoreCase("Rectangular") && cargo.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException("Unsafe! Cannot assign Petroleum to Rectangular Bogie.");
            }

            // Safe assignment
            this.cargoType = cargo;
            System.out.println("✅ Cargo '" + cargo + "' assigned to " + shape + " bogie.");

        } catch (CargoSafetyException e) {
            // Handle exception
            System.out.println("❌ Error: " + e.getMessage());

        } finally {
            // Always executes
            System.out.println("🔄 Assignment attempt completed for " + shape + " bogie.\n");
        }
    }

    public String getCargoType() {
        return cargoType;
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("🚆 Train Consist Management System - UC15\n");

        // ✅ Safe case
        GoodsBogie bogie1 = new GoodsBogie("Cylindrical");
        bogie1.assignCargo("Petroleum");

        // ❌ Unsafe case (handled)
        GoodsBogie bogie2 = new GoodsBogie("Rectangular");
        bogie2.assignCargo("Petroleum");

        // ✅ Program continues
        GoodsBogie bogie3 = new GoodsBogie("Rectangular");
        bogie3.assignCargo("Coal");

        System.out.println("🚆 System continues running after exception handling!");
    }
}