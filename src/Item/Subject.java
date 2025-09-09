package Item;

public class Subject {
    private String id;
    private String name;
    private int unit; // จำนวนหน่วยกิต

    // Constructor
    public Subject(String id, String name, int unit) {
        this.id = id;
        this.name = name;
        this.unit = unit;
    }

    // Getter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getUnit() {
        return unit;
    }

    // (Optional) toString สำหรับ debug
    @Override
    public String toString() {
        return id + " - " + name + " (" + unit + " หน่วยกิต)";
    }
}
