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

    private void itemLook(){
        //will search room and look for items in the current room
    }
    private void cardLook(){
        //will look for key cards for accessing the next area in current room
    }
    private void enemyLook(){
        //looks for enemies inside current room
    }
}
