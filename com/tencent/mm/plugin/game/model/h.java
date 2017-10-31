package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.x.ap;

public class h
  implements com.tencent.mm.ac.e
{
  private static h mzM;
  private boolean hjm;
  
  public h()
  {
    GMTrace.i(16560051716096L, 123382);
    this.hjm = false;
    GMTrace.o(16560051716096L, 123382);
  }
  
  public static h aEk()
  {
    GMTrace.i(16560185933824L, 123383);
    if (mzM == null) {}
    try
    {
      if (mzM == null) {
        mzM = new h();
      }
      h localh = mzM;
      GMTrace.o(16560185933824L, 123383);
      return localh;
    }
    finally {}
  }
  
  private void release()
  {
    GMTrace.i(16560454369280L, 123385);
    this.hjm = false;
    ap.wT().b(1311, this);
    GMTrace.o(16560454369280L, 123385);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(16560588587008L, 123386);
    if (paramk.getType() == 1311)
    {
      w.i("MicroMsg.GameConfigUpdater", "getGameCenterGlobalSetting sceneEnd, %s, %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      com.tencent.mm.kernel.h.xz().xi().a(w.a.uUl, Long.valueOf(bg.Po()));
      release();
    }
    GMTrace.o(16560588587008L, 123386);
  }
  
  /* Error */
  public final void update()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 117
    //   5: ldc 119
    //   7: invokestatic 23	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: invokestatic 85	com/tencent/mm/kernel/h:xz	()Lcom/tencent/mm/kernel/e;
    //   13: invokevirtual 91	com/tencent/mm/kernel/e:xi	()Lcom/tencent/mm/storage/t;
    //   16: getstatic 97	com/tencent/mm/storage/w$a:uUl	Lcom/tencent/mm/storage/w$a;
    //   19: lconst_0
    //   20: invokestatic 108	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   23: invokevirtual 123	com/tencent/mm/storage/t:get	(Lcom/tencent/mm/storage/w$a;Ljava/lang/Object;)Ljava/lang/Object;
    //   26: checkcast 105	java/lang/Long
    //   29: invokestatic 127	com/tencent/mm/sdk/platformtools/bg:c	(Ljava/lang/Long;)J
    //   32: invokestatic 108	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   35: invokevirtual 130	java/lang/Long:longValue	()J
    //   38: invokestatic 134	com/tencent/mm/sdk/platformtools/bg:aE	(J)J
    //   41: ldc2_w 135
    //   44: lcmp
    //   45: ifle +70 -> 115
    //   48: iconst_1
    //   49: istore_1
    //   50: iload_1
    //   51: ifeq +53 -> 104
    //   54: aload_0
    //   55: getfield 25	com/tencent/mm/plugin/game/model/h:hjm	Z
    //   58: ifne +46 -> 104
    //   61: ldc 66
    //   63: ldc -118
    //   65: invokestatic 141	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   68: aload_0
    //   69: invokespecial 115	com/tencent/mm/plugin/game/model/h:release	()V
    //   72: aload_0
    //   73: iconst_1
    //   74: putfield 25	com/tencent/mm/plugin/game/model/h:hjm	Z
    //   77: invokestatic 47	com/tencent/mm/x/ap:wT	()Lcom/tencent/mm/ac/n;
    //   80: sipush 1311
    //   83: aload_0
    //   84: invokevirtual 143	com/tencent/mm/ac/n:a	(ILcom/tencent/mm/ac/e;)V
    //   87: new 145	com/tencent/mm/plugin/game/model/aq
    //   90: dup
    //   91: invokespecial 146	com/tencent/mm/plugin/game/model/aq:<init>	()V
    //   94: astore_2
    //   95: invokestatic 47	com/tencent/mm/x/ap:wT	()Lcom/tencent/mm/ac/n;
    //   98: aload_2
    //   99: iconst_0
    //   100: invokevirtual 149	com/tencent/mm/ac/n:a	(Lcom/tencent/mm/ac/k;I)Z
    //   103: pop
    //   104: ldc2_w 117
    //   107: ldc 119
    //   109: invokestatic 28	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   112: aload_0
    //   113: monitorexit
    //   114: return
    //   115: iconst_0
    //   116: istore_1
    //   117: goto -67 -> 50
    //   120: astore_2
    //   121: aload_0
    //   122: monitorexit
    //   123: aload_2
    //   124: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	125	0	this	h
    //   49	68	1	i	int
    //   94	5	2	localaq	aq
    //   120	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	48	120	finally
    //   54	104	120	finally
    //   104	112	120	finally
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/model/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */