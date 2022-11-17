package Task_1_9.obstacle;

import Task_1_9.Runners.Runner;

public class RaceTrack  extends Obstacle {

    public RaceTrack(String name, int size) {
        super(name, size);
    }

    @Override
    public boolean overcome(Runner r) {
        boolean b;
        if (getSize() <= r.getRunDistance()) {
            System.out.println("Runner "+r.getName()+" overcomes an obstacle"+getName()+". Obstacle size - "+getSize()+" m.\n");
            r.run();
            b = true;
        } else {
            System.out.printf("Runner"+r.getName()+" drops out of obstacle course "+getName()+". Obstacle size - "+getSize()+" m.");
            b = false;
        }
        return b;
    }
}
