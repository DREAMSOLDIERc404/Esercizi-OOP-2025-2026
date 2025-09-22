class Student {

    // È buona pratica mettere i campi in testa alla classe
	String name;
	String surname;
	int id;
	int matriculationYear;

    void build(String name, String surname, int id, int matriculationYear) { /* Qui vanno i parametri necessari a inizializzare l'oggetto */
        /*
         * Completare il corpo del metodo
         */
		this.name = name;
		this.surname = surname;
		this.id = id;
		this.matriculationYear = matriculationYear;
    }

    void printStudentInfo() {
        /*
         * Completare il corpo del metodo
         */
		 System.out.println("[NOME]: \t" + this.name + this.surname);
		 System.out.println("[MATRICOLA]: \t" + this.id);
		 System.out.println("[ANNO IMM.]: \t" + this.matriculationYear);
    }
}
