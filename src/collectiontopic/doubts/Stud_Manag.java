package collectiontopic.doubts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Stud_Manag
{
		public static void main(String args[])
		{
			int choice = 0;
			Scanner sc = new Scanner(System.in);
			ArrayList<Student> list = new ArrayList<Student>();
			while(choice!=5)
			{
				System.out.println("Enter below choice");
				System.out.println("1) Insert");
				System.out.println("2) Update");
				System.out.println("3) Delete");
				System.out.println("4) display All records");
				System.out.println("5) searching by Name");	
				choice = sc.nextInt();
				switch(choice)
				{
						
							case 1: // Insert Student
									Student s = new Student();
									s.scan();
									list.add(s);		
									System.out.println("Student records successfully inserted in list object");
									break;

							case 2: 	
									
									System.out.println("Enter Rno which you want to update : ");
									int searchRno = sc.nextInt();
									boolean flag=false;
									s = null;
									int i;
									for(i=0 ;i<list.size();i++) 
									{
										 s = list.get(i);
										if(searchRno==s.rno)
										{	
											System.out.println("Records found in List Object----");
											flag= true;// i-- 
											break;
										}
									}
									if(flag)
									{
											s.update();
											list.set(i,s);
											System.out.print("Student Record suucessfully Updated in List Object.");
											// list.disp();
											break;


									}	
									else
									{
										System.out.println("Given rno not found in List records");
										break;	
									}
								

							case 3: int ch1= 0;
									System.out.println("Enter your choice:");
									System.out.println("1--------------------->By roll no");
									System.out.println("2--------------------->By name");
									System.out.println("3--------------------->By std");
									ch1 = sc.nextInt();
									switch(ch1)
									{
										case 1:
											sc.nextLine();
											Student s1 = new Student();
											System.out.println("Enter rollno  you want to delete: ");
											int searchr = sc.nextInt();
											boolean flag1 = false;
											s1 = null;
											int j;
										
												for(j=0;j<list.size();j++)
												{
												
													s1 = list.get(j);
													if(searchr == s1.rno)
													{
														System.out.println("Records found in List Object----");
														flag1 = true;// i-- 
														break;	
													}
												}
												if(flag1)
												{
										
														list.remove(j);
														s1.disp();
														// System.out.println(searchr+"-"+s1.rno);/h
														System.out.println("The Record is deleted successfully");
														break;
												}
												else
												{
													System.out.println("Given rno not found in List records");	
													break;	
												}
												

										case 2:

												sc.nextLine();
												Student s2 = new Student();
												System.out.println("Enter name  you want to delete: ");
												String searchn = sc.nextLine();
												boolean flag2 = false;
												s2 = null;

													for(j=0;j<list.size();j++)
													{
																s2 = list.get(j);
																// System.out.println(searchn+"-"+s2.name);
																if(searchn.equals(s2.name))
																{
																		System.out.println("Records found in the list object...");
																		flag2 = true;
																		break;
																}

													}
													if(flag2)
													{	
																list.remove(j);
																System.out.println("The Record is deleted successfully");

													}
													else
													{
																System.out.println("Given name not found in List records");	
													}

									}		
									break;	
							case 4: 	
									Iterator<Student>itr = list.iterator();
									while(itr.hasNext())
									{
											s = itr.next();
//											list.disp(s);
											s.disp();
									}
									break;
							case 5:
									sc.nextLine();
									System.out.println("Enter student Name :");
									String searchname = sc.nextLine();
									boolean flag3 = true;
									
									for(i=0;i<list.size();i++)
									{
											s= list.get(i);
											if(s.name.equals(searchname))
											{
													s.disp();
													flag = false;
													break;
											}

									}
									if(flag3)
									{

											System.out.println("Given Student name not found in student list.");
									}
									break;
				}			
		}
	}
}