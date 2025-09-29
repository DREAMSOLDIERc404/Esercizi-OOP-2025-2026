class TestStudent {

    public static void main(String[] args) {
        /*Creiamo un arrai di oggetti*/
		//Creiamo l'array
		Student[] studente = new Student[3];
		//Dentro ogni elemento dell'array creiamo l'oggetto
		for (int i = 0; i < 3; i++) {
			studente[i] = new Student();
		}
        studente[0].build("Alex", "Balducci", 1015, 2019);
		studente[1].build("Angel", "Bianchi", 1016, 2018);
		studente[2].build("Andrea", "Bracci", 1017, 2017);
        studente[0].printStudentInfo();
		System.out.println();
		studente[1].printStudentInfo();
		System.out.println();
		studente[2].printStudentInfo();
    }
}
