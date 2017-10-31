package com.tencent.d.b.a;

import com.tencent.d.a.c.f;

public abstract class e<T>
  extends com.tencent.d.a.c.e
{
  public T xBW = null;
  
  e()
  {
    super(-1);
  }
  
  protected e(int paramInt)
  {
    this(paramInt, "", null);
  }
  
  protected e(int paramInt, T paramT)
  {
    this(0, "", paramT);
  }
  
  protected e(int paramInt, String paramString)
  {
    this(paramInt, paramString, null);
  }
  
  protected e(int paramInt, String paramString, T paramT)
  {
    super(paramInt, paramString);
    switch (paramInt)
    {
    }
    for (;;)
    {
      if (!f.mZ(paramString)) {
        this.ftU = paramString;
      }
      this.xBW = paramT;
      return;
      this.ftU = "get support soter failed remotely";
      continue;
      this.ftU = "upload app secure key";
      continue;
      this.ftU = "upload auth key failed";
      continue;
      this.ftU = "not initialized yet. please make sure you've already called SoterWrapperApi.init(...) and call backed";
      continue;
      this.ftU = "context instance already released. should not happen normally, you can try to call again";
      continue;
      this.ftU = "there must be at least 1 fingerprint enrolled in system to complete this process. please check it previously";
      continue;
      this.ftU = "get challenge failed";
      continue;
      this.ftU = "upload or verify signature in server side failed";
    }
  }
  
  public String toString()
  {
    if (this.xBW == null) {
      return super.toString();
    }
    return String.format("total: %s, extData: %s", new Object[] { super.toString(), this.xBW.toString() });
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/d/b/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */