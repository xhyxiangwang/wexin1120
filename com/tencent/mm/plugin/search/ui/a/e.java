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
import com.tencent.mm.R.k;
import com.tencent.mm.g.a.gi;
import com.tencent.mm.g.b.n;
import com.tencent.mm.plugin.fts.d.a.a.a;
import com.tencent.mm.plugin.fts.d.a.a.b;
import com.tencent.mm.plugin.fts.d.b.b;
import com.tencent.mm.pluginsdk.model.app.an;
import java.util.List;

public final class e
  extends com.tencent.mm.plugin.fts.d.a.a
{
  public com.tencent.mm.plugin.fts.a.a.i iOg;
  public List<String> iOh;
  public String iVM;
  public String lWZ;
  public com.tencent.mm.pluginsdk.model.app.f mHS;
  public CharSequence pnZ;
  public String poa;
  private b pob;
  a poc;
  
  public e(int paramInt)
  {
    super(5, paramInt);
    GMTrace.i(16471736451072L, 122724);
    this.pob = new b();
    this.poc = new a();
    GMTrace.o(16471736451072L, 122724);
  }
  
  public final a.b Vk()
  {
    GMTrace.i(16472004886528L, 122726);
    b localb = this.pob;
    GMTrace.o(16472004886528L, 122726);
    return localb;
  }
  
  protected final a.a Vl()
  {
    GMTrace.i(18367830294528L, 136851);
    a locala = this.poc;
    GMTrace.o(18367830294528L, 136851);
    return locala;
  }
  
  public final String Vm()
  {
    GMTrace.i(16472139104256L, 122727);
    String str = this.mHS.field_appName;
    GMTrace.o(16472139104256L, 122727);
    return str;
  }
  
  public final int Vn()
  {
    GMTrace.i(16472273321984L, 122728);
    int i = this.iOg.mkP;
    GMTrace.o(16472273321984L, 122728);
    return i;
  }
  
  public final void a(Context paramContext, a.a parama, Object... paramVarArgs)
  {
    GMTrace.i(16471870668800L, 122725);
    this.mHS = an.aUV().NF(this.iOg.mkj);
    this.pnZ = com.tencent.mm.plugin.fts.d.f.b(com.tencent.mm.plugin.fts.d.b.a.a(this.mHS.field_appName, this.fIW, this.iOh)).mok;
    this.poa = this.mHS.fWA;
    an.aUV();
    this.lWZ = com.tencent.mm.pluginsdk.model.app.i.cB(this.mHS.field_appId, 1);
    this.iVM = this.mHS.field_appIconUrl;
    GMTrace.o(16471870668800L, 122725);
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
      GMTrace.i(16474957676544L, 122748);
      GMTrace.o(16474957676544L, 122748);
    }
  }
  
  public final class b
    extends a.b
  {
    public b()
    {
      super();
      GMTrace.i(16475360329728L, 122751);
      GMTrace.o(16475360329728L, 122751);
    }
    
    public final View a(Context paramContext, ViewGroup paramViewGroup)
    {
      GMTrace.i(16475494547456L, 122752);
      paramContext = LayoutInflater.from(paramContext).inflate(R.i.cVx, paramViewGroup, false);
      paramViewGroup = (e.a)e.this.poc;
      paramViewGroup.iiL = ((ImageView)paramContext.findViewById(R.h.bjt));
      paramViewGroup.iiM = ((TextView)paramContext.findViewById(R.h.cBJ));
      paramViewGroup.iiN = ((TextView)paramContext.findViewById(R.h.bAy));
      paramViewGroup.iiK = paramContext.findViewById(R.h.ctB);
      paramContext.setTag(paramViewGroup);
      GMTrace.o(16475494547456L, 122752);
      return paramContext;
    }
    
    public final void a(Context paramContext, a.a parama, com.tencent.mm.plugin.fts.d.a.a paramVarArgs)
    {
      GMTrace.i(16475628765184L, 122753);
      paramVarArgs = (e)paramVarArgs;
      parama = (e.a)parama;
      parama.iiM.setText(e.this.pnZ);
      com.tencent.mm.plugin.fts.d.e.a(e.this.poa, parama.iiN);
      com.tencent.mm.plugin.fts.d.e.a(paramContext, parama.iiL, paramVarArgs.iVM, paramVarArgs.lWZ, R.k.doC, 0, 0);
      GMTrace.o(16475628765184L, 122753);
    }
    
    public final boolean a(Context paramContext, com.tencent.mm.plugin.fts.d.a.a paramVarArgs)
    {
      GMTrace.i(16475762982912L, 122754);
      paramVarArgs = (e)paramVarArgs;
      gi localgi = new gi();
      localgi.fCx.context = paramContext;
      localgi.fCx.actionCode = 2;
      localgi.fCx.appId = paramVarArgs.mHS.field_appId;
      localgi.fCx.extMsg = "search_src=40";
      localgi.fCx.scene = 4;
      com.tencent.mm.sdk.b.a.uLm.m(localgi);
      GMTrace.o(16475762982912L, 122754);
      return true;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/search/ui/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */