public class GradeStudy {
    private long stdid;
    private String stdfirstname;
    private String stdlastname;
    private double scoretotal;
    private double scorehomework;
    private double scoreassignment;
    private double scoresubtest;
    private double scoremidterm;
    private double scorefinal;
    private String stdgrade; 

    public GradeStudy(){
        //Constructor Method
    }

    public GradeStudy(long stdID , String firstName , String lastName){
        //Constructor Method
        SetStdId(stdID);
        // SetStdFirstName(firstName);
        // SetStdlastName(lastName);
    }




    // Method for input Score : Input Score with Keyboard in Main()
    public void SetMidtermScore(long scoremidterm){
        this.scoremidterm = scoremidterm;
    }

    public void SetStdId(long stdid){
        this.stdid = stdid;
    }
    public long GetStdId(){
        return stdid;
    }
    /*
    public void SetStdGrade(String stdgrade){
        //// statement
    }
    */
    public String GetStdGrade(){
        return stdgrade;
    }
    public void CalGrade(){ // Cal Grade 
        stdgrade = "A" ;
    }

    //Create Get and Set for All Variable
    public void Setstdfirstname(){
        // statement 
    }
    public String Getstdfirstname(){
       return "";
    }

    public void SetScoreFinal(double scorefinal){
        this.scorefinal = scorefinal;
    }
    public double GetScoreFinal(){
        return scorefinal;
    }

    public void Displayresult(){
        System.out.println("Std ID= "+ GetStdId());
        System.out.println("Std Grade = "+ GetStdGrade());
        System.out.println("Score Final= "+ GetScoreFinal());
    }
  public static void main(String [] args){
      System.out.println("Hello Student Grade");
      
      GradeStudy stdgrade = new GradeStudy(); // New OBJECT 
      
      // Modify Method Setter : Input from Keyboard
      stdgrade.SetStdId(6306021499999L); // L to set Long int
      stdgrade.GetStdId();
      stdgrade.CalGrade();
      stdgrade.SetScoreFinal(20);
      stdgrade.GetScoreFinal();
      stdgrade.Displayresult();
      
  }  
}
