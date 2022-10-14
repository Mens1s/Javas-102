package E_MaceraOyunu;

import java.util.Random;

public class Snake extends Obstacle{
    Random rd = new Random();
    public Snake() {
        super(  3, 12, "Snake", 0, 12);

        this.setDamage(rd.nextInt(3) + 3);
    }


}
