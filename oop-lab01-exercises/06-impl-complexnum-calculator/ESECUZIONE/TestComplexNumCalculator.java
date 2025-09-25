class TestComplexNumCalculator {
  public static void main(String[] args) {
    /*Per velocità copio dalle soluzioni */
    ComplexNumCalculator calculator = new ComplexNumCalculator();
      calculator.build();

      ComplexNum n1 = new ComplexNum();
      ComplexNum n2 = new ComplexNum();
      ComplexNum result;

      // add(1+2i, 2+3i) = 3+5i
      n1.build(1, 2);
      n2.build(2, 3);

    Eser

      result = calculator.add(n1, n2);
      System.out.println("Result of add(1+2i, 2+3i) = " + result.toStringRep() + "\n");
      System.out.println("No. operations done = " + calculator.nOpDone + "\n");
      System.out.println("Last res = " + calculator.lastRes.toStringRep() + "\n");

     
  }
}
