package Task_1_9.obstacle;

import Task_1_9.Runners.Runner;

public class Wall extends Obstacle {
    public Wall(String name, int size) {
        super(name, size);
    }

    @Override
    public boolean overcome(Runner r) {
        boolean b;
        if (getSize() <= r.getJumpHeight()) {
            System.out.println("Runner "+r.getName()+" overcomes an obstacle"+getName()+". Obstacle size - "+getSize()+" m.\n");
            b = true;
            r.jump();
        } else {
            System.out.printf("Runner"+r.getName()+" drops out of obstacle course "+getName()+". Obstacle size - "+getSize()+" m.\n");
            b = false;
        }
        return b;
    }
}
