package homework_10;

public class Zombie extends Monster implements Attackable, Defendable, SpecialAbility {
    public Zombie(String name) {
        super(name, 50);
    }

    @Override
    public void attack() {
        System.out.println(name + " медленно идет вперед и кусает за плечо!");
    }

    @Override
    public void defend() {
        System.out.println(name + " не чувствует боли и продолжает стоять.");
    }

    @Override
    public void useSpecial() {
        System.out.println(name + " издает стон и призывает других мертвецов!");
    }
}
