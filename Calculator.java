/**
 * Created by Kolyambo on 03.07.2017.
 */
public class Calculator {
        private int result;

        public  void summ(int ... params) {
            for (Integer param : params) {
                this.result += param;
            }
        }

        public int getResult(){
            return this.result;
        }
        public void cleanResult(){
            this.result = 0;
        }
}
