package homework_10;

public class Vampire extends Monster implements Attackable, Defendable, SpecialAbility {
    public Vampire(String name) { super(name, 80); }

    @Override
    public void attack() { System.out.println(name + " впивается клыками в шею!"); }
    @Override
    public void defend() { System.out.println(name + " превращается в стаю летучих мышей."); }
    @Override
    public void useSpecial() { System.out.println(name + " восстанавливает здоровье за счет крови врага."); }
}
