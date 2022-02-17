class Tentti {
    private double pisteet;
    private boolean onkoErinomainen;

    public double setPisteet(double p){
        this.pisteet = p;
        return p;
    }

    public double getPisteet(){
        return this.pisteet;
    }

    public int getArvosana(){
        int arvosana;

        if (this.pisteet >= 90) {
            arvosana = 5;
        }
        else if (this.pisteet >= 80) {
            arvosana = 4;
        }
        else if (this.pisteet >= 70) {
            arvosana = 3;
        }
        else if (this.pisteet >= 60) {
            arvosana = 2;
        }
        else if (this.pisteet >= 50) {
            arvosana = 1;
        }
        else {
            arvosana = 0;
        }
        return arvosana;
    }
    public interface Erinomainen
    {
        boolean onkoErinomainen = false;
        
    }
    
    public boolean onkoErinomainen(int arvosana) {
        if (arvosana == 5) {
            onkoErinomainen = true;
            return true;
        }
        return false;
    }
    static class essee extends Tentti{
        private double kp;
        private double ok;
        private double p;
        private double s;

        public essee(Integer kp,Integer ok, Integer p, Integer s){
            this.kp = kp;
            this.ok = ok;
            this.p = p;
            this.s = s;

            if (kp >= 30){
                setKielioppi(30);
            }
            else

            if (ok >= 30){
                setOikeinkirjoitus(30);
            }
            else

            if (p >= 20){
                setPituus(20);
            }
            else
            if (s >= 30){
                setSisalto(30);
            }
            else;
            return;
        }

        public double lasketaanPisteet(){
            return setPisteet(getKielioppi() + getOikeinkirjoitus() + getPituus() + getSisalto());
        }

        public double getKielioppi() {
            return kp;
        }

        public void setKielioppi(int kp) {
            this.kp = kp;
        }

        public double getOikeinkirjoitus() {
            return ok;
        }

        public void setOikeinkirjoitus(int ok) {
            this.ok = ok;
        }

        public double getPituus() {
            return p;
        }

        public void setPituus(int p) {
            this.p = p;
        }

        public double getSisalto() {
            return s;
        }

        public void setSisalto(int s) {
            this.s = s;
        }
    }

    public static void main(String[] args) {
        essee olio = new essee(30,16,14,26);
        olio.lasketaanPisteet();
        System.out.println("Arvosanasi on " + olio.getArvosana());
        essee olio1 = new essee(30,30,20,30);
        olio1.lasketaanPisteet();
        System.out.println("Arvosanasi on " + olio1.getArvosana() + " " + olio1.onkoErinomainen(olio1.getArvosana()));
    }
}