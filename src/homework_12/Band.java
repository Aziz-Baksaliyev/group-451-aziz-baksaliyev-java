package homework_12;

public class Band {
    public String bandName;
    public Musician[] members = new Musician[5];
    public int count = 0;

    public Band(String name) {
        this.bandName = name;
    }

    public void addMusician(Musician m) {
        if (count < 5) {
            members[count] = m;
            count = count + 1;
        }
    }

    public void perform() {
        System.out.println("Группа " + bandName + " начинает концерт!");
        for (int i = 0; i < count; i++) {
            members[i].playInstrument();
        }
    }
}