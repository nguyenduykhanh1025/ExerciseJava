public class Bai15 {
    
    public boolean isTriangle(int a, int b, int c) {
        if((a + b) < c || (a + c) < b || (b + c) < a) {
            return false;
        }
        return true;
    }

    public double getPerimeter(int a, int b, int c){
        if(isTriangle(a,b,c)){
            return a + b + c;
        }
        return -1;
    }
    public double getArea(int a, int b, int c) {
        double s = -1;
        if(isTriangle(a,b,c)){
            double p = getPerimeter(a,b,c);
            s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return s;
    }
    // 0: tam giac thuong 1: tam giac vuong 2: tam giac can 3:tam giac deu
}
