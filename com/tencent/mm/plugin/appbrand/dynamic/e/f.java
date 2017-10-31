package com.tencent.mm.plugin.appbrand.dynamic.e;

import android.util.Log;
import com.tencent.gmtrace.GMTrace;
import org.json.JSONException;

public final class f
  extends JSONException
{
  public f(String paramString)
  {
    super(paramString);
    GMTrace.i(19967571394560L, 148770);
    GMTrace.o(19967571394560L, 148770);
  }
  
  public f(Throwable paramThrowable)
  {
    super(Log.getStackTraceString(paramThrowable));
    GMTrace.i(19967705612288L, 148771);
    GMTrace.o(19967705612288L, 148771);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/e/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */