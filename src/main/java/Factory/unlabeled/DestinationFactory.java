package Factory.unlabeled;

import Entity.unlabeled.Destination;

public class DestinationFactory {

    public static Destination createDestination(String name, String state, String country, int zip_code) {
        Destination destination = new Destination.DestinationBuilder().
                setName(name).setState(state).
                setCountry(country).
                setZip_code(zip_code).build();
        return destination;
    }
}

