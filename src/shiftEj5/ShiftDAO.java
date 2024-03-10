package shiftEj5;

import java.util.ArrayList;

public class ShiftDAO extends ShiftAbs{
    public ArrayList<Shift> shifts;

    public ShiftDAO() {
        shifts = new ArrayList<>();
    }
    @Override
    public void save(Shift shift){
        shifts.add(shift);
    }
    @Override
    public void showShifts(){
        for (Shift shift : shifts){
            System.out.println(shift);
        }
    }
}