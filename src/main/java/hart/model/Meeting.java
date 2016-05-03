package hart.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by biezenj on 5-4-2016.
 */

@Entity
@Table(name = "metingen")
public class Meeting implements Serializable {

    @Id
    @GeneratedValue
    int id;
    int sys, dia, pulse, hoeveelAlcohol;
    boolean sport, alcohol;
    Timestamp timestamp;

    protected Meeting() {
    }

    public Meeting(int sys, int dia, int pulse, boolean sport,boolean alcohol, int hoeveelAlcohol, Timestamp timestamp) {
        this.sys = sys;
        this.dia = dia;
        this.pulse = pulse;
        this.sport = sport;
        this.alcohol = alcohol;
        this.hoeveelAlcohol = hoeveelAlcohol;
        this.timestamp = timestamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSys() {
        return sys;
    }

    public void setSys(int sys) {
        this.sys = sys;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public int getHoeveelAlcohol() {
        return hoeveelAlcohol;
    }

    public void setHoeveelAlcohol(int hoeveelAlcohol) {
        this.hoeveelAlcohol = hoeveelAlcohol;
    }

    public boolean isSport() {
        return sport;
    }

    public void setSport(boolean sport) {
        this.sport = sport;
    }

    public boolean isAlcohol() {
        return alcohol;
    }

    public void setAlcohol(boolean alcohol) {
        this.alcohol = alcohol;
    }


    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
