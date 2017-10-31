package com.tencent.mm.plugin.voip.video;

import android.content.Context;
import android.media.ToneGenerator;
import android.provider.Settings.System;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;

public final class d
{
  public static Context mContext;
  private static final HashMap<String, Integer> rwO;
  public Object rwP;
  public ToneGenerator rwQ;
  private final int rwR;
  
  static
  {
    GMTrace.i(5387231166464L, 40138);
    HashMap localHashMap = new HashMap();
    rwO = localHashMap;
    localHashMap.put("1", Integer.valueOf(1));
    rwO.put("2", Integer.valueOf(2));
    rwO.put("3", Integer.valueOf(3));
    rwO.put("4", Integer.valueOf(4));
    rwO.put("5", Integer.valueOf(5));
    rwO.put("6", Integer.valueOf(6));
    rwO.put("7", Integer.valueOf(7));
    rwO.put("8", Integer.valueOf(8));
    rwO.put("9", Integer.valueOf(9));
    rwO.put("0", Integer.valueOf(0));
    rwO.put("#", Integer.valueOf(11));
    rwO.put("*", Integer.valueOf(10));
    GMTrace.o(5387231166464L, 40138);
  }
  
  private d()
  {
    GMTrace.i(5386828513280L, 40135);
    this.rwP = new Object();
    this.rwR = 250;
    GMTrace.o(5386828513280L, 40135);
  }
  
  public d(Context arg1)
  {
    GMTrace.i(5386694295552L, 40134);
    this.rwP = new Object();
    this.rwR = 250;
    mContext = ???;
    if (??? != null) {
      try
      {
        synchronized (this.rwP)
        {
          if ((buf()) && (this.rwQ == null)) {
            this.rwQ = new ToneGenerator(3, 66);
          }
          GMTrace.o(5386694295552L, 40134);
          return;
        }
        GMTrace.o(5386694295552L, 40134);
      }
      catch (Exception ???)
      {
        w.d("MicroMsg.DTMFToneGenerator", "获取音频发生器单例失败！！！");
        w.d("MicroMsg.DTMFToneGenerator", ???.getMessage());
        this.rwQ = null;
      }
    }
  }
  
  public static int Jb(String paramString)
  {
    GMTrace.i(5387096948736L, 40137);
    if ((paramString == null) || (paramString.equals("")))
    {
      GMTrace.o(5387096948736L, 40137);
      return -1;
    }
    if (rwO.containsKey(paramString))
    {
      int i = ((Integer)rwO.get(paramString)).intValue();
      GMTrace.o(5387096948736L, 40137);
      return i;
    }
    GMTrace.o(5387096948736L, 40137);
    return -1;
  }
  
  public static boolean buf()
  {
    GMTrace.i(5386962731008L, 40136);
    if (Settings.System.getInt(mContext.getContentResolver(), "dtmf_tone", 1) == 1)
    {
      GMTrace.o(5386962731008L, 40136);
      return true;
    }
    GMTrace.o(5386962731008L, 40136);
    return false;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/voip/video/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */