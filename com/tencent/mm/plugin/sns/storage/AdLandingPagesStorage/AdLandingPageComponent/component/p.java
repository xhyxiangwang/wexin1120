package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.o;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.h;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public final class p
  extends a
{
  private h qpz;
  LinearLayout qqI;
  
  public p(Context paramContext, o paramo, ViewGroup paramViewGroup)
  {
    super(paramContext, paramo, paramViewGroup);
    GMTrace.i(8264188166144L, 61573);
    GMTrace.o(8264188166144L, 61573);
  }
  
  public final void O(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(18581102264320L, 138440);
    super.O(paramInt1, paramInt2, paramInt3);
    Iterator localIterator = this.qpz.bjx().iterator();
    while (localIterator.hasNext()) {
      ((i)localIterator.next()).O(paramInt1, paramInt2, paramInt3);
    }
    GMTrace.o(18581102264320L, 138440);
  }
  
  protected final int aWs()
  {
    GMTrace.i(8264859254784L, 61578);
    int i = i.g.pOr;
    GMTrace.o(8264859254784L, 61578);
    return i;
  }
  
  public final View biL()
  {
    GMTrace.i(8264725037056L, 61577);
    View localView = this.iiK;
    this.qqI = ((LinearLayout)localView.findViewById(i.f.pLs));
    GMTrace.o(8264725037056L, 61577);
    return localView;
  }
  
  protected final void biR()
  {
    GMTrace.i(8264590819328L, 61576);
    if (((o)this.qpH).qnn == 0) {
      this.qqI.setOrientation(1);
    }
    while (this.qpz == null)
    {
      this.qpz = new h(((o)this.qpH).qnm, this.context, ((o)this.qpH).bgColor, this.qqI);
      this.qpz.layout();
      GMTrace.o(8264590819328L, 61576);
      return;
      if (((o)this.qpH).qnn == 1) {
        this.qqI.setOrientation(0);
      }
    }
    this.qpz.bs(((o)this.qpH).qnm);
    GMTrace.o(8264590819328L, 61576);
  }
  
  public final void biu()
  {
    GMTrace.i(18581236482048L, 138441);
    super.biu();
    Iterator localIterator = this.qpz.bjx().iterator();
    while (localIterator.hasNext()) {
      ((i)localIterator.next()).biu();
    }
    GMTrace.o(18581236482048L, 138441);
  }
  
  public final void biv()
  {
    GMTrace.i(8264322383872L, 61574);
    super.biv();
    Iterator localIterator = this.qpz.bjx().iterator();
    while (localIterator.hasNext()) {
      ((i)localIterator.next()).biv();
    }
    GMTrace.o(8264322383872L, 61574);
  }
  
  public final void biw()
  {
    GMTrace.i(8264456601600L, 61575);
    super.biw();
    Iterator localIterator = this.qpz.bjx().iterator();
    while (localIterator.hasNext()) {
      ((i)localIterator.next()).biw();
    }
    GMTrace.o(8264456601600L, 61575);
  }
  
  public final boolean s(JSONArray paramJSONArray)
  {
    GMTrace.i(18581370699776L, 138442);
    Object localObject = new JSONObject();
    if (super.L((JSONObject)localObject)) {
      paramJSONArray.put(localObject);
    }
    localObject = this.qpz.bjx().iterator();
    while (((Iterator)localObject).hasNext())
    {
      i locali = (i)((Iterator)localObject).next();
      JSONObject localJSONObject = new JSONObject();
      if ((locali != null) && (locali.L(localJSONObject))) {
        paramJSONArray.put(localJSONObject);
      }
    }
    GMTrace.o(18581370699776L, 138442);
    return true;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */