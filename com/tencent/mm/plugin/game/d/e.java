package com.tencent.mm.plugin.game.d;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.a.f;
import com.tencent.mm.an.a.a.c.a;
import com.tencent.mm.an.n;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.lang.ref.WeakReference;

public class e
{
  private static final String mRs;
  private static e mRt;
  public f<String, Bitmap> mHi;
  public f<String, Bitmap> mNK;
  private ColorDrawable mRu;
  private Bitmap mRv;
  private Bitmap mRw;
  
  static
  {
    GMTrace.i(12571771928576L, 93667);
    mRs = com.tencent.mm.loader.stub.a.gZT + "Game/Image/";
    GMTrace.o(12571771928576L, 93667);
  }
  
  private e()
  {
    GMTrace.i(12570563969024L, 93658);
    this.mHi = new f(6);
    this.mNK = new f(15);
    this.mRu = new ColorDrawable(android.support.v4.content.a.c(ab.getContext(), R.e.aOr));
    try
    {
      this.mRv = BackwardSupportUtil.b.a(ab.getContext().getAssets().open("avatar/default_nor_avatar.png"), com.tencent.mm.bq.a.getDensity(null));
      if ((this.mRv != null) && (!this.mRv.isRecycled())) {
        this.mRw = d.a(this.mRv, false, 0.5F * this.mRv.getWidth());
      }
      an.aUV().c(new j.a()
      {
        public final void a(String paramAnonymousString, l paramAnonymousl)
        {
          GMTrace.i(12575932678144L, 93698);
          if (e.this.mHi.aZ(paramAnonymousString))
          {
            paramAnonymousl = com.tencent.mm.pluginsdk.model.app.g.b(paramAnonymousString, 1, com.tencent.mm.bq.a.getDensity(null));
            e.this.mHi.k(paramAnonymousString, paramAnonymousl);
          }
          GMTrace.o(12575932678144L, 93698);
        }
      });
      GMTrace.o(12570563969024L, 93658);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.i("MicroMsg.GameImageUtil", localException.getMessage());
      }
    }
  }
  
  public static e aFP()
  {
    GMTrace.i(12570429751296L, 93657);
    if (mRt == null) {}
    try
    {
      if (mRt == null) {
        mRt = new e();
      }
      e locale = mRt;
      GMTrace.o(12570429751296L, 93657);
      return locale;
    }
    finally {}
  }
  
  public static Bitmap y(Bitmap paramBitmap)
  {
    GMTrace.i(16083712999424L, 119833);
    if ((paramBitmap != null) && (!paramBitmap.isRecycled()))
    {
      if (paramBitmap.getHeight() > paramBitmap.getWidth()) {}
      for (int i = paramBitmap.getWidth();; i = paramBitmap.getHeight())
      {
        paramBitmap = d.a(paramBitmap, i, i, false);
        GMTrace.o(16083712999424L, 119833);
        return paramBitmap;
      }
    }
    GMTrace.o(16083712999424L, 119833);
    return paramBitmap;
  }
  
  public final void a(final ImageView paramImageView, final String paramString, final float paramFloat)
  {
    GMTrace.i(17973498609664L, 133913);
    if ((paramImageView == null) || (bg.mZ(paramString)))
    {
      GMTrace.o(17973498609664L, 133913);
      return;
    }
    if (this.mHi.aZ(paramString))
    {
      localBitmap = (Bitmap)this.mHi.get(paramString);
      if ((localBitmap != null) && (!localBitmap.isRecycled()))
      {
        paramImageView.setImageBitmap(localBitmap);
        GMTrace.o(17973498609664L, 133913);
        return;
      }
    }
    Bitmap localBitmap = com.tencent.mm.pluginsdk.model.app.g.b(paramString, 1, paramFloat);
    if ((localBitmap != null) && (!localBitmap.isRecycled()))
    {
      paramImageView.setImageBitmap(localBitmap);
      this.mHi.put(paramString, localBitmap);
      GMTrace.o(17973498609664L, 133913);
      return;
    }
    paramImageView.setImageResource(R.g.aZb);
    paramImageView = new WeakReference(paramImageView);
    an.aUV().c(new j.a()
    {
      public final void a(String paramAnonymousString, l paramAnonymousl)
      {
        GMTrace.i(12572040364032L, 93669);
        if (paramString.equals(paramAnonymousString))
        {
          paramAnonymousString = com.tencent.mm.pluginsdk.model.app.g.b(paramString, 1, paramFloat);
          if (paramAnonymousString != null)
          {
            if ((paramImageView != null) && (paramImageView.get() != null)) {
              ((ImageView)paramImageView.get()).setImageBitmap(paramAnonymousString);
            }
            e.this.mHi.put(paramString, paramAnonymousString);
            an.aUV().j(this);
          }
        }
        GMTrace.o(12572040364032L, 93669);
      }
    });
    GMTrace.o(17973498609664L, 133913);
  }
  
  public final void a(ImageView paramImageView, String paramString, a parama)
  {
    GMTrace.i(12570832404480L, 93660);
    a(paramImageView, paramString, parama, null);
    GMTrace.o(12570832404480L, 93660);
  }
  
  public final void a(final ImageView paramImageView, String paramString, a parama, final b paramb)
  {
    GMTrace.i(12570966622208L, 93661);
    if (bg.mZ(paramString))
    {
      GMTrace.o(12570966622208L, 93661);
      return;
    }
    final a locala = parama;
    if (parama == null) {
      locala = new e.a.a().aFQ();
    }
    int i;
    if ((!locala.hCN) || (locala.mRF)) {
      i = 0;
    }
    while (i != 0)
    {
      GMTrace.o(12570966622208L, 93661);
      return;
      if (this.mNK.aZ(paramString))
      {
        parama = (Bitmap)this.mNK.get(paramString);
        if ((parama != null) && (!parama.isRecycled()))
        {
          if (paramImageView != null) {
            paramImageView.setImageBitmap(parama);
          }
          if (paramb != null) {
            paramb.x(parama);
          }
          i = 1;
          continue;
        }
      }
      i = 0;
    }
    parama = new c.a();
    boolean bool;
    String str;
    File localFile2;
    if (!locala.mRF)
    {
      bool = true;
      parama.hCN = bool;
      str = mRs;
      File localFile1 = new File(str);
      if (!localFile1.exists())
      {
        if (!localFile1.getParentFile().exists())
        {
          localFile2 = localFile1.getParentFile();
          File localFile3 = new File(localFile2.getAbsolutePath() + System.currentTimeMillis());
          if (!localFile3.mkdir()) {
            break label426;
          }
          localFile3.renameTo(localFile2);
        }
        if ((!localFile1.mkdir()) || (!localFile1.isDirectory())) {
          w.e("MicroMsg.GameImageUtil", "mkdir error. %s", new Object[] { str });
        }
      }
      label291:
      str = mRs + com.tencent.mm.a.g.n(paramString.getBytes());
      parama.hCP = locala.hCP;
      if (locala.mRF) {
        break label449;
      }
      parama.hCR = str;
      label342:
      parama.hDm = locala.hDm;
      parama.hDl = false;
      if ((paramImageView != null) && (locala.mRE))
      {
        if (locala.mRG != 0) {
          break label463;
        }
        paramImageView.setImageDrawable(this.mRu);
      }
    }
    for (;;)
    {
      parama = parama.Jk();
      n.Ja().a(paramString, null, parama, new com.tencent.mm.an.a.c.g()
      {
        public final void a(String paramAnonymousString, final View paramAnonymousView, com.tencent.mm.an.a.d.b paramAnonymousb)
        {
          GMTrace.i(12572443017216L, 93672);
          if ((paramAnonymousb != null) && (paramAnonymousb.bitmap != null))
          {
            paramAnonymousb = paramAnonymousb.bitmap;
            paramAnonymousView = paramAnonymousb;
            if (locala.mRD) {
              paramAnonymousView = e.y(paramAnonymousb);
            }
            if (locala.hCN) {
              e.this.mNK.k(paramAnonymousString, paramAnonymousView);
            }
            af.u(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(12570027098112L, 93654);
                if (e.2.this.iXd != null) {
                  e.2.this.iXd.setImageBitmap(paramAnonymousView);
                }
                GMTrace.o(12570027098112L, 93654);
              }
            });
            if (paramb != null) {
              paramb.x(paramAnonymousView);
            }
          }
          GMTrace.o(12572443017216L, 93672);
        }
        
        public final void ki(String paramAnonymousString)
        {
          GMTrace.i(12572308799488L, 93671);
          GMTrace.o(12572308799488L, 93671);
        }
      });
      GMTrace.o(12570966622208L, 93661);
      return;
      bool = false;
      break;
      label426:
      w.e("MicroMsg.GameImageUtil", "mkdir error, %s", new Object[] { localFile2.getAbsolutePath() });
      break label291;
      label449:
      parama.hCP = false;
      com.tencent.mm.pluginsdk.j.a.e.a.Oa(str);
      break label342;
      label463:
      paramImageView.setImageResource(locala.mRG);
    }
  }
  
  public final void g(ImageView paramImageView, String paramString)
  {
    GMTrace.i(12570698186752L, 93659);
    a(paramImageView, paramString, null, null);
    GMTrace.o(12570698186752L, 93659);
  }
  
  public final Bitmap h(ImageView paramImageView, String paramString)
  {
    GMTrace.i(12571100839936L, 93662);
    paramString = com.tencent.mm.ab.b.a(paramString, false, -1);
    if (((paramString != null) && (!paramString.isRecycled())) || ((this.mRv == null) || (this.mRv.isRecycled()))) {}
    try
    {
      this.mRv = BackwardSupportUtil.b.a(ab.getContext().getAssets().open("avatar/default_nor_avatar.png"), com.tencent.mm.bq.a.getDensity(null));
      if ((this.mRv != null) && (!this.mRv.isRecycled()) && (paramImageView != null)) {
        paramImageView.setImageBitmap(this.mRv);
      }
      paramImageView = this.mRv;
      GMTrace.o(12571100839936L, 93662);
      return paramImageView;
      if (paramImageView != null) {
        paramImageView.setImageBitmap(paramString);
      }
      GMTrace.o(12571100839936L, 93662);
      return paramString;
    }
    catch (Exception paramString)
    {
      for (;;) {}
    }
  }
  
  public final Bitmap i(ImageView paramImageView, String paramString)
  {
    GMTrace.i(12571235057664L, 93663);
    paramString = com.tencent.mm.ab.b.a(paramString, false, -1);
    if ((paramString != null) && (!paramString.isRecycled())) {}
    for (paramString = d.a(paramString, false, 0.5F * paramString.getWidth());; paramString = this.mRw)
    {
      if ((paramString != null) && (!paramString.isRecycled()) && (paramImageView != null)) {
        paramImageView.setImageBitmap(paramString);
      }
      GMTrace.o(12571235057664L, 93663);
      return paramString;
    }
  }
  
  public static final class a
  {
    public final boolean hCN;
    public final boolean hCP;
    final boolean hDm;
    final boolean mRD;
    final boolean mRE;
    public final boolean mRF;
    final int mRG;
    
    public a(a parama)
    {
      GMTrace.i(12570161315840L, 93655);
      this.hCN = parama.hCN;
      this.hCP = parama.hCP;
      this.hDm = parama.hDm;
      this.mRD = parama.mRD;
      this.mRE = parama.mRE;
      this.mRF = parama.mRF;
      this.mRG = parama.mRG;
      GMTrace.o(12570161315840L, 93655);
    }
    
    public static final class a
    {
      public boolean hCN;
      public boolean hCP;
      public boolean hDm;
      public boolean mRD;
      public boolean mRE;
      public boolean mRF;
      public int mRG;
      
      public a()
      {
        GMTrace.i(12576335331328L, 93701);
        this.hCN = true;
        this.hCP = true;
        this.hDm = false;
        this.mRD = false;
        this.mRE = true;
        this.mRF = false;
        this.mRG = 0;
        GMTrace.o(12576335331328L, 93701);
      }
      
      public final e.a aFQ()
      {
        GMTrace.i(12576469549056L, 93702);
        e.a locala = new e.a(this);
        GMTrace.o(12576469549056L, 93702);
        return locala;
      }
    }
  }
  
  public static abstract class b
  {
    public b()
    {
      GMTrace.i(12572577234944L, 93673);
      GMTrace.o(12572577234944L, 93673);
    }
    
    public abstract void x(Bitmap paramBitmap);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/d/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */