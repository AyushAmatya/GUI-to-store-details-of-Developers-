/** Creating a child class: SeniorDeveloper **/
public class JuniorDeveloper extends Developer
{
    /* Creating instance variables */
    private int salary;
    private String appointedDate;
    private String evaluationPeriod;
    private String terminationDate;
    private String specialization;
    private String appointedBy;
    private boolean joined;
    
    /* Creating a constructor of JuniorDeveloper */
    public JuniorDeveloper(String platform, String interviewerName, int workingHours, int salary, String appointedBy, String terminationDate)
    {
        /* Calling constructor of super class i.e. Developer class*/
        super(platform, interviewerName, workingHours);
        /* Assigning values entered by user as parameter to its corresponding variables*/
        this.platform= platform;
        this.interviewerName= interviewerName;
        this.workingHours= workingHours;
        this.salary= salary;
        this.appointedBy= appointedBy;
        this.terminationDate= terminationDate;
        appointedDate="";
        evaluationPeriod="";
        specialization="";
        joined= false;
    }
    
    /* Crearing a accesor method from where user can access value of salary*/
    public int getSalary()
    {
        return salary;
    }
    
    /* Crearing a accesor method from where user can access value of appointed date*/
    public String getAppointedDate()
    {
        return appointedDate;
    }
    
    /* Crearing a accesor method from where user can access value of evaluation period*/
    public String getEvaluationPeriod()
    {
        return evaluationPeriod;
    }
    
    /* Crearing a accesor method from where user can access value of termination date*/
    public String getTerminationDate()
    {
        return terminationDate;
    }
    
    /* Crearing a accesor method from where user can access value of appointed by*/
    public String getAppointedBy()
    {
        return appointedBy;
    }
    
    /* Crearing a accesor method from where user can access value of specialization */
    public String getSpecialization()
    {
        return specialization;
    }
    
    /* Crearing a accesor method from where user can access value of joined */
    public boolean getJoined()
    {
        return joined;
    }
    
    /* Creating a method from where user can change salary*/
    public void setSalary(int salary)
    {
        if (joined==false){
            /* This code runs if joined is false*/
            this.salary=salary;
        }
        else{
            /* This code runs if joined is true*/
            System.out.println("The developer has already joined. Therefore it is not possible to change the salary");
        }
    }
    
    /* Creating a method to appoint new developer */
    public void appoint(String developerName, String terminationDate, String appointedDate, String specialization, String evaluationPeriod)
    {
        if (joined==false){
            /* This code runs if joined is false*/
            setDeveloperName(developerName);
            joined= true;
            this.terminationDate = terminationDate;
            this.appointedDate= appointedDate;
            this.specialization= specialization;
            this.evaluationPeriod = evaluationPeriod;
        }
        else{
            /* This code runs if joined is true*/
            System.out.println("The developer is already appointed");
            System.out.println("Appointed Date: "+ appointedDate);
        }       
    }
    
    /* Creating a method that displays all the details to the user. */
    public void display()
    {
        /* Calling display method of super class i.e. Developer class*/
        super.display();
        if (joined== true){
            /* This code runs if joined is true */
            System.out.println("Appointed date: "+ appointedDate);
            System.out.println("Evaluation period: "+ evaluationPeriod);
            System.out.println("Termination Date: "+ terminationDate);
            System.out.println("Developer salary: "+ salary);
            System.out.println("Developer specializaion: "+ specialization);
            System.out.println("Developer appointed by: "+ appointedBy);
        }
    }
}
