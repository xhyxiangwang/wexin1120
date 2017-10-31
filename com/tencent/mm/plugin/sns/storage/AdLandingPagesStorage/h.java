package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage;

import android.content.Context;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.p;
import com.tencent.mm.plugin.sns.ui.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

public final class h
{
  private int bgColor;
  private Context context;
  private int kic;
  private int kid;
  private ViewGroup oIW;
  private LinkedHashMap<String, i> qtc;
  private LayoutInflater qtd;
  private List<p> quI;
  
  public h(List<p> paramList, Context paramContext, int paramInt, ViewGroup paramViewGroup)
  {
    GMTrace.i(8203253317632L, 61119);
    this.quI = paramList;
    this.context = paramContext;
    this.bgColor = paramInt;
    this.oIW = paramViewGroup;
    GMTrace.o(8203253317632L, 61119);
  }
  
  public final Collection<i> bjx()
  {
    GMTrace.i(18581907570688L, 138446);
    if (this.qtc == null)
    {
      localObject = Collections.EMPTY_LIST;
      GMTrace.o(18581907570688L, 138446);
      return (Collection<i>)localObject;
    }
    Object localObject = this.qtc.values();
    GMTrace.o(18581907570688L, 138446);
    return (Collection<i>)localObject;
  }
  
  public final void bs(List<p> paramList)
  {
    GMTrace.i(8203387535360L, 61120);
    if ((paramList != null) && (!paramList.equals(this.quI)))
    {
      this.quI = paramList;
      layout();
    }
    GMTrace.o(8203387535360L, 61120);
  }
  
  public final void layout()
  {
    GMTrace.i(8203521753088L, 61121);
    if ((this.quI == null) || (this.quI.isEmpty()))
    {
      GMTrace.o(8203521753088L, 61121);
      return;
    }
    if (this.qtc == null) {
      this.qtc = new LinkedHashMap();
    }
    Object localObject;
    if (this.qtd == null)
    {
      this.qtd = ((LayoutInflater)this.context.getSystemService("layout_inflater"));
      localObject = (WindowManager)this.context.getSystemService("window");
      this.kic = ((WindowManager)localObject).getDefaultDisplay().getWidth();
      this.kid = ((WindowManager)localObject).getDefaultDisplay().getHeight();
    }
    int i = 0;
    for (;;)
    {
      if (i < this.quI.size())
      {
        p localp = (p)this.quI.get(i);
        localObject = (i)this.qtc.get(localp.qno);
        if (localObject != null) {
          ((i)localObject).a(localp);
        }
        try
        {
          label172:
          if (this.oIW != ((i)localObject).getView().getParent())
          {
            if (this.oIW.getChildCount() <= i) {
              break label259;
            }
            this.oIW.addView(((i)localObject).getView(), i);
          }
          for (;;)
          {
            i += 1;
            break;
            i locali = am.a(this.context, localp, this.oIW, this.bgColor);
            localObject = locali;
            if (locali == null) {
              break label172;
            }
            this.qtc.put(localp.qno, locali);
            localObject = locali;
            break label172;
            label259:
            this.oIW.addView(((i)localObject).getView());
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.e("CompRenderer", "component may have same id %s,%s", new Object[] { localp.qno, bg.f(localException) });
          }
        }
      }
    }
    GMTrace.o(8203521753088L, 61121);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */