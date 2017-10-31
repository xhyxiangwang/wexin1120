package com.tencent.mm.plugin.search.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Looper;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.network.b;
import com.tencent.mm.platformtools.j;
import com.tencent.mm.plugin.fts.d.g.a;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

public final class i
  implements com.tencent.mm.plugin.fts.d.g
{
  private static int pnu;
  public ae ham;
  private ConcurrentHashMap<Long, ByteArrayOutputStream> pnA;
  private ConcurrentHashMap<Long, byte[]> pnB;
  public ae pnC;
  public Set<String> pnD;
  private ConcurrentHashMap<String, a> pnv;
  private Vector<String> pnw;
  private boolean pnx;
  private int pny;
  public ae[] pnz;
  
  static
  {
    GMTrace.i(11872363347968L, 88456);
    pnu = 32;
    GMTrace.o(11872363347968L, 88456);
  }
  
  public i()
  {
    GMTrace.i(11869142122496L, 88432);
    this.pnx = true;
    this.pny = 0;
    this.ham = new ae(Looper.getMainLooper());
    this.pnz = new ae[2];
    this.pnA = null;
    this.pnB = null;
    this.pnC = null;
    w.i("MicroMsg.FTS.SearchImageLoader", "create SearchImageLoader");
    if (com.tencent.mm.compatible.util.d.et(19)) {}
    for (pnu = 64;; pnu = 32)
    {
      this.pnv = new ConcurrentHashMap();
      this.pnw = new Vector();
      this.pnA = new ConcurrentHashMap();
      this.pnB = new ConcurrentHashMap();
      this.pnD = Collections.synchronizedSet(new HashSet());
      while (i < 2)
      {
        if (this.pnz[i] == null) {
          e.d(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(11867128856576L, 88417);
              Looper.prepare();
              i.this.pnz[i] = new ae();
              Looper.loop();
              GMTrace.o(11867128856576L, 88417);
            }
          }, "SearchImageLoader_loadImage_handler", 1).start();
        }
        i += 1;
      }
    }
    e.d(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11821763264512L, 88079);
        Looper.prepare();
        i.this.pnC = new ae();
        Looper.loop();
        GMTrace.o(11821763264512L, 88079);
      }
    }, "SearchImageLoader_saveImage_handler", 1).start();
    GMTrace.o(11869142122496L, 88432);
  }
  
  public static String Fq(String paramString)
  {
    GMTrace.i(16064251428864L, 119688);
    ap.AS();
    paramString = new File(new File(c.yV()), paramString).getAbsolutePath();
    GMTrace.o(16064251428864L, 119688);
    return paramString;
  }
  
  private void Fr(String paramString)
  {
    GMTrace.i(11871021170688L, 88446);
    a locala = (a)this.pnv.get(paramString);
    this.pnw.remove(paramString);
    this.pnv.remove(paramString);
    if ((locala != null) && (locala.bitmap != null))
    {
      if (!locala.bitmap.isRecycled())
      {
        w.i("MicroMsg.FTS.SearchImageLoader", "bitmap recycle %s", new Object[] { locala.bitmap });
        locala.bitmap.recycle();
      }
      locala.bitmap = null;
    }
    GMTrace.o(11871021170688L, 88446);
  }
  
  public static Bitmap K(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(16064385646592L, 119689);
    if (bg.mZ(paramString))
    {
      GMTrace.o(16064385646592L, 119689);
      return null;
    }
    if (new File(paramString).exists())
    {
      if ((paramInt1 > 0) && (paramInt2 > 0))
      {
        paramString = j.l(paramString, paramInt1, paramInt2);
        GMTrace.o(16064385646592L, 119689);
        return paramString;
      }
      paramString = j.mS(paramString);
      GMTrace.o(16064385646592L, 119689);
      return paramString;
    }
    GMTrace.o(16064385646592L, 119689);
    return null;
  }
  
  private static String b(String paramString1, String paramString2, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    GMTrace.i(11870752735232L, 88444);
    paramString1 = bg.ap(paramString1, "null") + bg.ap(paramString2, "null") + paramBoolean + paramInt1 + "_" + paramInt2;
    paramString1 = "fts_search_" + com.tencent.mm.a.g.n(paramString1.getBytes());
    GMTrace.o(11870752735232L, 88444);
    return paramString1;
  }
  
  private byte[] getBuffer()
  {
    try
    {
      GMTrace.i(11870618517504L, 88443);
      byte[] arrayOfByte2 = (byte[])this.pnB.get(Long.valueOf(Thread.currentThread().getId()));
      byte[] arrayOfByte1 = arrayOfByte2;
      if (arrayOfByte2 == null)
      {
        arrayOfByte1 = new byte['Ѐ'];
        this.pnB.put(Long.valueOf(Thread.currentThread().getId()), arrayOfByte1);
      }
      GMTrace.o(11870618517504L, 88443);
      return arrayOfByte1;
    }
    finally {}
  }
  
  public final Bitmap a(String paramString1, String paramString2, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    GMTrace.i(11870350082048L, 88441);
    paramString1 = kf(b(paramString1, paramString2, paramBoolean, paramInt1, paramInt2));
    GMTrace.o(11870350082048L, 88441);
    return paramString1;
  }
  
  public final String a(ImageView paramImageView, String paramString1, String paramString2, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    GMTrace.i(11869410557952L, 88434);
    paramString1 = b(paramString1, paramString2, paramBoolean, paramInt1, paramInt2);
    paramImageView.setTag(paramString1);
    w.d("MicroMsg.FTS.SearchImageLoader", "update image view cache key: hashcode=%d | cacheKey=%s", new Object[] { Integer.valueOf(paramImageView.hashCode()), paramString1 });
    GMTrace.o(11869410557952L, 88434);
    return paramString1;
  }
  
  public final void a(final Context paramContext, final ImageView paramImageView, String paramString1, String paramString2, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    GMTrace.i(11869276340224L, 88433);
    String str = a(paramImageView, paramString1, paramString2, paramBoolean, paramInt1, paramInt2);
    if (!this.pnx)
    {
      GMTrace.o(11869276340224L, 88433);
      return;
    }
    paramContext = new b(str, paramString1, paramString2, paramBoolean, paramInt1, paramInt2, new c()
    {
      public final void al(final String paramAnonymousString, boolean paramAnonymousBoolean)
      {
        GMTrace.i(11866055114752L, 88409);
        w.v("MicroMsg.FTS.SearchImageLoader", "LoadBitmapJob finish: %s %b", new Object[] { paramAnonymousString, Boolean.valueOf(paramAnonymousBoolean) });
        i.this.pnD.remove(paramAnonymousString);
        if (!paramAnonymousBoolean)
        {
          GMTrace.o(11866055114752L, 88409);
          return;
        }
        final Bitmap localBitmap = i.this.kf(paramAnonymousString);
        if (paramAnonymousString.equals(paramImageView.getTag())) {
          i.this.ham.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(11822300135424L, 88083);
              if (paramAnonymousString.equals(i.3.this.iXd.getTag())) {
                g.a.a(i.3.this.val$context.getResources(), localBitmap, i.3.this.iXd);
              }
              GMTrace.o(11822300135424L, 88083);
            }
          });
        }
        GMTrace.o(11866055114752L, 88409);
      }
    });
    if (this.pnD.add(str))
    {
      this.pny += 1;
      this.pny %= 2;
      this.pnz[this.pny].post(paramContext);
      GMTrace.o(11869276340224L, 88433);
      return;
    }
    w.v("MicroMsg.FTS.SearchImageLoader", "cacheKey: %s | runningJobTask: %s", new Object[] { str, this.pnD.toString() });
    GMTrace.o(11869276340224L, 88433);
  }
  
  public final void a(String paramString1, String paramString2, Bitmap paramBitmap)
  {
    GMTrace.i(16064519864320L, 119690);
    if (this.pnv.size() > pnu) {
      Fr((String)this.pnw.lastElement());
    }
    a locala = new a();
    locala.fHK = paramString2;
    locala.bitmap = paramBitmap;
    this.pnv.put(paramString1, locala);
    if (!new File(locala.fHK).exists()) {
      this.pnC.postDelayed(new d(locala), 200L);
    }
    GMTrace.o(16064519864320L, 119690);
  }
  
  public final boolean aBA()
  {
    GMTrace.i(11869813211136L, 88437);
    boolean bool = this.pnx;
    GMTrace.o(11869813211136L, 88437);
    return bool;
  }
  
  public final void aBB()
  {
    GMTrace.i(11869947428864L, 88438);
    w.d("MicroMsg.FTS.SearchImageLoader", "startLoadImage");
    this.pnx = true;
    GMTrace.o(11869947428864L, 88438);
  }
  
  public final void aBC()
  {
    GMTrace.i(11870081646592L, 88439);
    w.d("MicroMsg.FTS.SearchImageLoader", "clearCacheAndTask %s", new Object[] { Integer.valueOf(this.pnv.size()) });
    aBy();
    Iterator localIterator = this.pnv.entrySet().iterator();
    while (localIterator.hasNext()) {
      Fr((String)((Map.Entry)localIterator.next()).getKey());
    }
    this.pnw.clear();
    this.pnD.clear();
    GMTrace.o(11870081646592L, 88439);
  }
  
  public final void aBD()
  {
    GMTrace.i(11870215864320L, 88440);
    aBC();
    w.d("MicroMsg.FTS.SearchImageLoader", "destoryLoader");
    int i = 0;
    while (i < 2)
    {
      if (this.pnz[i] != null) {
        this.pnz[i].getLooper().quit();
      }
      i += 1;
    }
    Iterator localIterator = this.pnA.values().iterator();
    while (localIterator.hasNext())
    {
      ByteArrayOutputStream localByteArrayOutputStream = (ByteArrayOutputStream)localIterator.next();
      try
      {
        localByteArrayOutputStream.close();
      }
      catch (IOException localIOException) {}
    }
    this.pnA.clear();
    this.pnB.clear();
    this.pnC.getLooper().quit();
    GMTrace.o(11870215864320L, 88440);
  }
  
  public final void aBy()
  {
    GMTrace.i(11869544775680L, 88435);
    w.d("MicroMsg.FTS.SearchImageLoader", "stopLoadImageTask");
    int i = 0;
    while (i < 2)
    {
      if (this.pnz[i] != null) {
        this.pnz[i].removeCallbacksAndMessages(null);
      }
      i += 1;
    }
    GMTrace.o(11869544775680L, 88435);
  }
  
  public final void aBz()
  {
    GMTrace.i(11869678993408L, 88436);
    w.d("MicroMsg.FTS.SearchImageLoader", "stopLoadImage");
    this.pnx = false;
    aBy();
    GMTrace.o(11869678993408L, 88436);
  }
  
  public final Bitmap b(String paramString, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    GMTrace.i(11870886952960L, 88445);
    if (bg.mZ(paramString))
    {
      GMTrace.o(11870886952960L, 88445);
      return null;
    }
    Object localObject1 = (ByteArrayOutputStream)this.pnA.get(Long.valueOf(Thread.currentThread().getId()));
    Object localObject3 = localObject1;
    if (localObject1 == null)
    {
      localObject3 = new ByteArrayOutputStream(32768);
      this.pnA.put(Long.valueOf(Thread.currentThread().getId()), localObject3);
    }
    ((ByteArrayOutputStream)localObject3).reset();
    byte[] arrayOfByte = getBuffer();
    localObject2 = null;
    localObject1 = null;
    int i = 0;
    try
    {
      InputStream localInputStream = b.k(paramString, 10000, 20000);
      if (localInputStream == null)
      {
        localObject1 = localInputStream;
        localObject2 = localInputStream;
        w.w("MicroMsg.FTS.SearchImageLoader", "download %s error, can not open http stream", new Object[] { paramString });
        if (localInputStream != null) {}
        try
        {
          localInputStream.close();
          GMTrace.o(11870886952960L, 88445);
          return null;
        }
        catch (IOException paramString)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.FTS.SearchImageLoader", paramString, "", new Object[0]);
          }
        }
      }
      for (;;)
      {
        localObject1 = localInputStream;
        localObject2 = localInputStream;
        int j = localInputStream.read(arrayOfByte);
        if (j == -1) {
          break;
        }
        i += j;
        localObject1 = localInputStream;
        localObject2 = localInputStream;
        ((ByteArrayOutputStream)localObject3).write(arrayOfByte, 0, j);
      }
      try
      {
        ((InputStream)localObject2).close();
        throw paramString;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.FTS.SearchImageLoader", localIOException, "", new Object[0]);
        }
      }
    }
    catch (Exception localException)
    {
      localObject2 = localObject1;
      w.printErrStackTrace("MicroMsg.FTS.SearchImageLoader", localException, "", new Object[0]);
      localObject2 = localObject1;
      w.w("MicroMsg.FTS.SearchImageLoader", "get url:%s failed.", new Object[] { paramString });
      if (localObject1 != null) {}
      try
      {
        ((InputStream)localObject1).close();
        GMTrace.o(11870886952960L, 88445);
        return null;
        localObject1 = localException;
        localObject2 = localException;
        localObject3 = ((ByteArrayOutputStream)localObject3).toByteArray();
        if ((paramInt1 > 0) && (paramInt2 > 0))
        {
          localObject1 = localException;
          localObject2 = localException;
          localObject3 = com.tencent.mm.sdk.platformtools.d.decodeByteArray((byte[])localObject3, paramInt1, paramInt2);
        }
        for (;;)
        {
          localObject1 = localException;
          localObject2 = localException;
          w.d("MicroMsg.FTS.SearchImageLoader", "get url[%s] ok, bufSize[%d], bitmap size %d * %d", new Object[] { paramString, Integer.valueOf(i), Integer.valueOf(((Bitmap)localObject3).getWidth()), Integer.valueOf(((Bitmap)localObject3).getHeight()) });
          if (paramBoolean)
          {
            localObject1 = localException;
            localObject2 = localException;
            localObject3 = com.tencent.mm.sdk.platformtools.d.a((Bitmap)localObject3, true, ((Bitmap)localObject3).getWidth());
            if (localException != null) {}
            try
            {
              localException.close();
              GMTrace.o(11870886952960L, 88445);
              return (Bitmap)localObject3;
              localObject1 = localException;
              localObject2 = localException;
              localObject3 = com.tencent.mm.sdk.platformtools.d.bf((byte[])localObject3);
            }
            catch (IOException paramString)
            {
              for (;;)
              {
                w.printErrStackTrace("MicroMsg.FTS.SearchImageLoader", paramString, "", new Object[0]);
              }
            }
          }
        }
        if (localException != null) {}
        try
        {
          localException.close();
          GMTrace.o(11870886952960L, 88445);
          return (Bitmap)localObject3;
        }
        catch (IOException paramString)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.FTS.SearchImageLoader", paramString, "", new Object[0]);
          }
        }
      }
      catch (IOException paramString)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.FTS.SearchImageLoader", paramString, "", new Object[0]);
        }
      }
    }
    finally
    {
      if (localObject2 == null) {}
    }
  }
  
  public final Bitmap kf(String paramString)
  {
    GMTrace.i(11870484299776L, 88442);
    a locala = (a)this.pnv.get(paramString);
    if ((locala != null) && (locala.bitmap != null) && (!locala.bitmap.isRecycled()))
    {
      this.pnw.remove(paramString);
      this.pnw.add(0, paramString);
    }
    if (locala == null)
    {
      GMTrace.o(11870484299776L, 88442);
      return null;
    }
    paramString = locala.bitmap;
    GMTrace.o(11870484299776L, 88442);
    return paramString;
  }
  
  final class a
  {
    Bitmap bitmap;
    String fHK;
    
    a()
    {
      GMTrace.i(11867531509760L, 88420);
      GMTrace.o(11867531509760L, 88420);
    }
  }
  
  final class b
    implements Runnable
  {
    private String fHK;
    private int height;
    private String iMh;
    private boolean pnG;
    private i.c pnH;
    private String url;
    private int width;
    
    public b(String paramString1, String paramString2, String paramString3, boolean paramBoolean, int paramInt1, int paramInt2, i.c paramc)
    {
      GMTrace.i(11874108178432L, 88469);
      this.iMh = paramString1;
      this.url = paramString2;
      this.fHK = paramString3;
      this.pnH = paramc;
      this.pnG = paramBoolean;
      this.width = paramInt1;
      this.height = paramInt2;
      GMTrace.o(11874108178432L, 88469);
    }
    
    public final void run()
    {
      GMTrace.i(11874242396160L, 88470);
      w.d("MicroMsg.FTS.SearchImageLoader", "Start to run load bitmap job %s", new Object[] { this.iMh });
      if (bg.mZ(this.fHK)) {
        this.fHK = i.Fq(this.iMh);
      }
      long l2 = System.currentTimeMillis();
      Bitmap localBitmap = i.K(this.fHK, this.width, this.height);
      long l1 = System.currentTimeMillis();
      if (localBitmap != null)
      {
        w.d("MicroMsg.FTS.SearchImageLoader", "Found image in local %s | localPath %s | use time %d", new Object[] { this.url, this.fHK, Long.valueOf(l1 - l2) });
        i.this.a(this.iMh, this.fHK, localBitmap);
        this.pnH.al(this.iMh, true);
        GMTrace.o(11874242396160L, 88470);
        return;
      }
      localBitmap = i.this.b(this.url, this.pnG, this.width, this.height);
      l2 = System.currentTimeMillis();
      w.d("MicroMsg.FTS.SearchImageLoader", "Get image from net %s | localPath %s | use time %d", new Object[] { this.url, this.fHK, Long.valueOf(l2 - l1) });
      if (localBitmap != null)
      {
        i.this.a(this.iMh, this.fHK, localBitmap);
        this.pnH.al(this.iMh, true);
        GMTrace.o(11874242396160L, 88470);
        return;
      }
      this.pnH.al(this.iMh, false);
      GMTrace.o(11874242396160L, 88470);
    }
  }
  
  static abstract interface c
  {
    public abstract void al(String paramString, boolean paramBoolean);
  }
  
  final class d
    implements Runnable
  {
    private i.a pnI;
    
    public d(i.a parama)
    {
      GMTrace.i(11868605251584L, 88428);
      this.pnI = parama;
      GMTrace.o(11868605251584L, 88428);
    }
    
    public final void run()
    {
      GMTrace.i(11868739469312L, 88429);
      w.d("MicroMsg.FTS.SearchImageLoader", "Start to run save bitmap job");
      try
      {
        if (!new File(this.pnI.fHK).exists())
        {
          if ((this.pnI.bitmap != null) && (!this.pnI.bitmap.isRecycled()))
          {
            long l = System.currentTimeMillis();
            com.tencent.mm.sdk.platformtools.d.a(this.pnI.bitmap, 100, Bitmap.CompressFormat.PNG, this.pnI.fHK, false);
            w.d("MicroMsg.FTS.SearchImageLoader", "Save bitmap use time: %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
            GMTrace.o(11868739469312L, 88429);
            return;
          }
          w.d("MicroMsg.FTS.SearchImageLoader", "Save Bitmap is Recycled");
        }
        GMTrace.o(11868739469312L, 88429);
        return;
      }
      catch (IOException localIOException)
      {
        w.printErrStackTrace("MicroMsg.FTS.SearchImageLoader", localIOException, "", new Object[0]);
        GMTrace.o(11868739469312L, 88429);
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/search/ui/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */