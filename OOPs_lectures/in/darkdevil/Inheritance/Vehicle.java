package in.darkdevil.Inheritance;

public class Vehicle {
    protected int numberOfTyres;

    public void setNumberOfTyres(int numberOfTyres) {
        this.numberOfTyres = numberOfTyres;
    }

    public void commute(){
        System.out.printf("I am going from place a to place b using %d tyres\n",numberOfTyres);

    }
}
