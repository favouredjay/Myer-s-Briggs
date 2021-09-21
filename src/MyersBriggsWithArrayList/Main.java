package MyersBriggsWithArrayList;

import Exception.InvalidInputException;

public class Main {
    public static void main(String[] args) {

            try {
                Questions questions = new Questions();
                MyersBriggsQuestionnaire questionnaire = new MyersBriggsQuestionnaire();
                questionnaire.setQuestion(questions);
                questionnaire.choice();
                for (String a : questions.getQuestionsAnswers()) {
                    System.out.println(a);
                }
                System.out.println(questionnaire.extrovertOrIntrovert() + "" + questionnaire.sensingOrIntuitive() + questionnaire.thinkingOrFeeling() + questionnaire.judgingOrPerceiving());
            }
            catch (IllegalArgumentException e){
                e.printStackTrace();
            }


        }
    }



