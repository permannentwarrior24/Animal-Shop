package src;

/**
 * @author 112200338周嘉裕
 * @date 2022/12/4
 */
public class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException() {
        super();
    }

    public InsufficientBalanceException(String s) {
        super(s);
    }
}
