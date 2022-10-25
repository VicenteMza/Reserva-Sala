package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Borrar {

    public static void main(String[] args) throws ParseException {

//        System.out.println("Introduzca la fecha con formato dd/mm/yyyy");
//
//        Scanner sc = new Scanner(System.in);
//
//        String fecha = sc.nextLine();
//
//        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
//
//        Date testDate = null;
//
//        String date = fecha;
//
//        try {
//            testDate = df.parse(date);
//
//            System.out.println("Ahora hemos creado un objeto date con la fecha indicada, " + testDate);
//
//        } catch (Exception e) {
//            System.out.println("invalid format");
//        }
//
//        if (!df.format(testDate)
//                .equals(date)) {
//
//            System.out.println("invalid date!!");
//
//        } else {
//
//            System.out.println("valid date");
//
//        }
//        Calendar today = Calendar.getInstance();
//        System.out.println("hoy es " + today.getTime());
//-----------------------------------------------------------------------------
//        System.out.println("La fecha actual es: " + LocalDate.now().getYear());
//        System.out.println( "Fecha de mi cumpleaños: " + LocalDate.of(LocalDate.now().getYear(), Month.MAY, LocalDate.now().getDayOfMonth()) );
//        String fechaI1 = "2015-01-01";
//        String fechaF2 = "2014-02-01";
//
//        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
//
//        Date fecha1 = formato.parse(fechaI1);
//        Date fecha2 = formato.parse(fechaF2);
//
//        if (fecha1.before(fecha2)||fecha1.equals(fecha2)) {
//            System.out.println("Fecha 2 es mayor o igual que fecha1");
//        } else {
//            System.out.println("Fecha 2 es menor que fecha1");
//        }
//-----------------------------------------------------------------------------
String fechaI1 = "2015-01-01";
String fechaF2 = "2015-02-01";

DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

LocalDate fecha1 = LocalDate.parse(fechaI1, formatter);
LocalDate fecha2 = LocalDate.parse(fechaF2, formatter);

if(fecha1.isEqual(fecha2)){
    System.out.println( "Fecha 1 es igual a fecha2" );
}else if(fecha1.isAfter(fecha2)){
    System.out.println( "Fecha 1 es mayor a fecha2");
}else if(fecha1.isBefore(fecha2)){
    System.out.println( "Fecha 1 es menor a fecha2");
}
        System.out.println(fecha2);
    }
}
