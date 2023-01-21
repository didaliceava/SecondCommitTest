package JavaIntermediate.Singleton;

public class TestSingleton {


    public static void main(String[] args) {
        LearnSingleton obj  =  LearnSingleton.getObj();
        LearnSingleton obj2 = LearnSingleton.getObj();
        System.out.println(obj);
        System.out.println(obj2);


    }
}
