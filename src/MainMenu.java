import java.util.Scanner;

public class MainMenu {

    Scanner input = new Scanner(System.in);

    public boolean notPlayedBefore = true;
    private int choice;

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }


    public void openMainMenu(){
        if (notPlayedBefore){
            String menu1 = "  -Name of the Game- " + "\n" + " 1.New Game" + "\n" + " 2.Tutorials" + "\n" + " 3.Exit";
            System.out.println(menu1);
            setChoice(input.nextInt());
            if (getChoice() == 1){}
            if (getChoice() == 2){}
            if (getChoice() == 3){
                System.exit(0);
            }
        }
        else{
            String menu2 = "  -Name of the Game- " + "\n" + " 1.Continue" + "\n" + " 2.New Game" + "\n" + " 3.Tutorials" + "\n" + "4.Exit";
            System.out.println(menu2);
            setChoice(input.nextInt());
            if (getChoice() == 1){}
            if (getChoice() == 2){}
            if (getChoice() == 3){}
            if (getChoice() == 4){
                System.exit(0);
            }
        }

    }




}
