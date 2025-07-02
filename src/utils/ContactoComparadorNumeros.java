package utils;

import java.util.Comparator;

import models.Contacto;

public class ContactoComparadorNumeros implements Comparator<Contacto>{

    @Override
    public int compare(Contacto o1, Contacto o2) {
        // TODO Auto-generated method stub

        int resultComparacionNombre = o2.getNombre().compareToIgnoreCase(o1.getNombre());
        if (resultComparacionNombre != 0){
            return resultComparacionNombre;
        }

        int resultComparicionApellido = o1.getApellido().compareToIgnoreCase(o2.getApellido());
        if (resultComparicionApellido != 0){
            return resultComparicionApellido;
        }

        int resultComparacionTelefono = o1.getTelefono().compareToIgnoreCase(o2.getTelefono());
        if (resultComparacionTelefono != 0){
            return resultComparacionTelefono;
        }

        return 0;
    }

}
