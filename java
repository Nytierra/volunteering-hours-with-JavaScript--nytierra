package nytierra;

public class Project {
	public static void main(String[] args) {
        // Variable declarations
        String volunteerName = "Nytierra";
        String motto = "Nick is here to save the web from bad styles! With the power to manipulate CSS at will, Nick ensures every website is visually stunning.";
        //changing motto
        motto= "Saving the web using CSS";
        int hoursMonday = 3;
        int hoursTuesday = 2;
        int hoursWednesday = 0;
        int hoursThursday = 4;
        int hoursFriday = 1;
        int hoursSaturday = 2;
        int minimumVolunteerHours = 14;

        //  total volunteer hours
        int totalHours = hoursMonday + hoursTuesday + hoursWednesday + hoursThursday + hoursFriday;
        //true/ false
        boolean minimumHoursMet = totalHours >= minimumVolunteerHours;
      
           if (minimumHoursMet) {
        	 
        	 System.out.println("true");
         } else {
        	 System.out.println("false");
         }

     // result
        System.out.println(volunteerName + " volunteered for " + hoursMonday + ", " + hoursTuesday + ", " + hoursWednesday + ", " + hoursThursday + ", " + hoursFriday + "," + hoursSaturday + "," + " hours respectively, and their total contribution is " + totalHours + " hours.");
        
      //volunteerstaus 
       
        String volunteerStatusMessage;
        if (totalHours >= minimumVolunteerHours) {
            volunteerStatusMessage = "met the goal";
        } else {
            volunteerStatusMessage = " did not meet the goal";
        }
          //result
        System.out.println(volunteerName +  volunteerStatusMessage + " this week ");
        
        //result from mon-fri
        System.out.println("Total volunteer hours from Monday to Friday: " + totalHours);
          //motto
        System.out.println("Update motto:" + motto);
        
     System.out.println(volunteerName + " has contributed " + totalHours + " hours this week.");
     System.out.println(volunteerName + " has " + volunteerStatusMessage + " this week.");

}
}	
