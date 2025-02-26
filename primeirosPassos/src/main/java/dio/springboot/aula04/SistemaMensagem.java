package dio.springboot.aula04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem {
    @Autowired
    private Remetente noreply;
    @Autowired
    private Remetente teachTeam;

    public void enviarConfirmacaoCadatro(){
        System.out.println(noreply);
        System.out.println("Seu cadastro foi aprovado.");
    }
    public void enviarMsgBoasVindas(){
        teachTeam.setEmail("tech@dio.com.br");
        System.out.println(teachTeam);
        System.out.println("Bem-vindo à tech elite");
    }
}
