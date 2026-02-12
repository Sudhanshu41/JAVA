package in.abstraction;

public abstract class  Vehicle implements Transport{
    private int noOfTyre;
    public abstract void makeStartSound();
//    public void getSetGo();
    public Vehicle(int noOfTyre) {
        this.noOfTyre = noOfTyre;
    }

    @Override
    public void getSetGo() {
        System.out.println("Going to place!");
    }

    public int getNoOfTyre() {
        return noOfTyre;
    }

    public void setNoOfTyre(int noOfTyre) {
        this.noOfTyre = noOfTyre;
    }
    public void commute(){
        System.out.println("going!");
    }
}
