package com.gradedcodedassignment1;

//Super Department class will be the superclass and all other departments must extend it.
class SuperDepartment {
 // Super department will contain 4 methods of return type String and will not accept any parameter
 String departmentName() {
     return "Super Department";
 }

 String getTodaysWork() {
     return "No Work as of now";
 }

 String getWorkDeadline() {
     return "Nil";
 }

 String isTodayAHoliday() {
     return "Today is not a holiday";
 }
}

//Admin department will contain 3 methods of return type String and will not accept any parameter
class AdminDepartment extends SuperDepartment {
 // Override the departmentName method
 @Override
 String departmentName() {
     return "Admin Department";
 }

 // Override the getTodaysWork method
 @Override
 String getTodaysWork() {
     return "Complete your documents Submission";
 }

 // Override the getWorkDeadline method
 @Override
 String getWorkDeadline() {
     return "Complete by EOD";
 }
}

//Hr department will contain 4 methods of return type String and will not accept any parameter
class HrDepartment extends SuperDepartment {
 // Override the departmentName method
 @Override
 String departmentName() {
     return "Hr Department";
 }

 // Override the getTodaysWork method
 @Override
 String getTodaysWork() {
     return "Fill today’s timesheet and mark your attendance";
 }

 // Override the getWorkDeadline method
 @Override
 String getWorkDeadline() {
     return "Complete by EOD";
 }

 // Add a new method doActivity
 String doActivity() {
     return "team Lunch";
 }
}

//Tech department will contain 4 methods of return type String and will not accept any parameter
class TechDepartment extends SuperDepartment {
 // Override the departmentName method
 @Override
 String departmentName() {
     return "Tech Department";
 }

 // Override the getTodaysWork method
 @Override
 String getTodaysWork() {
     return "Complete coding of module 1";
 }

 // Override the getWorkDeadline method
 @Override
 String getWorkDeadline() {
     return "Complete by EOD";
 }

 // Add a new method getTechStackInformation
 String getTechStackInformation() {
     return "core Java";
 }
}

//Driver class Main will be used to create objects of HrDepartment, TechDepartment, AdminDepartment
public class Main {

public static void main(String[] args) {

   // Create an object of HrDepartment class and display its functionalities
   HrDepartment hr = new HrDepartment();
   System.out.println("Welcome to "+hr.departmentName());
   System.out.println(hr.doActivity());
   System.out.println(hr.getTodaysWork());
   System.out.println(hr.getWorkDeadline());
   System.out.println(hr.isTodayAHoliday());

   // Create an object of TechDepartment class and display its functionalities
   TechDepartment tech = new TechDepartment();
   System.out.println("Welcome to "+tech.departmentName());
   System.out.println(tech.getTodaysWork());
   System.out.println(tech.getWorkDeadline());
   System.out.println(tech.getTechStackInformation());
   System.out.println(tech.isTodayAHoliday());

   // Create an object of AdminDepartment class and display its functionalities
   AdminDepartment admin = new AdminDepartment();
   System.out.println("Welcome to "+admin.departmentName());
   System.out.println(admin.getTodaysWork());
   System.out.println(admin.getWorkDeadline());
   System.out.println(admin.isTodayAHoliday());

}
}
