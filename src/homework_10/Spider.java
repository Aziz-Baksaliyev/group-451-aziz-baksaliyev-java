package homework_10;

public class Spider extends Monster implements Attackable, Defendable, SpecialAbility {
    public Spider(String name) { super(name, 16); }

    @Override
    public void attack() { System.out.println(name + " прыгает на голову и кусает!"); }
    @Override
    public void defend() { System.out.println(name + " быстро лезет по стене вверх."); }
    @Override
    public void useSpecial() { System.out.println(name + " опутывает цель паутиной!"); }
}