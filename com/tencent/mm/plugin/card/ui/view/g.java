package com.tencent.mm.plugin.card.ui.view;

import android.graphics.Bitmap;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.bn.a.a;
import com.tencent.mm.plugin.card.b.c;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.ui.j;
import com.tencent.mm.protocal.c.jf;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;

public abstract class g
  extends i
{
  String code;
  private Bitmap ioh;
  MMActivity jFp;
  protected b kmJ;
  private Bitmap krk;
  private View.OnLongClickListener krt;
  private j kuA;
  private ViewGroup kzK;
  private aa kzL;
  private ViewStub kzM;
  
  public g()
  {
    GMTrace.i(18887521337344L, 140723);
    this.krt = new View.OnLongClickListener()
    {
      public final boolean onLongClick(View paramAnonymousView)
      {
        GMTrace.i(18895037530112L, 140779);
        if (paramAnonymousView.getId() == R.h.bvG)
        {
          com.tencent.mm.plugin.card.b.p.H(g.this.jFp, g.this.kmJ.aiL().code);
          com.tencent.mm.ui.base.h.bl(g.this.jFp, g.this.getString(R.l.duV));
        }
        GMTrace.o(18895037530112L, 140779);
        return false;
      }
    };
    GMTrace.o(18887521337344L, 140723);
  }
  
  private static void a(ImageView paramImageView, Bitmap paramBitmap)
  {
    GMTrace.i(18889534603264L, 140738);
    if ((paramImageView == null) || (paramBitmap == null))
    {
      GMTrace.o(18889534603264L, 140738);
      return;
    }
    paramImageView.setImageBitmap(paramBitmap);
    GMTrace.o(18889534603264L, 140738);
  }
  
  public final void MH()
  {
    GMTrace.i(18887655555072L, 140724);
    this.jFp = this.kzR.akO();
    this.kuA = this.kzR.akU();
    this.kmJ = this.kzR.akL();
    if (this.kmJ == null)
    {
      w.e("MicroMsg.CardBaseCodeView", "initView failure! cardInfo is null!");
      GMTrace.o(18887655555072L, 140724);
      return;
    }
    switch (this.kmJ.aiL().tEt)
    {
    default: 
      this.kzL = amg();
    }
    while (this.kzL == null)
    {
      w.e("MicroMsg.CardBaseCodeView", "iniView failure! codeContainer is null!");
      GMTrace.o(18887655555072L, 140724);
      return;
      this.kzL = amg();
      continue;
      this.kzL = amh();
      continue;
      this.kzL = ami();
    }
    switch (this.kmJ.aiL().tEt)
    {
    default: 
      if (this.kzM == null) {
        this.kzM = ((ViewStub)findViewById(R.h.bqR));
      }
      if (this.kzM == null) {
        w.e("MicroMsg.CardBaseCodeView", "initTargetView failure! viewStub is null!");
      }
      break;
    }
    for (;;)
    {
      if (this.kzK != null) {
        break label421;
      }
      w.e("MicroMsg.CardBaseCodeView", "iniView failure! targetView is null!");
      GMTrace.o(18887655555072L, 140724);
      return;
      if (this.kzM != null) {
        break;
      }
      this.kzM = ((ViewStub)findViewById(R.h.bqR));
      break;
      if (this.kzM != null) {
        break;
      }
      this.kzM = ((ViewStub)findViewById(R.h.boP));
      break;
      if (this.kzM != null) {
        break;
      }
      this.kzM = ((ViewStub)findViewById(R.h.bpm));
      break;
      if (this.kzL == null)
      {
        w.e("MicroMsg.CardBaseCodeView", "iniView failure! codeContainer is null!");
      }
      else if (this.kzL.getLayoutId() == 0)
      {
        w.e("MicroMsg.CardBaseCodeView", "initTargetView failure! codeContainer.getLayoutId()  is 0!");
      }
      else
      {
        this.kzM.setLayoutResource(this.kzL.getLayoutId());
        if (this.kzK == null) {
          this.kzK = ((ViewGroup)this.kzM.inflate());
        }
      }
    }
    label421:
    GMTrace.o(18887655555072L, 140724);
  }
  
  public final void amb()
  {
    GMTrace.i(18888863514624L, 140733);
    if (this.kzK != null) {
      this.kzK.setVisibility(8);
    }
    GMTrace.o(18888863514624L, 140733);
  }
  
  public final void ame()
  {
    GMTrace.i(18888595079168L, 140731);
    if ((this.kzL != null) && (this.kmJ != null) && (this.kzK != null)) {
      this.kzL.a(this.kzK, this.kmJ);
    }
    GMTrace.o(18888595079168L, 140731);
  }
  
  public final void amf()
  {
    GMTrace.i(18888729296896L, 140732);
    if ((this.kmJ != null) && (this.kzL != null) && (this.kzK != null))
    {
      this.kzL.b(this.kzK, this.kmJ);
      if ((this.kmJ.aiL().tEt == 2) && (this.kuA != null))
      {
        j localj = this.kuA;
        if ((localj.ioi != null) && (localj.ioi.isShowing())) {
          localj.ioi.dismiss();
        }
      }
      GMTrace.o(18888729296896L, 140732);
      return;
    }
    w.e("MicroMsg.CardBaseCodeView", "onScreenShot is error! mCardInfo or codeContainer or targetView is null ");
    GMTrace.o(18888729296896L, 140732);
  }
  
  public abstract aa amg();
  
  public abstract aa amh();
  
  public abstract aa ami();
  
  public final void d(c paramc)
  {
    int j = 1;
    GMTrace.i(18888192425984L, 140728);
    if (this.kmJ == null)
    {
      w.e("MicroMsg.CardBaseCodeView", "updateCodeView getCode mCardInfo  is null ! cannot show code view");
      GMTrace.o(18888192425984L, 140728);
      return;
    }
    if (paramc == null)
    {
      w.e("MicroMsg.CardBaseCodeView", "updateCodeView failure!refreshReason is null!");
      GMTrace.o(18888192425984L, 140728);
      return;
    }
    if (!this.kzL.i(this.kmJ))
    {
      w.e("MicroMsg.CardBaseCodeView", "updateCodeView failure! can not get qrcode! refreshReason = %s", new Object[] { Integer.valueOf(paramc.action) });
      ame();
      GMTrace.o(18888192425984L, 140728);
      return;
    }
    this.kzL.e(this.kzK);
    w.i("MicroMsg.CardBaseCodeView", "updateCodeView from refreshReason = %s", new Object[] { Integer.valueOf(paramc.action) });
    this.code = e(paramc);
    if (com.tencent.pb.common.c.h.xJ(this.code))
    {
      w.e("MicroMsg.CardBaseCodeView", "updateCodeView getCode is empty! cannot show code view");
      GMTrace.o(18888192425984L, 140728);
      return;
    }
    switch (this.kmJ.aiL().tEt)
    {
    }
    for (;;)
    {
      GMTrace.o(18888192425984L, 140728);
      return;
      Object localObject = this.kzK;
      paramc = this.code;
      try
      {
        localObject = (ImageView)((View)localObject).findViewById(R.h.bvz);
        l.u(this.ioh);
        int i = j;
        if (this.kmJ != null)
        {
          i = j;
          if (this.kmJ.aiK() != null) {
            i = this.kmJ.aiK().tFD;
          }
        }
        this.ioh = a.b(this.jFp, paramc, 0, i);
        a((ImageView)localObject, this.ioh);
        ((ImageView)localObject).setOnClickListener(this.kzR.akP());
        this.kuA.ioh = this.ioh;
        paramc = this.kuA;
        if ((paramc.ioi != null) && (paramc.ioi.isShowing())) {
          paramc.ioj.setImageBitmap(paramc.ioh);
        }
        GMTrace.o(18888192425984L, 140728);
        return;
      }
      catch (Exception paramc)
      {
        w.printErrStackTrace("MicroMsg.CardBaseCodeView", paramc, "", new Object[0]);
        GMTrace.o(18888192425984L, 140728);
        return;
      }
      localObject = this.kzK;
      paramc = this.code;
      try
      {
        localObject = (ImageView)((View)localObject).findViewById(R.h.bvq);
        l.u(this.krk);
        if ((paramc != null) && (paramc.length() > 0)) {
          this.krk = a.b(this.jFp, paramc, 5, 0);
        }
        a((ImageView)localObject, this.krk);
        ((ImageView)localObject).setOnClickListener(this.kzR.akP());
        this.kuA.krk = this.krk;
        GMTrace.o(18888192425984L, 140728);
        return;
      }
      catch (Exception paramc)
      {
        w.printErrStackTrace("MicroMsg.CardBaseCodeView", paramc, "", new Object[0]);
        GMTrace.o(18888192425984L, 140728);
        return;
      }
      localObject = this.kzK;
      paramc = this.code;
      localObject = (TextView)((View)localObject).findViewById(R.h.bvG);
      ((TextView)localObject).setText(com.tencent.mm.plugin.card.b.m.us(paramc));
      ((TextView)localObject).setOnLongClickListener(this.krt);
      String str = this.kmJ.aiK().hbA;
      if (!com.tencent.pb.common.c.h.xJ(str)) {
        ((TextView)localObject).setTextColor(l.uk(str));
      }
      if (paramc.length() <= 12)
      {
        ((TextView)localObject).setTextSize(1, 33.0F);
        GMTrace.o(18888192425984L, 140728);
        return;
      }
      if ((paramc.length() > 12) && (paramc.length() <= 16))
      {
        ((TextView)localObject).setTextSize(1, 30.0F);
        GMTrace.o(18888192425984L, 140728);
        return;
      }
      if ((paramc.length() > 16) && (paramc.length() <= 20))
      {
        ((TextView)localObject).setTextSize(1, 24.0F);
        GMTrace.o(18888192425984L, 140728);
        return;
      }
      if ((paramc.length() > 20) && (paramc.length() <= 40))
      {
        ((TextView)localObject).setTextSize(1, 18.0F);
        GMTrace.o(18888192425984L, 140728);
        return;
      }
      if (paramc.length() > 40) {
        ((TextView)localObject).setVisibility(8);
      }
    }
  }
  
  public final void d(b paramb)
  {
    GMTrace.i(18887789772800L, 140725);
    if (paramb == null)
    {
      w.e("MicroMsg.CardBaseCodeView", "updateCardInfo failure! mCardInfo is null!");
      GMTrace.o(18887789772800L, 140725);
      return;
    }
    this.kmJ = paramb;
    GMTrace.o(18887789772800L, 140725);
  }
  
  public final void destroy()
  {
    GMTrace.i(18887923990528L, 140726);
    super.destroy();
    this.jFp = null;
    this.kuA = null;
    this.kmJ = null;
    this.kzK = null;
    this.kzL = null;
    l.u(this.ioh);
    l.u(this.krk);
    GMTrace.o(18887923990528L, 140726);
  }
  
  public abstract String e(c paramc);
  
  public abstract boolean h(b paramb);
  
  public final void update()
  {
    GMTrace.i(18888058208256L, 140727);
    if (this.kmJ == null)
    {
      w.e("MicroMsg.CardBaseCodeView", "update  failure! mCardInfo is null!");
      GMTrace.o(18888058208256L, 140727);
      return;
    }
    if (this.kzL == null)
    {
      w.e("MicroMsg.CardBaseCodeView", "update failure! codeContainer is null!");
      GMTrace.o(18888058208256L, 140727);
      return;
    }
    if (this.kzK == null)
    {
      w.e("MicroMsg.CardBaseCodeView", "update failure! targetView is null!");
      GMTrace.o(18888058208256L, 140727);
      return;
    }
    this.kuA.alm();
    d(c.kAJ);
    this.kzL.c(this.kzK, this.kmJ);
    GMTrace.o(18888058208256L, 140727);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/view/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */