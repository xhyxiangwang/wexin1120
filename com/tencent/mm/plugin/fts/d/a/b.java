package com.tencent.mm.plugin.fts.d.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.fts.d.e;
import com.tencent.mm.plugin.fts.d.j.c;
import com.tencent.mm.plugin.fts.d.j.d;
import com.tencent.mm.plugin.fts.d.j.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public class b
  extends a
{
  public String mnI;
  private b mnJ;
  private a mnK;
  
  public b(int paramInt)
  {
    super(0, paramInt);
    GMTrace.i(16707959652352L, 124484);
    this.mnJ = new b();
    this.mnK = new a();
    GMTrace.o(16707959652352L, 124484);
  }
  
  public a.b Vk()
  {
    GMTrace.i(16708228087808L, 124486);
    b localb = this.mnJ;
    GMTrace.o(16708228087808L, 124486);
    return localb;
  }
  
  public a.a Vl()
  {
    GMTrace.i(18564861919232L, 138319);
    a locala = this.mnK;
    GMTrace.o(18564861919232L, 138319);
    return locala;
  }
  
  public void a(Context paramContext, a.a parama, Object... paramVarArgs)
  {
    GMTrace.i(16708093870080L, 124485);
    this.mnI = bg.ap(e.nS(this.mny), "");
    w.i("MicroMsg.FTS.FTSHeaderDataItem", "fillingDataItem: header=%s", new Object[] { this.mnI });
    GMTrace.o(16708093870080L, 124485);
  }
  
  public final class a
    extends a.a
  {
    public View iiK;
    public TextView kIS;
    public View mnL;
    
    public a()
    {
      super();
      GMTrace.i(16704872644608L, 124461);
      GMTrace.o(16704872644608L, 124461);
    }
  }
  
  public final class b
    extends a.b
  {
    public b()
    {
      super();
      GMTrace.i(16707422781440L, 124480);
      GMTrace.o(16707422781440L, 124480);
    }
    
    public final View a(Context paramContext, ViewGroup paramViewGroup)
    {
      GMTrace.i(16707556999168L, 124481);
      paramContext = LayoutInflater.from(paramContext).inflate(j.e.cVy, paramViewGroup, false);
      paramViewGroup = (b.a)b.this.Vl();
      paramViewGroup.kIS = ((TextView)paramContext.findViewById(j.d.bOG));
      paramViewGroup.mnL = paramContext.findViewById(j.d.ciG);
      paramViewGroup.iiK = paramContext.findViewById(j.d.ctB);
      paramContext.setTag(paramViewGroup);
      GMTrace.o(16707556999168L, 124481);
      return paramContext;
    }
    
    public final void a(Context paramContext, a.a parama, a paramVarArgs)
    {
      GMTrace.i(16707691216896L, 124482);
      paramContext = (b.a)parama;
      e.a(b.this.mnI, paramContext.kIS);
      if (b.this.position == 0) {
        paramContext.mnL.setVisibility(8);
      }
      for (;;)
      {
        paramContext.iiK.setBackgroundResource(j.c.aZO);
        GMTrace.o(16707691216896L, 124482);
        return;
        paramContext.mnL.setVisibility(0);
      }
    }
    
    public final boolean a(Context paramContext, a paramVarArgs)
    {
      GMTrace.i(16707825434624L, 124483);
      GMTrace.o(16707825434624L, 124483);
      return false;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/fts/d/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */