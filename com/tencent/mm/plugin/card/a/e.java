package com.tencent.mm.plugin.card.a;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.card.model.CardInfo;
import java.util.HashMap;
import java.util.Map;

public final class e
{
  public Map<String, Object> kmM;
  public CardInfo kml;
  
  public e()
  {
    GMTrace.i(5115171831808L, 38111);
    this.kmM = new HashMap();
    this.kml = null;
    this.kmM.clear();
    GMTrace.o(5115171831808L, 38111);
  }
  
  public final Object getValue(String paramString)
  {
    GMTrace.i(5115440267264L, 38113);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(5115440267264L, 38113);
      return null;
    }
    if (this.kmM.containsKey(paramString))
    {
      paramString = this.kmM.get(paramString);
      GMTrace.o(5115440267264L, 38113);
      return paramString;
    }
    GMTrace.o(5115440267264L, 38113);
    return null;
  }
  
  public final void putValue(String paramString, Object paramObject)
  {
    GMTrace.i(5115306049536L, 38112);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(5115306049536L, 38112);
      return;
    }
    this.kmM.put(paramString, paramObject);
    GMTrace.o(5115306049536L, 38112);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */