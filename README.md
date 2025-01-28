[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/mx4vd1Bo)

Note: The lack of commits is due to the fact that i made this website as a school project. Therefore, all the work was\ 
stored in a private school owned repository. 

Marks: 100/100

# OOP 2024 Portfolio
## Zain Jahangir
### CS4C
### Duncan Mullier

## Main Assignment (80 marks)
**Turtle Graphics Assignment**\
**committed by 6th May 10am**\
1 Basic Application           -- Done\
2 Command Processing          -- Done\
3 Validating Commands        -- Done\
4 Loading and Saving          -- Done\
5 Extending OOPGraphics library    -- Done


## Weekly Schedule (20 marks)
**1 Getting Started**\
**committed by 5th February**\
1 Hello World        -- Done\
2 Test               -- Done\
3 Personal Details   -- Done\
4 Diamonds           -- Done\
5 Questions          -- Done

**2 Data and Expressions**\
**committed by 19th February**\
1 Table of Student Grades  -- Done\
2 Computing Averages       -- Done\
3 Miles to Kilometers      -- Done\
4 Square Calculation       -- Done\
5 Fraction -- to do        -- Done

**3 Selection and Iteration**\
**committed by 26th February**\
1 Computing a Pay Increase   -- Done\
2 Rock, Paper, Scissors      -- Done\
3 String Reverser            -- Done\
4 Punctuation Marks          -- Done

**4 Classes and Objects**\
**committed by 4th March**\
1 Using String Objects     -- Done\
2 Dice                     -- Done\
3 Formatting Output        -- Done\
4 Pin Encryption           -- Done\
5 Sphere.Sphere Calculation       -- Done

**5 and 6 Writing Classes and Methods**\
**committed by 18th March**\
1 Sphere.Sphere       -- Done\
2 Books        -- Done\
3 Bulb         -- Done\
4 Accounts     -- Done\
5 Cards        -- Done

**7 Inheritance**\
**committed by 8th April**\
1 Hospital            -- Done\
2 Player Statistics   -- Done

**8 Polymorphism**\
**committed by 15th April**\
1 Firm Vacation           -- Done\
2 Password                -- Done

**9 Further Arrays**\
**committed by 22nd April**\
1 Histogram             -- Done\
2 L&L Bank Accounts     -- Done\
3 Post Codes            -- Done\
4 Quiz Time             -- to do

## Notes
sout + tab for shortcut\
public static void main (String[] args);\

Assignment in java works right to left
import java.util.Scanner;\
Scanner scan = new Scanner(System.in):\
Enter button = creates a new line = Computer represent this as \n\
scan.nextInt() - doesn't read the new line character \n instead it is carried on.\
The next scanner picks this up and assume a value has been entered even though one hasn't.


How to make a list:\
    String[] varName = {"Item1", "Item2", "Item3", ...}

For loops : for(Starting point, Condition/ End point, Step)\
    for (int i = 0; i <= 5; i++)\
    {\
        ...\
    }

i++ shortcut for i = i + 1\
i-- shortcut for i = i - 1


If Statements:\
    if (condition)\
    {\
        ...\
    }\
    else if (condition)\
    {\
        ...\
    }\
    else\
    {\
        ...\
    }

for (String word : words)\
{\
System.out.println(word);\
}

String[] words = sentence.split(" ");

How to make an Array
    ArrayList<String> food = new ArrayList <String>();
    food.add("Cheeseburger");

    ArrayList<Integer> numList = new ArrayList <Integer>();
    numList.add(5);
    System.out.println(sentenceArray.get(0));

    2D list
    ArrayList<ArrayList<String>> sentenceArray = new ArrayList<>();

Array only use reference data types

Learn about Array vs Collections
For each loop used for arrays
Enhanced For loop
        String sentenceStr = "Mary, had a . little. lamb,";
        ArrayList<String> sentenceArray = new ArrayList<>();
        
        for (String i: sentenceStr.split(""))
        {
            System.out.println(i);
            sentenceArray.add(i);
        }

        System.out.println(sentenceArray);
        System.out.println(sentenceArray.get(15));

Shortcut =         sentenceArray.addAll(Arrays.asList(sentenceStr.split("")));
                    ArrayList<String> sentenceArray = new ArrayList<>(Arrays.asList(sentenceStr.split("")));

final double ==> the value cant be changed.

methods are just java version of functions
write static void instead of def

When return values from a method, You have to write the data type of the value instead of void.
overloaded methods = methods that share the same name but have different parameters.
name + parameter = method signature

Constructor = a special method that is called when an object is instantiated (means created)
constructor have the written with a class and have the same name as a class and are wtitten as follows:
creates a instance of a class.

    classname(){
    
    }

Allows use to create object that have different atrributes
Example;

    public class Sphere.Sphere {
        int diameter;
        Sphere.Sphere(int diameter) {
            this.diameter = diameter;
        }
    }

main file:

    public class Sphere.MultiSphere {
    public static void main (String[] args) {
        Sphere.Sphere sphere1 = new Sphere.Sphere(5);
        Sphere.Sphere sphere2 = new Sphere.Sphere(10);

        System.out.println(sphere1.diameter);
        System.out.println(sphere2.diameter);
        }
    }

in order to access an object attributes from inside the class we have use the this. keyword

    void printDiameter()
    {
        System.out.println("The diameter of the sphere is: " + this.diameter);
    }

how to call it from the main file
    
    sphere1.printDiameter();


Variables declared inside a class but outside the scope of any blocks, constructors, or methods 
    are known as instance variables in Java.

## The small print
Enter your details above. Keep your portfolio up to date. You will also store your assignment here.
When you have done an exercise change **-- to do** to **-- completed**.
You can use this file to keep any notes that you may find useful in the phase test.

For each of the exercises create a project in the relevant directory (see myBeckett if you do not know how to do this).
By the end you will have a complete set of projects for the exercises and a project for the assignment in this repo.
For each project you should create a Readme.md file and show the output of your project.
This portfolio is marked and therefore needs to follow these instructions.

By submitting this work you are confirming that the work in this repo is your own, with all credit given to any sources
of help. Such sources might include software tools. You also confirm that you have read and understood the regulations 
relating to academic misconduct.
