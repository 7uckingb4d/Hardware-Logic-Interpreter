import java.util.ArrayList;

public class HardwareRepository {

    private ArrayList<Hardware> hardwareList;

    public HardwareRepository() {
        hardwareList = new ArrayList<>();
    }

    public void fetchData() {
        hardwareList.add(new Laptop(1,  "Dell XPS 13",    16));
        hardwareList.add(new Phone( 2,  "Samsung S24",    50));
        hardwareList.add(new Laptop(3,  "MacBook Pro",    32));
        hardwareList.add(new Phone( 4,  "iPhone 15",      48));
        hardwareList.add(new Laptop(5,  "ASUS Zenbook",   16));
        hardwareList.add(new Phone( 6,  "Google Pixel 8", 50));
        hardwareList.add(new Laptop(7,  "Lenovo Legion",  32));
        hardwareList.add(new Phone( 8,  "Huawei P60",     48));
        hardwareList.add(new Laptop(9,  "HP Spectre",     16));
        hardwareList.add(new Phone( 10, "Sony Xperia",    16));
    }

    public ArrayList<Hardware> getHardwareList() {
        return hardwareList;
    }
}
