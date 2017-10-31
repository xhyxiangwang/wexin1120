package com.tencent.mm.plugin.fts.d.a;

import android.content.Context;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.fts.d.b.b;
import com.tencent.mm.plugin.fts.d.d.b;
import com.tencent.mm.plugin.fts.d.e;
import com.tencent.mm.plugin.fts.d.f;
import com.tencent.mm.plugin.fts.d.j.d;
import com.tencent.mm.plugin.fts.d.j.e;
import com.tencent.mm.plugin.fts.d.j.g;

public final class c
  extends a
{
  public CharSequence mnN;
  private a.b mnO;
  a.a mnP;
  
  public c(int paramInt)
  {
    super(18, paramInt);
    GMTrace.i(19903952191488L, 148296);
    this.mnO = new b();
    this.mnP = new a();
    GMTrace.o(19903952191488L, 148296);
  }
  
  public final a.b Vk()
  {
    GMTrace.i(19904220626944L, 148298);
    a.b localb = this.mnO;
    GMTrace.o(19904220626944L, 148298);
    return localb;
  }
  
  protected final a.a Vl()
  {
    GMTrace.i(19904354844672L, 148299);
    a.a locala = this.mnP;
    GMTrace.o(19904354844672L, 148299);
    return locala;
  }
  
  public final void a(Context paramContext, a.a parama, Object... paramVarArgs)
  {
    GMTrace.i(19904086409216L, 148297);
    parama = TextUtils.ellipsize(this.fIW, d.b.mmY, 400.0F, TextUtils.TruncateAt.MIDDLE).toString();
    this.mnN = f.a(paramContext.getString(j.g.eEl), paramContext.getString(j.g.eEk), com.tencent.mm.plugin.fts.d.b.a.d(parama, parama)).mok;
    GMTrace.o(19904086409216L, 148297);
  }
  
  public final class a
    extends a.a
  {
    public TextView mnQ;
    
    public a()
    {
      super();
      GMTrace.i(19905025933312L, 148304);
      GMTrace.o(19905025933312L, 148304);
    }
  }
  
  public final class b
    extends a.b
  {
    public b()
    {
      super();
      GMTrace.i(19904489062400L, 148300);
      GMTrace.o(19904489062400L, 148300);
    }
    
    public final View a(Context paramContext, ViewGroup paramViewGroup)
    {
      GMTrace.i(19904623280128L, 148301);
      paramContext = LayoutInflater.from(paramContext).inflate(j.e.mnn, paramViewGroup, false);
      paramViewGroup = (c.a)c.this.mnP;
      paramViewGroup.mnQ = ((TextView)paramContext.findViewById(j.d.bQa));
      paramContext.setTag(paramViewGroup);
      GMTrace.o(19904623280128L, 148301);
      return paramContext;
    }
    
    public final void a(Context paramContext, a.a parama, a paramVarArgs)
    {
      GMTrace.i(19904757497856L, 148302);
      paramContext = (c.a)parama;
      e.a(c.this.mnN, paramContext.mnQ);
      GMTrace.o(19904757497856L, 148302);
    }
    
    public final boolean a(Context paramContext, a paramVarArgs)
    {
      GMTrace.i(19904891715584L, 148303);
      GMTrace.o(19904891715584L, 148303);
      return false;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/fts/d/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */