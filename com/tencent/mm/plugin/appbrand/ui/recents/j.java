package com.tencent.mm.plugin.appbrand.ui.recents;

import android.content.Context;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.t;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.ArrayList;
import java.util.List;

final class j
  extends RecyclerView.a
{
  private LayoutInflater CO;
  final SparseArray<k> jvN;
  private final ArrayList<?> jvO;
  
  j(ArrayList<?> paramArrayList)
  {
    GMTrace.i(16347719270400L, 121800);
    this.jvN = new SparseArray();
    this.jvO = paramArrayList;
    GMTrace.o(16347719270400L, 121800);
  }
  
  public final RecyclerView.t a(ViewGroup paramViewGroup, int paramInt)
  {
    GMTrace.i(16348121923584L, 121803);
    k localk = (k)this.jvN.get(paramInt);
    if (localk == null)
    {
      GMTrace.o(16348121923584L, 121803);
      return null;
    }
    Context localContext = paramViewGroup.getContext();
    if (this.CO == null) {
      this.CO = LayoutInflater.from(localContext);
    }
    paramViewGroup = localk.a(this.CO, paramViewGroup);
    GMTrace.o(16348121923584L, 121803);
    return paramViewGroup;
  }
  
  public final void a(RecyclerView.t paramt, int paramInt)
  {
    GMTrace.i(16348256141312L, 121804);
    k localk = (k)this.jvN.get(getItemViewType(paramInt));
    if (localk != null) {
      localk.a(paramt, jC(paramInt));
    }
    GMTrace.o(16348256141312L, 121804);
  }
  
  public final void a(RecyclerView.t paramt, int paramInt, List paramList)
  {
    GMTrace.i(16348390359040L, 121805);
    k localk = (k)this.jvN.get(getItemViewType(paramInt));
    if (localk == null)
    {
      super.a(paramt, paramInt, paramList);
      GMTrace.o(16348390359040L, 121805);
      return;
    }
    if ((paramList.size() > 0) && (localk.a(paramt, jC(paramInt), paramList.get(0))))
    {
      GMTrace.o(16348390359040L, 121805);
      return;
    }
    localk.a(paramt, jC(paramInt));
    GMTrace.o(16348390359040L, 121805);
  }
  
  public final int getItemCount()
  {
    GMTrace.i(16348658794496L, 121807);
    if (this.jvO == null)
    {
      GMTrace.o(16348658794496L, 121807);
      return 0;
    }
    int i = this.jvO.size();
    GMTrace.o(16348658794496L, 121807);
    return i;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(17785325355008L, 132511);
    Object localObject = jC(paramInt);
    k localk = (k)this.jvN.get(getItemViewType(paramInt));
    if ((localObject == null) || (localk == null))
    {
      GMTrace.o(17785325355008L, 132511);
      return 0L;
    }
    long l = localk.aO(localObject);
    GMTrace.o(17785325355008L, 132511);
    return l;
  }
  
  public final int getItemViewType(int paramInt)
  {
    GMTrace.i(16348524576768L, 121806);
    Object localObject = jC(paramInt);
    if (localObject == null)
    {
      GMTrace.o(16348524576768L, 121806);
      return 0;
    }
    paramInt = localObject.getClass().hashCode();
    GMTrace.o(16348524576768L, 121806);
    return paramInt;
  }
  
  final boolean isEmpty()
  {
    GMTrace.i(16347853488128L, 121801);
    if ((this.jvO == null) || (bg.bX(this.jvO)))
    {
      GMTrace.o(16347853488128L, 121801);
      return true;
    }
    GMTrace.o(16347853488128L, 121801);
    return false;
  }
  
  final Object jC(int paramInt)
  {
    GMTrace.i(16347987705856L, 121802);
    if ((paramInt < 0) || (paramInt > getItemCount()))
    {
      GMTrace.o(16347987705856L, 121802);
      return null;
    }
    Object localObject = this.jvO.get(paramInt);
    GMTrace.o(16347987705856L, 121802);
    return localObject;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/recents/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */