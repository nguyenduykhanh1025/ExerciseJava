public class PhuongTrinhBac2 {

    public String giaiPhuongTrinhBac2(float a, float b, float c) {
        String strResurt = "";
        float delta = b * b - 4 * a * c;
        if (delta < 0) {
            return "";
        } else if (delta == 0) {
            float x = -b / (2 * a);
            strResurt += x;
        } else {
            float x1 = (float) (-b + Math.sqrt(delta)) / (2 * a);
            float x2 = (float) (-b - Math.sqrt(delta)) / (2 * a);
            strResurt += x1 + " " + x2;
        }

        return strResurt;
    }
}
