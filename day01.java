class Cat{
    static void sleep(){
    }
}

public class TestDemo {

    public static void mystery(int x){
        System.out.print(x%10);
        if((x/10)!=0){
            mystery(x/10);
        }
        System.out.print(x%10);
    }
    public static void main2(String[] args) {
        //Cat.sleep();
        mystery(1234);
    }

    public static void main1(String[] args) {
        int x = 20;
        int y = 5;
        System.out.println(x+y + ""+(x+y)+y);
    }
}
