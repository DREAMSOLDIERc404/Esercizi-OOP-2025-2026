package it.unibo.constructors;

class Train {
    /* SOLUZIONI:
     *   static final int DEFAULT_N_FC_SEATS = 50;
     *   static final int DEFAULT_N_SC_SEATS = 100;
     *   static final int DEFAULT_TOT_SEATS = 150;
     *
     *   final int seats;
     *   final int firstClassSeats;
     *   final int secondClassSeats;
     *   int firstClassReserved;
     *   int secondClassReserved;
     *
     *   Train() {
     *       this(DEFAULT_TOT_SEATS, DEFAULT_N_FC_SEATS, DEFAULT_N_SC_SEATS);
     *   }
     *
     *   Train(final int nFCSeats, final int nSCSeats) {
     *       this(nFCSeats + nSCSeats, nFCSeats, nSCSeats);
     *   }
     *
     *   Train(final int nTotSeats, final int nFCSeats, final int nSCSeats) {
     *       this.seats = nTotSeats;
     *       this.firstClassSeats = nFCSeats;
     *       this.secondClassSeats = nSCSeats;
     *       this.firstClassReserved = 0;
     *       this.firstClassReserved = 0;
     *   }
     * 
     */

    //Il mio lavoro
    static final int DEFAULT_N_FC_SEATS = 50;
    static final int DEFAULT_N_SC_SEATS = 100;
    static final int DEFAULT_TOT_SEATS = 150;

    /* Dalle soluzioni, si consiglia di impostarle come final 
     * Per impedirne la modifica una volt ainzializzate
    */
    final int seats;
    final int firstClassSeats;
    final int secondClassSeats;
    int firstClassReserved;
    int secondClassReserved;

    Train(){
        this.seats=DEFAULT_TOT_SEATS;
        this.firstClassSeats=DEFAULT_N_FC_SEATS;
        this.secondClassSeats=DEFAULT_N_SC_SEATS;
        this.firstClassReserved=0;
        this.secondClassReserved=0;
    }

    Train(int TotSeats, int FirsClassSeats, int SecondClassSeats){
        this.seats=TotSeats;
        this.firstClassSeats=FirsClassSeats;
        this.secondClassSeats=SecondClassSeats;
        this.firstClassReserved=0;
        this.secondClassReserved=0;
    }

    void deleteAllReservations() {
        this.firstClassReserved = 0;
        this.secondClassReserved = 0;
    }

    double getFirstClassOccupancyRatio() {
        return this.firstClassReserved * 100d / this.firstClassSeats;
    }

    int getFirstClassSeats() {
        return this.firstClassSeats;
    }

    int getSecondClassSeats() {
        return this.secondClassSeats;
    }

    double getOccupancyRatio() {
        return (this.firstClassReserved + this.secondClassReserved) * 100d / this.seats;
    }

    double getSecondClassOccupancyRatio() {
        return this.secondClassReserved * 100 / this.secondClassSeats;
    }

    int getTotalSeats() {
        return this.seats;
    }

    void printTrainInfo() {
        System.out.println("Train info:");
        System.out.println("-nTotSeats: " + this.seats);
        System.out.println("-nFCSeats: " + this.firstClassSeats);
        System.out.println("-nSCSeats: " + this.secondClassSeats);
        System.out.println("-nFCReservedSeats: " + this.firstClassReserved);
        System.out.println("-nSCReservedSeats: " + this.secondClassReserved + "\n");
    }

    void reserveFirstClassSeats(final int nSeats) {
        this.firstClassReserved += nSeats;
    }

    void reserveSecondClassSeats(final int nSeats) {
        this.secondClassReserved += nSeats;
    }
}
