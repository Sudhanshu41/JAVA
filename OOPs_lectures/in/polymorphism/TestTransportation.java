package in.polymorphism;

public class TestTransportation {
    public static void main(String[] args) {
        Car c = new Car();
        Vehicle cv = new Car();
//        Vehicle v = new Vehicle();
        castTest(c);
        castTest(cv);// humne castTest mai chahe Vechicle kyo na dalo ho but call krte time usse ya toh vehicle chyie ya fir uska koi bacha bhi chlega..   \
        // castTest(v) isiliye nhi chlega kyonki is method mai humne downcast krke sirf Car ka obj banaya Vehicle ka nhi
    }
    private static void castTest(Vehicle veh){
//        Car cveh = (Car) veh;
//        cveh.noOfDoors();
//        cveh.start();
        veh.start();
//
//👉  Method Vehicle accept karta hai ✔
//👉 BUT andar tum force se Car bana rahe ho ❗
//👉 Isliye jo object pass hoga wo actually Car hona chahiye

    }
}
