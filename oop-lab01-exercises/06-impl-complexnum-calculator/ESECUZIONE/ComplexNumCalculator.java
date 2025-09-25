
class ComplexNumCalculator {
    int nOpDone;
    ComplexNum lastRes;

    void build(){
        this.nOpDone=0;
        this.lastRes = new ComplexNum();
        this.lastRes.build(0,0);
    }

    ComplexNum add(ComplexNum n1, ComplexNum n2) {
        this.lastRes.build(n1.re + n2.re, n1.im + n2.im);
        this.nOpDone++;
        return this.lastRes;
    }

    ComplexNum sub(ComplexNum n1, ComplexNum n2){
        this.lastRes.build(n1.re - n2.re, n1.im - n2.im);
        this.nOpDone++;
        return this.lastRes;
    }

    ComplexNum mul(ComplexNum n1, ComplexNum n2){
        this.lastRes.build(n1.re * n2.re - n1.im * n2.im, n1.im * n2.re + n1.re * n2.im);
        this.nOpDone++;
        return this.lastRes;
    }
    ComplexNum div(ComplexNum n1, ComplexNum n2){
        double re = (n1.re * n2.re + n1.im * n2.im) / (n2.re * n2.re + n2.im * n2.im);
        double im = (n1.im * n2.re - n1.re * n2.im) / (n2.re * n2.re + n2.im * n2.im);
        this.lastRes.build(re, im);
        this.nOpDone++;
        return this.lastRes;
    }
}