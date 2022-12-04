package src;

/**
 * @author 112200338周嘉裕
 * @date 2022/12/4
 */
public class AnimalNotFountException extends RuntimeException {
    public AnimalNotFountException() {
        super();
    }

    public AnimalNotFountException(String s) {
        super(s);
    }
}
