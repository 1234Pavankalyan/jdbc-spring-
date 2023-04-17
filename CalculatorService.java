
package helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CalculatorService {
private MathService mathService;
@Autowired
public void setMathService(MathService mathService) {
	this.mathService=mathService;
}
public int  add(int a, int b) {
    return mathService.add(a, b);
}

public int subtract(int a, int b) {
    return mathService.subtract(a,b);
}

public int multiply(int a, int b) {
    return mathService.multiply(a, b);
}

public int divide(int a, int b) {
    return mathService.divide(a, b);
}
}
