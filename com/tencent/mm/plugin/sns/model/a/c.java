package com.tencent.mm.plugin.sns.model.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelsfs.f;
import com.tencent.mm.network.t;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.b.3;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

public final class c
  extends b
{
  private long qgr;
  private int qgs;
  
  public c(b.a parama, a parama1)
  {
    super(parama, parama1);
    GMTrace.i(8066485452800L, 60100);
    this.qgr = 0L;
    this.qgs = 0;
    GMTrace.o(8066485452800L, 60100);
  }
  
  public final String Hd(String paramString)
  {
    GMTrace.i(8066619670528L, 60101);
    GMTrace.o(8066619670528L, 60101);
    return paramString;
  }
  
  public final boolean a(InputStream paramInputStream, Map<String, List<String>> paramMap)
  {
    GMTrace.i(8067022323712L, 60104);
    com.tencent.mm.plugin.sns.model.b localb = null;
    OutputStream localOutputStream = null;
    paramMap = localOutputStream;
    Object localObject = localb;
    try
    {
      byte[] arrayOfByte = new byte['Ѐ'];
      paramMap = localOutputStream;
      localObject = localb;
      String str1 = this.qfW.getPath() + this.qfW.bhZ();
      paramMap = localOutputStream;
      localObject = localb;
      long l = FileOp.kI(f.kQ(str1));
      paramMap = localOutputStream;
      localObject = localb;
      w.i("MicroMsg.SnsDownloadAdSight", "getdatabegin " + l);
      paramMap = localOutputStream;
      localObject = localb;
      localOutputStream = FileOp.kG(str1);
      paramMap = localOutputStream;
      localObject = localOutputStream;
      l = System.currentTimeMillis();
      paramMap = localOutputStream;
      localObject = localOutputStream;
      this.qgh.value = "";
      int j = 1;
      int i = 0;
      for (;;)
      {
        paramMap = localOutputStream;
        localObject = localOutputStream;
        int k = paramInputStream.read(arrayOfByte);
        if (k == -1) {
          break;
        }
        paramMap = localOutputStream;
        localObject = localOutputStream;
        if (this.qgk == 0L)
        {
          paramMap = localOutputStream;
          localObject = localOutputStream;
          this.qgk = bg.aF(this.qgl);
        }
        paramMap = localOutputStream;
        localObject = localOutputStream;
        if (k > this.qgi)
        {
          paramMap = localOutputStream;
          localObject = localOutputStream;
          this.qgi = k;
          paramMap = localOutputStream;
          localObject = localOutputStream;
          this.qgj = bg.Po();
        }
        paramMap = localOutputStream;
        localObject = localOutputStream;
        if (!i.Gh(com.tencent.mm.plugin.sns.model.ae.zp()))
        {
          paramMap = localOutputStream;
          localObject = localOutputStream;
          w.i("MicroMsg.SnsDownloadAdSight", "read data");
          paramMap = localOutputStream;
          localObject = localOutputStream;
          localOutputStream.close();
          paramMap = localOutputStream;
          localObject = localOutputStream;
          paramInputStream.close();
          if (localOutputStream != null) {}
          try
          {
            localOutputStream.close();
            GMTrace.o(8067022323712L, 60104);
            return false;
          }
          catch (IOException paramInputStream)
          {
            for (;;)
            {
              w.printErrStackTrace("MicroMsg.SnsDownloadAdSight", paramInputStream, "", new Object[0]);
            }
          }
        }
        paramMap = localOutputStream;
        localObject = localOutputStream;
        localOutputStream.write(arrayOfByte, 0, k);
        paramMap = localOutputStream;
        localObject = localOutputStream;
        this.qgq += k;
        k = j;
        paramMap = localOutputStream;
        localObject = localOutputStream;
        if (this.qgq - this.qgs > 409600 * j)
        {
          paramMap = localOutputStream;
          localObject = localOutputStream;
          localb = com.tencent.mm.plugin.sns.model.ae.bhk();
          paramMap = localOutputStream;
          localObject = localOutputStream;
          String str2 = this.qfW.mediaId;
          paramMap = localOutputStream;
          localObject = localOutputStream;
          com.tencent.mm.plugin.sns.model.ae.aCa().post(new b.3(localb, str2, str1));
          paramMap = localOutputStream;
          localObject = localOutputStream;
          this.qgs = this.qgq;
          k = j + 1;
        }
        i = 1;
        j = k;
        paramMap = localOutputStream;
        localObject = localOutputStream;
        if (a(this.qgq, l, this.qgh))
        {
          paramMap = localOutputStream;
          localObject = localOutputStream;
          l = System.currentTimeMillis();
          i = 0;
          j = k;
        }
      }
      paramMap = localOutputStream;
      localObject = localOutputStream;
      localOutputStream.close();
      localObject = null;
      paramMap = null;
      if (i != 0) {
        a(this.qgq, 0L, this.qgh);
      }
      l = FileOp.kI(this.qfW.getPath() + this.qfW.bhZ());
      w.i("MicroMsg.SnsDownloadAdSight", "getdataend2  " + l);
      GMTrace.o(8067022323712L, 60104);
      return true;
    }
    catch (Exception paramInputStream)
    {
      localObject = paramMap;
      w.printErrStackTrace("MicroMsg.SnsDownloadAdSight", paramInputStream, "snscdndownload fail : " + paramInputStream.getMessage(), new Object[0]);
      localObject = paramMap;
      w.printErrStackTrace("MicroMsg.SnsDownloadAdSight", paramInputStream, "", new Object[0]);
      if (paramMap != null) {}
      try
      {
        paramMap.close();
        GMTrace.o(8067022323712L, 60104);
        return false;
      }
      catch (IOException paramInputStream)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.SnsDownloadAdSight", paramInputStream, "", new Object[0]);
        }
      }
    }
    finally
    {
      if (localObject == null) {}
    }
    try
    {
      ((OutputStream)localObject).close();
      throw paramInputStream;
    }
    catch (IOException paramMap)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.SnsDownloadAdSight", paramMap, "", new Object[0]);
      }
    }
  }
  
  public final t b(t paramt)
  {
    GMTrace.i(8066888105984L, 60103);
    this.qgr = FileOp.kI(this.qfW.getPath() + this.qfW.bhZ());
    if (this.qgr > 0L)
    {
      w.i("MicroMsg.SnsDownloadAdSight", "appendHttpArg range " + this.qgr);
      paramt.setRequestProperty("RANGE", "bytes=" + this.qgr + "-");
    }
    GMTrace.o(8066888105984L, 60103);
    return paramt;
  }
  
  public final boolean bia()
  {
    GMTrace.i(8066753888256L, 60102);
    GMTrace.o(8066753888256L, 60102);
    return false;
  }
  
  public final boolean bib()
  {
    GMTrace.i(8067156541440L, 60105);
    long l = FileOp.kI(this.qfW.getPath() + this.qfW.bhZ());
    w.i("MicroMsg.SnsDownloadAdSight", "preceeData  downloadLen " + l + " " + this.qgn);
    if (l < this.qgn + this.qgr)
    {
      GMTrace.o(8067156541440L, 60105);
      return false;
    }
    String str = i.k(this.fNf);
    FileOp.g(this.qfW.getPath(), this.qfW.bhZ(), str);
    GMTrace.o(8067156541440L, 60105);
    return true;
  }
  
  protected final int bic()
  {
    GMTrace.i(8067290759168L, 60106);
    GMTrace.o(8067290759168L, 60106);
    return 4;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */