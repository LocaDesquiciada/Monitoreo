package modelo.herramientas;

public class ManejadorDeStrings {

    public String leadingZeros (int numeroAstr) {

        String strNumero = Integer.toString(numeroAstr);
        if (strNumero.length() < 8) {
           strNumero = String.format("%08d", numeroAstr);
        }
        return strNumero;
    }

    public String concatenarStr(String str1, String str2, String str3, String str4) {

        return  ((str1.concat(str2)).concat(str3)).concat(str4);
    }
}
