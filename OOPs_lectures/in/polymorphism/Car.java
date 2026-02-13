package in.polymorphism;

 class Car implements Vehicle{
    public int noOfDoors(){
        return 5;
    }

    @Override
    public void start() {
        System.out.println("Car is starting!!");
    }
//    ❗ Sabse important rule
//
//👉 static method OVERRIDE nahi hota
//👉 static method method hiding karta hai
//
//⚠️ Isliye tu real overriding nahi kar pa raha.
//
//             🔥 Override karne ke liye kya change kare?
//
//             ✅ Parent method ko non-static bana
//✅ Child me @Override use kar
}
