import java.util.Stack;

public class HistogramProblem {

    int getArea(int hist[], int number_bars) {
        Stack<Integer> st = new Stack<>();
        int area = 0;
        int i  = 0;
        int tp = 0;

       /* while(i < number_bars) {
            if(st.isEmpty() || hist[i] >=  hist[st.peek()]) {
                st.push(i++);
            }
            else {
                tp = st.peek();
                st.pop();
                area = hist[tp] *
            }
        }*/
        return area;
    }
}
