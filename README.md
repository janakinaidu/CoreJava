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
