/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.raghavx.zns.manager;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;

/**
 *
 * @author raghav
 */
public class ValueLogger implements PropertyChangeListener{

    private File rreqfile;
    private File rrepfile;
    public ValueLogger() {
        this.rrepfile = new File("rrep.csv");
        this.rreqfile = new File("rreq.csv");
    }


    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        String propertyName = evt.getPropertyName();

        if(propertyName.equals("RREQ")){
            return;
        }
        if(propertyName.equals("RREP")){
            return;
        }
        if(propertyName.equals("RERR")){
            return;
        }

    }

}
