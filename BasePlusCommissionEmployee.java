
public class BasePlusCommissionEmployee extends CommissionEmployee {
   private double baseSalary; 
   
   public BasePlusCommissionEmployee( String first, String last, String ssn, double sales, double rate, double salary ) {
      super( first, last, ssn, sales, rate );
      setBaseSalary( salary ); // validate and store base salary
   } 
   
   public void setBaseSalary( double salary ) {
		if (salary >= 0.0)
			baseSalary = salary;
		else
			throw new IllegalArgumentException("Base salary must be >= 0.0");
   } 
   
   public double getBaseSalary() {
      return baseSalary;
   } 
   
   public double earnings() {
      return getBaseSalary() + super.earnings();
   } 
   
   public String toString() {
      return String.format( "%s %s; %s: $%,.2f",
         "base-salaried", super.toString(),
         "base salary", getBaseSalary() );
   } 
} 