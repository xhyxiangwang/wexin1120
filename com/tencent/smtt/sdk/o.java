package com.tencent.smtt.sdk;

import android.text.TextUtils;
import com.tencent.smtt.export.external.DexLoader;
import java.util.Map;

final class o
{
  public boolean xxd = false;
  public boolean xxe = false;
  private Map<String, String> xxf = null;
  
  public final void a(String paramString, byte paramByte)
  {
    for (;;)
    {
      try
      {
        boolean bool = TextUtils.isEmpty(paramString);
        if (bool) {
          return;
        }
        str = "";
        if (paramByte == 1)
        {
          str = "_begin";
          this.xxf.put(paramString + str, String.valueOf(System.currentTimeMillis()));
          continue;
        }
        if (paramByte != 2) {
          continue;
        }
      }
      finally {}
      String str = "_end";
    }
  }
  
  public final boolean aO(int paramInt, String paramString)
  {
    boolean bool = true;
    for (;;)
    {
      try
      {
        Object localObject = ab.clI();
        if (((ab)localObject).clJ())
        {
          if ((!this.xxe) || (!this.xxd))
          {
            long l = System.currentTimeMillis();
            if (l % 10L != 0L) {
              return bool;
            }
          }
          this.xxe = true;
          this.xxd = true;
          this.xxf.put("is_first_init_tbs", String.valueOf(this.xxe));
          this.xxf.put("is_first_init_x5", String.valueOf(this.xxd));
          this.xxf.put("x5_webview_id", Integer.toString(paramInt));
          this.xxf.put("current_url", paramString);
          if ((QbSdk.xvE != null) && (QbSdk.xvE.containsKey("app_scene_id"))) {
            this.xxf.put("app_scene_id", QbSdk.xvE.get("app_scene_id"));
          }
          paramString = ((ab)localObject).clK().xyA;
          localObject = Integer.TYPE;
          Map localMap = this.xxf;
          paramString.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "setTbsInitPerformanceData", new Class[] { localObject, Map.class }, new Object[] { Integer.valueOf(paramInt), localMap });
          continue;
        }
        bool = false;
      }
      finally {}
    }
  }
  
  /* Error */
  public final void an(String paramString, long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokestatic 32	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   6: istore 4
    //   8: iload 4
    //   10: ifeq +6 -> 16
    //   13: aload_0
    //   14: monitorexit
    //   15: return
    //   16: aload_0
    //   17: getfield 20	com/tencent/smtt/sdk/o:xxf	Ljava/util/Map;
    //   20: aload_1
    //   21: lload_2
    //   22: invokestatic 59	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   25: invokeinterface 65 3 0
    //   30: pop
    //   31: goto -18 -> 13
    //   34: astore_1
    //   35: aload_0
    //   36: monitorexit
    //   37: aload_1
    //   38: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	39	0	this	o
    //   0	39	1	paramString	String
    //   0	39	2	paramLong	long
    //   6	3	4	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	8	34	finally
    //   16	31	34	finally
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/smtt/sdk/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */