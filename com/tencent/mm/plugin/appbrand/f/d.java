package com.tencent.mm.plugin.appbrand.f;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.px;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelappbrand.a.b;
import com.tencent.mm.plugin.appbrand.p.f;
import com.tencent.mm.plugin.appbrand.p.g;
import com.tencent.mm.plugin.appbrand.p.i;
import com.tencent.mm.plugin.fts.d.a.a.a;
import com.tencent.mm.plugin.fts.d.a.a.b;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.List;

public final class d
  extends com.tencent.mm.plugin.fts.d.a.a
{
  public com.tencent.mm.plugin.fts.a.a.i iOg;
  public List<String> iOh;
  public com.tencent.mm.plugin.appbrand.c.e iOi;
  public CharSequence iOj;
  private b iOk;
  a iOl;
  
  public d(int paramInt)
  {
    super(16, paramInt);
    GMTrace.i(10656082296832L, 79394);
    this.iOk = new b();
    this.iOl = new a();
    GMTrace.o(10656082296832L, 79394);
  }
  
  public final a.b Vk()
  {
    GMTrace.i(16548643209216L, 123297);
    b localb = this.iOk;
    GMTrace.o(16548643209216L, 123297);
    return localb;
  }
  
  protected final a.a Vl()
  {
    GMTrace.i(18199521263616L, 135597);
    a locala = this.iOl;
    GMTrace.o(18199521263616L, 135597);
    return locala;
  }
  
  public final String Vm()
  {
    GMTrace.i(10656484950016L, 79397);
    String str = this.iOi.appName;
    GMTrace.o(10656484950016L, 79397);
    return str;
  }
  
  public final int Vn()
  {
    GMTrace.i(10656619167744L, 79398);
    int i = this.iOg.mkP;
    GMTrace.o(10656619167744L, 79398);
    return i;
  }
  
  public final void a(Context paramContext, a.a parama, Object... paramVarArgs)
  {
    int i = 1;
    boolean bool = false;
    GMTrace.i(16548508991488L, 123296);
    this.iOi = i.pL(this.iOg.mkj);
    if (this.iOi == null)
    {
      GMTrace.o(16548508991488L, 123296);
      return;
    }
    switch (this.iOg.hJy)
    {
    default: 
      i = 0;
      bool = false;
      if (i == 0) {
        break;
      }
    }
    for (this.iOj = ((com.tencent.mm.plugin.appbrand.compat.a.i)h.h(com.tencent.mm.plugin.appbrand.compat.a.i.class)).a(this.iOi.appName, this.iOh, bool, this.fIW);; this.iOj = ((com.tencent.mm.plugin.appbrand.compat.a.i)h.h(com.tencent.mm.plugin.appbrand.compat.a.i.class)).a(this.iOi.appName, this.iOh, this.fIW))
    {
      this.info = this.iOi.ftu;
      GMTrace.o(16548508991488L, 123296);
      return;
      bool = true;
      break;
    }
  }
  
  public final class a
    extends a.a
  {
    public TextView iOm;
    public TextView iOn;
    public View iiK;
    public ImageView iiL;
    public TextView iiM;
    
    public a()
    {
      super();
      GMTrace.i(10653263724544L, 79373);
      GMTrace.o(10653263724544L, 79373);
    }
  }
  
  public final class b
    extends a.b
  {
    public b()
    {
      super();
      GMTrace.i(10653397942272L, 79374);
      GMTrace.o(10653397942272L, 79374);
    }
    
    public final View a(Context paramContext, ViewGroup paramViewGroup)
    {
      GMTrace.i(10653532160000L, 79375);
      paramContext = LayoutInflater.from(paramContext).inflate(p.g.ivc, paramViewGroup, false);
      paramViewGroup = (d.a)d.this.iOl;
      paramViewGroup.iiL = ((ImageView)paramContext.findViewById(p.f.bjt));
      paramViewGroup.iiM = ((TextView)paramContext.findViewById(p.f.cBJ));
      paramViewGroup.iiK = paramContext.findViewById(p.f.ctB);
      paramViewGroup.iOm = ((TextView)paramContext.findViewById(p.f.iuF));
      paramViewGroup.iOn = ((TextView)paramContext.findViewById(p.f.iuO));
      paramContext.setTag(paramViewGroup);
      GMTrace.o(10653532160000L, 79375);
      return paramContext;
    }
    
    public final void a(Context paramContext, a.a parama, com.tencent.mm.plugin.fts.d.a.a paramVarArgs)
    {
      GMTrace.i(16549448515584L, 123303);
      paramContext = (d)paramVarArgs;
      parama = (d.a)parama;
      if (paramContext.iOi == null)
      {
        parama.iiK.setVisibility(8);
        GMTrace.o(16549448515584L, 123303);
        return;
      }
      parama.iiK.setVisibility(0);
      parama.iiM.setText(d.this.iOj);
      int k = d.this.iOi.iCo;
      long l = d.this.iOi.iEI;
      int j = 0;
      int i = 0;
      if ((1L & l) > 0L)
      {
        j = 1;
        i = p.i.iyz;
        if ((j == 0) || (k != 0)) {
          break label252;
        }
        paramVarArgs = new ColorMatrix();
        paramVarArgs.setSaturation(0.0F);
        parama.iiL.setColorFilter(new ColorMatrixColorFilter(paramVarArgs));
        parama.iOm.setVisibility(0);
        parama.iOm.setText(i);
        label167:
        paramVarArgs = com.tencent.mm.plugin.appbrand.appcache.a.hJ(d.this.iOi.iCo);
        if (!bg.mZ(paramVarArgs)) {
          break label263;
        }
        parama.iOn.setVisibility(8);
      }
      for (;;)
      {
        b.CT().a(parama.iiL, paramContext.iOi.iEH, com.tencent.mm.modelappbrand.a.a.CS(), com.tencent.mm.modelappbrand.a.e.hkj);
        GMTrace.o(16549448515584L, 123303);
        return;
        if ((l & 0x2) <= 0L) {
          break;
        }
        j = 1;
        i = p.i.iyy;
        break;
        label252:
        parama.iiL.setColorFilter(null);
        break label167;
        label263:
        parama.iOn.setText(paramVarArgs);
        parama.iOn.setVisibility(0);
      }
    }
    
    public final boolean a(Context paramContext, com.tencent.mm.plugin.fts.d.a.a paramVarArgs)
    {
      GMTrace.i(16549582733312L, 123304);
      paramContext = (d)paramVarArgs;
      paramVarArgs = new px();
      paramVarArgs.fNL.userName = paramContext.iOi.ftu;
      paramVarArgs.fNL.fNO = paramContext.iOi.iCo;
      paramVarArgs.fNL.fNR = true;
      paramVarArgs.fNL.scene = 1027;
      com.tencent.mm.sdk.b.a.uLm.m(paramVarArgs);
      GMTrace.o(16549582733312L, 123304);
      return true;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/f/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */