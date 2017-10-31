package com.tencent.smtt.utils;

import android.content.Context;
import android.os.Environment;
import android.os.Looper;
import android.os.Process;
import android.widget.TextView;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class t
{
  static String iay;
  private static boolean xAT = true;
  static t xAV = null;
  static File xAW = null;
  static byte[] xAY;
  TextView Po;
  private Context mContext = null;
  private SimpleDateFormat xAX = null;
  private StringBuffer xAZ = new StringBuffer();
  
  static
  {
    iay = null;
    xAY = null;
  }
  
  public t(Context paramContext)
  {
    try
    {
      this.mContext = paramContext.getApplicationContext();
      this.xAX = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss.SSS", Locale.US);
      return;
    }
    catch (Exception paramContext)
    {
      this.xAX = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss.SSS");
    }
  }
  
  public static void setWriteLogJIT(boolean paramBoolean)
  {
    xAT = paramBoolean;
  }
  
  public void Xv(String paramString)
  {
    if (this.Po != null) {
      this.Po.post(new a(paramString));
    }
  }
  
  public void aN(String paramString)
  {
    try
    {
      String str = this.xAX.format(Long.valueOf(System.currentTimeMillis()));
      this.xAZ.append(str).append(" pid=").append(Process.myPid()).append(" tid=").append(Process.myTid()).append(paramString).append("\n");
      if ((Thread.currentThread() != Looper.getMainLooper().getThread()) || (xAT)) {
        writeLogToDisk();
      }
      return;
    }
    catch (Exception paramString) {}
  }
  
  public void setLogView(TextView paramTextView)
  {
    this.Po = paramTextView;
  }
  
  public void writeLogToDisk()
  {
    for (;;)
    {
      try
      {
        if (xAW == null)
        {
          if (!Environment.getExternalStorageState().equals("mounted")) {
            continue;
          }
          str = f.am(this.mContext, 6);
          if (str != null) {
            continue;
          }
          xAW = null;
        }
      }
      catch (NullPointerException localNullPointerException)
      {
        String str;
        continue;
      }
      catch (SecurityException localSecurityException)
      {
        continue;
      }
      if (xAW != null)
      {
        h.a(xAW, iay, xAY, this.xAZ.toString());
        this.xAZ.delete(0, this.xAZ.length());
      }
      return;
      xAW = new File(str, "tbslog.txt");
      iay = h.clT();
      xAY = h.fo(xAW.getName(), iay);
      continue;
      xAW = null;
    }
  }
  
  private final class a
    implements Runnable
  {
    String xBa = null;
    
    a(String paramString)
    {
      this.xBa = paramString;
    }
    
    public final void run()
    {
      if (t.this.Po != null) {
        t.this.Po.append(this.xBa + "\n");
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/smtt/utils/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */