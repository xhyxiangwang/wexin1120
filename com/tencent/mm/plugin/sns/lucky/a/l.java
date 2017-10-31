package com.tencent.mm.plugin.sns.lucky.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.d.a;
import com.tencent.mm.modelsns.e;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.sns.model.a;
import com.tencent.mm.protocal.c.avx;
import com.tencent.mm.protocal.c.bdk;
import com.tencent.mm.protocal.c.bdy;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.bp.a;
import java.math.BigInteger;

public final class l
  implements bp.a
{
  public l()
  {
    GMTrace.i(8804414521344L, 65598);
    GMTrace.o(8804414521344L, 65598);
  }
  
  private static String O(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(8804682956800L, 65600);
    if ((bg.mZ(paramString1)) || (bg.mZ(paramString2)) || (bg.mZ(paramString3)))
    {
      GMTrace.o(8804682956800L, 65600);
      return "";
    }
    int j = paramString1.indexOf(paramString2);
    if (j >= 0) {}
    for (int i = paramString1.indexOf(paramString3); (j >= 0) && (i > j); i = -1)
    {
      paramString1 = paramString1.substring(j, i + paramString3.length());
      GMTrace.o(8804682956800L, 65600);
      return paramString1;
    }
    GMTrace.o(8804682956800L, 65600);
    return "";
  }
  
  public final void a(d.a parama)
  {
    GMTrace.i(8804548739072L, 65599);
    if ((parama == null) || (parama.hme == null) || (parama.hme.tvq == null))
    {
      w.i("MicroMsg.SimpleExperimentLsn", "recv null msg");
      GMTrace.o(8804548739072L, 65599);
      return;
    }
    Object localObject2 = n.a(parama.hme.tvq);
    w.d("MicroMsg.SimpleExperimentLsn", "recv addMsg " + (String)localObject2);
    parama = O((String)localObject2, "<TimelineObject", "</TimelineObject>");
    if (bg.mZ(parama))
    {
      w.i("MicroMsg.SimpleExperimentLsn", "recv addMsg has no  timelineObj tag");
      GMTrace.o(8804548739072L, 65599);
      return;
    }
    Object localObject1 = O((String)localObject2, "<RecXml", "</RecXml>");
    if (bg.mZ((String)localObject1))
    {
      w.i("MicroMsg.SimpleExperimentLsn", "recv addMsg has no  RecXml tag");
      GMTrace.o(8804548739072L, 65599);
      return;
    }
    Object localObject3 = O((String)localObject2, "<ADInfo", "</ADInfo>");
    if (bg.mZ((String)localObject3))
    {
      w.i("MicroMsg.SimpleExperimentLsn", "recv addMsg has no  ADInfo tag");
      GMTrace.o(8804548739072L, 65599);
      return;
    }
    localObject2 = e.lm(parama);
    avx localavx = new avx();
    localavx.uqJ = n.mV((String)localObject3);
    localObject3 = new bdy();
    localavx.uqI = ((bdy)localObject3);
    ((bdy)localObject3).uvX = n.mV((String)localObject1);
    localObject1 = new bdk();
    ((bdk)localObject1).tDg = new BigInteger(((bhc)localObject2).nas).longValue();
    ((bdk)localObject1).orU = ((bhc)localObject2).orU;
    ((bdk)localObject1).twR = ((bhc)localObject2).jWW;
    ((bdk)localObject1).uve = n.H(parama.getBytes());
    ((bdy)localObject3).uuw = ((bdk)localObject1);
    a.b(localavx);
    GMTrace.o(8804548739072L, 65599);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/lucky/a/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */