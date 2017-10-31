package org.a.d;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.a.g.c;

public final class e
{
  public final List<d> xVm;
  
  public e()
  {
    this.xVm = new ArrayList();
  }
  
  public e(List<d> paramList)
  {
    this.xVm = new ArrayList(paramList);
  }
  
  public e(Map<String, String> paramMap)
  {
    this();
    paramMap = paramMap.entrySet().iterator();
    for (;;)
    {
      if (!paramMap.hasNext()) {
        return;
      }
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      this.xVm.add(new d((String)localEntry.getKey(), (String)localEntry.getValue()));
    }
  }
  
  public final void Yr(String paramString)
  {
    String[] arrayOfString;
    int i;
    if ((paramString != null) && (paramString.length() > 0))
    {
      arrayOfString = paramString.split("&");
      int j = arrayOfString.length;
      i = 0;
      if (i < j) {}
    }
    else
    {
      return;
    }
    paramString = arrayOfString[i].split("=");
    String str = c.decode(paramString[0]);
    if (paramString.length > 1) {}
    for (paramString = c.decode(paramString[1]);; paramString = "")
    {
      this.xVm.add(new d(str, paramString));
      i += 1;
      break;
    }
  }
  
  public final void a(e parame)
  {
    this.xVm.addAll(parame.xVm);
  }
  
  public final String cqp()
  {
    if (this.xVm.size() == 0) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = this.xVm.iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return localStringBuilder.toString().substring(1);
      }
      d locald = (d)localIterator.next();
      localStringBuilder.append('&').append(c.encode(locald.amo).concat("=").concat(c.encode(locald.value)));
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/org/a/d/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */