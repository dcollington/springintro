package oslomet.webprog.springintro;

public class kunde {
    private String navn;
    private String adresse;


        public kunde(String navn, String adresse){
            this.navn = navn;
            this.adresse = adresse;
        }
      public kunde(){  }

        public void setNavn(String navn){
            this.navn = navn;
        }
        public void setAdresse(String adresse){
            this.adresse = navn;
        }

        public String getNavn(){
            return navn;
        }

        public String getAdresse(){
            return adresse;
        }

}
