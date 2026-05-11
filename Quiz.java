import java.util.Scanner;

public class Quiz {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        String[] Question={"1. What is main function of the router?",
                "2. Which part of computer is known as brain",
                "3. FB Launched in?",
                "4. Father of computer?",
                "5. First programming language"
        };

        String options[][]={{"1.Storing files", "2. Encrypting data", "3. Directing internet traffic", "4. Managing passwords"},
                {"1. Mouse","2. CPU","3. Monitor","4. Speaker"},{"1. 2000","2. 2004","3. 2006","4. 2008"},
                {"1. Steve Jobs","2. Elon Musk","3. RVD","4. Charles Babbage"},
                {"1.Cobal","2. C","3. Fortran","4. Assembly"}
        };

        int[] ans={3, 2, 2, 4, 3};
        int choice;
        int score=0;
        for(int i=0;i<Question.length;i++){

            System.out.println(Question[i]);
            for(String option : options[i]){
                System.out.println(option);

            }
            System.out.print("Enter Your Choice: ");
            choice= scanner.nextInt();
            if(choice==ans[i]){
                System.out.println("Correct!");
                score++;
            }
            else{
                System.out.println("Oops,It's Wrong!");
                System.out.println("The correct answer is "+ans[i]);
            }
        }
        System.out.println("You have answered "+score+" correct out of 5!");
        double percent=((double) score /5)*100;
        System.out.println("You were "+percent+" correct");

    }
}
