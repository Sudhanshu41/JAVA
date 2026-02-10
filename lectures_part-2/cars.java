public class cars {
    int noOFWheels;
    int noOfDoors;
    int maxSpeed;
    String name;
    String modelNumber;
    String company;

    public cars(int noOFWheels, int noOfDoors, int maxSpeed, String name, String modelNumber, String company) {
        this.noOFWheels = noOFWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("cars{");
        sb.append("noOFWheels=").append(noOFWheels);
        sb.append(", noOfDoors=").append(noOfDoors);
        sb.append(", maxSpeed=").append(maxSpeed);
        sb.append(", modelNumber='").append(modelNumber).append('\'');
        sb.append(", company='").append(company).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        cars swift = new cars(4,4,120,"swift","wsfgd","suzuki");
        System.out.println(swift);
    }
}
