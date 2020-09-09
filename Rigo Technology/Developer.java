/** Creating a parent class: Developer **/
public class Developer
{
    /* Creating instance variables */
    String platform;
    String interviewerName;
    String developerName;
    int workingHours;
    
    /* Creating a constructor of Developer */
    public Developer(String platform, String interviewerName, int workingHours)
    {
        /* Assigning values entered by user as parameter to its corresponding variables */
        this.platform= platform;
        this.interviewerName= interviewerName;
        this.workingHours= workingHours;
        this.developerName="";
    }
    
    /* Crearing a accesor method from where user can access value of platform */
    public String getPlatform()
    {
        return platform;
    }
    
    /* Crearing a accesor method from where user can access value of interviewer name*/
    public String getInterviewerName()
    {
        return interviewerName;
    }
    
    /* Crearing a accesor method from where user can access value of working hours*/
    public int getWorkingHours()
    {
        return workingHours;
    }
    
    /* Crearing a accesor method from where user can access value of developer name */
    public String getDeveloperName()
    {
        return developerName;
    }
    
    /* Creating a method from where user can change developer name*/
    public void setDeveloperName(String developerName)
    {
        this.developerName= developerName;
    }
    
    /* Creating a method that displays all the details to the user. */
    public void display()
    {
        System.out.println("Platform: "+platform);
        System.out.println("Interviewer name: "+ interviewerName);
        System.out.println("Working hour: "+ workingHours);
        if (!developerName.equals("")){
            System.out.println("Developer name: "+developerName);
        }
    }
}
