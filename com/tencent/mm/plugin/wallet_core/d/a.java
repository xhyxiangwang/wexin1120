package com.tencent.mm.plugin.wallet_core.d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.NinePatch;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.g.a.ad;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.platformtools.j;
import com.tencent.mm.platformtools.j.a;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class a
{
  public ArrayList<a> rYo;
  private com.tencent.mm.sdk.b.c rYp;
  public LinkedList<String> rYq;
  public LinkedList<Bankcard> rYr;
  
  public a()
  {
    GMTrace.i(6833829838848L, 50916);
    this.rYo = new ArrayList();
    this.rYp = new com.tencent.mm.sdk.b.c() {};
    com.tencent.mm.sdk.b.a.uLm.b(this.rYp);
    GMTrace.o(6833829838848L, 50916);
  }
  
  private static boolean a(Context paramContext, Bankcard paramBankcard)
  {
    GMTrace.i(6834366709760L, 50920);
    if (m.zS()) {}
    for (paramContext = com.tencent.mm.plugin.wallet_core.c.b.h(paramContext, paramBankcard.field_bankName, false); (paramContext == null) || (paramContext.rNp); paramContext = com.tencent.mm.plugin.wallet_core.c.b.h(paramContext, paramBankcard.field_bankcardType, paramBankcard.bwl()))
    {
      GMTrace.o(6834366709760L, 50920);
      return false;
    }
    GMTrace.o(6834366709760L, 50920);
    return true;
  }
  
  public final void a(Context paramContext, Bankcard paramBankcard, ImageView paramImageView)
  {
    GMTrace.i(6833964056576L, 50917);
    a(paramContext, paramBankcard, paramImageView, null, null);
    GMTrace.o(6833964056576L, 50917);
  }
  
  public final void a(Context paramContext, Bankcard paramBankcard, ImageView paramImageView1, View paramView, ImageView paramImageView2)
  {
    GMTrace.i(6834098274304L, 50918);
    a locala = new a();
    locala.rCW = paramBankcard;
    if (paramImageView1 != null)
    {
      paramImageView1.setTag(R.h.cIG, paramBankcard.field_bankcardType);
      locala.rYx = new WeakReference(paramImageView1);
    }
    if (paramView != null) {
      locala.rYy = new WeakReference(paramView);
    }
    if (paramImageView2 != null) {
      locala.rYz = new WeakReference(paramImageView2);
    }
    this.rYo.add(locala);
    if (m.zS()) {}
    for (paramImageView1 = paramBankcard.field_bankName; (this.rYq != null) && (this.rYq.contains(paramImageView1)); paramImageView1 = paramBankcard.field_bankcardType)
    {
      w.i("MicroMsg.BankcardLogoHelper", "waiting resp:" + paramImageView1);
      GMTrace.o(6834098274304L, 50918);
      return;
    }
    if (!a(paramContext, paramBankcard))
    {
      if (this.rYr == null) {
        this.rYr = new LinkedList();
      }
      this.rYr.add(paramBankcard);
      if (this.rYq == null)
      {
        b(paramContext, this.rYr);
        GMTrace.o(6834098274304L, 50918);
      }
    }
    else
    {
      paramContext = new ad();
      com.tencent.mm.sdk.b.a.uLm.m(paramContext);
    }
    GMTrace.o(6834098274304L, 50918);
  }
  
  public final void a(final Bankcard paramBankcard, final ImageView paramImageView)
  {
    GMTrace.i(18037520465920L, 134390);
    a locala = new a();
    locala.rCW = paramBankcard;
    if (paramImageView != null)
    {
      paramImageView.setTag(R.h.cIG, paramBankcard.field_bankcardType);
      locala.rYx = new WeakReference(paramImageView);
    }
    paramImageView = paramBankcard.rNi;
    if ((paramImageView != null) && (locala.rYx != null) && (locala.rYx.get() != null))
    {
      w.d("MicroMsg.BankcardLogoHelper", "bankLogoUrl = " + paramImageView.oiq);
      paramBankcard = (ImageView)locala.rYx.get();
      if (!bg.mZ(paramImageView.oiq))
      {
        paramImageView = j.a(new com.tencent.mm.plugin.wallet_core.ui.view.c(paramImageView.oiq));
        if (paramImageView != null) {
          paramBankcard.setImageBitmap(paramImageView);
        }
        j.a(locala);
        GMTrace.o(18037520465920L, 134390);
        return;
      }
      if (paramImageView.rNm > 0)
      {
        paramBankcard.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(18037788901376L, 134392);
            paramBankcard.setImageResource(paramImageView.rNm);
            GMTrace.o(18037788901376L, 134392);
          }
        });
        GMTrace.o(18037520465920L, 134390);
        return;
      }
      w.e("MicroMsg.BankcardLogoHelper", "bankcard logoUrl == null");
      GMTrace.o(18037520465920L, 134390);
      return;
    }
    w.e("MicroMsg.BankcardLogoHelper", "bankUrls == null");
    GMTrace.o(18037520465920L, 134390);
  }
  
  public final void b(final Context paramContext, List<Bankcard> paramList)
  {
    GMTrace.i(6834500927488L, 50921);
    if ((paramList != null) && (paramList.size() > 0))
    {
      int j = paramList.size();
      this.rYq = new LinkedList();
      int i = 0;
      if (i < j)
      {
        Bankcard localBankcard = (Bankcard)paramList.get(i);
        if (localBankcard.bwm()) {
          w.i("MicroMsg.BankcardLogoHelper", "ignore balance");
        }
        for (;;)
        {
          i += 1;
          break;
          if (!a(paramContext, localBankcard))
          {
            w.i("MicroMsg.BankcardLogoHelper", localBankcard.field_bankcardType + "'s url is null or need update");
            this.rYq.add(localBankcard.field_bankcardType);
          }
        }
      }
      if (this.rYq.size() > 0)
      {
        w.i("MicroMsg.BankcardLogoHelper", "doScene to get bankcard logo");
        paramList = new com.tencent.mm.plugin.wallet_core.b.b(this.rYq);
        ap.wT().a(1650, new com.tencent.mm.ac.e()
        {
          public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
          {
            GMTrace.i(18037386248192L, 134389);
            ap.wT().b(1650, this);
            a.this.rYq = null;
            if (a.this.rYr != null)
            {
              a.this.b(paramContext, a.this.rYr);
              a.this.rYr = null;
            }
            GMTrace.o(18037386248192L, 134389);
          }
        });
        ap.wT().a(paramList, 0);
        GMTrace.o(6834500927488L, 50921);
        return;
      }
      w.i("MicroMsg.BankcardLogoHelper", "use cache bankcard logo data");
      paramContext = new ad();
      com.tencent.mm.sdk.b.a.uLm.m(paramContext);
    }
    GMTrace.o(6834500927488L, 50921);
  }
  
  public final void destory()
  {
    GMTrace.i(6834232492032L, 50919);
    com.tencent.mm.sdk.b.a.uLm.c(this.rYp);
    if (this.rYo != null)
    {
      this.rYo.clear();
      this.rYo = null;
    }
    GMTrace.o(6834232492032L, 50919);
  }
  
  static final class a
    implements j.a
  {
    Bankcard rCW;
    String rWL;
    WeakReference<ImageView> rYx;
    WeakReference<View> rYy;
    WeakReference<ImageView> rYz;
    
    a()
    {
      GMTrace.i(6833158750208L, 50911);
      this.rYy = null;
      this.rYz = null;
      GMTrace.o(6833158750208L, 50911);
    }
    
    public final void k(String paramString, final Bitmap paramBitmap)
    {
      boolean bool2 = true;
      GMTrace.i(6833292967936L, 50912);
      Object localObject = new StringBuilder("onGetPictureFinish ").append(paramString).append(", bitmap = ");
      if (paramBitmap == null) {}
      for (boolean bool1 = true;; bool1 = false)
      {
        w.d("MicroMsg.BankcardLogoHelper", bool1);
        if (!TextUtils.isEmpty(this.rWL)) {
          break;
        }
        w.e("MicroMsg.BankcardLogoHelper", "mBankcardLogoUrl is empty");
        GMTrace.o(6833292967936L, 50912);
        return;
      }
      final ImageView localImageView;
      if (this.rYx != null)
      {
        localImageView = (ImageView)this.rYx.get();
        if (paramBitmap != null) {
          break label218;
        }
        bool1 = true;
        if (localImageView != null) {
          break label223;
        }
        label112:
        if (localImageView != null) {
          break label229;
        }
      }
      label218:
      label223:
      label229:
      for (localObject = "";; localObject = localImageView.getTag())
      {
        w.d("MicroMsg.BankcardLogoHelper", "onGetPictureFinish done notifyKey %s  bitmap is null? %s iv is null? %s iv tag: %s mBankcardLogoUrl %s", new Object[] { paramString, Boolean.valueOf(bool1), Boolean.valueOf(bool2), localObject, this.rWL });
        if ((localImageView != null) && (paramString != null) && (paramString.equals(this.rWL)))
        {
          localImageView.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(6836379975680L, 50935);
              localImageView.setImageBitmap(paramBitmap);
              GMTrace.o(6836379975680L, 50935);
            }
          });
          localImageView.setTag(R.h.cIG, null);
        }
        GMTrace.o(6833292967936L, 50912);
        return;
        bool1 = false;
        break;
        bool2 = false;
        break label112;
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */