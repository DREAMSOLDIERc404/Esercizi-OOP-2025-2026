class ComplexNum {
    /*
     * Inserire qui la dichiarazione dei campi della classe
     */
	double re;
	double im;
	
	
    void build(double re, double im) {
        /*
         * Inserire qui l'inizializzazione dei campi con i parametri forniti in input
         */
		 this.re = re;
		 this.im = im;
    }

    boolean equal(ComplexNum num) {
        /*
         * Implementare il metodo in modo che restituisca true se e solo se il
         * numero complesso è uguale al parametro num passato in input
         */
		 if((num.re == this.re) && (num.im == this.im)){
			return true;
		 }
        return false;
    }

    void add(ComplexNum num) {
        /*
         * Implementare il metodo in modo che venga aggiunto il numero complesso
         * passato in input - Rif. Appendice A1 (slide)
         */
		this.re += num.re;
		this.im += num.im;
    }

    String toStringRep() {
        /*
         * Implementare il metodo in modo che restituisca una rappresentazione
         * testuale del numero complesso
         */
		String buffer= "";
		if(this.re != 0.0){
			buffer += this.re;
		}
        //Per stampare il + numero immaginario deve essere maggiore di 0 
        //perchè se diverso va omesso e se minore java stampa da solo il - 
		if((this.re != 0.0) && (this.im > 0.0)){
			buffer += "+";
		}
		if(this.im != 0.0 && this.im != 1.0 && this.im != -1.0){
			buffer += this.im+"i";
		}
        if(this.im == 1.0){
            buffer += "i";
        }
        if(this.im == -1.0){
            buffer += "-i";
        }

        if(buffer==""){
            buffer = "0.0";
        }

        return buffer;
    }
}