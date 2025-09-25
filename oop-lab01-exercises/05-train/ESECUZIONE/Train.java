class Train {
    
    int nTotSeats;
    int nFirstClassSeats;
    int nSecondClassSeats;
    int nFirstClassReservedSeats;
    int nSecondClassReservedSeats;

    void build(int nFirstClassSeats, int nSecondClassSeats){
        
        this.nFirstClassSeats = nFirstClassSeats;
        this.nSecondClassSeats = nSecondClassSeats;

        this.nFirstClassReservedSeats = 0;
        this.nSecondClassReservedSeats = 0;
        
        this.nTotSeats =  this.nFirstClassSeats + this.nSecondClassSeats;
    }

    void reserveFirstClassSeats(int nSeatsToReserve){
        this.nFirstClassReservedSeats += nSeatsToReserve;
    }

    void reserveSecondClassSeats(int nSeatsToReserve){
        this.nSecondClassReservedSeats += nSeatsToReserve;
    }

    double getTotOccupancyRatio(){
        return (this.nFirstClassReservedSeats + this.nSecondClassReservedSeats) / this.nTotSeats;
    }

    double getFirstClassOccupancyRatio(){
        return (this.nFirstClassReservedSeats)/ this.nTotSeats;
    }

    double getSecondClassOccupancyRatio(){
        return this.nSecondClassReservedSeats / this.nTotSeats;
    }

    void deleteAllReservations(){
        this.nFirstClassReservedSeats=0;
        this.nSecondClassReservedSeats=0;
    }

}
