package com.parabot.pk_honor.thiever.strategies;

import com.parabot.pk_honor.thiever.Stalls;
import org.parabot.environment.scripts.framework.Strategy;
import org.rev317.min.api.methods.Players;
import org.rev317.min.api.methods.SceneObjects;
import org.rev317.min.api.methods.Walking;
import org.rev317.min.api.wrappers.SceneObject;

/**
 * Created with IntelliJ IDEA.
 * User: Piet Jetse
 * Date: 13-4-2014
 * Time: 19:41
 */
public class Walk implements Strategy {
    @Override
    public boolean activate() {
         SceneObject[] stall = SceneObjects.getNearest(Stalls.getIdByLevel());
        //SceneObject[] stall = SceneObjects.getNearest(2565);
        return stall[0].distanceTo() > 5;
    }

    @Override
    public void execute() {
        SceneObject[] stall = SceneObjects.getNearest(Stalls.getIdByLevel());
        // SceneObject[] stall = SceneObjects.getNearest(2565);
        Walking.walkTo(Players.getMyPlayer().getLocation(),stall[0].getLocation());
    }
}
