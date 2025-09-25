
class ComplexNumCalculator {
    int nOpDone;
    ComplexNum lastRes;

    void build(){
        this.nOpDone=0;
        this.lastRes = new ComplexNum();
        this.lastRes.build(0,0);
    }

    ComplexNum add(ComplexNum n1, ComplexNum n2) {
        n1.add(n2);
        this.lastRes= n1;
        this.nOpDone++;
        return this.lastRes;
    }
}