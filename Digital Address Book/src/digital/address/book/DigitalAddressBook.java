/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package digital.address.book;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Microsoft
 */
public class DigitalAddressBook {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
  
        Scanner input = new Scanner (System.in);
        ArrayList <Businesses> bus = new ArrayList<>();
          
           String menu1 = "1. Add new person \n"             
                +"2. Add new Businesses \n"
                +"3. exit ";
            while(true){
                             System.out.println(menu1);
                 switch(input.nextInt()) {
                    case 1:
                         personMenu();
                          break;
                    case 2 :
                          BusinessesMenu();
                          break;
                    case 3:
                       System.exit(0);

            default:
                System.out.println("THIS OPTION NOT AVAILABLE try AGAIN "); 
        }
    }
  }
    
    static void personMenu() {
        Scanner input = new Scanner (System.in);
        ArrayList <Person> per1 = new ArrayList<>();
         String menu = 
                 "\n1. add new person contact \n"      
                 +"2. Enter an person name to remove if exists: \n"
                 +"3. print all person comtact \n "
                 +"4. serch by first name and last name \n"
                 +"5. EDITER \n"
                 +"6. exit ";
                   while(true){
                             System.out.println(menu);
                         switch(input.nextInt()){
                           case 1:   System.out.println("----------------------------------");
                            System.out.println("plz enter FIRST_NAME then LAST_NAME ");
                            String str1=input.next();
                            String str11=input.next();
                             System.out.println("\nplz his/her BIRTHDATE \n ");
                             String str2 = input.next();
                             System.out.println("\n_plz enter CITY \n");
                             String str3 = input.next();
                              System.out.println("\nplz enter COUNTRY \n " );
                             String str4 = input.next(); 
                             System.out.println("\n_plz enter EMAIL \n ");
                             String str5 = input.next();
                             System.out.println("\n_plz enter POSTLCODE \n ");
                             String str6 = input.next();
                             System.out.println("\n_plz enter TELPHONE \n ");
                             int str7 = input.nextInt();
                            Person p1 =new Person( str1 , str11, str2, str3, str4, str5, str6 ,str7);

                             per1.add( p1);
                             break;
                 
                      case 2:
                                System.out.print("Enter an person first name and last name to remove if exists: ");
                                  String name=input.next();
                                  String name1=input.next();
                           for (int i = 0; i < per1.size(); i++) {
                                 
                                  if(per1.get(i).getFirstName().equals(name)&&(per1.get(i).getLasrName().equals(name1)))
                                     per1.remove(i);
                                  
                                   else {
                                   System.out.println("THIS NAME DOSE NOT EXIST");          }
                               
                                 }
                          
                      
                           break;
                      case 3:
                          for (int i = 0; i < per1.size(); i++) {
                              System.out.println("----------------------------------");

                              System.out.println(per1.get(i).toString());
                              System.out.println("----------------------------------");
                        }
                          break;
                      case 4:
                          for (int i = 0; i < per1.size(); i++) {
                                 System.out.println("enter name ");
                                  String str = input.next();
                                 per1.get(i).compareBy(str);
                          }
                      case 5 : 
                      {
                          String menu22= "1. edit first name \n"
                                  +"2. edit last name \n"
                                  +"3. edit birthdate \n"
                                  +"4. edit city \n"
                                  +"5. edit country \n"
                                  +"6. edit email \n"
                                  +"7. edit postlcode \n "
                                  +"8. edit telphone number \n"
                                  +"9. exist";
                          while (true) {                              
                              System.out.println(menu22);
                       
                          for (int i = 0; i < per1.size(); i++) {
                              System.out.println("enter what do you want to edit ");
                              switch (input.nextInt()) {
                                  case 1:
                                       per1.get(i).setFirstName(input.next());
                                   break;
                                  case 2 :
                                       per1.get(i).setLasrName(input.next());
                                      break;
                                  case 3 :
                                      per1.get(i).setBD(input.next());
                                      break;
                                  case 4 :
                                      per1.get(i).setCity(input.next());
                                      break;
                                  case 5:
                                      per1.get(i).setCountry(input.next());
                                      break;
                                  case 6 :
                                      per1.get(i).setEmail(input.next());
                                      break ;
                                  case 7 :
                                      per1.get(i).setPostlcode(input.next());
                                      break ; 
                                  case 8:
                                      per1.get(i).setTelphone(input.nextInt());
                                      break;
                                  case 9 :
                                      return;
                                    
                                  default:
                                      System.out.println(" OUT OF RANGE ");
                              
                                    }
                          
                                }
                               
                              break;
                              }     
                          break;

                      }
                     case 6:
                        return;
                      
                    }
                } 
    }
    
  static void BusinessesMenu () {
          Scanner input = new Scanner (System.in);
     ArrayList <Businesses> bus = new ArrayList<>();
     
       String menu = 
                 "1. add new Businesses contact \n"      
                 +"2. Enter an TITLE of business to remove if exists:\n"
                 +"3. print all business conact \n"
                 +"4. serch by Title of business \n"
                 +"5. EDITER \n"
                 +"6. exit ";
                     
                 while(true){
                             System.out.println(menu);
                         switch(input.nextInt()){
                           case 1:
                            System.out.println("plz enter title of business");
                            String str8=input.next();
                            System.out.println("plz enter the gener of business ");
                            String str9=input.next();
                            System.out.println("plz enter FIRST_NAME then LAST_NAME of contact person ");
                            String str1=input.next();
                            String str11=input.next();
                             System.out.println("\nplz his/her BIRTHDATE of contact person \n ");
                             String str2 = input.next();
                             System.out.println("\n_plz enter CITY of contact person \n");
                             String str3 = input.next();
                              System.out.println("\nplz enter COUNTRY of contact person\n " );
                             String str4 = input.next(); 
                             System.out.println("\n_plz enter EMAIL of contact person \n ");
                             String str5 = input.next();
                             System.out.println("\n_plz enter POSTLCODE of contact person \n ");
                             String str6 = input.next();
                             System.out.println("\n_plz enter TELPHONE of contact person \n ");
                             int str7;
                             str7 = input.nextInt();
                             System.out.println("\n_plz enter website of business \n");
                             String str111 = input.next();
                             System.out.println("\n_plz enter CITY of business \n");
                             String str10 = input.next();
                              System.out.println("\nplz enter COUNTRY of business \n " );
                             String str12 = input.next(); 
                             System.out.println("\n_plz enter EMAIL of business \n ");
                             String str13 = input.next();
                             System.out.println("\n_plz enter POSTLCODE of business \n ");
                             String str14 = input.next();
                             System.out.println("\n_plz enter TELPHONE of business \n ");
                             int str15 = input.nextInt();
                             
                            Businesses b1  = new Businesses(str8, str9, new Person(str1, str11, str2, str3, str4, str5, str6, str7), str111, str10, str12, str13, str14, str15);
                            
                             bus.add( b1);
                             break;
                 
                     case 2:
                                System.out.print("Enter an TITLE of business to remove if exists: ");
                                  String Title=input.next();
                           for (int i = 0; i < bus.size(); i++) {
                                 
                                  if(bus.get(i).getTitle().equals(Title))
                                     bus.remove(i);
                                  
                                   else {
                                   System.out.println("THIS TITLE DOSE NOT EXIST");          }
                               
                                 }
                          
                      
                           break;
                      case 3:
                          for (int i = 0; i < bus.size(); i++) {
                              System.out.println(bus.get(i).toString());
                              System.out.println("----------------------------------");
                        }
                          break;
                      case 4:
                          for (int i = 0; i < bus.size(); i++) {
                                 System.out.println("enter Title ");
                                  String str = input.next();
                                 bus.get(i).compareBy(str);
                          }
                          
                        break;
                        case 5 : 
                      {
                          String menu22=  
                                  "1. edit Title \n"
                                  +"2. edit genre \n"
                                  +"3. edit contact person\n"
                                  +"4. edit website \n"
                                  +"5. edit city \n "
                                  +"6. edit country \n"
                                  +"7. edit email \n"
                                  +"8. edit postlcode \n "
                                  +"9. edit telphone number \n"
                                  +"10. exist";
                          while (true) {                              
                              System.out.println(menu22);
                       
                          for (int i = 0; i < bus.size(); i++) {
                              System.out.println("enter what do you want to edit ");
                              switch (input.nextInt()) {
                                  case 1:
                                       bus.get(i).setTitle(input.next());
                                   break;
                                  case 2 :
                                       bus.get(i).setGenre(input.next());
                                      break;
                                   case 3 :
                                      bus.get(i).setWebsite(input.next());
                                      break;
                                  case 4:
                                      bus.get(i).setCity(input.next());
                                      break;
                                  case 5:
                                      bus.get(i).setCountry(input.next());
                                      break;
                                  case 6 :
                                      bus.get(i).setEmail(input.next());
                                      break ;
                                  case 7 :
                                      bus.get(i).setPostlcode(input.next());
                                      break ; 
                                  case 8:
                                      bus.get(i).setTelphone(input.nextInt());
                                      break;
                                  case 9 :
                                      return;
                                    
                                  default:
                                      System.out.println(" OUT OF RANGE ");
                              
                                    }
                          
                                }
                               
                              break;
                              }     
                          break;

                      }
                     case 6:
                        return;
                         
                    }
                } 
    }
       
           
   }   


