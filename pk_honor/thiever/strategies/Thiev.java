package com.parabot.pk_honor.thiever.strategies;

import com.parabot.pk_honor.thiever.Stalls;
import org.parabot.environment.api.utils.Time;
import org.parabot.environment.scripts.framework.SleepCondition;
import org.parabot.environment.scripts.framework.Strategy;
import org.rev317.min.api.methods.Players;
import org.rev317.min.api.methods.SceneObjects;
import org.rev317.min.api.wrappers.SceneObject;


/**
 * Created with IntelliJ IDEA.
 * User: Piet Jetse
 * Date: 13-4-2014
 * Time: 19:40
 */
public class Thiev implements Strategy {
    @Override
    public boolean activate() {
       SceneObject[] stall = SceneObjects.getNearest(Stalls.getIdByLevel());
        return stall[0].distanceTo() < 6;
    }

    @Override
    public void execute() {
       SceneObject[] stall = SceneObjects.getNearest(Stalls.getIdByLevel());
        //todo get String
        stall[0].interact(0);
        Time.sleep(new SleepCondition() {
            @Override
            public boolean isValid() {
                return Players.getMyPlayer().getAnimation() != -1;
            }
        }, 500);
    }
}
