public class Auto {

        private int CC;
        private String targa;
        private String brand;
        private String model;

        public Auto(int CC, String targa, String brand, String model){
            this.CC = CC;
            this.targa = targa;
            this.brand = brand;
            this.model = model;
        }
        @Override
        public String toString() {
            return CC + " " + targa + " " + brand + " " + model;
        }

        public void setCC(int CC){
            this.CC = CC;
        }
        public void setTarga(String targa){
            this.targa = targa;
        }
        public void setBrand(String brand){
            this.brand = brand;
        }
        public void setModel(String model) {this.model =model;}

        public int getCC(){
            return CC;
        }
        public String getTarga(){
            return targa;
        }
        public String getBrand(){
            return brand;
        }
        public String getModel(){
            return model;
        }

}
