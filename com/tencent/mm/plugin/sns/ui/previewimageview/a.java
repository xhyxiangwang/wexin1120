package com.tencent.mm.plugin.sns.ui.previewimageview;

import android.widget.BaseAdapter;
import com.tencent.gmtrace.GMTrace;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public abstract class a
  extends BaseAdapter
  implements d
{
  private int qVU;
  HashMap<Object, Integer> qVV;
  
  public a()
  {
    GMTrace.i(15974728204288L, 119021);
    this.qVU = 0;
    this.qVV = new HashMap();
    GMTrace.o(15974728204288L, 119021);
  }
  
  protected final void bC(List<?> paramList)
  {
    GMTrace.i(15975130857472L, 119024);
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      bs(paramList.next());
    }
    GMTrace.o(15975130857472L, 119024);
  }
  
  protected final void bs(Object paramObject)
  {
    GMTrace.i(15974996639744L, 119023);
    HashMap localHashMap = this.qVV;
    int i = this.qVU;
    this.qVU = (i + 1);
    localHashMap.put(paramObject, Integer.valueOf(i));
    GMTrace.o(15974996639744L, 119023);
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(15975265075200L, 119025);
    if ((paramInt < 0) || (paramInt >= this.qVV.size()))
    {
      GMTrace.o(15975265075200L, 119025);
      return -1L;
    }
    Object localObject = getItem(paramInt);
    long l = ((Integer)this.qVV.get(localObject)).intValue();
    GMTrace.o(15975265075200L, 119025);
    return l;
  }
  
  public final boolean hasStableIds()
  {
    GMTrace.i(15974862422016L, 119022);
    GMTrace.o(15974862422016L, 119022);
    return true;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/previewimageview/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */