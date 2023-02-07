package Character;

public interface IDamageable {

    void maxHealth();
    double health();
    boolean isDead();
    void receivesDamage(double amount);
    void heals(double amount);

}
