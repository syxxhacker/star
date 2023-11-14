import java.util.Scanner;

public class LoveCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("问题A：你最近是否经常感到忐忑不安？");
        System.out.println("1. 是的，经常");
        System.out.println("2. 从不");
        System.out.println("3. 偶尔");
        int answerA = scanner.nextInt();

        if (answerA == 1) {
            questionB();
        } else if (answerA == 2) {
            questionC();
        } else if (answerA == 3) {
            questionD();
        }
    }

    public static void questionB() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("问题B：你是否经常提醒自己保持形象？");
        System.out.println("1. 是的，经常");
        System.out.println("2. 从不");
        System.out.println("3. 偶尔");
        int answerB = scanner.nextInt();

        if (answerB == 1) {
            questionE();
        } else if (answerB == 2) {
            questionC();
        } else if (answerB == 3) {
            questionD();
        }
    }

    public static void questionC() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("问题C：你最近是否经常会因为TA失眠？");
        System.out.println("1. 是的，经常");
        System.out.println("2. 从不");
        System.out.println("3. 偶尔");
        int answerC = scanner.nextInt();

        if (answerC == 1) {
            questionF();
        } else if (answerC == 2) {
            questionE();
        } else if (answerC == 3) {
            questionD();
        }
    }

    public static void questionD() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("问题D：你是否经常感到无助？");
        System.out.println("1. 是的，经常");
        System.out.println("2. 从不");
        System.out.println("3. 偶尔");
        int answerD = scanner.nextInt();

        if (answerD == 1) {
            questionG();
        } else if (answerD == 2) {
            questionF();
        } else if (answerD == 3) {
            questionE();
        }
    }

    public static void questionE() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("问题E：你认为自己配得上TA吗？");
        System.out.println("1. 是的，经常");
        System.out.println("2. 从不");
        System.out.println("3. 偶尔");
        int answerE = scanner.nextInt();

        if (answerE == 1) {
            questionF();
        } else if (answerE == 2) {
            questionG();
        } else if (answerE == 3) {
            questionH();
        }
    }

    public static void questionF() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("问题F：你是否经常幻想和TA在一起的日子？");
        System.out.println("1. 是的，经常");
        System.out.println("2. 从不");
        System.out.println("3. 偶尔");
        int answerF = scanner.nextInt();

        if (answerF == 1) {
            questionG();
        } else if (answerF == 2) {
            questionH();
        } else if (answerF == 3) {
            questionI();
        }
    }

    public static void questionG() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("问题G：你最近是否经常傻笑？");
        System.out.println("1. 是的，经常");
        System.out.println("2. 从不");
        System.out.println("3. 偶尔");
        int answerG = scanner.nextInt();

        if (answerG == 1) {
            questionI();
        } else if (answerG == 2) {
            questionJ();
        } else if (answerG == 3) {
            resultOne();
        }
    }

    public static void questionH() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("问题H：TA是否有关注到你？");
        System.out.println("1. 不清楚");
        System.out.println("2. 有关注到");
        System.out.println("3. 没有");
        int answerH = scanner.nextInt();

        if (answerH == 1) {
            resultThree();
        } else if (answerH == 2) {
            questionJ();
        } else if (answerH == 3) {
            resultFour();
        }
    }

    public static void questionI() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("问题I：TA对你的态度？");
        System.out.println("1. 无视");
        System.out.println("2. 拒绝");
        System.out.println("3. 正常");
        int answerI = scanner.nextInt();

        if (answerI == 1) {
            questionJ();
        } else if (answerI == 2) {
            resultOne();
        } else if (answerI == 3) {
            resultTwo();
        }
    }

    public static void questionJ() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("问题J：你是否保持自信，在对方面前展现真正的自己？");
        System.out.println("1. 是的");
        System.out.println("2. 不是");
        int answerJ = scanner.nextInt();

        if (answerJ == 1) {
            resultOne();
        } else if (answerJ == 2) {
            resultTwo();
        }
    }

    public static void resultOne() {
        System.out.println("结果一：对方喜欢你");
        System.out.println("TA对你有一定的好感，你们的关系有进一步发展的可能。继续保持自信，展现真实的自己，加强与TA的交流和互动，或许会有更多的机会和可能性。");
    }

    public static void resultTwo() {
        System.out.println("结果二：对方不喜欢你");
        System.out.println("可能你的方式并不能引起TA心中的波澜，也可能TA对你本身不感兴趣，因此你再主动也不能让TA改变心意，所以如果TA一直对你的示好没有反应或已经表示拒绝，适可而止、保持距离可能是最恰当、最礼貌的解决方案，不要灰心，也许身边也有其他喜欢你的人呢。");
    }

    public static void resultThree() {
        System.out.println("结果三：对方可能喜欢你");
        System.out.println("TA对你可能有喜欢的感觉，但不如你来的那么强烈，因此你的表现在很大程度上决定你们是否展开恋情，也许你的一个举动会增加TA对你的好感，进而关系更进一步，也许机缘不凑巧TA对你的好感度降低。所以在表现更好的自己的同时，抱着一颗平常心也是一个不错的选择。");
    }

    public static void resultFour() {
        System.out.println("结果四：对方可能不喜欢你");
        System.out.println("TA可能没有明确表达自己的想法，其实TA的内心对你没有太大的感觉，因此你的一厢情愿不太能打动对方。如果你想要此事有很大的改观，那你需要好好花时间去了解TA，并发展你们连接情感的共同话题或爱好，被动独自暗恋可能会使对方不能感受到你的心意。");
    }
}
