package homework_10;

public class Dragon extends Monster implements Attackable, Defendable, SpecialAbility {
    public Dragon(String name) { super(name, 500); }

    @Override
    public void attack() { System.out.println(name + " изрыгает поток пламени!"); }
    @Override
    public void defend() { System.out.println(name + " прикрылся чешуей как броней."); }
    @Override
    public void useSpecial() { System.out.println(name + " взмывает в небо и бьет хвостом!"); }
}