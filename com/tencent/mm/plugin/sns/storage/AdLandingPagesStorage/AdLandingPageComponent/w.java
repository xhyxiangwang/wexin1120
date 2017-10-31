package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent;

import com.tencent.gmtrace.GMTrace;
import java.io.Serializable;

public final class w
  implements Serializable
{
  public float height;
  public String iconUrl;
  public float qnr;
  public float width;
  
  public w()
  {
    GMTrace.i(8217614614528L, 61226);
    GMTrace.o(8217614614528L, 61226);
  }
  
  public final boolean equals(Object paramObject)
  {
    GMTrace.i(8217748832256L, 61227);
    if (paramObject == this)
    {
      GMTrace.o(8217748832256L, 61227);
      return true;
    }
    if ((paramObject instanceof w))
    {
      paramObject = (w)paramObject;
      if ((((w)paramObject).iconUrl.equals(this.iconUrl)) && (((w)paramObject).width == this.width) && (((w)paramObject).height == this.height) && (((w)paramObject).qnr == this.qnr))
      {
        GMTrace.o(8217748832256L, 61227);
        return true;
      }
      GMTrace.o(8217748832256L, 61227);
      return false;
    }
    GMTrace.o(8217748832256L, 61227);
    return false;
  }
  
  public final int hashCode()
  {
    GMTrace.i(8217883049984L, 61228);
    int i = super.hashCode();
    GMTrace.o(8217883049984L, 61228);
    return i;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */