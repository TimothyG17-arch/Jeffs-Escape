import java.util.HashMap;

public class Locations
{

    HashMap<String, Area> map = new HashMap<String, Area>();

    public void addArea(String name, Area area){
        map.put(name, area);
    }
    public void getArea(String name){
        System.out.println(map.get(name));
    }

    public void getAllRooms(){
        for (String i : map.keySet()) {
            System.out.println(i);
        }
    }

    public Locations() {
        this.map = map;
    }
}
