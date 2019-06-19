package oop1;

public enum typeShape {
    INVALID {
        public String toString() {
            return "khong phai la tam giac";
        }
    },
    NORMAL {
        public String toString() {
            return "thuong";
        }
    },
    RIGHT_TRIANGLE {
        public String toString() {
            return "vuong";
        }
    },
    ISOSCELES_TRIANGLE {
        public String toString() {
            return "can";
        }
    }
}
