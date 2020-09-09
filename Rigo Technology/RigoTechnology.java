/**
 * Write a description of class RigoTechnology here.
 *
 * @author Ayush Amatya
 * @version 1.1
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
//Creating a class RigoTechnology that implements an interface ActionListener;
public class RigoTechnology implements ActionListener
{
    //Creating array list named "list";
    ArrayList<Developer> list = new ArrayList<Developer>();
    
    //Declearing 1st value of integer i as 0. This is later used as id in combo box;
    int i = 0;
    
    //Declaring frame;
    JFrame myFrame;
    
    //Declaring all the JLabel that will be used in the frame;
    JLabel lblSeniorDeveloper, lblPlatformS, lblInterviewerNameS, 
    lblWorkingHoursS, lblDotLineSen, lblSalaryS, lblContractPeriod, lblDeveloperNameS,
    lblJoiningDate, lblAdvanceSalary, lblStaffRoomNumber, lblSelectPlatformS,
    lblEndLine, lblJuniorDeveloper, lblPlatformJ, lblInterviewerNameJ, lblSalaryJ, 
    lblWorkingHoursJ, lblAppointedBy, lblTerminationDate1, lblDotLineJun,
    lblDeveloperNameJ, lblAppointedDate, lblSpecialization, lblSelectPlatformJ, 
    lblEvaluationPeriod, lblTerminationDate2;
    
    //Declaring all the JTextBox that will be used in the frame;
    JTextField txtPlatformS, txtInterviewerNameS, txtWorkingHoursS, txtSalaryS,
    txtContractPeriod, txtDeveloperNameS, txtJoiningDate, txtAdvanceSalary,
    txtStaffRoomNumber, txtPlatformJ, txtInterviewerNameJ, txtSalaryJ, 
    txtWorkingHoursJ, txtAppointedBy, txtTerminationDate1, txtTerminationDate2, txtDeveloperNameJ, 
    txtAppointedDate, txtSpecialization, txtEvaluationPeriod;
    
    //Declearing all the JButton that will be used in the frame;
    JButton btnAddSen, btnHire, btnTerminate, btnAddJun, btnAppoint, btnDisplayAll, btnClear;
    
    //Declaring all the JComboBox that will be used in the frame;
    JComboBox cmbSelectPlatformS, cmbSelectPlatformJ;
    
    //Creating a methode named "gui" where all the code that displays required information in frame is written. This methode will be called in main methode. 
    public void gui(){
        //Creating frame "myFrame";
        myFrame = new JFrame("Rigo Technology");
        myFrame.setVisible(true);
        //Declearing size of the frame;
        myFrame.setSize(650,700);
        myFrame.setLayout(null);
        
        //Creating JLabel "lblSeniorDeveloper" which displays "Senior Developer" in our frame;
        lblSeniorDeveloper = new JLabel ("SENIOR DEVELOPER");
        //Declearing font of the text;
        lblSeniorDeveloper.setFont(new Font("",Font.PLAIN, 22));
        //Declearing location and size of lblSeniorDeveloper. (x-axis, y-axis, width, height);
        lblSeniorDeveloper.setBounds(200, 5, 300, 25);
        //adding lblSeniorDeveloper to the frame;
        myFrame.add(lblSeniorDeveloper);
        
        lblPlatformS = new JLabel ("Platform:");
        lblPlatformS.setBounds (70, 75, 60, 23);
        myFrame.add(lblPlatformS);
        
        //Creating JTextField "txtPlatformS" to enter the value of platform;
        txtPlatformS = new JTextField ();
        //Declearing location and size of txtPlatformS. (x-axis, y-axis, width, height);
        txtPlatformS.setBounds(130, 75, 140, 23);
        //adding txtPlatformS to the frame;
        myFrame.add(txtPlatformS);
        
        lblInterviewerNameS = new JLabel("Interviewer Name:");
        lblInterviewerNameS.setBounds(20, 40, 110, 23);
        myFrame.add(lblInterviewerNameS);
        
        txtInterviewerNameS = new JTextField();
        txtInterviewerNameS.setBounds(130, 40, 200, 23);
        myFrame.add(txtInterviewerNameS);
        
        lblWorkingHoursS = new JLabel("Working Hours:");
        lblWorkingHoursS.setBounds(390, 40, 90, 23);
        myFrame.add(lblWorkingHoursS);
        
        txtWorkingHoursS = new JTextField();
        txtWorkingHoursS.setBounds(485, 40, 110, 23);
        myFrame.add(txtWorkingHoursS);
        
        lblSalaryS = new JLabel("Salary:");
        lblSalaryS.setBounds(440, 75, 60, 23);
        myFrame.add(lblSalaryS);
        
        txtSalaryS = new JTextField();
        txtSalaryS.setBounds(485, 75, 110, 23);
        myFrame.add(txtSalaryS);
        
        lblContractPeriod = new JLabel("Contract Period:");
        lblContractPeriod.setBounds(30, 110, 100, 23);
        myFrame.add(lblContractPeriod);
        
        txtContractPeriod = new JTextField();
        txtContractPeriod.setBounds(130, 110, 110, 23);
        myFrame.add(txtContractPeriod);
        
        btnAddSen = new JButton("Add");
        btnAddSen.setBounds(450, 110, 70, 25);
        myFrame.add(btnAddSen);
        
        lblDotLineSen = new JLabel("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        lblDotLineSen.setBounds(5, 140, 650, 20);
        myFrame.add(lblDotLineSen);
        
        lblDeveloperNameS = new JLabel("Developer Name:");
        lblDeveloperNameS.setBounds(25, 170, 100, 23);
        myFrame.add(lblDeveloperNameS);
        
        txtDeveloperNameS = new JTextField();
        txtDeveloperNameS.setBounds(130, 170, 165, 23);
        myFrame.add(txtDeveloperNameS);
        
        lblJoiningDate = new JLabel("Joining Date:");
        lblJoiningDate.setBounds(405, 205, 90, 23);
        myFrame.add(lblJoiningDate);
        
        txtJoiningDate = new JTextField();
        txtJoiningDate.setBounds(485, 205, 110, 23);
        myFrame.add(txtJoiningDate);
        
        lblStaffRoomNumber = new JLabel("Staff Room Number:");
        lblStaffRoomNumber.setBounds(365, 170, 120, 23);
        myFrame.add(lblStaffRoomNumber);
        
        txtStaffRoomNumber = new JTextField();
        txtStaffRoomNumber.setBounds(485, 170, 110, 23);
        myFrame.add(txtStaffRoomNumber);
        
        lblAdvanceSalary = new JLabel("Advance Salary:");
        lblAdvanceSalary.setBounds(30, 240, 100, 23);
        myFrame.add(lblAdvanceSalary);
        
        txtAdvanceSalary = new JTextField();
        txtAdvanceSalary.setBounds(130, 240, 110, 23);
        myFrame.add(txtAdvanceSalary);
        
        lblSelectPlatformS = new JLabel("Select Platform:");
        lblSelectPlatformS.setBounds(30, 205, 100, 23);
        myFrame.add(lblSelectPlatformS);
        
        //Ceating JComboBox "cmbSelectPlatformS" that allows the user to select the required platform;
        //Creating list "selectPlatformS[]" that stored the options of platform that is displayed in the combo box;
        String selectPlatformS[] = {"Select platform", "No platform registered"};
        cmbSelectPlatformS = new JComboBox(selectPlatformS);
        //Declearing the location and size of cmbSelectPlatformS. (x-axis, y-axis, width, height);
        cmbSelectPlatformS.setBounds(130, 205, 165, 23);
        //Adding cmbSeletPlatform to the frame;
        myFrame.add(cmbSelectPlatformS);
        
        //Creating JButton "btnHire";
        btnHire = new JButton("Hire");
        btnHire.setBounds(420, 240, 70, 25);
        myFrame.add(btnHire);
        
        btnTerminate = new JButton("Terminate");
        btnTerminate.setBounds(500, 240, 95, 25);
        myFrame.add(btnTerminate);
        
        lblEndLine = new JLabel("========================================================================================");
        lblEndLine.setBounds(5, 270, 650, 20);
        myFrame.add(lblEndLine);
        
        lblJuniorDeveloper = new JLabel ("JUNIOR DEVELOPER");
        lblJuniorDeveloper.setFont(new Font("",Font.PLAIN, 22));
        lblJuniorDeveloper.setBounds(200, 290, 300, 25);
        myFrame.add(lblJuniorDeveloper);
        
        lblPlatformJ = new JLabel ("Platform:");
        lblPlatformJ.setBounds (70, 400, 60, 23);
        myFrame.add(lblPlatformJ);
        
        txtPlatformJ = new JTextField ();
        txtPlatformJ.setBounds(130, 400, 140, 23);
        myFrame.add(txtPlatformJ);
        
        lblInterviewerNameJ = new JLabel("Interviewer Name:");
        lblInterviewerNameJ.setBounds(20, 365, 110, 23);
        myFrame.add(lblInterviewerNameJ);
        
        txtInterviewerNameJ = new JTextField();
        txtInterviewerNameJ.setBounds(130, 365, 200, 23);
        myFrame.add(txtInterviewerNameJ);
        
        lblAppointedBy = new JLabel("Appointed By:");
        lblAppointedBy.setBounds(45, 330, 110, 23);
        myFrame.add(lblAppointedBy);
        
        txtAppointedBy = new JTextField();
        txtAppointedBy.setBounds(130, 330, 200, 23);
        myFrame.add(txtAppointedBy);
        
        lblWorkingHoursJ = new JLabel("Working Hours:");
        lblWorkingHoursJ.setBounds(390, 330, 90, 23);
        myFrame.add(lblWorkingHoursJ);
        
        txtWorkingHoursJ = new JTextField();
        txtWorkingHoursJ.setBounds(485, 330, 110, 23);
        myFrame.add(txtWorkingHoursJ);
        
        lblSalaryJ = new JLabel("Salary:");
        lblSalaryJ.setBounds(440, 365, 60, 23);
        myFrame.add(lblSalaryJ);
        
        txtSalaryJ = new JTextField();
        txtSalaryJ.setBounds(485, 365, 110, 23);
        myFrame.add(txtSalaryJ);
        
        lblTerminationDate1 = new JLabel("Termination Date:");
        lblTerminationDate1.setBounds(380, 400, 100, 23);
        myFrame.add(lblTerminationDate1);
        
        txtTerminationDate1= new JTextField();
        txtTerminationDate1.setBounds(485, 400, 110, 23);
        myFrame.add(txtTerminationDate1);
        
        btnAddJun = new JButton("Add");
        btnAddJun.setBounds(450, 435, 70, 25);
        myFrame.add(btnAddJun);
        
        lblDotLineJun = new JLabel("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        lblDotLineJun.setBounds(5, 465, 650, 20);
        myFrame.add(lblDotLineJun);
        
        lblDeveloperNameJ = new JLabel("Developer Name:");
        lblDeveloperNameJ.setBounds(25, 495, 100, 23);
        myFrame.add(lblDeveloperNameJ);
        
        txtDeveloperNameJ = new JTextField();
        txtDeveloperNameJ.setBounds(130, 495, 165, 23);
        myFrame.add(txtDeveloperNameJ);
        
        lblAppointedDate = new JLabel("Appointed Date:");
        lblAppointedDate.setBounds(385, 530, 90, 23);
        myFrame.add(lblAppointedDate);
        
        txtAppointedDate = new JTextField();
        txtAppointedDate.setBounds(485, 530, 110, 23);
        myFrame.add(txtAppointedDate);
        
        lblEvaluationPeriod = new JLabel("Evaluation Period:");
        lblEvaluationPeriod.setBounds(375, 495, 120, 23);
        myFrame.add(lblEvaluationPeriod);
        
        txtEvaluationPeriod = new JTextField();
        txtEvaluationPeriod.setBounds(485, 495, 110, 23);
        myFrame.add(txtEvaluationPeriod);
        
        lblSpecialization = new JLabel("Specialization:");
        lblSpecialization.setBounds(40, 565, 85, 23);
        myFrame.add(lblSpecialization);
        
        txtSpecialization = new JTextField();
        txtSpecialization.setBounds(130, 565, 110, 23);
        myFrame.add(txtSpecialization);
        
        lblSelectPlatformJ = new JLabel("Select Platform:");
        lblSelectPlatformJ.setBounds(30, 530, 100, 23);
        myFrame.add(lblSelectPlatformJ);
        
        String selectPlatformJ[] = {"Select platform", "No platform registered"};
        cmbSelectPlatformJ = new JComboBox(selectPlatformJ);
        cmbSelectPlatformJ.setBounds(130, 530, 165, 23);
        myFrame.add(cmbSelectPlatformJ);
        
        btnAppoint = new JButton("Appoint");
        btnAppoint.setBounds(450, 600, 80, 25);
        myFrame.add(btnAppoint);
        
        btnDisplayAll = new JButton("Display All");
        btnDisplayAll.setBounds(200, 620, 100, 30);
        myFrame.add(btnDisplayAll);
        
        btnClear = new JButton("Clear");
        btnClear.setBounds(310, 620, 100, 30);
        myFrame.add(btnClear);
        
        lblTerminationDate2 = new JLabel("Termination Date:");
        lblTerminationDate2.setBounds(380, 565, 100, 23);
        myFrame.add(lblTerminationDate2);
        
        txtTerminationDate2= new JTextField();
        txtTerminationDate2.setBounds(485, 565, 110, 23);
        myFrame.add(txtTerminationDate2);
        
        //adding ActionListener to all the button used in this frame. This decides the functions of the button;
        btnClear.addActionListener(this);
        btnAddSen.addActionListener(this);
        btnAddJun.addActionListener(this);
        btnHire.addActionListener(this);
        btnTerminate.addActionListener(this);
        btnAppoint.addActionListener(this);
        btnDisplayAll.addActionListener(this);
        
        //Closing the program if user clicks close button on top of the window;
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    //Creating a methode actionPerformed that is inside ActionListener;
    public void actionPerformed(ActionEvent e)
    {
        //This code runs if user click btnClear;
        if (e.getSource() == btnClear){
            //Calling method clear() of same class(this class);
            clear();
        }
        
        //This code runs if user click btnAddSen;
        if(e.getSource() == btnAddSen){
            //Calling method addSen() of same class(this class);
            addSen();
        }
        
        //This code runs if user click btnAddJun;
        if(e.getSource() == btnAddJun){
            //Calling method addJun() of same class(this class);
            addJun();
        }
        
        //This code runs if user click btnHire;
        if(e.getSource() == btnHire){
            //Calling method hire() of same class(this class);
            hireSen();
        }       
        
        //This code runs if user click btnTerminate;
        if(e.getSource() == btnTerminate){
            //Calling method terminateSen() of same class(this class);
            terminateSen();
        }
        
        //This code runs if user click btnAppoint;
        if(e.getSource() == btnAppoint){
            //Calling method appointJun() of same class(this class);
            appointJun();
        }
        
        //This code runs if user click btnDisplayAll;
        if(e.getSource() == btnDisplayAll){
            //Calling method displayAll() of same class(this class);
            displayAll();
        }
    }
    
    //Declearing methode addSen() which decleares functions of btnAddSen;
    public void addSen()
    {
        //declearing a try except so that there are no RunTime errors if there occur some errors;
        try{
            //Storing the values entered by user in the text box of frame into string variables;
            String platformS = txtPlatformS.getText();
            String interviewerNameS = txtInterviewerNameS.getText();
            String workingHoursS = txtWorkingHoursS.getText();
            String salaryS = txtSalaryS.getText();
            String contractPeriod = txtContractPeriod.getText();
                
            //Checking if any textboxes are empty or not;
            if(platformS.equals("") || interviewerNameS.equals("") || workingHoursS.equals("") || salaryS.equals("") || 
            contractPeriod.equals("")){
                //Displaying message in a dialogbox using JOptionPane;
                JOptionPane.showMessageDialog(myFrame, "Please fill up all the required information");
            }
            else{
                //convertig values of working hours, slary and contract period into integer;
                int intWorkingHoursS = Integer.parseInt(workingHoursS);
                int intSalaryS = Integer.parseInt(salaryS);
                int intContractPeriod = Integer.parseInt(contractPeriod);
                    
                //Creating the object(senDev) of SeniorDeveloper with all the required arguments;
                SeniorDeveloper senDev = new SeniorDeveloper(platformS, interviewerNameS, intWorkingHoursS, intSalaryS, intContractPeriod);
                    
                //Adding the object(senDev) of SeniorDeveloper in the arraylist(list); 
                list.add(senDev);
                    
                if(cmbSelectPlatformS.getItemAt(1).equals("No platform registered")){
                    cmbSelectPlatformS.removeItemAt(1);
                }
                //Adding the name of the platform available in SeniorDeveloper in combo box(cmbSelectPlatformS);
                cmbSelectPlatformS.addItem("(id: " + i + ") " + platformS);
                i=i+1;
                    
                //Displaying sucess message in the dialogbox;
                JOptionPane.showMessageDialog(myFrame, "The platform "+ platformS + " is sucessfully registered to Senior Developer");
            }
        }
        //This contains the code that is to be runned if the above code produces any error;
        catch(Exception exp){
            JOptionPane.showMessageDialog(myFrame, "Working hours, Salary and contract period must be a numeric value.");
        }
    }
    
    //Declearing methode hireSen() which decleares functions of btnHire;
    public void hireSen()
    {
        try{
            String developerNameS = txtDeveloperNameS.getText();
            String staffRoomNumber = txtStaffRoomNumber.getText();
            //Storing the value selected by user in combo box in new String variable(selectPlatformS);
            String selectPlatformS = cmbSelectPlatformS.getSelectedItem().toString();
            String joiningDate = txtJoiningDate.getText();
            String advanceSalary = txtAdvanceSalary.getText();
            
            if(developerNameS.equals("") || staffRoomNumber.equals("") || selectPlatformS.equals("Select platform") || 
            joiningDate.equals("") || advanceSalary.equals("")){
                JOptionPane.showMessageDialog(myFrame, "Please fill up all the required information");
            }
            else if(selectPlatformS.equals("No platform registered")){
                JOptionPane.showMessageDialog(myFrame, "There are no any platform registered");
            }
            else{
                float floatAdvanceSalary = Float.parseFloat(advanceSalary);
                    
                //Storing the index of the platform selected by user in new integer variable(indexS) from selectPlatformS;
                int indexS = Character.getNumericValue(selectPlatformS.charAt(5));
                    
                //Casting the object of Developer into object of SeniorDeveloper;
                //Here list.get(indexS) is the object of Developer class stored in index(indexS) of arraylist(list) and senVar stores that object as the object of SeniorDeveloper; 
                SeniorDeveloper senVar = (SeniorDeveloper)list.get(indexS);
                    
                if (senVar.getAppointed() == true){
                    JOptionPane.showMessageDialog(myFrame, "The developer is already hired in this platform: " + selectPlatformS);
                }
                else{
                    //caling hire methode of SeniorDeveloper using SeniorDeveloper object(senVar);
                    senVar.hire(developerNameS, joiningDate, floatAdvanceSalary, staffRoomNumber);
                    
                    JOptionPane.showMessageDialog(myFrame, "The developer: "+ developerNameS +" is successfully hired in platform: " + senVar.platform);
                }
            }
                
        }
        catch(Exception exp){
            JOptionPane.showMessageDialog(myFrame, "The value of Advance salary should be float");
        }
    }
    
    //Declearing methode terminateSen() which decleares functions of btnTerminate;
    public void terminateSen()
    {
        String selectPlatformS = cmbSelectPlatformS.getSelectedItem().toString();
        if (selectPlatformS.equals("Select platform") || selectPlatformS.equals("No platform registered")){
            JOptionPane.showMessageDialog(myFrame, "Please select the platform that you want to terminate");
        }
        else{
            //Storing the index of the platform selected by user in new integer variable(index) from selectPlatformS;
            int index = Character.getNumericValue(selectPlatformS.charAt(5));
            //Casting the object of Developer into object of SeniorDeveloper;
            //Here list.get(indexS) is the object of Developer class stored in index(indexS) of arraylist(list) and senVar stores that object as the object of SeniorDeveloper;
            SeniorDeveloper senVar = (SeniorDeveloper)list.get(index);
                
            if(senVar.getAppointed() == false){
                JOptionPane.showMessageDialog(myFrame, "1st appoint the developer before terminating it");
            }
            else if(senVar.getTerminated() == true && senVar.getAppointed() == true){
                JOptionPane.showMessageDialog(myFrame, "The contract of developer of platform: " + selectPlatformS + " is already terminated");
            }
            else{
                JOptionPane.showMessageDialog(myFrame, "The contract of developer of platform: " + selectPlatformS + " is sucessfully terminated");
                //Calling termination() method of SeniorDeveloper through object od SeniorDeveloper(senVar);
                senVar.termination();
            }
        }
    }
    
    //Declearing methode addJun() which decleares functions of btnAddJun;
    public void addJun()
    {
        //declearing a try except so that there are no RunTime errors if there occur some errors;
        try{
            //Storing the values entered by user in the text box of frame into string variables;
            String platformJ = txtPlatformJ.getText();
            String interviewerNameJ = txtInterviewerNameJ.getText();
            String workingHoursJ = txtWorkingHoursJ.getText();
            String salaryJ = txtSalaryJ.getText();
            String terminationDate1 = txtTerminationDate1.getText();
            String appointedBy = txtAppointedBy.getText();                
                
            //Checking if any textboxes are empty or not;
            if(platformJ.equals("") || interviewerNameJ.equals("") || workingHoursJ.equals("") || salaryJ.equals("") || 
            terminationDate1.equals("") || appointedBy.equals("")){
                JOptionPane.showMessageDialog(myFrame, "Please fill up all the required information");
            }
    
            else{
                //convertig values of working hours and salary into integer;
                int intWorkingHoursJ = Integer.parseInt(workingHoursJ);
                int intSalaryJ = Integer.parseInt(salaryJ);
                    
                //Creating the object(junDev) of JuniorDeveloper with all the required arguments;
                JuniorDeveloper junDev = new JuniorDeveloper(platformJ, interviewerNameJ, intWorkingHoursJ, intSalaryJ, appointedBy, terminationDate1);
                    
                //Adding the object(junDev) of JuniorDeveloper in the arraylist(list); 
                list.add(junDev);
                    
                if(cmbSelectPlatformJ.getItemAt(1).equals("No platform registered")){
                    cmbSelectPlatformJ.removeItemAt(1);
                }
                //Adding the name of the platform available in JuniorDeveloper in combo box(cmbSelectPlatformJ);
                cmbSelectPlatformJ.addItem("(id: " + i + ") " + platformJ);
                i=i+1;

                JOptionPane.showMessageDialog(myFrame, "The platform "+ platformJ + " is sucessfully registered to Junior Developer");
            }
        }
        //This contains the code that is to be runned if the above code produces any error;
        catch(Exception exp){
            JOptionPane.showMessageDialog(myFrame, "Working hours and Salary must be a numeric value.");
        }
    }
    
    //Declearing methode appointJun() which decleares functions of btnAppoint;
    public void appointJun()
    {
        String developerNameJ = txtDeveloperNameJ.getText();
        String selectPlatformJ = cmbSelectPlatformJ.getSelectedItem().toString();
        String specialization = txtSpecialization.getText();
        String evaluationPeriod = txtEvaluationPeriod.getText();
        String appointedDate = txtAppointedDate.getText();
        String terminationDate2 = txtTerminationDate2.getText();
                
        if(developerNameJ.equals("") || selectPlatformJ.equals("Select platform") || specialization.equals("") ||
        evaluationPeriod.equals("") || appointedDate.equals("") || terminationDate2.equals("")){
            JOptionPane.showMessageDialog(myFrame, "Please fill all the required information");
        }
        else if (selectPlatformJ.equals("No platform registered")){
            JOptionPane.showMessageDialog(myFrame, "There are no any platform registered");
        }
        else{
            int indexJ = Character.getNumericValue(selectPlatformJ.charAt(5));
            JuniorDeveloper junVar = (JuniorDeveloper)list.get(indexJ);
                
            if(junVar.getJoined() == true){
                JOptionPane.showMessageDialog(myFrame, "The developer is already appointed in this platform");
            }
            else{                    
                junVar.appoint(developerNameJ, terminationDate2, appointedDate, specialization, evaluationPeriod);
                JOptionPane.showMessageDialog(myFrame, "The developer is sucessfully appointed in platform: "+ selectPlatformJ);
            }
        }
    }
    
    //Declearing methode displayAll() which decleares functions of btnDisplayAll;
    public void displayAll()
    {
        //loopig all the items of arraylist(list) using for loop;
        for (Developer obj: list){
            //checking of the object is instance of SeniorDeveloper or not;
            if(obj instanceof SeniorDeveloper){                    
                System.out.println("Senior Developer:");
                System.out.println("id: " + Integer.toString(list.indexOf(obj)));
                obj.display();
            }
            else{
                System.out.println("Junior Developer:");
                System.out.println("id: " + Integer.toString(list.indexOf(obj)));
                obj.display();
            }
            System.out.println("");
        }
    }
    
    //Declearing methode clear() which decleares functions of btnClear;
    public void clear()
    {
        txtPlatformS.setText("");
        txtInterviewerNameS.setText("");
        txtWorkingHoursS.setText("");
        txtSalaryS.setText("");
        txtContractPeriod.setText("");
        txtDeveloperNameS.setText("");
        txtJoiningDate.setText("");
        cmbSelectPlatformS.setSelectedItem("Select platform");
        txtAdvanceSalary.setText("");
        txtStaffRoomNumber.setText("");
        txtPlatformJ.setText("");
        txtInterviewerNameJ.setText("");
        txtSalaryJ.setText("");
        txtWorkingHoursJ.setText("");
        txtAppointedBy.setText("");
        txtTerminationDate1.setText("");
        txtTerminationDate2.setText("");
        txtDeveloperNameJ.setText(""); 
        txtAppointedDate.setText("");
        txtSpecialization.setText("");
        cmbSelectPlatformJ.setSelectedItem("Select platform");
        txtEvaluationPeriod.setText("");
    }
    //Creating the main method;
    public static void main(String []args)
    {
        //Calling gui() methode of RigoTechnology() through the object of RigoTechnology(); 
        new RigoTechnology().gui();
    }
}
