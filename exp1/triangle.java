import java.io.*;
import java.util.regex.Pattern;

public class triangle {
    private String as, bs, cs;
    private static String s1, s2, s3;
    
    public triangle(){}
    public void setA(String as){
        this.as = as;
    }
    public void setB(String bs){
        this.bs = bs;
    }
    public void setC(String cs){
        this.cs = cs;
    }
    public boolean isTriangle(){
        if(!isNum(as) || !isNum(bs) || !isNum(cs)){
            return false;
        }
        Double a = Double.parseDouble(as);
        Double b = Double.parseDouble(bs);
        Double c = Double.parseDouble(cs);
        return ((a + b > c) && (a + c > b) && (b + c > a) && (a > 0) && (b > 0) && (c > 0));
    }
    public boolean isNum(String str){
        // 正则表达式判断整数、浮点数
        // ?:0或1个, *:0或多个, +:1或多个 
        // 匹配所有整数
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        // 匹配小数
        Pattern pattern2 = Pattern.compile("^[-\\+]?[\\d]+[.][\\d]+$");
        return pattern.matcher(str).matches() || pattern2.matcher(str).matches();
    }
    public triangle(String _a, String _b, String _c){
        setA(_a);
        setB(_b);
        setC(_c);
    }
    public String judgeType(){
        if(!isNum(as) || !isNum(bs) || !isNum(cs)){
            return "输入的不是合法数字！";
        }
        Double a = Double.parseDouble(as);
        Double b = Double.parseDouble(bs);
        Double c = Double.parseDouble(cs);
        if(isTriangle()){
            if(Math.abs(a - b) < 0.0000001 && Math.abs(b - c) < 0.0000001){
                return "等边三角形";
            }else if(Math.abs(a - b) < 0.0000001 || Math.abs(b - c) < 0.0000001 || Math.abs(a - c) < 0.0000001){
                if(Math.abs(Math.pow(a, 2) - Math.pow(b, 2) - Math.pow(c, 2)) < 0.0000001
                || Math.abs(Math.pow(b, 2) - Math.pow(a, 2) - Math.pow(c, 2)) < 0.0000001
                || Math.abs(Math.pow(c, 2) - Math.pow(b, 2) - Math.pow(a, 2)) < 0.0000001){
                    return "等腰直角三角形";
                }else{
                    return "等腰三角形";
                }
            }else{
                if(Math.abs(Math.pow(a, 2) - Math.pow(b, 2) - Math.pow(c, 2)) < 0.0000001
                || Math.abs(Math.pow(b, 2) - Math.pow(a, 2) - Math.pow(c, 2)) < 0.0000001
                || Math.abs(Math.pow(c, 2) - Math.pow(b, 2) - Math.pow(a, 2)) < 0.0000001){
                    return "直角三角形";
                }else{
                    return "一般三角形";
                }
            }
        }else{
            return "不能组成三角形";
        }
    }
    public void inputAndSet(){
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入三角形的三边：");
            System.out.println("a = ");
            s1 = in.readLine();
            // while(!isNum(s1)){
            //     System.out.println("不是数字，请重新输入数字！");
            //     System.out.println("a = ");
            //     s1 = in.readLine();
            // }
            System.out.println("b = ");
            s2 = in.readLine();
            // while(!isNum(s2)){
            //     System.out.println("不是数字，请重新输入数字！");
            //     System.out.println("b = ");
            //     s2 = in.readLine();
            // }
            System.out.println("c = ");
            s3 = in.readLine();
            // while(!isNum(s3)){
            //     System.out.println("不是数字，请重新输入数字！");
            //     System.out.println("c = ");
            //     s3 = in.readLine();
            // }
        } catch (IOException e) {
            //TODO: handle exception
        }
        setA(s1);
        setB(s2);
        setC(s3);
    }

    public static void main(String[] args) {
        triangle tri = new triangle();
        tri.inputAndSet();
        System.out.print(tri.judgeType());
    }
}

