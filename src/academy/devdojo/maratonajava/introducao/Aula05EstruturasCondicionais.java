package academy.devdojo.maratonajava.introducao;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 20;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcólica");
        }

        if(!isAutorizadoComprarBebida)
        System.out.println("Não autorizado a comprar bebida alcólia");

        boolean c = false;
        if(c == true) {
            System.out.println("Dentro de algo quenunca deveser feito");
        }

    System.out.println("fora do if");
    }

}
