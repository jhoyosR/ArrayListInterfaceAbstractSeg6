package libroEj3;

import java.util.ArrayList;

public class InstituteDAO extends InstituteAbs{
    public ArrayList<Object> elements;

    public InstituteDAO(){
        elements = new ArrayList<>();
    }
    @Override
    public void addItem(Object element){
        elements.add(element);
    }
    @Override
    public void displayElements(){
        for (Object element : elements){
            System.out.println(element);
        }
    }
}
