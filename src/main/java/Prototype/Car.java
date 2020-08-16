package Prototype;

import java.util.ArrayList;
import java.util.List;

public class Car {
    public static void main(String[] args) throws CloneNotSupportedException {

        Dashboard dashboard = new Dashboard();
        dashboard.setDisplay("Audi Display");
        dashboard.loadData();

        Dashboard dashboard2 = dashboard.clone();
        dashboard.features.remove(2);

        dashboard2.setDisplay("BMW Display");

        System.out.println(dashboard);
        System.out.println(dashboard2);
    }
}

class Dashboard implements Cloneable{
    private String display;
    private int vent;
    List<String> features = new ArrayList<>();
    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public int getVent() {
        return vent;
    }

    public void setVent(int vent) {
        this.vent = vent;
    }

    //say this is loaded from database
    public void loadData(){
        for(int i = 0;i<10;i++){
            features.add("feature:"+i);
        }
    }

    @Override
    public String toString() {
        return "Dashboard{" +
                "display='" + display + '\'' +
                ", vent=" + vent +
                ", features=" + features +
                '}';
    }

    @Override
    protected Dashboard clone() throws CloneNotSupportedException {
        Dashboard dashboard = new Dashboard();
        for(String feature: this.features){
            dashboard.features.add(feature);
        }
        return dashboard;
    }
}
