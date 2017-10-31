package com.tencent.mm.plugin.brandservice.ui.base;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class e
  extends BaseAdapter
{
  private Map<String, Integer> klT;
  private a klU;
  Runnable klV;
  List<f> klw;
  
  public e(a parama)
  {
    GMTrace.i(10908277407744L, 81273);
    this.klw = null;
    this.klV = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10897539989504L, 81193);
        e.this.X(e.a(e.this));
        GMTrace.o(10897539989504L, 81193);
      }
    };
    if (parama == null) {
      throw new RuntimeException("ViewCreator can not be null.");
    }
    this.klU = parama;
    this.klw = new ArrayList();
    this.klT = new HashMap();
    GMTrace.o(10908277407744L, 81273);
  }
  
  private String lq(int paramInt)
  {
    GMTrace.i(10909082714112L, 81279);
    if ((paramInt < 0) || (paramInt >= this.klw.size()))
    {
      GMTrace.o(10909082714112L, 81279);
      return null;
    }
    String str = ((f)this.klw.get(paramInt)).klX;
    GMTrace.o(10909082714112L, 81279);
    return str;
  }
  
  public final void X(List<f> paramList)
  {
    GMTrace.i(10908411625472L, 81274);
    if (this.klw != paramList)
    {
      this.klw.clear();
      if (paramList != null) {
        this.klw.addAll(paramList);
      }
    }
    this.klT.clear();
    int i = 0;
    paramList = null;
    Object localObject;
    if (i < this.klw.size())
    {
      localObject = (f)this.klw.get(i);
      if ((localObject != null) && (((f)localObject).klX != null))
      {
        localObject = ((f)localObject).klX;
        label96:
        if ((localObject == null) || (((String)localObject).equalsIgnoreCase(paramList))) {
          break label150;
        }
        this.klT.put(localObject, Integer.valueOf(i));
      }
    }
    for (;;)
    {
      i += 1;
      paramList = (List<f>)localObject;
      break;
      localObject = null;
      break label96;
      notifyDataSetChanged();
      GMTrace.o(10908411625472L, 81274);
      return;
      label150:
      localObject = paramList;
    }
  }
  
  public final int getCount()
  {
    GMTrace.i(10908545843200L, 81275);
    int i = this.klw.size();
    GMTrace.o(10908545843200L, 81275);
    return i;
  }
  
  public final Object getItem(int paramInt)
  {
    GMTrace.i(10908680060928L, 81276);
    Object localObject = this.klw.get(paramInt);
    GMTrace.o(10908680060928L, 81276);
    return localObject;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(10908814278656L, 81277);
    long l = paramInt;
    GMTrace.o(10908814278656L, 81277);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    boolean bool2 = true;
    GMTrace.i(10908948496384L, 81278);
    paramViewGroup = (f)getItem(paramInt);
    Object localObject = lq(paramInt);
    String str = lq(paramInt + 1);
    boolean bool1;
    if (paramInt == to((String)localObject))
    {
      bool1 = true;
      if (((String)localObject).equalsIgnoreCase(str)) {
        break label100;
      }
    }
    for (;;)
    {
      localObject = this.klU;
      getCount();
      paramView = ((a)localObject).a(paramViewGroup, paramView, bool1, bool2);
      GMTrace.o(10908948496384L, 81278);
      return paramView;
      bool1 = false;
      break;
      label100:
      bool2 = false;
    }
  }
  
  public final int to(String paramString)
  {
    GMTrace.i(10909216931840L, 81280);
    int i = bg.a((Integer)this.klT.get(paramString), -1);
    GMTrace.o(10909216931840L, 81280);
    return i;
  }
  
  public static abstract interface a
  {
    public abstract View a(f paramf, View paramView, boolean paramBoolean1, boolean paramBoolean2);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/brandservice/ui/base/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */