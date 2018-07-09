package cs.com.java.demo5;

import com.sun.glass.ui.View;

public class Button {

    private OnClickListener listener;

    public  void setOnClickListener(OnClickListener _listener){

    }

   static class click implements OnClickListener{

        @Override
        public void onClick(View view) {

        }
    }

    public static void main(String[] args) {
        Button button = new Button();


    }


}


