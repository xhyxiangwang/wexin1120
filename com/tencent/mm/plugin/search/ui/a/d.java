package com.tencent.mm.plugin.search.ui.a;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.fts.a.a.c;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.d.a.a.a;
import com.tencent.mm.plugin.fts.d.a.a.b;
import com.tencent.mm.plugin.fts.d.b.b;
import com.tencent.mm.plugin.fts.d.e;
import com.tencent.mm.plugin.fts.d.f;
import java.util.List;

public final class d
  extends com.tencent.mm.plugin.fts.d.a.a
{
  public int actionType;
  public i iOg;
  public List<String> iOh;
  public CharSequence lWW;
  public String lWZ;
  public CharSequence pnT;
  public String pnU;
  public c pnV;
  private b pnW;
  a pnX;
  
  public d(int paramInt)
  {
    super(3, paramInt);
    GMTrace.i(11852364906496L, 88307);
    this.actionType = -1;
    this.pnW = new b();
    this.pnX = new a();
    GMTrace.o(11852364906496L, 88307);
  }
  
  public final a.b Vk()
  {
    GMTrace.i(16473347063808L, 122736);
    b localb = this.pnW;
    GMTrace.o(16473347063808L, 122736);
    return localb;
  }
  
  protected final a.a Vl()
  {
    GMTrace.i(18366756552704L, 136843);
    a locala = this.pnX;
    GMTrace.o(18366756552704L, 136843);
    return locala;
  }
  
  public final String Vm()
  {
    GMTrace.i(11852767559680L, 88310);
    String str = this.pnV.field_title;
    GMTrace.o(11852767559680L, 88310);
    return str;
  }
  
  public final int Vn()
  {
    GMTrace.i(11852901777408L, 88311);
    int i = this.iOg.mkP;
    GMTrace.o(11852901777408L, 88311);
    return i;
  }
  
  public final void a(Context paramContext, a.a parama, Object... paramVarArgs)
  {
    boolean bool2 = true;
    GMTrace.i(16473212846080L, 122735);
    this.pnV = ((c)this.iOg.userData);
    if (this.pnV == null)
    {
      GMTrace.o(16473212846080L, 122735);
      return;
    }
    this.lWW = this.pnV.field_title;
    this.pnT = this.pnV.field_tag;
    this.lWZ = this.pnV.field_iconPath;
    this.pnU = this.pnV.field_androidUrl;
    this.actionType = this.pnV.field_actionType;
    boolean bool1;
    switch (this.iOg.hJy)
    {
    default: 
      GMTrace.o(16473212846080L, 122735);
      return;
    case 3: 
      bool1 = true;
    }
    for (;;)
    {
      this.lWW = f.b(com.tencent.mm.plugin.fts.d.b.a.a(this.lWW, this.fIW, this.iOh, bool2, bool1)).mok;
      GMTrace.o(16473212846080L, 122735);
      return;
      this.pnT = f.b(com.tencent.mm.plugin.fts.d.b.a.a(this.pnT, this.fIW, this.iOh)).mok;
      break;
      bool1 = false;
      continue;
      bool2 = false;
      bool1 = false;
    }
  }
  
  public final class a
    extends a.a
  {
    public View iiK;
    public ImageView iiL;
    public TextView iiM;
    public TextView iiN;
    
    public a()
    {
      super();
      GMTrace.i(11852230688768L, 88306);
      GMTrace.o(11852230688768L, 88306);
    }
  }
  
  public final class b
    extends a.b
  {
    public b()
    {
      super();
      GMTrace.i(11847398850560L, 88270);
      GMTrace.o(11847398850560L, 88270);
    }
    
    public final View a(Context paramContext, ViewGroup paramViewGroup)
    {
      GMTrace.i(11847533068288L, 88271);
      paramContext = LayoutInflater.from(paramContext).inflate(R.i.cVs, paramViewGroup, false);
      int i = paramViewGroup.getPaddingLeft();
      int j = paramViewGroup.getPaddingRight();
      paramContext.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(paramViewGroup.getWidth(), 1073741824), i + j, -1), View.MeasureSpec.makeMeasureSpec(-2, 1073741824));
      paramViewGroup = (d.a)d.this.pnX;
      paramViewGroup.iiL = ((ImageView)paramContext.findViewById(R.h.bjt));
      paramViewGroup.iiM = ((TextView)paramContext.findViewById(R.h.cBJ));
      paramViewGroup.iiN = ((TextView)paramContext.findViewById(R.h.bAy));
      paramViewGroup.iiK = paramContext.findViewById(R.h.ctB);
      paramContext.setTag(paramViewGroup);
      GMTrace.o(11847533068288L, 88271);
      return paramContext;
    }
    
    public final void a(Context paramContext, a.a parama, com.tencent.mm.plugin.fts.d.a.a paramVarArgs)
    {
      GMTrace.i(16471199580160L, 122720);
      parama = (d.a)parama;
      paramVarArgs = (d)paramVarArgs;
      cj(parama.iiK);
      e.a(d.this.lWW, parama.iiM);
      e.a(d.this.pnT, parama.iiN);
      e.a(paramContext, parama.iiL, null, paramVarArgs.lWZ, R.k.doC);
      GMTrace.o(16471199580160L, 122720);
    }
    
    public final boolean a(Context paramContext, com.tencent.mm.plugin.fts.d.a.a paramVarArgs)
    {
      GMTrace.i(16471333797888L, 122721);
      paramVarArgs = (d)paramVarArgs;
      a(d.this.fIW, paramVarArgs.iOg);
      if (((com.tencent.mm.plugin.appbrand.k.d)h.h(com.tencent.mm.plugin.appbrand.k.d.class)).qM(paramVarArgs.pnV.field_url))
      {
        GMTrace.o(16471333797888L, 122721);
        return true;
      }
      Intent localIntent;
      if (paramVarArgs.pnV.field_actionType == 2)
      {
        localIntent = new Intent();
        localIntent.putExtra("rawUrl", paramVarArgs.pnV.field_url);
        com.tencent.mm.bi.d.b(paramContext, "webview", ".ui.tools.WebViewUI", localIntent);
        GMTrace.o(16471333797888L, 122721);
        return true;
      }
      if (!com.tencent.mm.plugin.search.a.a.F(paramContext, paramVarArgs.pnV.field_featureId))
      {
        localIntent = new Intent();
        localIntent.putExtra("rawUrl", paramVarArgs.pnV.field_updateUrl);
        com.tencent.mm.bi.d.b(paramContext, "webview", ".ui.tools.WebViewUI", localIntent);
      }
      GMTrace.o(16471333797888L, 122721);
      return true;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/search/ui/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */