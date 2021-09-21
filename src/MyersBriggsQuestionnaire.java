import java.util.Scanner;
import Exception.InvalidInputException;

public class MyersBriggsQuestionnaire {
static Scanner input = new Scanner(System.in);
static String answer;

    String [] answerToQuestion = new String[20];
    String [] questions = {
                    "1. a. expend energy, enjoy groups or b. conserve energy, enjoy one-on-one" ,
                    "2. a. interpret literally or b. look for meaning and possibilities" ,
                    "3. a. logical, thinking, questioning or b. empathetic, feeling, accommodating" ,
                    "4. a. organized, orderly or b. flexible, adaptable" ,
                    "5. a. more outgoing, think out loud or b. more reserved, think to yourself" ,
                    "6. a. practical, realistic, experiential or b. imaginative, innovative, theoretical" ,
                    "7. a. candid, straight forward, frank or b. tactful, kind, encouraging" ,
                    "8. a. plan, schedule or b. unplanned, spontaneous" ,
                    "9. a. seek many tasks, public activities, interaction with others or b. seek private, solitary activities with quiet to concentrate" ,
                    "10. a. standard, usual, conventional or b. different, novel, unique" ,
                    "11. a. firm, tend to criticize, hold the line or b. gentle, tend to appreciate, conciliate" ,
                    "12. a. regulated, structured or b. easygoing, “live” and “let live”" ,
                    "13. a. external, communicative, express yourself or b. internal, reticent, keep to yourself" ,
                    "14. a. focus on here-and-now or b. look to the future, global perspective, “big picture”" ,
                    "15. a. tough-minded, just or b. tender-hearted, merciful" ,
                    "16. a. preparation, plan ahead or b. go with the flow, adapt as you go" ,
                    "17. a. active, initiate or b. reflective, deliberate" ,
                    "18. a. facts, things, “what is” or b. ideas, dreams, “what could be,” philosophical" ,
                    "19. a. matter of fact, issue-oriented or b. sensitive, people-oriented, compassionate" ,
                    "20. a. control, govern or b. latitude, freedom"
        };


    public  void choice() throws InvalidInputException {

        for (int j = 0; j < answerToQuestion.length; j++) {
            System.out.println(questions[j]);

            System.out.println("Enter your answer: ");
            answer = input.next();

            if (answer.equalsIgnoreCase("A") ) {
                answerToQuestion[j] = answer;
            }
            else if( answer.equalsIgnoreCase("B")){
                answerToQuestion[j] = answer;
            }
           validateAnswer();
        }
    }
    public String introvertOrExtrovert()  {
        int E = 0;
        int I = 0;
                for(int i = 0; i< questions.length; i=i+4){

            if(answerToQuestion[i].equalsIgnoreCase("A")){
               E++;
            }
            else if(answerToQuestion[i].equalsIgnoreCase("B")){
                I++;
            }
        }
                if(E > I){
                    return "E (Extrovert)";
                }
                else
                    return "I (Introvert)";

    }
    public String sensingOrIntuitive()  {
        int S = 0;
        int N = 0;
        for (int i = 1; i< questions.length; i+=4){

            if(answerToQuestion[i].equalsIgnoreCase("A")){
                S++;
            }
            else if(answerToQuestion[i].equalsIgnoreCase("B")){
                N++;
            }
        }
        if(S > N){
            return "S (Sensing)";
        }
        else
            return "N (Intuitive)";


    }

    public String thinkingOrFeeling()  {
        int T = 0;
        int F = 0;
        for(int i = 2; i < questions.length; i+=4){

            if(answerToQuestion[i].equalsIgnoreCase("A")){
                T++;
            }
            else if(answerToQuestion[i].equalsIgnoreCase("B")){
                F++;
            }
        }
        if(T > F){
            return "T (Thinking)";
        }
        else
            return "F (Feeling)";

    }
    public String judgingOrPerceiving()  {
        int P = 0;
        int J = 0;
        for (int i = 3; i< questions.length; i+=4){

            if(answerToQuestion[i].equalsIgnoreCase("A")){
                J++;
            }
            else if(answerToQuestion[i].equalsIgnoreCase("B")){
                P++;
            }
        }
        if(J > P){
            return "J (Judging)";
        }
        else
            return "P (Perceiving)";

    }
    public  void validateAnswer() throws InvalidInputException {
        for (int j = 0; j < answerToQuestion.length ; j++) {


        if  (!(answer.equalsIgnoreCase("A")|| answer.equalsIgnoreCase("B")) ){
            throw new InvalidInputException("options are a or b, try again");
        }

        }
        }



    public static void main(String[] args) throws InvalidInputException {
        try {
            MyersBriggsQuestionnaire questionnaire = new MyersBriggsQuestionnaire();
            questionnaire.choice();
            for (String i : questionnaire.answerToQuestion)
                System.out.println(i);
            System.out.println("Your personality test result is: \n" + questionnaire.introvertOrExtrovert() + "\n" + questionnaire.sensingOrIntuitive() + "\n" + questionnaire.thinkingOrFeeling() + "\n" + questionnaire.judgingOrPerceiving());
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }
    }
}