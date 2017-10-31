package com.tencent.mm.plugin.search.ui.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.d.a.a;
import com.tencent.mm.plugin.fts.d.a.a.a;
import com.tencent.mm.plugin.fts.d.e;
import com.tencent.mm.storage.x;
import java.util.List;

public abstract class b
  extends a
{
  public i iOg;
  public List<String> iOh;
  public x jqN;
  public CharSequence klY;
  public CharSequence klZ;
  a pnN;
  public String username;
  
  public b(int paramInt)
  {
    super(1, paramInt);
    GMTrace.i(11845654020096L, 88257);
    this.pnN = new a();
    GMTrace.o(11845654020096L, 88257);
  }
  
  protected final a.a Vl()
  {
    GMTrace.i(18367964512256L, 136852);
    a locala = this.pnN;
    GMTrace.o(18367964512256L, 136852);
    return locala;
  }
  
  public final int Vn()
  {
    GMTrace.i(11845788237824L, 88258);
    int i = this.iOg.mkP;
    GMTrace.o(11845788237824L, 88258);
    return i;
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
      GMTrace.i(11850754293760L, 88295);
      GMTrace.o(11850754293760L, 88295);
    }
  }
  
  public abstract class b
    extends com.tencent.mm.plugin.fts.d.a.a.b
  {
    public b()
    {
      super();
      GMTrace.i(11849143681024L, 88283);
      GMTrace.o(11849143681024L, 88283);
    }
    
    public final View a(Context paramContext, ViewGroup paramViewGroup)
    {
      GMTrace.i(11849277898752L, 88284);
      paramContext = LayoutInflater.from(paramContext).inflate(R.i.cVs, paramViewGroup, false);
      paramViewGroup = (b.a)b.this.pnN;
      paramViewGroup.iiL = ((ImageView)paramContext.findViewById(R.h.bjt));
      paramViewGroup.iiM = ((TextView)paramContext.findViewById(R.h.cBJ));
      paramViewGroup.iiN = ((TextView)paramContext.findViewById(R.h.bAy));
      paramViewGroup.iiK = paramContext.findViewById(R.h.ctB);
      paramContext.setTag(paramViewGroup);
      GMTrace.o(11849277898752L, 88284);
      return paramContext;
    }
    
    public final void a(Context paramContext, a.a parama, a paramVarArgs)
    {
      GMTrace.i(16472675975168L, 122731);
      paramContext = (b.a)parama;
      parama = (b)paramVarArgs;
      cj(paramContext.iiK);
      com.tencent.mm.pluginsdk.ui.a.b.a(paramContext.iiL, parama.username);
      e.a(parama.klY, paramContext.iiM);
      e.a(parama.klZ, paramContext.iiN);
      GMTrace.o(16472675975168L, 122731);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/search/ui/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */