package com.tencent.d.b.f;

import android.content.Context;
import com.tencent.d.b.c.a;
import com.tencent.d.b.e.c;
import com.tencent.d.b.e.f;

public final class b
{
  public int hJp;
  public a lYV;
  public Context mContext;
  public String sgP;
  public c xCr;
  public f xCs;
  public com.tencent.d.b.c.b xCt;
  
  public final String toString()
  {
    return "AuthenticationParam{mScene=" + this.hJp + ", mChallenge='" + this.sgP + '\'' + ", mIWrapGetChallengeStr=" + this.xCr + ", mIWrapUploadSignature=" + this.xCs + ", mContext=" + this.mContext + ", mFingerprintCanceller=" + this.lYV + ", mSoterFingerprintStateCallback=" + this.xCt + '}';
  }
  
  public static final class a
  {
    public b xCu = new b();
    
    public final a EB(int paramInt)
    {
      this.xCu.hJp = paramInt;
      return this;
    }
    
    public final a XE(String paramString)
    {
      this.xCu.sgP = paramString;
      return this;
    }
    
    public final a a(a parama)
    {
      this.xCu.lYV = parama;
      return this;
    }
    
    public final a a(com.tencent.d.b.c.b paramb)
    {
      this.xCu.xCt = paramb;
      return this;
    }
    
    public final a hO(Context paramContext)
    {
      this.xCu.mContext = paramContext;
      return this;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/d/b/f/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */