public class EnumMathOperation {
    enum MathsOp{

        ADD {
            public int operate(int num1, int num2){
                return num1 + num2;
            }
        },
        SUBTRACT {
            public int operate(int num1, int num2){
                return num1 - num2;
            }
        },
        MULTIPLY {
            public int operate(int num1, int num2){
                return num1 * num2;
            }
        },
        DIVIDE {
            public int operate(int num1, int num2){
                return num1 / num2;
            }
        };
        public abstract int operate(int num1, int num2);

    }

    public static void main(String[] args) {
        System.out.println(MathsOp.ADD.operate(12, 6));
        System.out.println(MathsOp.SUBTRACT.operate(12, 6));
        System.out.println(MathsOp.MULTIPLY.operate(12, 6));
        System.out.println(MathsOp.DIVIDE.operate(12, 6));
    }

}
