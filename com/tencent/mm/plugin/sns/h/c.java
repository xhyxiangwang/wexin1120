package com.tencent.mm.plugin.sns.h;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class c
{
  private static Map<String, a> qkH;
  private static volatile long qkI;
  
  static
  {
    GMTrace.i(8886824206336L, 66212);
    qkH = new ConcurrentHashMap();
    qkI = 0L;
    GMTrace.o(8886824206336L, 66212);
  }
  
  private static String Hl(String paramString)
  {
    GMTrace.i(8886287335424L, 66208);
    int i = paramString.indexOf('?');
    String str = paramString;
    if (i >= 0) {
      str = paramString.substring(0, i);
    }
    i = str.indexOf("://");
    paramString = str;
    if (i >= 0) {
      paramString = str.substring(i + 3);
    }
    i = paramString.indexOf('/');
    if (i >= 0)
    {
      paramString = paramString.substring(i + 1);
      GMTrace.o(8886287335424L, 66208);
      return paramString;
    }
    GMTrace.o(8886287335424L, 66208);
    return paramString;
  }
  
  public static void U(String paramString, long paramLong)
  {
    GMTrace.i(8886689988608L, 66211);
    try
    {
      paramString = (a)qkH.remove(paramString);
      if (paramString == null)
      {
        bij();
        GMTrace.o(8886689988608L, 66211);
        return;
      }
      paramString.qkO = paramLong;
      StringBuilder localStringBuilder = new StringBuilder(1024);
      localStringBuilder.append(paramString.qkJ).append(',').append(paramString.qkK).append(',').append(paramString.mMimeType).append(',').append(paramString.Uo).append(',').append(paramString.LM).append(',').append(paramString.qkL).append(',').append(paramString.qkM).append(',').append(paramString.qkN).append(',').append(paramString.qkO);
      paramString = localStringBuilder.toString();
      w.i("MicroMsg.SnsImgStats", "report dl: " + paramString);
      g.paX.z(13513, paramString);
      bij();
      GMTrace.o(8886689988608L, 66211);
      return;
    }
    catch (Exception paramString)
    {
      bij();
      GMTrace.o(8886689988608L, 66211);
      return;
    }
    finally
    {
      bij();
    }
  }
  
  public static void a(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, long paramLong)
  {
    GMTrace.i(8886421553152L, 66209);
    try
    {
      b localb = new b();
      localb.qkJ = Hl(paramString1);
      localb.mMimeType = paramString2;
      localb.Uo = paramInt1;
      localb.LM = paramInt2;
      localb.qkL = paramInt3;
      localb.qkM = paramLong;
      paramString1 = new StringBuilder(1024);
      paramString1.append(localb.qkJ).append(',').append(localb.mMimeType).append(',').append(localb.Uo).append(',').append(localb.LM).append(',').append(localb.qkL).append(',').append(localb.qkM);
      paramString1 = paramString1.toString();
      w.i("MicroMsg.SnsImgStats", "report up: " + paramString1);
      g.paX.z(13512, paramString1);
      GMTrace.o(8886421553152L, 66209);
      return;
    }
    catch (Exception paramString1)
    {
      GMTrace.o(8886421553152L, 66209);
    }
  }
  
  public static void a(String paramString1, String paramString2, int paramInt1, String paramString3, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2)
  {
    GMTrace.i(8886555770880L, 66210);
    try
    {
      a locala = new a();
      locala.qkJ = Hl(paramString2);
      locala.qkK = paramInt1;
      locala.mMimeType = paramString3;
      locala.Uo = paramInt2;
      locala.LM = paramInt3;
      locala.qkL = paramInt4;
      locala.qkM = paramLong1;
      locala.qkN = paramLong2;
      qkH.put(paramString1, locala);
      GMTrace.o(8886555770880L, 66210);
      return;
    }
    catch (Exception paramString1)
    {
      GMTrace.o(8886555770880L, 66210);
    }
  }
  
  private static void bij()
  {
    GMTrace.i(8886153117696L, 66207);
    synchronized (qkH)
    {
      if (bg.aG(qkI) <= 120000L)
      {
        GMTrace.o(8886153117696L, 66207);
        return;
      }
      qkI = bg.Pq();
      qkH.clear();
      GMTrace.o(8886153117696L, 66207);
      return;
    }
  }
  
  private static final class a
  {
    public int LM;
    public int Uo;
    public String mMimeType;
    public String qkJ;
    public int qkK;
    public int qkL;
    public long qkM;
    public long qkN;
    public long qkO;
    
    public a()
    {
      GMTrace.i(8885750464512L, 66204);
      this.qkJ = "";
      this.qkK = 0;
      this.mMimeType = "";
      this.Uo = -1;
      this.LM = -1;
      this.qkL = -1;
      this.qkM = -1L;
      this.qkN = -1L;
      this.qkO = -1L;
      GMTrace.o(8885750464512L, 66204);
    }
  }
  
  private static final class b
  {
    public int LM;
    public int Uo;
    public String mMimeType;
    public String qkJ;
    public int qkL;
    public long qkM;
    
    public b()
    {
      GMTrace.i(8880650190848L, 66166);
      this.qkJ = "";
      this.mMimeType = "";
      this.Uo = -1;
      this.LM = -1;
      this.qkL = -1;
      this.qkM = -1L;
      GMTrace.o(8880650190848L, 66166);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/h/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */