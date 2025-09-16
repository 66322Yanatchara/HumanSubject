package Item;

public class Subject {
    private String id;
    private String name;
    private int units;

    public Subject() {}

    public Subject(String id, String name, int units) {
        this.id = id;
        this.name = name;
        this.units = units;
    }

    // getters
    public String getId()    { return id; }
    public String getName()  { return name; }
    public int getUnits()    { return units; }

    // (รองรับโค้ดเดิมที่เรียก getUnit())
    public int getUnit()     { return units; }

    // setters (ตามสไตล์ที่อาจารย์ใช้ในคลาส)
    public void setId(String id)       { this.id = id; }
    public void setName(String name)   { this.name = name; }
    public void setUnits(int units)    { this.units = units; }
    // (รองรับโค้ดเดิมที่เรียก setUnit())
    public void setUnit(int units)     { this.units = units; }

    @Override
    public String toString() {
        return id + " - " + name + " (" + units + " หน่วยกิต)";
    }
}
