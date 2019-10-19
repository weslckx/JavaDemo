/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graduaat.it.www.beans;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Wes
 */
@ManagedBean(name="bus")
public class Bus {
    private ArrayList<Reiziger> reizigers;

    public Bus() {
        reizigers=new ArrayList<>();
    }

    public ArrayList<Reiziger> getReizigers() {
        return reizigers;
    }

    public void setReizigers(ArrayList<Reiziger> reizigers) {
        this.reizigers = reizigers;
    }
    
    
}
