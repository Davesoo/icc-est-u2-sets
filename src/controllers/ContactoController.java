package controllers;

import java.util.*;

import models.Contacto;
import utils.ContactoComparador;
import utils.ContactoComparadorHash;
import utils.ContactoComparadorNumeros;

public class ContactoController {

    public ContactoController(){

    }

    public void runTreeContacto(){
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparador());

        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Pedro", "Gonzales", "222222222"));
        agenda.add(new Contacto("Pablo", "Lopez", "222222222"));

        for(Contacto contacto : agenda){
            System.out.println(contacto);
        }
    }

    public void runTreeContactoNumeros(){
        Set<Contacto> agenda2 = new TreeSet<>(new ContactoComparadorNumeros());

        agenda2.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda2.add(new Contacto("Luis", "Perez", "111111111"));
        agenda2.add(new Contacto("Ana", "Perez", "987654321"));
        agenda2.add(new Contacto("Pedro", "Lopez", "123456789"));
        agenda2.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda2.add(new Contacto("Pedro", "Gonzales", "222222222"));
        agenda2.add(new Contacto("Pablo", "Lopez", "222222222"));

        for(Contacto contacto : agenda2){
            System.out.println(contacto);
        }
    }

    public void runTreeContactoHash(){
        Set<Contacto> agenda2 = new TreeSet<>(new ContactoComparadorHash());

        agenda2.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda2.add(new Contacto("Luis", "Perez", "111111111"));
        agenda2.add(new Contacto("Ana", "Perez", "987654321"));
        agenda2.add(new Contacto("Pedro", "Lopez", "123456789"));
        agenda2.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda2.add(new Contacto("Pedro", "Gonzales", "222222222"));
        agenda2.add(new Contacto("Pablo", "Lopez", "222222222"));

        for(Contacto contacto : agenda2){
            System.out.println(contacto);
        }
    }
}
