/* este tipo de excecao vc sabe que tem um exececao mais o sistema informa que não precisar ser tratada pelo programadador 
public class ExmploExcecao {
    public static void main(String[] args) {
        Number valor = Double.valueOf("a1.75"); // esta execçao que pode acontecer nos desenvolvedores não preocupamos com o q vai acontecer.
        System.out.println(valor); // não é possivel validar antes de apresentar o erro para tratar
    }

}
*/

import java.text.NumberFormat;
import java.text.ParseException;

public class ExmploExcecao {
    public static void main(String[] args) {
        Number valor;

        try { // ele quer quizer que try tenta converter a strinh a1.75 para o valor se ele
              // não der certo o metodo já diz q ele precisa tratar usando a ParseException
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);

        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }

    }

}
