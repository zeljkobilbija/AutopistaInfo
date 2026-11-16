package com.zeljkobilbija001.autopistainfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Spisak autoputeva po zemljama (DE, FR, IT – JSON-i iz AutobahnInfo, AutoroutesInfo i AutostradeInfo; NL, BE, LU). Novi autoput: dodaj JSON u assets/autoputevi
 * (node alati/benelux_skripta.js NL-A2) i upiši ime datoteke umesto null ("autoputevi/nl-a2.json").
 * Za Belgiju se u nazivu rute navodi i evropska oznaka (E40), jer je na tablama češća od A-broja.
 */
public final class Autoputevi {

    private Autoputevi() { }

    public static final List<Autoput> SVE = Arrays.asList(
            new Autoput("ES", "AP-7", "La Jonquera – Barcelona – Valencia – Alicante – Málaga", "autoputevi/es-ap-7.json"),
            new Autoput("ES", "AP-2", "Zaragoza – Lleida – El Vendrell", "autoputevi/es-ap-2.json"),
            new Autoput("ES", "AP-68", "Bilbao – Logroño – Zaragoza", "autoputevi/es-ap-68.json"),
            new Autoput("ES", "AP-1", "Irún – Vitoria-Gasteiz – Burgos", "autoputevi/es-ap-1.json"),
            new Autoput("ES", "AP-6", "Villalba – Adanero", "autoputevi/es-ap-6.json"),
            new Autoput("ES", "AP-9", "Ferrol – A Coruña – Santiago – Vigo", "autoputevi/es-ap-9.json"),
            new Autoput("ES", "AP-4", "Sevilla – Jerez – Cádiz", "autoputevi/es-ap-4.json"),
            new Autoput("ES", "AP-15", "Tudela – Pamplona", "autoputevi/es-ap-15.json"),
            new Autoput("ES", "AP-8", "Irún – San Sebastián – Bilbao", "autoputevi/es-ap-8.json"),
            new Autoput("ES", "AP-71", "León – Astorga", "autoputevi/es-ap-71.json"),
            new Autoput("ES", "AP-66", "Campomanes – León", "autoputevi/es-ap-66.json"),
            new Autoput("ES", "AP-61", "San Rafael – Segovia", "autoputevi/es-ap-61.json"),
            new Autoput("ES", "AP-51", "Villacastín – Ávila", "autoputevi/es-ap-51.json"),
            new Autoput("ES", "AP-36", "Ocaña – La Roda", "autoputevi/es-ap-36.json"),
            new Autoput("ES", "AP-41", "Madrid – Toledo", "autoputevi/es-ap-41.json"),
            new Autoput("ES", "AP-53", "Santiago – Lalín", "autoputevi/es-ap-53.json"),
            new Autoput("ES", "A-1", "Madrid – Burgos – Vitoria-Gasteiz", "autoputevi/es-a-1.json"),
            new Autoput("ES", "A-2", "Madrid – Zaragoza – Lleida – Barcelona", "autoputevi/es-a-2.json"),
            new Autoput("ES", "A-3", "Madrid – Albacete – Valencia", "autoputevi/es-a-3.json"),
            new Autoput("ES", "A-4", "Madrid – Córdoba – Sevilla – Cádiz", "autoputevi/es-a-4.json"),
            new Autoput("ES", "A-5", "Madrid – Mérida – Badajoz", "autoputevi/es-a-5.json"),
            new Autoput("ES", "A-6", "Madrid – Benavente – Lugo – A Coruña", "autoputevi/es-a-6.json"),
            new Autoput("ES", "A-7", "Barcelona – Valencia – Murcia – Málaga – Algeciras", "autoputevi/es-a-7.json"),
            new Autoput("ES", "A-8", "Irún – Bilbao – Santander – Oviedo – Ribadeo", "autoputevi/es-a-8.json"),
            new Autoput("ES", "A-11", "Soria – Valladolid – Zamora", "autoputevi/es-a-11.json"),
            new Autoput("ES", "A-15", "Medinaceli – Soria – Pamplona", "autoputevi/es-a-15.json"),
            new Autoput("ES", "A-23", "Sagunto – Teruel – Zaragoza – Huesca", "autoputevi/es-a-23.json"),
            new Autoput("ES", "A-31", "Madrid – Albacete – Alicante", "autoputevi/es-a-31.json"),
            new Autoput("ES", "A-30", "Albacete – Murcia – Cartagena", "autoputevi/es-a-30.json"),
            new Autoput("ES", "A-44", "Bailén – Jaén – Granada – Motril", "autoputevi/es-a-44.json"),
            new Autoput("ES", "A-45", "Córdoba – Málaga", "autoputevi/es-a-45.json"),
            new Autoput("ES", "A-49", "Sevilla – Huelva – Ayamonte", "autoputevi/es-a-49.json"),
            new Autoput("ES", "A-52", "Benavente – Ourense – Vigo", "autoputevi/es-a-52.json"),
            new Autoput("ES", "A-62", "Burgos – Valladolid – Salamanca – Fuentes de Oñoro", "autoputevi/es-a-62.json"),
            new Autoput("ES", "A-66", "Gijón – Oviedo – León – Salamanca – Sevilla", "autoputevi/es-a-66.json"),
            new Autoput("ES", "A-67", "Palencia – Santander", "autoputevi/es-a-67.json"),
            new Autoput("ES", "A-68", "Bilbao – Logroño – Zaragoza", "autoputevi/es-a-68.json"),
            new Autoput("ES", "A-92", "Sevilla – Granada – Almería", "autoputevi/es-a-92.json")
    );

    /** Redosled zemalja na početnom ekranu. */
    public static final String[] ZEMLJE = {"ES"};

    /** Autoputevi jedne zemlje ("NL", "BE" ili "LU"), redom kao u spisku. */
    public static List<Autoput> zaZemlju(String zemlja) {
        List<Autoput> l = new ArrayList<>();
        for (Autoput a : SVE) if (a.zemlja.equals(zemlja)) l.add(a);
        return l;
    }

    public static Autoput poId(String id) {
        for (Autoput a : SVE) if (a.id.equals(id)) return a;
        return null;
    }
}
