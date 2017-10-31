package com.tencent.tmassistantsdk.downloadservice;

public class StopRequestException
  extends Exception
{
  protected static final long serialVersionUID = 1L;
  public final int mFinalErrCode;
  
  public StopRequestException(int paramInt, String paramString)
  {
    super(paramString);
    this.mFinalErrCode = paramInt;
  }
  
  public StopRequestException(int paramInt, Throwable paramThrowable)
  {
    super(paramThrowable);
    this.mFinalErrCode = paramInt;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/tmassistantsdk/downloadservice/StopRequestException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */