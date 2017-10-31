package com.tencent.mm.plugin.sns.model.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

public final class f
  extends b
{
  public f(b.a parama, a parama1)
  {
    super(parama, parama1);
    GMTrace.i(8065411710976L, 60092);
    GMTrace.o(8065411710976L, 60092);
  }
  
  public final String Hd(String paramString)
  {
    GMTrace.i(8065545928704L, 60093);
    GMTrace.o(8065545928704L, 60093);
    return paramString;
  }
  
  public final boolean a(InputStream paramInputStream, Map<String, List<String>> paramMap)
  {
    GMTrace.i(8065680146432L, 60094);
    w.i("MicroMsg.SnsDownloadSight", "download sight. %s ", new Object[] { com.tencent.mm.modelsfs.f.kQ(this.qfW.getPath() + this.qfW.bhZ()) });
    Object localObject2 = null;
    OutputStream localOutputStream = null;
    paramMap = localOutputStream;
    Object localObject1 = localObject2;
    try
    {
      byte[] arrayOfByte = new byte['Ѐ'];
      paramMap = localOutputStream;
      localObject1 = localObject2;
      localOutputStream = FileOp.hk(com.tencent.mm.modelsfs.f.kQ(this.qfW.getPath() + this.qfW.bhZ()));
      paramMap = localOutputStream;
      localObject1 = localOutputStream;
      long l = System.currentTimeMillis();
      paramMap = localOutputStream;
      localObject1 = localOutputStream;
      this.qgh.value = "";
      int i = 0;
      for (;;)
      {
        paramMap = localOutputStream;
        localObject1 = localOutputStream;
        int j = paramInputStream.read(arrayOfByte);
        if (j == -1) {
          break;
        }
        paramMap = localOutputStream;
        localObject1 = localOutputStream;
        if (j > this.qgi)
        {
          paramMap = localOutputStream;
          localObject1 = localOutputStream;
          this.qgi = j;
          paramMap = localOutputStream;
          localObject1 = localOutputStream;
          this.qgj = bg.Po();
        }
        paramMap = localOutputStream;
        localObject1 = localOutputStream;
        if (this.qgk == 0L)
        {
          paramMap = localOutputStream;
          localObject1 = localOutputStream;
          this.qgk = bg.aF(this.qgl);
        }
        paramMap = localOutputStream;
        localObject1 = localOutputStream;
        if (!i.Gh(ae.zp()))
        {
          paramMap = localOutputStream;
          localObject1 = localOutputStream;
          localOutputStream.close();
          paramMap = localOutputStream;
          localObject1 = localOutputStream;
          paramInputStream.close();
          if (localOutputStream != null) {}
          try
          {
            localOutputStream.close();
            GMTrace.o(8065680146432L, 60094);
            return false;
          }
          catch (IOException paramInputStream)
          {
            for (;;)
            {
              w.printErrStackTrace("MicroMsg.SnsDownloadSight", paramInputStream, "", new Object[0]);
            }
          }
        }
        paramMap = localOutputStream;
        localObject1 = localOutputStream;
        localOutputStream.write(arrayOfByte, 0, j);
        paramMap = localOutputStream;
        localObject1 = localOutputStream;
        this.qgq += j;
        i = 1;
        paramMap = localOutputStream;
        localObject1 = localOutputStream;
        if (a(this.qgq, l, this.qgh))
        {
          paramMap = localOutputStream;
          localObject1 = localOutputStream;
          l = System.currentTimeMillis();
          i = 0;
        }
      }
      paramMap = localOutputStream;
      localObject1 = localOutputStream;
      localOutputStream.close();
      localObject1 = null;
      paramMap = null;
      if (i != 0) {
        a(this.qgq, 0L, this.qgh);
      }
      GMTrace.o(8065680146432L, 60094);
      return true;
    }
    catch (Exception paramInputStream)
    {
      localObject1 = paramMap;
      w.printErrStackTrace("MicroMsg.SnsDownloadSight", paramInputStream, "snscdndownload fail : " + paramInputStream.getMessage(), new Object[0]);
      localObject1 = paramMap;
      w.printErrStackTrace("MicroMsg.SnsDownloadSight", paramInputStream, "", new Object[0]);
      if (paramMap != null) {}
      try
      {
        paramMap.close();
        GMTrace.o(8065680146432L, 60094);
        return false;
      }
      catch (IOException paramInputStream)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.SnsDownloadSight", paramInputStream, "", new Object[0]);
        }
      }
    }
    finally
    {
      if (localObject1 == null) {}
    }
    try
    {
      ((OutputStream)localObject1).close();
      throw paramInputStream;
    }
    catch (IOException paramMap)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.SnsDownloadSight", paramMap, "", new Object[0]);
      }
    }
  }
  
  public final boolean bib()
  {
    GMTrace.i(8065814364160L, 60095);
    String str = i.j(this.fNf);
    FileOp.g(this.qfW.getPath(), this.qfW.bhZ(), str);
    GMTrace.o(8065814364160L, 60095);
    return true;
  }
  
  protected final int bic()
  {
    GMTrace.i(8065948581888L, 60096);
    GMTrace.o(8065948581888L, 60096);
    return 2;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */