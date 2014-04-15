package com.parabot.pk_honor.thiever;

/**
 * Created with IntelliJ IDEA.
 * User: Piet Jetse
 * Date: 13-4-2014
 * Time: 19:41
 */
public enum Stalls {
    BAKERY_STALL(0, 2561),
    SILK_STALL(20, 2560),
    FUR_STALL(35, 2563),
    SILVER_STALL(50, 2565),
    SPICE_STALL(65, 2564),
    GEM_STALL(75, 2562);

    private int level;
    private int id;

    Stalls(int level, int id) {
        this.level = level;
        this.id = id;
    }

    public int getID() {
        return id;
    }

    public int getLevel() {
        return level;
    }

  /*  public static int getIdByLevel() {
        for (int i = 0; i < Stalls.values().length; i++) {
            if (Skill.THIEVING.getLevel() >= Stalls.values()[i].level && Skill.THIEVING.getLevel() < Stalls.values()[i + 1].level) {
                return Stalls.values()[i].id;
            }
        }
        return -1;
    }*/
}

