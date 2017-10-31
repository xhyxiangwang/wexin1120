package com.tencent.mm.plugin.shake.d.b;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.a.g;
import com.tencent.mm.platformtools.i.a;
import com.tencent.mm.platformtools.i.b;
import com.tencent.mm.platformtools.j;
import com.tencent.mm.platformtools.j.a;
import com.tencent.mm.plugin.shake.d.a.k;
import com.tencent.mm.plugin.shake.e.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;

public final class a
  extends BitmapDrawable
  implements j.a
{
  private static final Paint hax;
  private static Bitmap pxS;
  private int mRG;
  private String pxP;
  private ImageView pxQ;
  private com.tencent.mm.platformtools.i pxR;
  private int type;
  private String username;
  
  static
  {
    GMTrace.i(6611431063552L, 49259);
    Paint localPaint = new Paint();
    hax = localPaint;
    localPaint.setAntiAlias(true);
    hax.setFilterBitmap(true);
    GMTrace.o(6611431063552L, 49259);
  }
  
  private static Bitmap B(View paramView, int paramInt)
  {
    GMTrace.i(6610894192640L, 49255);
    if (paramView == null)
    {
      paramView = pxS;
      GMTrace.o(6610894192640L, 49255);
      return paramView;
    }
    int i = paramView.getMeasuredWidth();
    int j = paramView.getMeasuredHeight();
    if (((pxS != null) && (pxS.getWidth() == i)) || (paramInt > 0)) {}
    for (;;)
    {
      try
      {
        pxS = d.t(paramView.getResources().getDrawable(paramInt));
        if ((pxS.getWidth() != i) && (i > 0) && (j > 0)) {
          pxS = Bitmap.createScaledBitmap(pxS, i, j, true);
        }
      }
      catch (IOException paramView)
      {
        w.printErrStackTrace("MicroMsg.ShakeAvatarDrawable", paramView, "", new Object[0]);
        continue;
      }
      paramView = pxS;
      GMTrace.o(6610894192640L, 49255);
      return paramView;
      pxS = BackwardSupportUtil.b.a(ab.getContext().getAssets().open("avatar/default_nor_avatar.png"), com.tencent.mm.bq.a.getDensity(null));
    }
  }
  
  public static String DS(String paramString)
  {
    GMTrace.i(6611162628096L, 49257);
    if (bg.mZ(paramString))
    {
      w.w("MicroMsg.ShakeAvatarDrawable", "getStoragePath: but url is null");
      GMTrace.o(6611162628096L, 49257);
      return null;
    }
    String str = com.tencent.mm.plugin.shake.d.a.i.bdZ();
    if (bg.mZ(str))
    {
      w.w("MicroMsg.ShakeAvatarDrawable", "getStoragePath, but save dir is null");
      GMTrace.o(6611162628096L, 49257);
      return null;
    }
    paramString = String.format("%s/%s", new Object[] { str, g.n(paramString.getBytes()) });
    GMTrace.o(6611162628096L, 49257);
    return paramString;
  }
  
  public final void draw(Canvas paramCanvas)
  {
    GMTrace.i(6610759974912L, 49254);
    w.i("MicroMsg.ShakeAvatarDrawable", "album username[%s], url[%s], type[%d], attr[%s]", new Object[] { this.username, this.pxP, Integer.valueOf(this.type), toString() });
    if ((4 != this.type) && ((!k.tB(this.type)) || (6 == this.type)))
    {
      GMTrace.o(6610759974912L, 49254);
      return;
    }
    Object localObject2 = null;
    Object localObject1;
    if (4 == this.type)
    {
      this.pxR = new a(this.pxP);
      localObject1 = j.a(this.pxR);
    }
    for (;;)
    {
      if (localObject1 != null)
      {
        localObject2 = localObject1;
        if (!((Bitmap)localObject1).isRecycled()) {}
      }
      else
      {
        w.i("MicroMsg.ShakeAvatarDrawable", "bm is null or recycled, album url[%s]", new Object[] { this.pxP });
        localObject2 = B(this.pxQ, this.mRG);
      }
      if (localObject2 != null) {
        paramCanvas.drawBitmap((Bitmap)localObject2, null, getBounds(), hax);
      }
      GMTrace.o(6610759974912L, 49254);
      return;
      localObject1 = localObject2;
      if (k.tB(this.type))
      {
        localObject1 = localObject2;
        if (6 != this.type)
        {
          this.pxR = new b(this.pxP);
          localObject1 = j.a(this.pxR);
        }
      }
    }
  }
  
  public final void k(String paramString, final Bitmap paramBitmap)
  {
    GMTrace.i(6611028410368L, 49256);
    w.i("MicroMsg.ShakeAvatarDrawable", "type[%d] notifyKey[%s] albumUrl[%s]", new Object[] { Integer.valueOf(this.type), paramString, this.pxP });
    if ((this.pxR != null) && (paramString.equals(this.pxR.Pi())) && ((4 == this.type) || ((k.tB(this.type)) && (6 != this.type)))) {
      this.pxQ.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6613444329472L, 49274);
          a.a(a.this).setImageBitmap(paramBitmap);
          GMTrace.o(6613444329472L, 49274);
        }
      });
    }
    GMTrace.o(6611028410368L, 49256);
  }
  
  private static final class a
    implements com.tencent.mm.platformtools.i
  {
    private String pxP;
    
    public a(String paramString)
    {
      GMTrace.i(6611565281280L, 49260);
      this.pxP = paramString;
      GMTrace.o(6611565281280L, 49260);
    }
    
    public final void F(String paramString, boolean paramBoolean)
    {
      GMTrace.i(6612907458560L, 49270);
      GMTrace.o(6612907458560L, 49270);
    }
    
    public final i.b Pf()
    {
      GMTrace.i(6613175894016L, 49272);
      GMTrace.o(6613175894016L, 49272);
      return null;
    }
    
    public final String Pg()
    {
      GMTrace.i(6611699499008L, 49261);
      String str = a.DS(this.pxP);
      GMTrace.o(6611699499008L, 49261);
      return str;
    }
    
    public final String Ph()
    {
      GMTrace.i(6611833716736L, 49262);
      String str = this.pxP;
      GMTrace.o(6611833716736L, 49262);
      return str;
    }
    
    public final String Pi()
    {
      GMTrace.i(6611967934464L, 49263);
      String str = this.pxP;
      GMTrace.o(6611967934464L, 49263);
      return str;
    }
    
    public final String Pj()
    {
      GMTrace.i(6612102152192L, 49264);
      String str = this.pxP;
      GMTrace.o(6612102152192L, 49264);
      return str;
    }
    
    public final boolean Pk()
    {
      GMTrace.i(6612236369920L, 49265);
      GMTrace.o(6612236369920L, 49265);
      return true;
    }
    
    public final boolean Pl()
    {
      GMTrace.i(6612370587648L, 49266);
      GMTrace.o(6612370587648L, 49266);
      return false;
    }
    
    public final Bitmap Pm()
    {
      GMTrace.i(6612504805376L, 49267);
      Bitmap localBitmap = BitmapFactory.decodeResource(ab.getContext().getResources(), R.g.bbq);
      GMTrace.o(6612504805376L, 49267);
      return localBitmap;
    }
    
    public final void Pn()
    {
      GMTrace.i(6612773240832L, 49269);
      GMTrace.o(6612773240832L, 49269);
    }
    
    public final Bitmap a(Bitmap paramBitmap, i.a parama, String paramString)
    {
      GMTrace.i(6612639023104L, 49268);
      if (i.a.iaZ == parama) {}
      try
      {
        d.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, a.DS(this.pxP), false);
        w.d("MicroMsg.ShakeAvatarDrawable", "get bitmap, from %s", new Object[] { parama.toString() });
        GMTrace.o(6612639023104L, 49268);
        return paramBitmap;
      }
      catch (IOException paramString)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.ShakeAvatarDrawable", paramString, "", new Object[0]);
          w.w("MicroMsg.ShakeAvatarDrawable", "save bitmap fail");
        }
      }
    }
    
    public final void a(i.a parama, String paramString)
    {
      GMTrace.i(6613041676288L, 49271);
      GMTrace.o(6613041676288L, 49271);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/shake/d/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */