public class Radio {

    private int volume;
    private boolean isOn;
    private int VOL_MAX;
    private String [] posturi = {"ProFM", "Radio21", "Death FM", "Antena satelor"};
    private int postCurent;

    public Radio (int vmax){
        if (vmax<1)VOL_MAX = 3;
        else VOL_MAX=vmax;
    }
    public Radio() {
        this (3);
    }
    public void porneste(){
        if (isOn){
            System.out.println("Radioul este deja pornit");
        }else {
            isOn=true;
            volume = 1;
            System.out.println("Radioul a pornit!");
        }
    }
    public void opreste (){
        if (!isOn){
            System.out.println("Radioul este deja oprit");
        }else {
            isOn = false;
            volume = 0;
            System.out.println("Radioul a fost oprit");
        }
    }
    public void daMaiTare(int nrTrepte){
        if (nrTrepte<=0){
            System.out.println("Numar de trepte invalid");
            return;
        }
        if(!isOn){
            System.out.println("Radioul nu este pornit");
        }
        if(volume+nrTrepte>VOL_MAX){
            System.out.println("Nu pot da mai tare cu " + nrTrepte + " pentru ca depasim volumul maxim admis");
        }
        volume+=nrTrepte;
        System.out.println("Radioul a fost dat mai tare cu " + nrTrepte + " trepte");
    }
    public void daMaiTare(){
        daMaiTare(1);
    }
    public void daMaiIncet(int nrTrepte) {
        if (nrTrepte <= 0) {
            System.out.println("Nr de trepte invalid!");
            return;
        }
        if (!isOn) {
            System.out.println("Aparatul nu este pornit");
            return;
        }

        if (volume - nrTrepte <= 0) {
            System.out.println("Nu pot da mai incet cu atatea trepte!");
            return;
        }

        volume -= nrTrepte;
        System.out.println("Aparatul dvs a fost dat mai incet cu " + nrTrepte + " trepte");

    }
    public void daMaiIncet(){
        daMaiIncet(1);
    }

    private void afisarePostCurent(){
        System.out.println("***************************************");
        System.out.println("Sunteti pe postul "+posturi[postCurent]);
        System.out.println("***************************************");
    }

    public void postUrmator(){
        if(!isOn){
            System.out.println("Aparatul nu este pornit!");
        }else{
            // daca ajung la capat o iau de la inceput

            if(postCurent == posturi.length-1){
                postCurent = 0;
            }else{
                postCurent++;
            }
            // postCurent = ++postCurent%posturi.length;
            afisarePostCurent();
        }
    }

    public void postPrecedent(){
        if(!isOn){
            System.out.println("Aparatul nu este pornit!");
        }else{
            postCurent=((postCurent==0)?posturi.length-1:postCurent-1);
            afisarePostCurent();
        }
    }

    public void stare(){
        System.out.println("Aparatul este "+(isOn?"pornit":"oprit"));
        if(isOn){
            System.out.println("Treapta de volum curenta este: "+volume);
            afisarePostCurent();
        }
    }

    public static void main(String[] args) {
        Radio r = new Radio(5);
        r.volume = -5; // merge, pt ca sunt in interiorul clasei Radio! dar pt alte clase NU
        r.opreste();
        r.porneste();
        r.daMaiIncet();
        r.daMaiTare(4);
        r.daMaiTare(2);
        r.daMaiTare();
        r.porneste();
        r.opreste();
        r.postUrmator();
        Radio r1 = new Radio(); // --> 3 trepte
        r1.stare();
        r1.postPrecedent();
        Radio r2 = new Radio(-2); // --> 3 trepte
        r2.stare();
    }

}
