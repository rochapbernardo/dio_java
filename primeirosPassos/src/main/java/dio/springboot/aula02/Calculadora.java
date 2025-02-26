package dio.springboot.aula02;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
    public int soma(int num1, int num2){
        return num1+num2;
    }
}
