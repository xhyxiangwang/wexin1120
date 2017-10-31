package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class n
  implements Closeable
{
  public static final ByteOrder iBi;
  private volatile int afx;
  private final File iBj;
  private volatile FileChannel iBk;
  volatile boolean iBl;
  private volatile int iBm;
  private volatile int iBn;
  private volatile int iBo;
  private volatile Map<String, a> iBp;
  
  static
  {
    GMTrace.i(10615280107520L, 79090);
    iBi = ByteOrder.BIG_ENDIAN;
    GMTrace.o(10615280107520L, 79090);
  }
  
  n(File paramFile)
  {
    GMTrace.i(10614743236608L, 79086);
    this.iBk = null;
    this.iBl = true;
    this.afx = -1;
    this.iBm = 0;
    this.iBn = 0;
    this.iBo = -1;
    this.iBp = null;
    this.iBj = paramFile;
    int i;
    if ((this.iBj == null) || (!this.iBj.exists()))
    {
      i = 0;
      if ((i == 0) || (!Sz())) {
        break label122;
      }
    }
    for (;;)
    {
      this.iBl = bool;
      GMTrace.o(10614743236608L, 79086);
      return;
      if (this.iBj.length() <= 14L)
      {
        i = 0;
        break;
      }
      i = 1;
      break;
      label122:
      bool = false;
    }
  }
  
  private boolean Sz()
  {
    GMTrace.i(10615145889792L, 79089);
    if (this.iBk == null) {}
    try
    {
      this.iBk = new RandomAccessFile(this.iBj, "r").getChannel();
      if (this.iBk == null)
      {
        GMTrace.o(10615145889792L, 79089);
        return false;
      }
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      for (;;)
      {
        w.e("MicroMsg.AppBrandWxaPkg", "open(), exp = %s", new Object[] { bg.f(localFileNotFoundException) });
      }
    }
    try
    {
      this.iBk.position(0L);
      Object localObject = ByteBuffer.allocate(14);
      ((ByteBuffer)localObject).order(iBi);
      this.iBk.read((ByteBuffer)localObject);
      if (-66 == ((ByteBuffer)localObject).get(0))
      {
        int i = ((ByteBuffer)localObject).get(13);
        if (-19 == i) {}
      }
      else
      {
        GMTrace.o(10615145889792L, 79089);
        return false;
      }
      localObject = ((ByteBuffer)localObject).array();
      this.afx = a.n((byte[])localObject, 1);
      this.iBm = a.n((byte[])localObject, 5);
      this.iBn = a.n((byte[])localObject, 9);
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        w.e("MicroMsg.AppBrandWxaPkg", "parseHeader, exp = %s", new Object[] { bg.f(localIOException) });
      }
    }
    GMTrace.o(10615145889792L, 79089);
    return true;
  }
  
  final boolean Sx()
  {
    GMTrace.i(10615011672064L, 79088);
    if ((!this.iBl) || (this.iBk == null) || (this.iBm <= 4))
    {
      w.e("MicroMsg.AppBrandWxaPkg", "readInfo, valid = %b, (null == mFileChannel) = %b, mBodyInfoLength = %d, skip", new Object[] { Boolean.valueOf(this.iBl), this.iBk, Integer.valueOf(this.iBn) });
      GMTrace.o(10615011672064L, 79088);
      return false;
    }
    if ((this.iBp != null) && (this.iBo >= 0) && (this.iBo == this.iBp.size()))
    {
      GMTrace.o(10615011672064L, 79088);
      return true;
    }
    try
    {
      this.iBk.position(14L);
      Object localObject = ByteBuffer.allocate(this.iBm);
      ((ByteBuffer)localObject).order(iBi);
      this.iBk.read((ByteBuffer)localObject);
      byte[] arrayOfByte = ((ByteBuffer)localObject).array();
      this.iBo = a.n(arrayOfByte, 0);
      android.support.v4.e.a locala = new android.support.v4.e.a();
      localObject = null;
      int j = 4;
      int i = 0;
      while (i < this.iBo)
      {
        int k = a.n(arrayOfByte, j);
        j += 4;
        String str = new String(arrayOfByte, j, k);
        j += k;
        k = a.n(arrayOfByte, j);
        j += 4;
        int m = a.n(arrayOfByte, j);
        j += 4;
        localObject = new a(str, k, m);
        locala.put(str, localObject);
        i += 1;
      }
      this.iBp = locala;
      if ((localObject != null) && (((a)localObject).iBq + ((a)localObject).iBr > this.iBj.length()))
      {
        w.e("MicroMsg.AppBrandWxaPkg", "readInfo, lastFileOffset(%d) + lastFileLength(%d) > totalFileLength(%d)", new Object[] { Integer.valueOf(((a)localObject).iBq), Integer.valueOf(((a)localObject).iBr), Long.valueOf(this.iBj.length()) });
        GMTrace.o(10615011672064L, 79088);
        return false;
      }
      GMTrace.o(10615011672064L, 79088);
      return true;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.AppBrandWxaPkg", "readInfo, exp = %s", new Object[] { bg.f(localException) });
      GMTrace.o(10615011672064L, 79088);
    }
    return false;
  }
  
  final List<a> Sy()
  {
    GMTrace.i(18188918063104L, 135518);
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = this.iBp.values().iterator();
    while (localIterator.hasNext()) {
      localLinkedList.add((a)localIterator.next());
    }
    GMTrace.o(18188918063104L, 135518);
    return localLinkedList;
  }
  
  public final void close()
  {
    GMTrace.i(10614877454336L, 79087);
    if (this.iBk != null) {
      try
      {
        this.iBk.close();
        this.iBk = null;
        GMTrace.o(10614877454336L, 79087);
        return;
      }
      catch (IOException localIOException) {}
    }
    GMTrace.o(10614877454336L, 79087);
  }
  
  final InputStream oa(String paramString)
  {
    int i = 0;
    GMTrace.i(18188783845376L, 135517);
    if ((this.iBp == null) || (bg.mZ(paramString)))
    {
      boolean bool;
      if (this.iBp == null)
      {
        bool = true;
        if (this.iBp != null) {
          break label87;
        }
      }
      for (;;)
      {
        w.e("MicroMsg.AppBrandWxaPkg", "openReadFile, mFileMap null = %b, mFileMap size = %d, fileName = %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(i), paramString });
        GMTrace.o(18188783845376L, 135517);
        return null;
        bool = false;
        break;
        label87:
        i = this.iBp.size();
      }
    }
    paramString = a.nX(paramString);
    a locala = (a)this.iBp.get(paramString);
    if (locala != null) {
      try
      {
        Object localObject = this.iBk.map(FileChannel.MapMode.READ_ONLY, locala.iBq, locala.iBr);
        ((MappedByteBuffer)localObject).order(iBi);
        ((MappedByteBuffer)localObject).limit(locala.iBr);
        localObject = new com.tencent.mm.plugin.appbrand.i.a((ByteBuffer)localObject);
        GMTrace.o(18188783845376L, 135517);
        return (InputStream)localObject;
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.AppBrandWxaPkg", "openReadFile, fileName = %s, fileOffset = %d, fileLength = %d, exp = %s", new Object[] { paramString, Integer.valueOf(locala.iBq), Integer.valueOf(locala.iBr), bg.f(localException) });
        GMTrace.o(18188783845376L, 135517);
        return null;
      }
    }
    GMTrace.o(18188783845376L, 135517);
    return null;
  }
  
  public static final class a
  {
    public final String fnP;
    public final int iBq;
    public final int iBr;
    
    public a(String paramString, int paramInt1, int paramInt2)
    {
      GMTrace.i(10612461535232L, 79069);
      this.fnP = paramString;
      this.iBq = paramInt1;
      this.iBr = paramInt2;
      GMTrace.o(10612461535232L, 79069);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */