import junit.framework.TestCase;

public class searchBallTest extends TestCase{
    int t0[] = {1,2,2,2,2,2,2,2,2,2};
    int t1[] = {2,1,2,2,2,2,2,2,2,2};
    int t2[] = {2,2,1,2,2,2,2,2,2,2};
    int t3[] = {2,2,2,1,2,2,2,2,2,2};
    int t4[] = {2,2,2,2,1,2,2,2,2,2};
    int t5[] = {2,2,2,2,2,1,2,2,2,2};
    int t6[] = {2,2,2,2,2,2,1,2,2,2};
    int t7[] = {2,2,2,2,2,2,2,1,2,2};
    int t8[] = {2,2,2,2,2,2,2,2,1,2};
    int t9[] = {2,2,2,2,2,2,2,2,2,1};
    public void testBallProgram(){
        searchBall sbt = new searchBall();
        int testset[][] = {t0, t1, t2, t3, t4, t5, t6, t7, t8, t9};
        for(int i = 0; i<10; i++){
            sbt.setWeight(testset[i]);
            String expectedS = (i+1) + "号是假球！";
            String actualS = sbt.searchLighterBall();
            assertEquals(expectedS, actualS);
        }
    }
    public static void main(String[] args) {
        junit.textui.TestRunner.run(searchBallTest.class);
    }
}
