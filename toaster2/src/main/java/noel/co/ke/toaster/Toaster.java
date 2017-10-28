package noel.co.ke.toaster;

import android.content.Context;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
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
    public static int CUSTOM=7;




    public Toaster(Context context) {
        super(context);
    }

    public static Toast makeText(Context context,String message,int duration,int type) {
        Toast toast = new Toast(context);
        toast.setDuration(duration);

        View layout = LayoutInflater.from(context).inflate(R.layout.toaster_layout, null, false);
        toast.setView(layout);


        TextView txtMsg = layout.findViewById(R.id.txt_message);
        ImageView toastImage = layout.findViewById(R.id.toast_icon);
        RelativeLayout toastLayout = layout.findViewById(R.id.toast_layout);

        toast.setGravity(Gravity.FILL_HORIZONTAL|Gravity.TOP, 0, 0);
        toast.setMargin(0, 0);
        Log.i("Margin", String.valueOf("Horizontal" + toast.getVerticalMargin()));

        //Select View Type
        if(type == SUCCESS){
            toastImage.setImageResource(R.drawable.ic_check_white_24px);
            toastLayout.setBackgroundColor(context.getResources().getColor(R.color.success));
        }else if(type == WARNING){
            toastImage.setImageResource(R.drawable.ic_pan_tool_white_24px);
            toastLayout.setBackgroundColor(context.getResources().getColor(R.color.warning));
        }else if(type == ERROR){
            toastImage.setImageResource(R.drawable.ic_clear_white_24px);
            toastLayout.setBackgroundColor(context.getResources().getColor(R.color.error));
        }else if(type == INFO){
            toastImage.setImageResource(R.drawable.ic_info_white_24px);
            toastLayout.setBackgroundColor(context.getResources().getColor(R.color.info));
        }else if (type == STOCK){
            toastImage.setImageResource(R.drawable.ic_info_white_24px);
            toastLayout.setBackgroundColor(context.getResources().getColor(R.color.stock));
        }

        txtMsg.setText(message);


        return toast;
    }


    public static Toast makeText(Context context,String message,int duration,int type, int image, int customColor) {
        Toast toast = new Toast(context);
        toast.setDuration(duration);

        View layout = LayoutInflater.from(context).inflate(R.layout.toaster_layout, null, false);
        toast.setView(layout);


        TextView txtMsg = layout.findViewById(R.id.txt_message);
        ImageView toastImage = layout.findViewById(R.id.toast_icon);
        RelativeLayout toastLayout = layout.findViewById(R.id.toast_layout);

        toast.setGravity(Gravity.FILL_HORIZONTAL|Gravity.TOP, 0, 0);
        toast.setMargin(0, 0);
        Log.i("Margin", String.valueOf("Horizontal" + toast.getVerticalMargin()));

        //Select View Type
        if(type == SUCCESS){
            toastImage.setImageResource(R.drawable.ic_check_white_24px);
            toastLayout.setBackgroundColor(context.getResources().getColor(R.color.success));
        }else if(type == WARNING){
            toastImage.setImageResource(R.drawable.ic_pan_tool_white_24px);
            toastLayout.setBackgroundColor(context.getResources().getColor(R.color.warning));
        }else if(type == ERROR){
            toastImage.setImageResource(R.drawable.ic_clear_white_24px);
            toastLayout.setBackgroundColor(context.getResources().getColor(R.color.error));
        }else if(type == INFO){
            toastImage.setImageResource(R.drawable.ic_info_white_24px);
            toastLayout.setBackgroundColor(context.getResources().getColor(R.color.info));
        }else if (type == STOCK){
            toastImage.setImageResource(R.drawable.ic_info_white_24px);
            toastLayout.setBackgroundColor(context.getResources().getColor(R.color.stock));
        }else if(type == CUSTOM){
            toastImage.setImageResource(image);
            toastLayout.setBackgroundColor(context.getResources().getColor(customColor));
        }

        txtMsg.setText(message);


        return toast;
    }
}
