package triangle;
import junit.framework.TestCase;

public class triangleTest extends TestCase{
    triangle tri;

    public void testJudgeTriangle(){
        // 不合法输入
        tri = new triangle("abc","def","123");
        assertEquals("输入的不是合法数字！", tri.judgeType());
        tri = new triangle("1.1.1","2","3");
        assertEquals("输入的不是合法数字！", tri.judgeType());
        tri = new triangle("1.1.1","2","");
        assertEquals("输入的不是合法数字！", tri.judgeType());
        // 不能组成三角形
        tri = new triangle("0","1","2");
        assertEquals("不能组成三角形", tri.judgeType());
        tri = new triangle("1","2","3");
        assertEquals("不能组成三角形", tri.judgeType());
        tri = new triangle("1.2","2.2","5.2");
        assertEquals("不能组成三角形", tri.judgeType());
        // 能组成三角形，判断类型
        tri = new triangle("3","4","5");
        assertEquals("直角三角形", tri.judgeType());
        tri = new triangle("0.6","0.8","1");
        assertEquals("直角三角形", tri.judgeType());
        tri = new triangle("3","5","3");
        assertEquals("等腰三角形", tri.judgeType());
        tri = new triangle("2.5","3.5","2.5");
        assertEquals("等腰三角形", tri.judgeType());
        tri = new triangle("2","2","2");
        assertEquals("等边三角形", tri.judgeType());
        tri = new triangle("2.5","2.5","2.5");
        assertEquals("等边三角形", tri.judgeType());
        tri = new triangle("1.4142135624","1","1");
        assertEquals("等腰直角三角形", tri.judgeType());
        tri = new triangle("6","5","4");
        assertEquals("一般三角形", tri.judgeType());
        tri = new triangle("6.5","5.5","4.5");
        assertEquals("一般三角形", tri.judgeType());
    }
    
    public static void main(String[] args) {
        junit.textui.TestRunner.run(triangleTest.class);
    }
}
