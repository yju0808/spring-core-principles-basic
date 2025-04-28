
package hello.core.singleton;

public class SingletonService {

    // 1. static 영역에 객체를 딱 1개만 생성
    private static final SingletonService instance = new SingletonService();

    // 2. public으로 열어서, static 메서드를 통해서만 조회 가능
    public static SingletonService getInstance() {
        return instance;
    }

    // 3. 생성자를 private로 막아서, 외부에서 new 키워드로 객체를 생성할 수 없도록 막음
    private SingletonService() {
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}