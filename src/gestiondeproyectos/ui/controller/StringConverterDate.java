/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondeproyectos.ui.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javafx.util.StringConverter;

/**
 *
 * @author iker
 */
class StringConverterDate {
    private String pattern="dd/MM/yyyy";
    private StringConverter converter;
    
    
    public StringConverterDate(){
            converter = new StringConverter<LocalDate>() {
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(pattern);
            @Override
            public String toString(LocalDate date) {
                if (date != null) {
                    return dateFormatter.format(date);
                } else {
                    return "";
                }
            }
            @Override
            public LocalDate fromString(String string) {
                if (string != null && !string.isEmpty()) {
                    return LocalDate.parse(string, dateFormatter);
                } else {
                    return null;
                }
            }
        };
    }

    public StringConverter getConverter() {
        return converter;
    }
    
}
