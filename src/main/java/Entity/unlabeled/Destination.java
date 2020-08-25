package Entity.unlabeled;

public class Destination {
    private String name;
    private String state;
    private String country;
    private int zip_code;

    public Destination(Destination builder) {
        this.name = builder.name;
        this.state = builder.state;
        this.country = builder.country;
        this.zip_code = builder.zip_code;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public int getZip_code() {
        return zip_code;
    }

    @Override
    public String toString() {
        return "Destination{" +
                "name='" + name + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zip_code=" + zip_code +
                '}';
    }

    public Destination setName(String name) {
        this.name = name;
        return this;
    }

    public Destination setState(String state) {
        this.state = state;
        return this;
    }

    public Destination setCountry(String country) {
        this.country = country;
        return this;
    }

    public Destination setZip_code(int zip_code) {
        this.zip_code = zip_code;
        return this;
    }
    public Destination createDestination() {
        return new Destination(this);
    }
}
