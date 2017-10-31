package com.tencent.d.a.c;

public class e
{
  public int errCode;
  public String ftU;
  
  public e(int paramInt)
  {
    this.errCode = paramInt;
    switch (this.errCode)
    {
    case 1: 
    default: 
      this.ftU = "errmsg not specified";
      return;
    case 0: 
      this.ftU = "ok";
      return;
    }
    this.ftU = "device not support soter";
  }
  
  public e(int paramInt, String paramString)
  {
    this.errCode = paramInt;
    this.ftU = paramString;
  }
  
  public boolean equals(Object paramObject)
  {
    return ((paramObject instanceof e)) && (((e)paramObject).errCode == this.errCode);
  }
  
  public final boolean isSuccess()
  {
    return this.errCode == 0;
  }
  
  public String toString()
  {
    return "SoterCoreResult{errCode=" + this.errCode + ", errMsg='" + this.ftU + '\'' + '}';
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/d/a/c/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */