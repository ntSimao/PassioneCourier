package com.PassioneCourier.group2.Entity.unlabeled;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Route implements Serializable {

    @Id
    private int route_id;
    private int product_id, from_location_id, to_location_id, price, days;

    protected Route(){}

    private Route(Builder builder){
        this.route_id = builder.route_id;
        this.product_id = builder.product_id;
        this.from_location_id = builder.from_location_id;
        this.to_location_id = builder.to_location_id;
        this.price = builder.price;
        this.days = builder.days;
    }

    public int getRoute_id() {
        return route_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public int getFrom_location_id() {
        return from_location_id;
    }

    public int getTo_location_id() {
        return to_location_id;
    }

    public int getPrice() {
        return price;
    }

    public int getDays() {
        return days;
    }

    @Override
    public String toString() {
        return "Route{" +
                "route_id=" + route_id +
                ", product_id=" + product_id +
                ", from_location_id=" + from_location_id +
                ", to_location_id=" + to_location_id +
                ", price=" + price +
                ", days=" + days +
                '}';
    }

    public static class Builder{

        private int route_id, product_id, from_location_id, to_location_id, price, days;

        public Builder setRoute_id(int route_id){
            this.route_id = route_id;
            return this;
        }
        public Builder setProduct_id(int product_id){
            this.product_id = product_id;
            return this;
        }
        public Builder setFromLocation_id(int from_location_id){
            this.from_location_id = from_location_id;
            return this;
        }
        public Builder setToLocation_id(int to_location_id){
            this.to_location_id = to_location_id;
            return this;
        }
        public Builder setPrice(int price){
            this.price = price;
            return this;
        }
        public Builder setDays(int days){
            this.days = days;
            return this;
        }

        public Builder copy(Route route){
            this.route_id = route.route_id;
            this.product_id = route.product_id;
            this.from_location_id = route.from_location_id;
            this.to_location_id = route.to_location_id;
            this.price = route.price;
            this.days = route.days;
            return this;
        }

        public Route build(){
            return new Route( this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Route route = (Route) o;
        return route_id == route.route_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(route_id);
    }
}

