package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent;

import com.tencent.gmtrace.GMTrace;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class p
  implements Serializable
{
  public int fvu;
  public float height;
  public String qhb;
  public boolean qnA;
  public int qnB;
  public boolean qnC;
  public String qno;
  public int qnp;
  public float qnq;
  public float qnr;
  public float qns;
  public float qnt;
  public float qnu;
  public float qnv;
  public boolean qnw;
  public int qnx;
  public int qny;
  public boolean qnz;
  public int type;
  public float width;
  
  public p()
  {
    GMTrace.i(8289957969920L, 61765);
    this.qnu = -2.0F;
    this.qnv = -2.0F;
    GMTrace.o(8289957969920L, 61765);
  }
  
  public final void Ho(String paramString)
  {
    GMTrace.i(18949261492224L, 141183);
    this.qhb = paramString;
    Iterator localIterator = biA().iterator();
    while (localIterator.hasNext()) {
      ((p)localIterator.next()).Ho(paramString);
    }
    GMTrace.o(18949261492224L, 141183);
  }
  
  protected List<p> biA()
  {
    GMTrace.i(18949395709952L, 141184);
    List localList = Collections.emptyList();
    GMTrace.o(18949395709952L, 141184);
    return localList;
  }
  
  public final void hS(boolean paramBoolean)
  {
    GMTrace.i(18577478385664L, 138413);
    this.qnC = paramBoolean;
    Iterator localIterator = biA().iterator();
    while (localIterator.hasNext()) {
      ((p)localIterator.next()).hS(paramBoolean);
    }
    GMTrace.o(18577478385664L, 138413);
  }
  
  public final void ur(int paramInt)
  {
    GMTrace.i(18577344167936L, 138412);
    this.qnB = paramInt;
    Iterator localIterator = biA().iterator();
    while (localIterator.hasNext()) {
      ((p)localIterator.next()).ur(paramInt);
    }
    GMTrace.o(18577344167936L, 138412);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */