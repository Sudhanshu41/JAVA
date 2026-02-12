package in.darkdevil.Inheritance;

import in.darkdevil.TwoWheeler;

public class InheritanceTest {
    public static void main(String[] args) {
        TwoWheeler tw = new TwoWheeler();
        tw.commute();
        Vehicle ve = new Vehicle();
        ve.commute();
        MotorCycle mc = new MotorCycle();
        mc.Balance();
        mc.commute();
    }
}
