package Task_1_9.Runners;

public class Cat extends Runner {

    private int total;

    public Cat(String name, int runDistance, int jumpHeight) {
        super(name, runDistance, jumpHeight);
    }


    @Override
    public void run() {
        total++;
        System.out.printf("Cat %s can run\nOvercome %d obstacle\n\n",
                super.getName(), total);
    }

    @Override
    public void jump() {
        total++;
        System.out.printf("Cat %s can jump\nOvercome %d obstacle\n\n",
                super.getName(), total);
    }
}
