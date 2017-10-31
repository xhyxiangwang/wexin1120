package com.tencent.mm.plugin.voip_cs.c;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bq.a;
import com.tencent.mm.sdk.platformtools.ab;

public final class b
{
  public static final int obG;
  public static final int obH;
  public static final int obI;
  public static final int obJ;
  public static final int obK;
  public static final int obL;
  public static final int obN;
  public static final int obO;
  public static final int obP;
  public static final int obQ;
  private static int rBs;
  
  static
  {
    GMTrace.i(11282207997952L, 84059);
    obG = a.fromDPToPix(ab.getContext(), 3);
    obH = a.fromDPToPix(ab.getContext(), 4);
    obI = a.fromDPToPix(ab.getContext(), 8);
    obJ = a.fromDPToPix(ab.getContext(), 10);
    obK = a.fromDPToPix(ab.getContext(), 14);
    obL = a.fromDPToPix(ab.getContext(), 30);
    obN = a.fromDPToPix(ab.getContext(), 32);
    obO = a.fromDPToPix(ab.getContext(), 96);
    obP = a.fromDPToPix(ab.getContext(), 76);
    obQ = a.fromDPToPix(ab.getContext(), 230);
    rBs = 0;
    GMTrace.o(11282207997952L, 84059);
  }
  
  public static int jdMethod_do(Context paramContext)
  {
    GMTrace.i(11282073780224L, 84058);
    if (rBs == 0) {
      rBs = a.eg(paramContext);
    }
    int i = rBs;
    GMTrace.o(11282073780224L, 84058);
    return i;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/voip_cs/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */