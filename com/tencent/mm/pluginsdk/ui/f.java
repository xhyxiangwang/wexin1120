package com.tencent.mm.pluginsdk.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.m;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.d;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.e.b;
import com.tencent.mm.ab.n;
import com.tencent.mm.ae.m;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;

public final class f
{
  private static final Drawable nDG;
  private Activity activity;
  private String iKa;
  public p nDF;
  private GetHdHeadImageGalleryView nDH;
  public e pqc;
  private String sYD;
  public b sYE;
  private int sYF;
  public String username;
  
  static
  {
    GMTrace.i(1182592401408L, 8811);
    nDG = new ColorDrawable();
    GMTrace.o(1182592401408L, 8811);
  }
  
  public f(Activity paramActivity, String paramString)
  {
    this(paramActivity, paramString, null);
    GMTrace.i(1181250224128L, 8801);
    GMTrace.o(1181250224128L, 8801);
  }
  
  public f(Activity paramActivity, String paramString1, String paramString2)
  {
    this(paramActivity, paramString1, paramString2, a.sYI);
    GMTrace.i(1181384441856L, 8802);
    GMTrace.o(1181384441856L, 8802);
  }
  
  public f(Activity paramActivity, String paramString1, String paramString2, int paramInt)
  {
    this(paramActivity, paramString1, paramString2, paramInt, (byte)0);
    GMTrace.i(1181518659584L, 8803);
    GMTrace.o(1181518659584L, 8803);
  }
  
  private f(Activity paramActivity, String paramString1, String paramString2, int paramInt, byte paramByte)
  {
    GMTrace.i(1181652877312L, 8804);
    this.sYD = null;
    this.iKa = null;
    this.activity = paramActivity;
    this.username = paramString1;
    this.iKa = paramString2;
    this.sYE = null;
    this.sYF = paramInt;
    GMTrace.o(1181652877312L, 8804);
  }
  
  public final void bHS()
  {
    GMTrace.i(1181787095040L, 8805);
    Object localObject1 = LayoutInflater.from(this.activity).inflate(R.i.cXl, null);
    this.nDF = new p((View)localObject1, -1, -1);
    switch (2.sYH[(this.sYF - 1)])
    {
    }
    for (;;)
    {
      this.nDF.setFocusable(true);
      this.nDF.setOutsideTouchable(true);
      this.nDF.setBackgroundDrawable(nDG);
      this.nDF.showAtLocation(this.activity.getWindow().getDecorView(), 49, 0, 0);
      this.nDH = ((GetHdHeadImageGalleryView)((View)localObject1).findViewById(R.h.bKR));
      this.nDH.sYv = this.nDF;
      this.nDH.username = this.username;
      ap.AS();
      if (c.isSDCardAvailable()) {
        break;
      }
      t.fn(this.activity);
      d(n.Dh().aZ(this.activity), null);
      GMTrace.o(1181787095040L, 8805);
      return;
      this.nDF.setAnimationStyle(R.m.fdn);
      continue;
      this.nDF.setAnimationStyle(R.m.fdo);
      continue;
      this.nDF.setAnimationStyle(R.m.fdm);
    }
    final Object localObject2;
    if (!bg.mZ(this.iKa))
    {
      localObject1 = m.d(this.username, this.iKa, R.g.bbs);
      localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = BitmapFactory.decodeResource(this.activity.getResources(), R.g.aYg);
      }
      if ((localObject2 == null) || (((Bitmap)localObject2).isRecycled())) {
        break label422;
      }
      w.i("MicroMsg.GetHdHeadImg", "The avatar of %s is in the cache", new Object[] { this.username });
      this.nDH.setThumbImage((Bitmap)localObject2);
    }
    for (;;)
    {
      if (!bg.mZ(this.sYD)) {
        this.username = this.sYD;
      }
      n.Dh();
      localObject1 = d.hJ(this.username);
      if ((localObject1 == null) || (((Bitmap)localObject1).isRecycled())) {
        break label444;
      }
      w.i("MicroMsg.GetHdHeadImg", "The HDAvatar of %s is already exists", new Object[] { this.username });
      n.Dh();
      d((Bitmap)localObject1, d.r(this.username, true));
      GMTrace.o(1181787095040L, 8805);
      return;
      localObject1 = b.a(this.username, true, -1);
      break;
      label422:
      w.i("MicroMsg.GetHdHeadImg", "The avatar of %s is not in the cache, use default avatar", new Object[] { this.username });
    }
    label444:
    this.pqc = new e();
    this.pqc.a(this.username, new e.b()
    {
      public final int aM(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(1035221336064L, 7713);
        f.this.pqc.Dl();
        w.i("MicroMsg.GetHdHeadImg", "onSceneEnd: errType=%d, errCode=%d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        Object localObject;
        if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
        {
          n.Dh();
          localObject = d.hJ(f.this.username);
          if (localObject != null)
          {
            f localf = f.this;
            n.Dh();
            localf.d((Bitmap)localObject, d.r(f.this.username, true));
          }
          for (;;)
          {
            if (f.this.sYE != null)
            {
              localObject = f.this.sYE;
              localObject = f.this.username;
            }
            GMTrace.o(1035221336064L, 7713);
            return 0;
            f.this.d(localObject2, null);
          }
        }
        f.this.d(localObject2, null);
        if (f.this.sYE != null)
        {
          localObject = f.this.sYE;
          localObject = f.this.username;
        }
        GMTrace.o(1035221336064L, 7713);
        return 0;
      }
    });
    GMTrace.o(1181787095040L, 8805);
  }
  
  public final void d(Bitmap paramBitmap, String paramString)
  {
    GMTrace.i(1181921312768L, 8806);
    for (;;)
    {
      try
      {
        if (paramBitmap.getWidth() < 480)
        {
          float f = 480 / paramBitmap.getWidth();
          localObject = new Matrix();
          ((Matrix)localObject).postScale(f, f);
          localObject = Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), (Matrix)localObject, true);
          w.d("MicroMsg.GetHdHeadImg", "dkhdbm old[%d %d] new[%d %d]", new Object[] { Integer.valueOf(paramBitmap.getWidth()), Integer.valueOf(paramBitmap.getHeight()), Integer.valueOf(((Bitmap)localObject).getWidth()), Integer.valueOf(((Bitmap)localObject).getHeight()) });
          this.nDH.M((Bitmap)localObject);
          this.nDH.pqd = paramString;
          GMTrace.o(1181921312768L, 8806);
          return;
        }
      }
      catch (Exception paramBitmap)
      {
        w.printErrStackTrace("MicroMsg.GetHdHeadImg", paramBitmap, "", new Object[0]);
        GMTrace.o(1181921312768L, 8806);
        return;
      }
      Object localObject = paramBitmap;
    }
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(1156419944448L, 8616);
      sYI = 1;
      sYJ = 2;
      sYK = 3;
      sYL = new int[] { sYI, sYJ, sYK };
      GMTrace.o(1156419944448L, 8616);
    }
    
    public static int[] bHT()
    {
      GMTrace.i(1156285726720L, 8615);
      int[] arrayOfInt = (int[])sYL.clone();
      GMTrace.o(1156285726720L, 8615);
      return arrayOfInt;
    }
  }
  
  public static abstract interface b {}
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */