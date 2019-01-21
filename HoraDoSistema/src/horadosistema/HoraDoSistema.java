package horadosistema;

import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

public class HoraDoSistema {

    public static void main(String[] args) {
        Date relogio = new Date();
        System.out.println("O Horário do Sistema é:");
        System.out.println(relogio);
        System.out.println("--------------");
        System.out.println("O idioma do Sistema é:");
        Locale currentLocale = Locale.getDefault();
        System.out.println(currentLocale.getDisplayLanguage());
        System.out.println("--------------");
        System.out.println("A resolucao da tela:");
         System.out.println(Toolkit.getDefaultToolkit()
            .getScreenSize().width + " x " + Toolkit.getDefaultToolkit()
            .getScreenSize().height); 
    }
}