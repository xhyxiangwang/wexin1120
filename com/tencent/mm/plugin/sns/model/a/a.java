package com.tencent.mm.plugin.sns.model.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.data.e;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.am;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.an;

public final class a
{
  public String fwU;
  public String mediaId;
  public e pYf;
  public String qbm;
  public String qbq;
  public amn qbr;
  public boolean qfQ;
  public boolean qfR;
  public int qfS;
  public an qfT;
  public String url;
  
  public a(String paramString)
  {
    GMTrace.i(8068498718720L, 60115);
    this.mediaId = "";
    this.url = "";
    this.qfQ = false;
    this.qfR = false;
    this.qfS = 0;
    this.qbq = "";
    this.pYf = null;
    this.qbm = "";
    this.fwU = "";
    this.mediaId = paramString;
    GMTrace.o(8068498718720L, 60115);
  }
  
  public final String bhZ()
  {
    GMTrace.i(8068767154176L, 60117);
    if (this.qfS == 4)
    {
      str = i.p(this.qbr);
      GMTrace.o(8068767154176L, 60117);
      return str;
    }
    if (this.qfS == 6)
    {
      str = i.q(this.qbr);
      GMTrace.o(8068767154176L, 60117);
      return str;
    }
    if (this.qfQ)
    {
      str = i.n(this.qbr);
      GMTrace.o(8068767154176L, 60117);
      return str;
    }
    String str = i.m(this.qbr);
    GMTrace.o(8068767154176L, 60117);
    return str;
  }
  
  public final String getPath()
  {
    GMTrace.i(8068901371904L, 60118);
    if (bg.mZ(this.qbm)) {
      init();
    }
    String str = this.qbm;
    GMTrace.o(8068901371904L, 60118);
    return str;
  }
  
  public final boolean init()
  {
    GMTrace.i(8068632936448L, 60116);
    this.qbm = am.dt(ae.getAccSnsPath(), this.mediaId);
    GMTrace.o(8068632936448L, 60116);
    return true;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */