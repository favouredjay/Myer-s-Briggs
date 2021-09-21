package MyersBriggsWithArrayList;

import org.junit.jupiter.api.Test;

import static MyersBriggsWithArrayList.Result.I;
import static org.junit.jupiter.api.Assertions.*;

class MyersBriggsQuestionnaireTest {
    MyersBriggsQuestionnaire questionnaire = new MyersBriggsQuestionnaire();
    Questions questions = new Questions();
    Result options;
    @Test
    void testThatItIsNotNull(){
        assertNotNull(questionnaire);
    }

    @Test
    void testThatMyersBriggsHasQuestions(){
  assertNotNull(questions);
    }

    @Test
    void testThatMyersBriggsHas20Questions(){

        for(String q : questions.getQuestions()){
            System.out.println(q);
        }

    assertEquals(20, questions.getQuestions().length);
    }


   @Test
    void testThatAnswerCanBeInputted(){
        questionnaire.setQuestion(questions);
        questions.getQuestionsAnswers().add("a");
        questions.answers.add("b");
        questions.answers.add("b");
        questions.answers.add("b");
        questions.answers.add("b");
        questions.answers.add("b");
        questions.answers.add("b");
        questions.answers.add("b");
        questions.answers.add("b");
        questions.answers.add("b");
        questions.answers.add("b");
        questions.answers.add("b");
        questions.answers.add("b");
        questions.answers.add("b");
        questions.answers.add("b");
        questions.answers.add("a");
        questions.answers.add("b");
        questions.answers.add("b");
        questions.answers.add("b");
        questions.answers.add("b");
       System.out.println(questionnaire.extrovertOrIntrovert()+""+questionnaire.sensingOrIntuitive()+""+questionnaire.thinkingOrFeeling()+""+questionnaire.judgingOrPerceiving());

       assertEquals(20,questions.getQuestionsAnswers().size());
   }




    


}