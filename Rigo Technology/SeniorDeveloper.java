/** Creating a child class: SeniorDeveloper **/
public class SeniorDeveloper extends Developer
{
    /* Creating instance variables */
    private int salary;
    private String joiningDate;
    private String staffRoomNumber;
    private int contractPeriod;
    private float advanceSalary;
    private boolean appointed;
    private boolean terminated;
    
    /* Creating a constructor of SeniorDeveloper */
    public SeniorDeveloper(String platform, String interviewerName, int workingHours, int salary, int contractPeriod)
    {
        /* Calling constructor of super class i.e. Developer class*/
        super(platform, interviewerName, workingHours);
        /* Assigning values entered by user as parameter to its corresponding variables*/
        this.salary= salary;
        this.contractPeriod= contractPeriod;
        joiningDate="";
        staffRoomNumber="";
        advanceSalary=0.0f;
        appointed= false;
        terminated= false;
    }
    
    /* Crearing a accesor method from where user can access value of advance salary */
    public float getAdvanceSalary()
    {
        return advanceSalary;
    }
    
    /* Crearing a accesor method from where user can access value of joining date*/
    public String getJoiningDate()
    {
        return joiningDate;
    }
    
    /* Crearing a accesor method from where user can access value of staff room number */
    public String getStaffRoomNumber()
    {
        return staffRoomNumber;
    }
    
    /* Crearing a accesor method from where user can access value of salary*/
    public int getSalary()
    {
        return salary;
    }
    
    /* Crearing a accesor method from where user can access value of contact period*/
    public int getContractPeriod()
    {
        return contractPeriod;
    }
    
    /* Crearing a accesor method from where user can access value of appointed */
    public boolean getAppointed()
    {
        return appointed;
    }
    
    /* Crearing a accesor method from where user can access value of terminated */
    public boolean getTerminated()
    {
        return terminated;
    }
    
    /* Creating a method from where user can change salary*/
    public void setSalary(int salary)
    {
        this.salary = salary;
    }
    
    /* Creating a method from where user can change contract period*/
    public void setContractPeriod(int contractPeriod)
    {
        this.contractPeriod = contractPeriod;
    }
    
    /* Creating a method to hire new developer */
    public void hire(String developerName, String joiningDate, float advanceSalary, String staffRoomNumber)
    {
        if (appointed == true){
            /* This code runs if appointed is true */
            System.out.println("The developer is already appointed");
            System.out.println("Developer name: "+ developerName);
            System.out.println ("Room number: "+ staffRoomNumber);
        }
        else{
            /* This code runs if appointed is false */
            /* Calling the method to set the developer name from parent class i.e. Developer class with the developer name as parameter*/
            setDeveloperName(developerName);
            this.joiningDate = joiningDate;
            this.advanceSalary = advanceSalary;
            this.staffRoomNumber= staffRoomNumber;
            appointed= true;
            terminated= false;
        }
    }
    
    /* Creating a method that terminates the developer contract */
    public void termination()
    {
        if (terminated == true){
            /* This code runs if termination is true */
            System.out.println("The developer contract is already terminated.");
        }
        else{
            /* This code runs if termination is false. */
            /* Calling the method to set the developer name from parent class i.e. Developer class with the empty string as parameter*/
            setDeveloperName("");
            this.joiningDate="";
            this.advanceSalary = 0.0f;
            this.staffRoomNumber = "";
            appointed= false;
            terminated= true;
            //System.out.println("The developer contrat is sucessfully terminated");
        }
    }
    
    /* Creating a method to display platform, interviewer name and salary to the user */
    public void print()
    {
        System.out.println("Platform: "+ getPlatform());
        System.out.println("Interviewer name: "+ getInterviewerName());
        System.out.println("Developer salary: "+ getSalary());
    }
    
    /* Creating a method that displays all the details to the user. */
    public void display()
    {
        /* Calling display method of super class i.e. Developer class*/
        super.display();
        if (appointed==true){
            /* This code runs if appointed is true */
            System.out.println("Termination status: "+ terminated);
            System.out.println("Joining date: "+ joiningDate);
            System.out.println("Advance salary: "+ advanceSalary);
        }
    }
}
