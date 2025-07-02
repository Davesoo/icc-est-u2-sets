package utils;

import java.util.Comparator;

import models.Contacto;

public class ContactoComparador implements Comparator<Contacto>{

    @Override
    public int compare(Contacto o1, Contacto o2) {
        // TODO Auto-generated method stub

        int resultComparicionApellido = o1.getApellido().compareToIgnoreCase(o2.getApellido());
        if (resultComparicionApellido != 0){
            return resultComparicionApellido;
        }

        int resultComparacionNombre = o1.getNombre().compareToIgnoreCase(o2.getNombre());
        if (resultComparacionNombre != 0){
            return resultComparacionNombre;
        }

        return 0;
    }    
}
