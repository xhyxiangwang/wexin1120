package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.sdk.platformtools.w;

public final class g
{
  public String extra;
  public String fMT;
  public long gCB;
  public int gCh;
  public int hJY;
  public String qhb;
  public String qhe;
  public int qnB;
  public int quA;
  public int quB;
  public int quC;
  public int quD;
  public int quE;
  public String quF;
  public String quG;
  public String quH;
  public int quv;
  public int quw;
  public int qux;
  public int quy;
  public int quz;
  
  public g()
  {
    GMTrace.i(8196676648960L, 61070);
    this.extra = "";
    GMTrace.o(8196676648960L, 61070);
  }
  
  public final String bjF()
  {
    GMTrace.i(8196810866688L, 61071);
    long l1 = 0L;
    try
    {
      long l2 = i.Gk(this.fMT);
      l1 = l2;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        StringBuilder localStringBuilder;
        String str1;
        w.e("AdLandingPagesReportInfo", "", new Object[] { localException });
        continue;
        String str2 = this.qhe;
      }
    }
    localStringBuilder = new StringBuilder().append(i.jdMethod_do(l1)).append(",").append(this.qhb).append(",").append(this.quv).append(",").append(this.gCh).append(",").append(this.quw).append(",").append(this.qux).append(",").append(this.quy).append(",").append(this.quz).append(",").append(this.quA).append(",").append(this.quB).append(",").append(this.quC).append(",").append(this.quD).append(",").append(this.quE).append(",").append(this.hJY).append(",").append(this.quF).append(",").append(this.gCB).append(",").append(this.quG).append(",");
    if (this.qhe == null)
    {
      str1 = "";
      str1 = str1 + "," + this.extra + "," + this.qnB + "," + this.quH;
      GMTrace.o(8196810866688L, 61071);
      return str1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */