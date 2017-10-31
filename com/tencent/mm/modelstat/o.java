package com.tencent.mm.modelstat;

import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelsns.d;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.c.bfg;
import com.tencent.mm.protocal.c.bfi;
import com.tencent.mm.protocal.c.bfj;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.w.f.a;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public final class o
{
  public static String a(bfj parambfj)
  {
    GMTrace.i(1373986881536L, 10237);
    if (parambfj != null)
    {
      Object localObject = parambfj.uxx;
      String str2 = "";
      String str1 = str2;
      if (!bg.mZ((String)localObject))
      {
        localObject = ((String)localObject).split("\\|");
        str1 = str2;
        if (localObject != null)
        {
          str1 = str2;
          if (localObject.length > 0) {
            str1 = localObject[0];
          }
        }
      }
      try
      {
        parambfj = String.format("expId=%d&adgroup_id=%s&snsId=%s", new Object[] { Integer.valueOf(parambfj.uxy), URLEncoder.encode(str1, "UTF-8"), parambfj.uxw });
        GMTrace.o(1373986881536L, 10237);
        return parambfj;
      }
      catch (UnsupportedEncodingException parambfj)
      {
        w.e("MicroMsg.SnsStatExtUtil", "", new Object[] { parambfj });
      }
    }
    GMTrace.o(1373986881536L, 10237);
    return "";
  }
  
  public static String a(String paramString, PString paramPString)
  {
    GMTrace.i(1373852663808L, 10236);
    if (bg.mZ(paramString))
    {
      GMTrace.o(1373852663808L, 10236);
      return "";
    }
    Object localObject = Base64.decode(paramString, 0);
    paramString = new bfi();
    try
    {
      paramString.aC((byte[])localObject);
      localObject = paramString.uxt.uxx;
      String str = paramString.uxt.uxw;
      localObject = String.format("snsId=%s&uxInfo=%s&source=%d&snsStatExt=%s", new Object[] { URLEncoder.encode((String)localObject, "UTF-8"), URLEncoder.encode(str, "UTF-8"), Integer.valueOf(paramString.uxt.cyK), URLEncoder.encode(a(paramString.uxt), "UTF-8") });
      if (paramString.uxv == null) {}
      for (paramString = "";; paramString = paramString.uxv.mzX)
      {
        paramPString.value = paramString;
        GMTrace.o(1373852663808L, 10236);
        return (String)localObject;
      }
      return "";
    }
    catch (Exception paramString)
    {
      w.printErrStackTrace("MicroMsg.SnsStatExtUtil", paramString, "", new Object[0]);
      GMTrace.o(1373852663808L, 10236);
    }
  }
  
  public static void a(String paramString, d paramd)
  {
    GMTrace.i(18565801443328L, 138326);
    if (paramd == null)
    {
      GMTrace.o(18565801443328L, 138326);
      return;
    }
    b(paramString, paramd);
    GMTrace.o(18565801443328L, 138326);
  }
  
  public static void b(String paramString, d paramd)
  {
    GMTrace.i(1373584228352L, 10234);
    if ((bg.mZ(paramString)) || (paramd == null))
    {
      GMTrace.o(1373584228352L, 10234);
      return;
    }
    paramString = lt(paramString);
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramString == null) {}
    for (int i = -1;; i = paramString.cyK)
    {
      paramd.m("Source", i + ",");
      paramd.m("SnsStatExt", a(paramString));
      GMTrace.o(1373584228352L, 10234);
      return;
    }
  }
  
  public static bfj lt(String paramString)
  {
    GMTrace.i(1373718446080L, 10235);
    if (bg.mZ(paramString))
    {
      GMTrace.o(1373718446080L, 10235);
      return null;
    }
    byte[] arrayOfByte = Base64.decode(paramString, 0);
    paramString = new bfi();
    try
    {
      paramString.aC(arrayOfByte);
      paramString = paramString.uxt;
      GMTrace.o(1373718446080L, 10235);
      return paramString;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.SnsStatExtUtil", "", new Object[] { localException });
      }
    }
  }
  
  public static String y(au paramau)
  {
    GMTrace.i(1374121099264L, 10238);
    if (paramau == null)
    {
      GMTrace.o(1374121099264L, 10238);
      return "";
    }
    Object localObject = null;
    if (paramau.aBp())
    {
      localObject = f.a.eC(paramau.field_content);
      if ((localObject == null) || (bg.mZ(((f.a)localObject).fMi)))
      {
        GMTrace.o(1374121099264L, 10238);
        return "";
      }
      localObject = ((f.a)localObject).fMi;
    }
    if (paramau.bQP())
    {
      paramau = t.mj(paramau.field_imgPath);
      if ((paramau == null) || (bg.mZ(paramau.fMi)))
      {
        GMTrace.o(1374121099264L, 10238);
        return "";
      }
      localObject = paramau.fMi;
    }
    GMTrace.o(1374121099264L, 10238);
    return (String)localObject;
  }
  
  public static enum a
  {
    public int value;
    
    static
    {
      GMTrace.i(1401098862592L, 10439);
      hRD = new a("Chat", 0, 1);
      hRE = new a("TalkChat", 1, 2);
      hRF = new a("Sns", 2, 3);
      hRG = new a[] { hRD, hRE, hRF };
      GMTrace.o(1401098862592L, 10439);
    }
    
    private a(int paramInt)
    {
      GMTrace.i(1400964644864L, 10438);
      this.value = 0;
      this.value = paramInt;
      GMTrace.o(1400964644864L, 10438);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/modelstat/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */