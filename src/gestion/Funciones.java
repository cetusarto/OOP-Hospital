/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

import com.toedter.calendar.JDateChooser;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author cesar
 */
public class Funciones {

    public Funciones() {
    }

    SimpleDateFormat yyyyMMdd = new SimpleDateFormat("yyyy-MM-dd");

    public String getFecha(JDateChooser jd) {
        if (jd.getDate() != null) {
            return yyyyMMdd.format(jd.getDate());
        } else {
            return null;
        }
    }

    public java.util.Date StringADate(String fecha) {
        SimpleDateFormat formato_del_Texto = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaE = null;
        try {
            fechaE = formato_del_Texto.parse(fecha);
            return fechaE;
        } catch (ParseException ex) {
            return null;
        }

    }

    public String getDia(JDateChooser jd) {
        SimpleDateFormat yyyyMMdd = new SimpleDateFormat("EEEE");

        if (jd.getDate() != null) {
            return yyyyMMdd.format(jd.getDate());
        } else {
            return null;
        }
    }
}
