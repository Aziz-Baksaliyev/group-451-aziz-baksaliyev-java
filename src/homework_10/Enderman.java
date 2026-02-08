package homework_10;

public class Enderman extends Monster implements Attackable, Defendable, SpecialAbility {
    public Enderman(String name) { super(name, 40); }

    @Override
    public void attack() { System.out.println(name + " быстро бьет длинными руками!"); }
    @Override
    public void defend() { System.out.println(name + " закрылся блоком травы."); }
    @Override
    public void useSpecial() { System.out.println(name + " телепортировался за спину!"); }
}