public abstract class Hardware {
    protected int id;
    protected String brand;
    protected int spec;

    public Hardware(int id, String brand, int spec) {
        this.id = id;
        this.brand = brand;
        this.spec = spec;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public int getSpec() { return spec; }
    public void setSpec(int spec) { this.spec = spec; }

    public abstract String interpretSpec();

    @Override
    public String toString() {
        return "ID: " + id + " | Brand: " + brand + " | Spec: " + interpretSpec();
    }
}
