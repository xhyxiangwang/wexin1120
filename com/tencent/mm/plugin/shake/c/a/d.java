package com.tencent.mm.plugin.shake.c.a;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import java.util.HashMap;
import java.util.Map;

public final class d
{
  public float gBS;
  public float gBT;
  Map<String, Object> kmM;
  int pvY;
  long pvZ;
  String pwa;
  
  public d()
  {
    GMTrace.i(6524323758080L, 48610);
    this.kmM = new HashMap();
    this.pvY = 0;
    this.pvZ = 0L;
    this.gBS = -85.0F;
    this.gBT = -1000.0F;
    this.pwa = "";
    this.kmM.clear();
    GMTrace.o(6524323758080L, 48610);
  }
  
  public final void putValue(String paramString, Object paramObject)
  {
    GMTrace.i(6524457975808L, 48611);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(6524457975808L, 48611);
      return;
    }
    this.kmM.put(paramString, paramObject);
    GMTrace.o(6524457975808L, 48611);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/shake/c/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */