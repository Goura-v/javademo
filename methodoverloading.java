class test{
    public int add(int a, int b){
        int result = a+b;
        return result;
    }
    public double add(double a, double b){
        double result = a+b;
        return result;
    }
    public int add(int a, int b, int c, int d){
        int result = a+b+c+d;
        return result;
    }
}

public class methodoverloading {
    public static void main(String[] args) {
        test obj = new test();
        int res1 = obj.add(10,20);
        double res2 = obj.add(10.5,20.5);
        int res3 = obj.add(10,20,30,40);
        System.out.println(res1); 
        System.out.println(res2); 
        System.out.println(res3); 
    }
}
