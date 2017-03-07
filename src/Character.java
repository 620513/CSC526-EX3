/**
 * Created by ThelmaAndrews on 03-03-2017.
 */
abstract class Character{
    public WeaponBehavior weapon;
    public abstract void fight();
    public Character(){
        weapon = new KnifeBehavior();
    }
    public void setWeapon(WeaponBehavior w)    {
        this.weapon = w;
    }
}
