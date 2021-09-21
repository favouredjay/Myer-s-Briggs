package MyersBriggsWithArrayList;

import java.util.*;

import static MyersBriggsWithArrayList.Result.*;

public class MyersBriggsQuestionnaire {
    private Questions question;
    private Questions answers;
    private Result options;

    String answerToQuestion = "";


    public String[] questionQuestion() {
        return question.getQuestions();
    }

    public Questions getQuestion() {
        return question;
    }

    public void setQuestion(Questions question) {
        this.question = question;
    }

    public List<String> getAnswers() {
        return answers.getQuestionsAnswers();
    }



Scanner input=new Scanner(System.in);
    public void choice() throws IllegalArgumentException{


        for(int counter=0;counter<20;counter++){
            System.out.println(questionQuestion()[counter]);
            System.out.println("Enter your answer");
            answerToQuestion=input.next();
            System.out.println(question.getQuestionsAnswers().add(answerToQuestion));
            validateInput();
        }

    }

    public Result extrovertOrIntrovert(){
int A=0;
int B=0;
        for(int i = 0; i<20; i=i+4){

            if(question.getQuestionsAnswers().get(i).equalsIgnoreCase("A")){

                A++;

            }
            else if(question.getQuestionsAnswers().get(i).equalsIgnoreCase("b")){

                B++;

            }
        }
        if(A > B){
            return options=E;
        }
        else {
            return options=I;
        }

    }
    public Result getResult(){
        return options;
    }
    public Result sensingOrIntuitive()  {
        int A=0;
        int B=0;
        for (int i = 1; i< question.getQuestions().length; i+=4){

            if(question.getQuestionsAnswers().get(i).equalsIgnoreCase( question.getOptionA())){
                A++;
            }
            else if(question.getQuestionsAnswers().get(i).equalsIgnoreCase(question.getOptionB())){
                B++;
            }
        }
        if(A>B){
         return  options = S;
        }
        else
          return  options = N;


    }

    public Result thinkingOrFeeling()  {
        int A=0;
        int B=0;
        for(int i = 2; i < question.getQuestions().length; i+=4){

            if(question.getQuestionsAnswers().get(i).equalsIgnoreCase(question.getOptionA())){
              A++;
            }
            else if(question.getQuestionsAnswers().get(i).equalsIgnoreCase(question.getOptionB())){
                B++;
            }
        }
        if(A>B){
         return    options = T;
        }
        else
          return   options = F;

    }
    public Result judgingOrPerceiving()  {
        int A=0;
        int B=0;
        for (int i = 3; i< question.getQuestions().length; i+=4){

            if(question.getQuestionsAnswers().get(i).equalsIgnoreCase(question.getOptionA())){
                A++;
            }
            else if(question.getQuestionsAnswers().get(i).equalsIgnoreCase(question.getOptionB())){
                B++;
            }
        }
        if(A>B){
          return   options = J;
        }
        else
         return    options = P;

    }
    public void validateInput(){
        for (int j = 0; j < question.getQuestionsAnswers().size() ; j++) {


            if  (!(question.getQuestionsAnswers().get(j).equalsIgnoreCase("A")|| question.getQuestionsAnswers().get(j).equalsIgnoreCase("B")) ){
                throw new IllegalArgumentException("options are a or b, try again");
            }



        }
    }



}
