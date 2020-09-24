public class AggregateData {
    String id;
    String name;
    String address;
    String city;
    String state;
    String zip;

    public AggregateData(PersonalData pd) {
        this.id = pd.id;
        this.name = pd.name;
        String [] temp = pd.address.split(",");
        this.address = temp[0].trim();
        this.city = temp[1].trim();
        this.state = temp[2].trim();
        this.zip = temp[3].trim();

    }

    public void to(AggregateData ad){
        ad.id = this.id;
        ad.name = this.name;
        ad.address = this.address;
        ad.city = this.city;
        ad.state = this.state;
        ad.zip = this.zip;
    }

    public AggregateData(){
        this.id = null;
        this.name = null;
        this.address = null;
        this.city = null;
        this.state = null;
        this.zip = null;
    }

    public AggregateData(String id, String name, String address, String city, String state, String zip){
        this.id = id;
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "AggregateData{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
