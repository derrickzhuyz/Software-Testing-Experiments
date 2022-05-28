public class searchBall{
    private static int ball[] = new int[10];
    public searchBall(){}
    public void setWeight(int weight[]){
        for(int i = 0; i<weight.length; i++){
            ball[i] = weight[i];
        }
    }
    public String output(int i){
        String s = (i+1) + "号是假球！";
        System.out.println(s);
        return s;
    }
    public String searchLighterBall(){
        String res = "";
        if(ball[0] + ball[1] + ball[2] + ball[3] + ball[4] < ball[5] + ball[6] + ball[7] + ball[8] + ball[9]){
            // 0-4
            if(ball[0] + ball[1] == ball[2] + ball[3]){
                // 4
                res = output(4);
                return res;
            }else if(ball[0] + ball[1] < ball[2] + ball[3]){
                // 0-1
                if(ball[0] < ball[1]){
                    res = output(0);
                    return res;
                }else{
                    res = output(1);
                    return res;
                }
            }else{
                // 2-3
                if(ball[2] < ball[3]){
                    res = output(2);
                    return res;
                }else{
                    res = output(3);
                    return res;
                }
            }
        }else{
            // 5-9
            if(ball[5] + ball[6] == ball[7] + ball[8]){
                // 9
                res = output(9);
                return res;
            }else if(ball[5] + ball[6] < ball[7] + ball[8]){
                // 5-6
                if(ball[5] < ball[6]){
                    res = output(5);
                    return res;
                }else{
                    res = output(6);
                    return res;
                }
            }else{
                // 7-8
                if(ball[7] < ball[8]){
                    res = output(7);
                    return res;
                }else{
                    res = output(8);
                    return res;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        searchBall sb = new searchBall();
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
        int testset[][] = {t0, t1, t2, t3, t4, t5, t6, t7, t8, t9};
        for(int i = 0; i<10; i++){
            sb.setWeight(testset[i]);
            System.out.println(sb.searchLighterBall());
        }
    }
}

