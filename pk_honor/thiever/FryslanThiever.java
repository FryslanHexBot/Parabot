package com.parabot.pk_honor.thiever;

import com.parabot.pk_honor.thiever.strategies.Thiev;
import com.parabot.pk_honor.thiever.strategies.Walk;
import org.parabot.environment.scripts.Category;
import org.parabot.environment.scripts.Script;
import org.parabot.environment.scripts.ScriptManifest;
import org.parabot.environment.scripts.framework.Strategy;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Piet Jetse
 * Date: 13-4-2014
 * Time: 19:37
 */
@ScriptManifest(name = "Fryslan Thiever", author = "Fryslan", description = "Gets 99 Thieving for you", category = Category.THIEVING, version = 1, servers = "PKHonor")
public class FryslanThiever extends Script {

    private final ArrayList<Strategy> strategies = new ArrayList<Strategy>();

    @Override
    public boolean onExecute() {

        strategies.add(new Thiev());
        strategies.add(new Walk());
        provide(strategies);
        return true;
    }

    @Override
    public void onFinish() {

    }
}
