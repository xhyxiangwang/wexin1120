package com.tencent.mm.plugin.sns.a.b;

import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelsns.d;
import com.tencent.mm.modelstat.o;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.storage.e;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.protocal.c.bfi;
import com.tencent.mm.protocal.c.bfj;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;

public final class f
{
  private static String FQ(String paramString)
  {
    GMTrace.i(8168759361536L, 60862);
    if (bg.mZ(paramString))
    {
      GMTrace.o(8168759361536L, 60862);
      return "";
    }
    paramString = Base64.decode(paramString, 0);
    bfi localbfi = new bfi();
    try
    {
      localbfi.aC(paramString);
      paramString = o.a(localbfi.uxt);
      GMTrace.o(8168759361536L, 60862);
      return paramString;
    }
    catch (IOException paramString)
    {
      w.e("SnsAdExtUtil", "", new Object[] { paramString });
      GMTrace.o(8168759361536L, 60862);
    }
    return "";
  }
  
  public static String a(long paramLong, Object... paramVarArgs)
  {
    GMTrace.i(8168490926080L, 60860);
    ae.bhj();
    paramVarArgs = new StringBuilder(i.l(paramVarArgs));
    a(paramLong, paramVarArgs);
    paramVarArgs = paramVarArgs.toString();
    GMTrace.o(8168490926080L, 60860);
    return paramVarArgs;
  }
  
  public static String a(bhc parambhc)
  {
    GMTrace.i(20052933869568L, 149406);
    if (parambhc != null)
    {
      parambhc = FQ(parambhc.qBT);
      GMTrace.o(20052933869568L, 149406);
      return parambhc;
    }
    w.v("SnsAdExtUtil", "getSnsStatExt timeLineObject null");
    GMTrace.o(20052933869568L, 149406);
    return null;
  }
  
  public static void a(long paramLong, StringBuilder paramStringBuilder)
  {
    GMTrace.i(8168625143808L, 60861);
    Object localObject = ae.bhr().dI(paramLong);
    if (localObject != null)
    {
      localObject = ((e)localObject).bjL();
      if (localObject != null)
      {
        localObject = o.lt(((bhc)localObject).qBT);
        StringBuilder localStringBuilder = paramStringBuilder.append(",");
        if (localObject == null) {}
        for (int i = -1;; i = ((bfj)localObject).cyK)
        {
          localStringBuilder.append(i);
          paramStringBuilder.append(",").append(o.a((bfj)localObject));
          GMTrace.o(8168625143808L, 60861);
          return;
        }
      }
      w.v("SnsAdExtUtil", "l timeLineObject null, snsId %d", new Object[] { Long.valueOf(paramLong) });
      GMTrace.o(8168625143808L, 60861);
      return;
    }
    w.v("SnsAdExtUtil", "l snsInfo null, snsId %d", new Object[] { Long.valueOf(paramLong) });
    GMTrace.o(8168625143808L, 60861);
  }
  
  public static void a(String paramString, d paramd)
  {
    GMTrace.i(8168356708352L, 60859);
    Object localObject = ae.bhp().Hz(paramString);
    if (localObject != null)
    {
      localObject = ((m)localObject).bjL();
      if (localObject != null)
      {
        o.a(((bhc)localObject).qBT, paramd);
        GMTrace.o(8168356708352L, 60859);
        return;
      }
      w.v("SnsAdExtUtil", "timeLineObject null, snsId %s", new Object[] { paramString });
      GMTrace.o(8168356708352L, 60859);
      return;
    }
    w.v("SnsAdExtUtil", "snsInfo null, snsId %s", new Object[] { paramString });
    GMTrace.o(8168356708352L, 60859);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/a/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */