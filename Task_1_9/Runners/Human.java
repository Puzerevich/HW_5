package Task_1_9.Runners;

public class Human extends Runner {

    public int total;

    public Human(String name, int runDistance, int jumpHeight) {
        super(name, runDistance, jumpHeight);
    }

    @Override
    public void run() {
        total++;
        System.out.printf("Human %s can run\nOvercome %d obstacle\n\n",
                super.getName(), total);
    }

    @Override
    public void jump() {
        total++;
        System.out.printf("Human %s can jump\nOvercome %d obstacle\n\n",
                super.getName(), total);
    }

}
