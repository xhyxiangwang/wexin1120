package com.tencent.mm.plugin.search.ui.a;

import android.content.Context;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.fts.d.a.a;
import com.tencent.mm.plugin.fts.d.a.a.a;
import com.tencent.mm.plugin.fts.d.a.b;
import com.tencent.mm.plugin.fts.d.d.b;
import com.tencent.mm.plugin.fts.d.e;
import com.tencent.mm.plugin.fts.d.j.c;
import com.tencent.mm.plugin.fts.d.j.d;
import com.tencent.mm.x.n;

public final class j
  extends b
{
  public int count;
  public String fAJ;
  private a pou;
  b pov;
  
  public j(int paramInt)
  {
    super(paramInt);
    GMTrace.i(11848472592384L, 88278);
    this.pou = new a();
    this.pov = new b();
    GMTrace.o(11848472592384L, 88278);
  }
  
  public final com.tencent.mm.plugin.fts.d.a.a.b Vk()
  {
    GMTrace.i(18366890770432L, 136844);
    a locala = this.pou;
    GMTrace.o(18366890770432L, 136844);
    return locala;
  }
  
  protected final a.a Vl()
  {
    GMTrace.i(18367024988160L, 136845);
    b localb = this.pov;
    GMTrace.o(18367024988160L, 136845);
    return localb;
  }
  
  public final void a(Context paramContext, a.a parama, Object... paramVarArgs)
  {
    GMTrace.i(16470931144704L, 122718);
    parama = TextUtils.ellipsize(n.fc(this.fAJ), d.b.mmY, 500.0F, TextUtils.TruncateAt.MIDDLE);
    this.mnI = paramContext.getString(R.l.eER, new Object[] { parama });
    GMTrace.o(16470931144704L, 122718);
  }
  
  public final class a
    extends com.tencent.mm.plugin.fts.d.a.a.b
  {
    public a()
    {
      super();
      GMTrace.i(18367293423616L, 136847);
      GMTrace.o(18367293423616L, 136847);
    }
    
    public final View a(Context paramContext, ViewGroup paramViewGroup)
    {
      GMTrace.i(18367427641344L, 136848);
      paramContext = LayoutInflater.from(paramContext).inflate(R.i.cVK, paramViewGroup, false);
      paramViewGroup = (j.b)j.this.pov;
      paramViewGroup.kIS = ((TextView)paramContext.findViewById(j.d.bOG));
      paramViewGroup.iiK = paramContext.findViewById(j.d.ctB);
      paramViewGroup.iiL = ((ImageView)paramContext.findViewById(R.h.bjt));
      paramContext.setTag(paramViewGroup);
      GMTrace.o(18367427641344L, 136848);
      return paramContext;
    }
    
    public final void a(Context paramContext, a.a parama, a paramVarArgs)
    {
      GMTrace.i(18367561859072L, 136849);
      paramContext = (j.b)parama;
      e.a(j.this.mnI, paramContext.kIS);
      paramContext.iiK.setBackgroundResource(j.c.aZO);
      com.tencent.mm.pluginsdk.ui.a.b.a(paramContext.iiL, j.this.fAJ);
      GMTrace.o(18367561859072L, 136849);
    }
    
    public final boolean a(Context paramContext, a paramVarArgs)
    {
      GMTrace.i(18367696076800L, 136850);
      GMTrace.o(18367696076800L, 136850);
      return false;
    }
  }
  
  public final class b
    extends a.a
  {
    public View iiK;
    public ImageView iiL;
    public TextView kIS;
    
    public b()
    {
      super();
      GMTrace.i(18366622334976L, 136842);
      GMTrace.o(18366622334976L, 136842);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/search/ui/a/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */