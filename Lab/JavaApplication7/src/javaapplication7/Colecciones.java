
package javaapplication7;

import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class Colecciones {
    private ArrayList<Afiliado> afiliados=new ArrayList<Afiliado>();
    
    
    
    public ArrayList<Afiliado> getAfiliados() {
        return afiliados;
    }

    public void setAfiliados(Afiliado a) {
        afiliados.add(a);
    }
}
