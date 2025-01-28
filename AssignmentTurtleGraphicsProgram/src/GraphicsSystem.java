import uk.ac.leedsbeckett.oop.OOPGraphics;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class GraphicsSystem extends OOPGraphics
{
    String[] userCommand;
    ArrayList <String> commands = new ArrayList<>();
    String lastCommand = "clear";
    String saveWarningVal;

    public GraphicsSystem()
    {
        JFrame MainFrame = new JFrame();
        //create a frame to display the turtle panel on

        MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Make sure the app exits when closed

        MainFrame.setLayout(new FlowLayout());
        //not strictly necessary

        MainFrame.add(this);
        //"this" is this object that extends turtle graphics so we are adding a
        // turtle graphics panel to the frame

        MainFrame.pack();
        //set the frame to a size we can see
        MainFrame.setVisible(true);
        penDown();
    }
    @Override
    public void processCommand(String userInput)
    {
        userInput = userInput.toLowerCase();
        boolean isComValid = checkCommand(userInput);

        if (isComValid)
        {
            performCommand(userInput);
            // if you clear or load command back to back,
            // the command would be performed
            lastCommand = userCommand[0];
            commands.add(userInput);

        }

        else
        {
            System.out.println("Invalid Command. Can not perform it.");
        }
    }

    public void performCommand(String userInput)
    {
        // add it to an array that record all the valid commands the user has made.
        userCommand = userInput.split(" ");

        // Basic commands
        switch(userCommand[0])
        {
            // Methods with no parameter
            // Draw OOP
            case "about": about();
                break;
            // Clears the canvas
            case "clear":
                if (saveWarning())
                {
                    clear();
                }
                break;
            // Resets the turtle position to the beginning/center
            case "reset": reset();
                break;
            // Ink
            case "pendown": penDown();
                break;
            // No Ink
            case "penup": penUp();
                break;

            // Colours
            case "black": setPenColour(Color.black);
                break;
            case "white": setPenColour(Color.white);
                break;
            case "green": setPenColour(Color.green);
                break;
            case "red": setPenColour(Color.red);
                break;

            // Methods with a parameter
            case "forward": forward(Integer.parseInt(userCommand[1]));
                break;
            case "backward": forward(-Integer.parseInt(userCommand[1]));
                break;
            case "turnleft": turnLeft(Integer.parseInt(userCommand[1]));
                break;
            case "turnright": turnRight(Integer.parseInt(userCommand[1]));
                break;
            case "square": square(Integer.parseInt(userCommand[1]));
                break;
            case "triangle":
                if (userCommand.length == 2)
                {
                    triangle(Integer.parseInt(userCommand[1]));
                }
                else
                {
                    scaleneTriangle(Integer.parseInt(userCommand[1]),Integer.parseInt(userCommand[2]),Integer.parseInt(userCommand[3]));
                }
                break;
            case "penwidth": penwidth(Integer.parseInt(userCommand[1]));
                break;
            case "pencolour": penColour(Integer.parseInt(userCommand[1]),Integer.parseInt(userCommand[2]),Integer.parseInt(userCommand[3]));
                break;
            case "save":
                saveCommands(commands, userCommand[1]);
                commands.clear();
                break;
            case "load":
                if (saveWarning())
                {
                    clear();
                    reset();
                    loadCommands(userCommand[1]);
                }
                break;
            case "saveimage": saveImage(userCommand[1]);
                System.out.println("Saving B");
                break;
            case "loadimage":
                if (saveWarning())
                {
                    loadImage(userCommand[1]);
                }
                break;

        }
    }

    public boolean checkCommand(String userInput) {
        userCommand = userInput.split(" ");
        ArrayList<String> commandsWithoutParameters = new ArrayList<>(Arrays.asList("about", "penup", "pendown", "reset", "clear", "black", "white", "red", "green"));
        ArrayList<String> commandsWithOneParameter = new ArrayList<>(Arrays.asList("forward", "backward", "turnleft", "turnright", "square","triangle", "penwidth", "save", "load", "saveimage", "loadimage"));
        ArrayList<String> commandsWithMultipleParameters = new ArrayList<>(Arrays.asList("pencolour","triangle"));

        // Commands without parameters
        if (userCommand.length == 1)
        {
            if (commandsWithoutParameters.contains(userCommand[0]))
            {
                return true;
            }
            // checks valid command but with missing parameters
            else if (commandsWithOneParameter.contains(userCommand[0]))
            {
                System.out.println("Missing parameter");
                return false;
            }
            else if (commandsWithMultipleParameters.contains(userCommand[0]))
            {
                System.out.println("Missing parameter");
                return false;
            }
            else
            {
                return false;
            }
        }

        // Commands with a single parameter
        else if (userCommand.length == 2)
        {
            if (commandsWithOneParameter.contains(userCommand[0]))
            {
                return checkParameter(userCommand[1]);
            }
            else
            {
                System.out.println("Invalid command");
                return false;
            }
        }

        // Commands with a single parameter
        else if (userCommand.length == 4)
        {
            if (commandsWithMultipleParameters.contains(userCommand[0]))
            {
                // check all 3 parameters
                for (int i = 1; i < 4; i++)
                {
                    boolean isParameterValid = checkParameter(userCommand[i]);
                    if (!isParameterValid)
                    {
                        return false;
                    }
                }

                // colour have different parameter
                if (Objects.equals(userCommand[0], "pencolour"))
                {
                    return checkColour(Integer.parseInt(userCommand[1]),Integer.parseInt(userCommand[2]),Integer.parseInt(userCommand[3]));
                }

                // Hypotenuse needs to be larger than the sum of the opposing side
                else if (Objects.equals(userCommand[0], "triangle"))
                {
                    return checkTriLengths(Integer.parseInt(userCommand[1]),Integer.parseInt(userCommand[2]),Integer.parseInt(userCommand[3]));
                }

                else
                {
                    return true;
                }

            }

            else
            {
                System.out.println("Invalid command");
                return false;
            }
        }

        // Any invalid commands
        else
        {
            System.out.println("Invalid Command");
            return false;
        }

    }


    public boolean checkParameter(String parameterString)
    {
        if (userCommand[0].equals("saveimage") || userCommand[0].equals("loadimage"))
        {
            return true;
        }
        else if (userCommand[0].equals("save") || userCommand[0].equals("load"))
        {
            return true;
        }

        try
        {
            double parameter = Integer.parseInt(parameterString);
            if (parameter < 0 || parameter > 800)
            {
                System.out.println("Please enter a sensible value:\n\tMin = 0\n\tMax = 800");
                return false;
            }
            else
            {
                System.out.println("This is a valid parameter");
                return true;
            }
        }

        catch (Exception NumberFormatException)
        {
            System.out.println("This is a non numeric value");
            return false;
        }
    }

    public void about()
    {
        reset();
        myName();
        super.about();
    }

    public void myName()
    {
        setStroke(10);
        // z
        penUp();
        forward(-125);
        turnLeft(90);
        forward(-200);

        penDown();
        forward(50);
        turnRight(135);
        forward(70);
        turnLeft(135);
        forward(50);

        penUp();
        forward(20);

        //a
        setPenColour(Color.white);
        penDown();
        turnLeft(60);
        forward(60);
        turnRight(120);
        forward(60);
        forward(-20);
        turnRight(120);
        forward(40);

        forward(-40);
        turnLeft(120);
        forward(20);
        turnLeft(60);

        penUp();
        forward(20);

        // I
        setPenColour(Color.green);
        penDown();
        turnLeft(90);
        forward(50);

        forward(-50);
        turnRight(90);

        penUp();
        forward(20);

        // N
        setPenColour(Color.blue);
        penDown();
        turnLeft(90);
        forward(50);
        turnRight(135);
        forward(70);
        turnLeft(135);
        forward(50);

        reset();
    }

    public void square(int length)
    {
        for (int i = 0; i < 4; i++)
        {
            forward(length);
            turnRight(90);
        }
    }

    public void triangle(int length)
    {
        for (int i = 0; i < 3; i++)
        {
            forward(length);
            turnLeft(120);
        }
    }

    public void scaleneTriangle(int a, int b, int c)
    {
        ArrayList <Integer> triLengths = new ArrayList<>(Arrays.asList(a,b,c));

        int A, B, C;
        A = (int) Math.round(Math.toDegrees(Math.acos( (Math.pow(b,2) + Math.pow(c,2) - Math.pow(a,2)) / (2*b*c) )));
        B = (int) Math.round(Math.toDegrees(Math.acos( (Math.pow(a,2) + Math.pow(c,2) - Math.pow(b,2)) / (2*a*c) )));
        C = (int) Math.round(Math.toDegrees(Math.acos( (Math.pow(a,2) + Math.pow(b,2) - Math.pow(c,2)) / (2*a*b) )));
        ArrayList <Integer> angles = new ArrayList<>(Arrays.asList(C,A,B));

        for (int i = 0; i < 3; i++)
        {
            System.out.println(triLengths.get(i));
            System.out.println(angles.get(i));
            System.out.println();
            forward(triLengths.get(i));
            turnLeft(180 - angles.get(i));
        }

    }

    public void penwidth(int length)
    {
        setStroke(length);
    }

    @Override
    public void reset()
    {
        super.reset();
        setPenColour(Color.red);
        penwidth(1);
        penDown();
    }

    public void penColour(int r, int g, int b)
    {
        setPenColour(new Color(r,g,b));
    }

    public boolean checkColour(int r, int g, int b)
    {
        ArrayList <Integer> myArray = new ArrayList<>(Arrays.asList(r,g,b));
        for (int colour: myArray)
        {
            if (colour > 255 || colour < 0)
            {
                System.out.println("Invalid Colour");
                return false;
            }
        }

        return true;
    }

    public boolean checkTriLengths(int a , int b, int c)
    {
        int[] sides = {a,b,c};
        Arrays.sort(sides);

        // b + c < a
        if (sides[0] + sides[1] > sides[2])
        {
            return true;
        }
        else
        {
            System.out.println("Invalid: The sum of the two smallest side need to bigger than th largest side");
            return false;
        }
    }

    // Saves all commands previously typed as a text file
    public void saveCommands(ArrayList <String> commands, String filename)
    {
        try
        {
            FileWriter writer = new FileWriter( filename + ".txt");
            for (String command: commands)
            {
                writer.append(command);
                writer.append("\n");
            }
            writer.close();
            System.out.println("File Saved");

        }
        catch(IOException e)
        {
            System.out.println("File not Saved");
        }
    }

    public void saveImage(String filename)
    {
        BufferedImage img = getBufferedImage();
        File imagefile = new File(filename + ".jpeg");
        try
        {
            ImageIO.write(img, "jpeg", imagefile);
            System.out.println("Image saved");
        }
        catch (IOException e)
        {
            System.out.println("Error: Not Saved");
        }
    }

    public void loadImage(String filename)
    {

        BufferedImage img;
        try
        {
            img = ImageIO.read(new File(filename+ ".jpeg"));
            setBufferedImage(img);
        }
        catch (IOException e)
        {
            System.out.println("Can't load image");
        }
    }

    public void loadCommands(String filename)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(filename + ".txt"));
            String line;
            reset();
            while ((line = reader.readLine()) != null)
            {
                System.out.println(line);
                performCommand(line);
            }
            reader.close();
        }
        catch (IOException e)
        {
            System.out.println("Not a valid text file:");
        }
    }


    public boolean saveWarning()
    {
        ArrayList <String> saveCommands = new ArrayList<>(Arrays.asList("save", "saveimage", "load", "loadimage", "clear"));
        if (saveCommands.contains(lastCommand))
        {
            return true;
        }
        else
        {
            saveWarningVal = JOptionPane.showInputDialog("Your current image is not saved!\n Enter 1 to continue");
            if (Objects.equals(saveWarningVal, "1"))
            {
                JOptionPane.showMessageDialog(null, "Command performed.");
                return true;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Command ignored.");
                saveWarningVal = "0";
                return false;
            }
        }
    }

}