package week05;

class Creature {
    protected String name;
    protected String habitat;

    public Creature(String name, String habitat) {
        this.name = name;
        this.habitat = habitat;
    }

    public String move() {
        return name + " 正在水中移動";
    }

    public String eat() {
        return name + " 正在覓食";
    }

    public String describe() {
        return name + " (" + habitat + ")";
    }

    public final String kingdom() {
        return "動物界";
    }

    public String feed() {
        return name + " 正在覓食";
    }

    public String feed(String food) {
        return name + " 正在吃 " + food;
    }

    public String feed(String food, int amount) {
        return name + " 吃了 " + amount + " 份 " + food;
    }
}

class Shark extends Creature {
    public Shark(String name, String habitat) {
        super(name, habitat);
    }

    @Override
    public String move() {
        return name + " 高速衝刺獵食";
    }

    @Override
    public String eat() {
        return name + " 撕咬獵物";
    }
}

class Turtle extends Creature {
    public Turtle(String name, String habitat) {
        super(name, habitat);
    }

    @Override
    public String move() {
        return name + " 緩慢划動四肢";
    }

    @Override
    public String eat() {
        return name + " 啃食海草";
    }
}

class Dolphin extends Creature {
    public Dolphin(String name, String habitat) {
        super(name, habitat);
    }

    @Override
    public String move() {
        return name + " 躍出水面";
    }

    @Override
    public String eat() {
        return name + " 合作圍捕魚群";
    }
}

class Octopus extends Creature {
    public Octopus(String name, String habitat) {
        super(name, habitat);
    }

    @Override
    public String move() {
        return name + " 噴射水流推進";
    }

    @Override
    public String eat() {
        return name + " 用觸手捕捉獵物";
    }
}

public class MarineEcosystem {
    public static void main(String[] args) {
        final int OCEAN_DEPTH = 11034;
        System.out.println("海洋最深處：" + OCEAN_DEPTH + " 公尺\n");

        Creature[] ecosystem = {
            new Shark("大白鯊", "深海"),
            new Turtle("綠蠵龜", "珊瑚礁"),
            new Dolphin("瓶鼻海豚", "近海"),
            new Octopus("藍環章魚", "礁岩區")
        };

        for (Creature c : ecosystem) {
            System.out.println(c.describe());
            System.out.println("  分類：" + c.kingdom());
            System.out.println("  移動：" + c.move());
            System.out.println("  覓食：" + c.eat());
            System.out.println("  餵食：" + c.feed());
            System.out.println("  餵食：" + c.feed("小魚"));
            System.out.println("  餵食：" + c.feed("小魚", 3));
            System.out.println();
        }
    }
}
