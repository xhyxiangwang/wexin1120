package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a;

import android.text.Spannable;
import android.view.animation.Interpolator;
import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public final class a
  extends LinkedHashMap<Spannable, Float>
{
  public long duration;
  public b qnX;
  public Interpolator qnY;
  private String qnZ;
  
  public a()
  {
    GMTrace.i(8214661824512L, 61204);
    this.qnX = new b();
    this.qnY = null;
    this.duration = 0L;
    this.qnZ = "";
    GMTrace.o(8214661824512L, 61204);
  }
  
  public a(b paramb)
  {
    GMTrace.i(8214796042240L, 61205);
    this.qnX = new b();
    this.qnY = null;
    this.duration = 0L;
    this.qnZ = "";
    this.qnX = paramb;
    GMTrace.o(8214796042240L, 61205);
  }
  
  public final boolean a(a parama)
  {
    GMTrace.i(8214930259968L, 61206);
    if (size() != parama.size())
    {
      GMTrace.o(8214930259968L, 61206);
      return false;
    }
    parama = parama.entrySet().iterator();
    while (parama.hasNext()) {
      if (!containsKey(((Map.Entry)parama.next()).getKey()))
      {
        GMTrace.o(8214930259968L, 61206);
        return false;
      }
    }
    GMTrace.o(8214930259968L, 61206);
    return true;
  }
  
  public final Spannable[] biD()
  {
    GMTrace.i(8215064477696L, 61207);
    Object localObject = new ArrayList();
    Iterator localIterator = entrySet().iterator();
    while (localIterator.hasNext()) {
      ((ArrayList)localObject).add(((Map.Entry)localIterator.next()).getKey());
    }
    localObject = (Spannable[])((ArrayList)localObject).toArray(new Spannable[((ArrayList)localObject).size()]);
    GMTrace.o(8215064477696L, 61207);
    return (Spannable[])localObject;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/chart/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */