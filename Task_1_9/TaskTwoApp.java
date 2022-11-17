package Task_1_9;

import Task_1_9.Runners.Cat;
import Task_1_9.Runners.Human;
import Task_1_9.Runners.Robot;
import Task_1_9.Runners.Runner;
import Task_1_9.obstacle.Obstacle;
import Task_1_9.obstacle.RaceTrack;
import Task_1_9.obstacle.Wall;

public class TaskTwoApp {
    public static void main(String[] args) {
        Obstacle[] obstacles;
        Runner[] runners;

        Runner oleg = new Human("Oleg", 1500, 2);
        Runner olga = new Human("Olga", 2500, 3);
        Runner verter = new Robot("verter", 10000, 20);
        Runner barsik = new Cat("Barsik", 500, 2);
        Obstacle racetrack = new RaceTrack("racetrack", 500);
        Obstacle racetrack2 = new RaceTrack("racetrack", 1500);
        Obstacle racetrack3 = new RaceTrack("racetrack", 2000);
        Obstacle racetrack4 = new RaceTrack("racetrack", 3000);

        Obstacle wall = new Wall("wall", 2);
        Obstacle wall1 = new Wall("wall", 1);
        Obstacle wall2 = new Wall("wall", 3);
        Obstacle wall3 = new Wall("wall", 4);

        obstacles = new Obstacle[]{racetrack, wall, racetrack2, wall1, racetrack3,
                wall2, racetrack4, wall3};
        runners = new Runner[]{oleg, barsik, olga, verter};

            for (Runner r : runners) {
                for (Obstacle o : obstacles) {
                    if (!o.overcome(r)) {
                        break;
                    }
                }
            }

    }
}
