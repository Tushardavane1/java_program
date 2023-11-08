class patient 
{
    String name;
    int age;
   int oxy_level;
   int HRCT_report;
   patient(String  name,int age,int oxy_level,int HRCT_report)
   {
    this.name = name;
    this.age = age;
    this.oxy_level = oxy_level;
    this.HRCT_report = HRCT_report;
   }

   void display_report(){
    if(oxy_level<95){
        if(HRCT_report>10){
            System.out.println("Patient is covid Positive (+) and need Hospitalized");
        }
    }
    else{
        System.out.println("********Infomation***********");
        System.out.println("Patient Name ::"+name);
         System.out.println("Patient Age ::"+age);
          System.out.println("Patient Oxy_level"+oxy_level);
           System.out.println("Patient HRCT ::"+HRCT_report);
           System.out.println("*****Patient is Normal******");

    }
}
}
class hospital{
    public static void main(String args[])
    {
      patient obj = new patient("Tushar", 20, 94, 11);
      obj.display_report();
    }
}