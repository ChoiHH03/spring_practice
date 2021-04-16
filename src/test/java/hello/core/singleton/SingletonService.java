package hello.core.singleton;

public class SingletonService {
    //유일한 인스턴스를 private static final로 만들어준다
    private static final SingletonService instance = new SingletonService();

    //메서드로 해당 인스턴스를 외부에서 불러올 수 있게 만든다
    public static SingletonService getInstance() {
        return instance;
    }

    //생성자로 새로운 인스턴스를 만들지 못하게 private로 막아준다
    private SingletonService() {
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
