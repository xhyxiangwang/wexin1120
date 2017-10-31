package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.smtt.utils.TbsLog;
import java.io.File;

class TbsLinuxToolsJni
{
  private static boolean xxx = false;
  private static boolean xxy = false;
  
  public TbsLinuxToolsJni(Context paramContext)
  {
    for (;;)
    {
      try
      {
        if (xxy) {
          return;
        }
        xxy = true;
      }
      finally {}
      try
      {
        if (!t.gS(paramContext)) {
          break label162;
        }
        localFile1 = new File(t.clv());
        if (localFile1 != null)
        {
          File localFile2 = localFile1;
          if (!new File(localFile1.getAbsolutePath() + File.separator + "liblinuxtoolsfortbssdk_jni.so").exists())
          {
            localFile2 = localFile1;
            if (!t.gS(paramContext))
            {
              p.clh();
              localFile2 = p.gH(paramContext);
            }
          }
          if (localFile2 != null)
          {
            System.load(localFile2.getAbsolutePath() + File.separator + "liblinuxtoolsfortbssdk_jni.so");
            xxx = true;
          }
        }
        ChmodInner("/checkChmodeExists", "700");
      }
      catch (Throwable paramContext)
      {
        xxx = false;
        continue;
      }
      return;
      label162:
      p.clh();
      File localFile1 = p.gI(paramContext);
    }
  }
  
  private native int ChmodInner(String paramString1, String paramString2);
  
  public final int fl(String paramString1, String paramString2)
  {
    if (!xxx)
    {
      TbsLog.e("TbsLinuxToolsJni", "jni not loaded!", true);
      return -1;
    }
    return ChmodInner(paramString1, paramString2);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/smtt/sdk/TbsLinuxToolsJni.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */