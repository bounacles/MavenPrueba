/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ghamaven.App;

import com.mycompany.ghamaven.Persona;
import java.lang.*;
import org.apache.commons.lang.NotImplementedException;

/**
 *
 * @author pablo
 */
public class LifeActions {
    
    static void morir (Persona persona)
    {
        persona.setAlive(false);

    }
    
    static boolean mayorDeEdad(Persona persona)
    {
        return persona.getAge()>= 18;
    }
    
}
