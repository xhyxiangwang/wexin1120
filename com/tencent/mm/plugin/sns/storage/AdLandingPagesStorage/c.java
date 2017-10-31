package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.p;
import java.io.Serializable;
import java.util.LinkedList;

public final class c
  implements Serializable
{
  public String iHK;
  public int id;
  public boolean qnz;
  public String qtV;
  public boolean qtW;
  public LinkedList<p> qtX;
  public boolean qtY;
  
  public c()
  {
    GMTrace.i(8203655970816L, 61122);
    this.qtX = new LinkedList();
    this.qnz = true;
    GMTrace.o(8203655970816L, 61122);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */