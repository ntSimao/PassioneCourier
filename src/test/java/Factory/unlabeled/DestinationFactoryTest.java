package Factory.unlabeled;

import Entity.unlabeled.Destination;
import org.junit.Assert;
import org.junit.Test;

public class DestinationFactoryTest {

    @Test
    public void createDestination() {
        Destination destination = DestinationFactory.createDestination("PennyTimbers", "Africa", "South Africa", 1623);
        Assert.assertEquals(destination,destination);
        //System.out.println("You have reached your " + destination);
    }
}

