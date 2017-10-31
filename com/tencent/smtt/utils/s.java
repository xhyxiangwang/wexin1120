package com.tencent.smtt.utils;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class s
{
  public b xAO = null;
  public b xAP = null;
  
  public static boolean a(b paramb1, b paramb2)
  {
    if ((paramb1 != null) && (paramb1.iBp != null) && (paramb2 != null) && (paramb2.iBp != null))
    {
      Object localObject1 = paramb1.iBp;
      paramb1 = paramb2.iBp;
      paramb2 = ((Map)localObject1).entrySet().iterator();
      while (paramb2.hasNext())
      {
        Object localObject2 = (Map.Entry)paramb2.next();
        localObject1 = (String)((Map.Entry)localObject2).getKey();
        localObject2 = (a)((Map.Entry)localObject2).getValue();
        if (paramb1.containsKey(localObject1))
        {
          localObject1 = (a)paramb1.get(localObject1);
          if ((((a)localObject2).kTl != ((a)localObject1).kTl) || (((a)localObject2).xAQ != ((a)localObject1).xAQ)) {
            return false;
          }
        }
        else
        {
          return false;
        }
      }
      return true;
    }
    return false;
  }
  
  final class a
  {
    long kTl;
    private String mName;
    long xAQ;
    
    a(String paramString, long paramLong1, long paramLong2)
    {
      this.mName = paramString;
      this.kTl = paramLong1;
      this.xAQ = paramLong2;
    }
  }
  
  public final class b
  {
    public Map<String, s.a> iBp = new HashMap();
    
    public b(File paramFile)
    {
      this.iBp.clear();
      P(paramFile);
    }
    
    private void P(File paramFile)
    {
      if (paramFile.isDirectory())
      {
        paramFile = paramFile.listFiles();
        int i = 0;
        while (i < paramFile.length)
        {
          P(paramFile[i]);
          i += 1;
        }
      }
      if (paramFile.isFile())
      {
        String str = paramFile.getName();
        long l1 = paramFile.length();
        long l2 = paramFile.lastModified();
        if ((str != null) && (str.length() > 0) && (l1 > 0L) && (l2 > 0L))
        {
          paramFile = new s.a(s.this, str, l1, l2);
          if (!this.iBp.containsKey(str)) {
            this.iBp.put(str, paramFile);
          }
        }
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/smtt/utils/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */