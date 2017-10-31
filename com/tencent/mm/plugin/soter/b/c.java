package com.tencent.mm.plugin.soter.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bl.b;
import com.tencent.mm.protocal.ac;
import com.tencent.mm.protocal.c.axk;
import com.tencent.mm.protocal.c.axs;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.bja;
import com.tencent.mm.protocal.c.eo;
import com.tencent.mm.protocal.k;
import com.tencent.mm.protocal.k.b;
import com.tencent.mm.protocal.k.c;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.bg;

public final class c
{
  public static final class a
    extends k.d
    implements k.b
  {
    public biz qXE;
    
    public a()
    {
      GMTrace.i(18498692579328L, 137826);
      this.qXE = new biz();
      GMTrace.o(18498692579328L, 137826);
    }
    
    public final byte[] Bb()
    {
      GMTrace.i(18498826797056L, 137827);
      this.tpL = ac.bLt();
      this.qXE.tzY = new axs().bd(bg.bNU());
      this.qXE.urE = k.a(this);
      this.tpK = this.qXE.tzY.ush.toByteArray();
      byte[] arrayOfByte = this.qXE.toByteArray();
      GMTrace.o(18498826797056L, 137827);
      return arrayOfByte;
    }
    
    public final int Bc()
    {
      GMTrace.i(18498961014784L, 137828);
      GMTrace.o(18498961014784L, 137828);
      return 627;
    }
    
    public final int getCmdId()
    {
      GMTrace.i(18499095232512L, 137829);
      GMTrace.o(18499095232512L, 137829);
      return 0;
    }
  }
  
  public static final class b
    extends k.e
    implements k.c
  {
    public bja qXF;
    
    public b()
    {
      GMTrace.i(18495337136128L, 137801);
      this.qXF = new bja();
      GMTrace.o(18495337136128L, 137801);
    }
    
    public final int getCmdId()
    {
      GMTrace.i(18495605571584L, 137803);
      GMTrace.o(18495605571584L, 137803);
      return 0;
    }
    
    public final int y(byte[] paramArrayOfByte)
    {
      GMTrace.i(18495471353856L, 137802);
      this.qXF = ((bja)new bja().aC(paramArrayOfByte));
      k.a(this, this.qXF.urV);
      int i = this.qXF.urV.tyi;
      GMTrace.o(18495471353856L, 137802);
      return i;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/soter/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */