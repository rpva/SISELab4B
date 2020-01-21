package cs.calc.server;

import javax.jws.WebService;
import java.util.concurrent.atomic.AtomicInteger;

@WebService
public class Calculator {
    AtomicInteger last = new AtomicInteger(0);

    public int last(){
        return last.get();
    }

    public int sum(int a, int b){
        int x = a+b;
        last.set(x);
        return x;
    }

    public int mul(int a, int b){
        int x = a*b;
        last.set(x);
        return x;
    }
}
