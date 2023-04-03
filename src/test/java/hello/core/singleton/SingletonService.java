package hello.core.singleton;

public class SingletonService {

    // 자기 자신을 정적 필드로 소유
    private static final SingletonService instance = new SingletonService();

    private SingletonService() {} // private 생성자

    public static SingletonService getInstance() {
        return instance;
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }

}
