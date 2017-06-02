package com.mrj.zy.someutils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Created by ZY on 2017/6/3.
 */

public class BitmapFormatUtil {
    /**
     * 图片转成string
     *
     * @param bitmap 需要转换的Bitmap数据
     * @return 得到的字符串数据
     */
    public static String convertIconToString(Bitmap bitmap) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();// outputstream
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
        byte[] appicon = baos.toByteArray();// 转为byte数组
        return Base64.encodeToString(appicon, Base64.DEFAULT);

    }

    /**
     * 将String类型转换为Bitmap类型
     *
     * @param st 需要转换的数据
     * @return 得到的Bitmap
     */
    public static Bitmap convertStringToIcon(String st) {
        Bitmap bitmap = null;
        byte[] bitmapArray;
        bitmapArray = Base64.decode(st, Base64.DEFAULT);
        bitmap = BitmapFactory.decodeByteArray(bitmapArray, 0,
                bitmapArray.length);
        return bitmap;
    }
}
