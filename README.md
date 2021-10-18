# CoreJava Comparable and Comparator
About some important topics of Corejava
Comparable vs Comparator and its importance on comparing the java objects

Differnces:
===========
1.Comparable interface can be used to provide single way of sorting whereas Comparator interface is used to provide different ways of sorting.
2.For using Comparable, Class needs to implement it whereas for using Comparator we don’t need to make any change in the class.
3.Comparable interface is in java.lang package whereas Comparator interface is present in java.util package.
4.We don’t need to make any code changes at client side for using Comparable, Arrays.sort() or Collection.sort() methods automatically uses the compareTo() method of the class. For Comparator, client needs to provide the Comparator class to use in compare() method

//source:
journeldev,greekforce,javatpoint
----------------------------------------------------------------------------------------------------------------------------------------
                    private  int returnSomeValue() {
                        try {
                          int x = 0/3; //This is not ArithmeticException
                          return 1;
                        }catch(ArithmeticException ae) {
                          ae.printStackTrace();
                          return 2;
                        }
                        catch(Exception ex){
                          ex.printStackTrace();
                          return 3;
                        }
                      }
                      
                      package com.naidu;
------------------------------------------------------
                  public class A {

                    static {
                      System.out.println("i m from static Block");//calls 1st
                    }

                    {
                      System.out.println("i m from instance Block");
                    }

                    public static void main(String[] args) {
                      System.out.println("Hai I m from main method");//comes in 2nd place
                      A a = new A();//i m from instance Block
                    }

                  }
                  OutPut:
                    i m from static Block
                    Hai I m from main method
                    i m from instance Block
