package com.tencent.mm.plugin.webview.ui.tools.game.menu;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.a.g;
import com.tencent.mm.an.a.a.c;
import com.tencent.mm.an.a.a.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.m;
import com.tencent.mm.ui.base.n;
import java.util.List;

public final class f
  extends BaseAdapter
{
  private static final String mzD;
  private Context mContext;
  m qQU;
  
  static
  {
    GMTrace.i(18084362452992L, 134739);
    mzD = com.tencent.mm.loader.stub.a.gZT + "Game/HvMenu/";
    GMTrace.o(18084362452992L, 134739);
  }
  
  public f(Context paramContext)
  {
    GMTrace.i(18083691364352L, 134734);
    this.mContext = paramContext;
    GMTrace.o(18083691364352L, 134734);
  }
  
  public final int getCount()
  {
    GMTrace.i(18083825582080L, 134735);
    if (this.qQU == null)
    {
      GMTrace.o(18083825582080L, 134735);
      return 0;
    }
    int i = this.qQU.size();
    GMTrace.o(18083825582080L, 134735);
    return i;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(18083959799808L, 134736);
    long l = paramInt;
    GMTrace.o(18083959799808L, 134736);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(18084094017536L, 134737);
    paramView = LayoutInflater.from(this.mContext).inflate(R.i.cWG, paramViewGroup, false);
    paramViewGroup = new a(paramView);
    n localn = (n)this.qQU.vHt.get(paramInt);
    Object localObject1;
    if ((localn != null) && (localn.getItemId() != -1))
    {
      localObject1 = localn.getTitle().toString();
      if (!bg.mZ((String)localObject1))
      {
        localObject1 = ((String)localObject1).split("__", 2);
        if (localObject1.length == 1)
        {
          paramViewGroup.jaE.setText(localObject1[0]);
          paramView.setTag(localn);
        }
      }
    }
    for (;;)
    {
      GMTrace.o(18084094017536L, 134737);
      return paramView;
      paramViewGroup.jaE.setText(localObject1[0]);
      localObject1 = localObject1[1];
      if (((String)localObject1).startsWith("http"))
      {
        Object localObject2 = mzD + g.n(((String)localObject1).getBytes());
        c.a locala = new c.a();
        locala.hCP = true;
        locala.hCR = ((String)localObject2);
        localObject2 = locala.Jk();
        com.tencent.mm.an.a.a.Jh().a((String)localObject1, paramViewGroup.jso, (c)localObject2);
        break;
      }
      paramViewGroup.jso.setImageResource(ab.getResources().getIdentifier((String)localObject1, "drawable", ab.getPackageName()));
      break;
      paramView.setTag(null);
    }
  }
  
  public final class a
  {
    TextView jaE;
    ImageView jso;
    
    public a(View paramView)
    {
      GMTrace.i(18084496670720L, 134740);
      this.jaE = ((TextView)paramView.findViewById(R.h.title));
      this.jso = ((ImageView)paramView.findViewById(R.h.icon));
      GMTrace.o(18084496670720L, 134740);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/game/menu/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */