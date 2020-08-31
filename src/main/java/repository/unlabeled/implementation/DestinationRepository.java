package repository.unlabeled.implementation;

import Entity.unlabeled.Destination;

import java.util.Set;

public class DestinationRepository implements DestinationRepositoryInterface {
    private static DestinationRepository destination = null;
    private Set<Destination> destinationsDB;
}
