package noel.co.ke.toaster;

import android.content.Context;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by admin on 27/10/2017.
 */

public class Toaster  extends Toast{

    public static int SUCCESS=1;
    public static int WARNING=2;
    public static int ERROR=3;
    public static int INFO=4;
    public static int DEFAULT=5;
    public static int STOCK=6;


    public Toaster(Context context) {
        super(context);
    }

    public static Toast makeText(Context context,String message,int duration,int type) {
        Toast toast = new Toast(context);
        toast.setDuration(duration);

        View layout = LayoutInflater.from(context).inflate(R.layout.toaster_layout, null, false);
        toast.setView(layout);
        toast.setGravity(Gravity.FILL_HORIZONTAL|Gravity.TOP, 0, 0);
        toast.setMargin(0, 0);
        Log.i("Margin", String.valueOf("Horizontal" + toast.getVerticalMargin()));

        //Select View Type
        if(type == SUCCESS){
//            Display success toast
        }else if(type == WARNING){
//            Display warning toast
        }else if(type == ERROR){
//            Display Error toast
        }else if(type == INFO){
//            Display Info toast
        }else if (type == STOCK){
//            Display Stock toast
        }


//        Message
        TextView txtMsg = layout.findViewById(R.id.txt_message);
        txtMsg.setText(message);
        return toast;
    }
}
