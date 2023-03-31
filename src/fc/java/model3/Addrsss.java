package fc.java.model3;

public class Addrsss {
        private String city;
        private String country;

        public Addrsss() {
        }

        public Addrsss(String city, String country) {
                this.city = city;
                this.country = country;
        }

        public String getCity() {
                return city;
        }

        public void setCity(String city) {
                this.city = city;
        }

        public String getCountry() {
                return country;
        }

        public void setCountry(String country) {
                this.country = country;
        }

        @Override
        public String toString() {
                return "Addrsss{" +
                        "city='" + city + '\'' +
                        ", country='" + country + '\'' +
                        '}';
        }
}
