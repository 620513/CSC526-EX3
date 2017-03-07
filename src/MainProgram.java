import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by ThelmaAndrews on 03-03-2017.
 */
public class MainProgram {
    public static void main(String args[]){
        for(int in = 0; in < 12; in++){
            new Thread(new RoundRobinBeaviors()).start();
        }
    }
}
class RoundRobinBeaviors implements Runnable{
    @Override
    public void run(){
        Queen queen=new Queen();
        final String weaponbehaviors = "ABKS";
        final int n=weaponbehaviors.length();
        Random random=new Random();
        char weapontype=weaponbehaviors.charAt(random.nextInt(n));
        if(weapontype=='A'){
            queen.setWeapon(new AxeBehavior());
            queen.fight();
        }
        if(weapontype=='K'){
            queen.setWeapon(new KnifeBehavior());
            queen.fight();
        }
        if(weapontype=='B'){
            queen.setWeapon(new BowAndArrowBehavior());
            queen.fight();
        }
        if(weapontype=='S'){
            queen.setWeapon(new SwordBehavior());
            queen.fight();
        }
    }
}
