package oop2;

import java.util.ArrayList;
import java.util.Arrays;

public class ShapeFactory {
    ArrayList<Shape> listShape;

    public ArrayList<Shape> getListData(String data) {

        String[] arrInfomation = data.split("\n");

        this.listShape = new ArrayList<>();

        for (int i = 0; i < arrInfomation.length; i++) {
            double[] arrData = Arrays.stream(arrInfomation[i].split(" ")).mapToDouble(Double::parseDouble).toArray();
            if (arrData.length == 3) {
                Circle circle = new Circle(arrData[0], arrData[1], arrData[2]);
                listShape.add(circle);
            } else if (arrData.length == 6) {
                Triangle triangle = new Triangle(arrData[0], arrData[1], arrData[2], arrData[3], arrData[4], arrData[5]);
                listShape.add(triangle);
            } else {
                Quadrilateral quadrilateral = new Quadrilateral(arrData[0], arrData[1], arrData[2], arrData[3], arrData[4], arrData[5], arrData[6], arrData[7]);
                listShape.add(quadrilateral);
            }
        }
        return listShape;
    }
}
