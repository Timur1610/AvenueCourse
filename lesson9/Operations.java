package lesson9;

public enum Operations{


    SUM{
        public int action(int num1, int num2){
            return num1 + num2;
        }
    },
    MINUS{
        public int action(int num1, int num2){
            return num1 - num2;
        }
    },
    MULT{
        public int action(int num1, int num2){
            return num1 * num2;
        }
    },
    DIV{
        public int action(int num1, int num2){
            return num1 / num2;
        }
    };


    public abstract int action(int num1, int num2);

}
