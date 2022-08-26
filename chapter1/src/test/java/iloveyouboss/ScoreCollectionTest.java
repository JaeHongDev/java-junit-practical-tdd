package iloveyouboss;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class ScoreCollectionTest {
    @Test
    public void test(){

    }

    @Test
    public void answersArithmeticMeanOfTwoNumbers(){
        ScoreCollection collection = new ScoreCollection();
        collection.add(()-> 5);
        collection.add(()-> 7);

        int actualResult = collection.arithmeticMean();
        //then
        Assert.assertThat(actualResult, CoreMatchers.equalTo(6));
    }
}
