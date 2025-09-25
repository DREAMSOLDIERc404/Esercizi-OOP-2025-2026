class Calculator{

    int nOpDone;
    double lastRes;

    void build(){
        this.nOpDone=0;
        this.lastRes=0;
    }
    
    double sub(double n1, double n2){
        this.lastRes=n1-n2;
        this.nOpDone++;
        return this.lastRes;
    }

    double add(double n1, double n2) {
        this.lastRes=n1+n2;
        this.nOpDone++;
        return this.lastRes;
    }

    double mul(double n1, double n2){
        this.lastRes=n1*n2;
        this.nOpDone++;
        return this.lastRes;
    }
    double div(double n1, double n2){
        this.lastRes=n1/n2;
        this.nOpDone++;
        return this.lastRes;
    }
}