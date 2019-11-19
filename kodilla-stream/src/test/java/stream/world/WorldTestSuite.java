package stream.world;

import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {



    @Test
    public void testGetPeopleQuantity(){

        World world = new World();

        Country poland = new Country("Poland", new BigDecimal(38536869));
        Country germany = new Country("Germany", new BigDecimal(82422299));


        Country china = new Country("China", new BigDecimal(1314000000));
        Country thailand = new Country("Thailand", new BigDecimal(64631595));

        Country morocco = new Country("Morroco", new BigDecimal(33241059));
        Country egypt = new Country("Egypt", new BigDecimal(78887007));


        Continent europa = new Continent("Europa");
        europa.addCountryToConinentList(poland);
        europa.addCountryToConinentList(germany);

        Continent asia = new Continent("Azja");
        asia.addCountryToConinentList(china);
        asia.addCountryToConinentList(thailand);

        Continent africa = new Continent("Afrika");
        africa.addCountryToConinentList(morocco);
        africa.addCountryToConinentList(egypt);


        world.addContinentToWorldList(europa);
        world.addContinentToWorldList(asia);
        world.addContinentToWorldList(africa);


        //sum of people = 1 611 718 829

        Assert.assertEquals(new BigDecimal(1611718829), world.getPeopleQuantity());

    }
}
