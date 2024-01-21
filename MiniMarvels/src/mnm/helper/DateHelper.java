/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mnm.helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHelper {
    private static final String DATE_FORMAT = "dd-MM-yyyy";

    // Chuyển đổi từ String sang Date
    public static Date parseDate(String dateString) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        return dateFormat.parse(dateString);
    }

    // Chuyển đổi từ Date sang String
    public static String formatDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        return dateFormat.format(date);
    }
}
