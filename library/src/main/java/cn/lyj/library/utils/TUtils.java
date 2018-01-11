package cn.lyj.library.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by 龙英杰 on 2018/1/11.
 * toast 类
 */
public class TUtils {
    static Toast mToast;

    /**
     * 长toast
     * @param context
     * @param str
     */
    public static void LongToast(Context context,String str){
        mToast=new Toast(context);
        Toast.makeText(context, "mToast:" + str, Toast.LENGTH_LONG).show();
    }

    /**
     * 短toast
     * @param context
     * @param str
     */
    public static void ShortToast(Context context,String str){
        mToast=new Toast(context);
        Toast.makeText(context, "mToast:" + str, Toast.LENGTH_SHORT).show();
    }
}
