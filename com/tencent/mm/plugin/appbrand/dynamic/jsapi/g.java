package com.tencent.mm.plugin.appbrand.dynamic.jsapi;

import android.os.Bundle;
import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.mm.ipcinvoker.extension.f;
import com.tencent.mm.ipcinvoker.h;
import com.tencent.mm.jsapi.b.b.a;
import com.tencent.mm.modelappbrand.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.x.q.b;
import org.json.JSONObject;

public final class g
  extends com.tencent.mm.jsapi.b.a
{
  public g()
  {
    super("onTapCallback", 327);
    GMTrace.i(19927977164800L, 148475);
    GMTrace.o(19927977164800L, 148475);
  }
  
  protected final void b(com.tencent.mm.jsapi.core.a parama, JSONObject paramJSONObject, final b.a parama1)
  {
    GMTrace.i(19928111382528L, 148476);
    parama = parama.ww();
    b localb = new b();
    localb.id = parama.getString("__page_view_id", "");
    localb.fOu = paramJSONObject.optString("eventId", "");
    localb.iLv = paramJSONObject.optBoolean("hasHandler");
    localb.iLw = paramJSONObject.optBoolean("res");
    XIPCInvoker.a(parama.getString("__process_name", ab.vR()), localb, a.class, new h() {});
    GMTrace.o(19928111382528L, 148476);
  }
  
  private static class a
    implements com.tencent.mm.ipcinvoker.g<g.b, Bundle>
  {
    private a()
    {
      GMTrace.i(19927708729344L, 148473);
      GMTrace.o(19927708729344L, 148473);
    }
  }
  
  public static final class b
    implements f
  {
    String fOu;
    boolean iLv;
    boolean iLw;
    String id;
    
    public b()
    {
      GMTrace.i(19930929954816L, 148497);
      GMTrace.o(19930929954816L, 148497);
    }
    
    public final void e(Parcel paramParcel)
    {
      int j = 1;
      GMTrace.i(19931064172544L, 148498);
      paramParcel.writeString(this.id);
      if (this.iLv)
      {
        i = 1;
        paramParcel.writeInt(i);
        paramParcel.writeString(this.fOu);
        if (!this.iLw) {
          break label68;
        }
      }
      label68:
      for (int i = j;; i = 0)
      {
        paramParcel.writeInt(i);
        GMTrace.o(19931064172544L, 148498);
        return;
        i = 0;
        break;
      }
    }
    
    public final void readFromParcel(Parcel paramParcel)
    {
      boolean bool2 = true;
      GMTrace.i(19931198390272L, 148499);
      this.id = paramParcel.readString();
      if (paramParcel.readInt() == 1)
      {
        bool1 = true;
        this.iLv = bool1;
        this.fOu = paramParcel.readString();
        if (paramParcel.readInt() != 1) {
          break label70;
        }
      }
      label70:
      for (boolean bool1 = bool2;; bool1 = false)
      {
        this.iLw = bool1;
        GMTrace.o(19931198390272L, 148499);
        return;
        bool1 = false;
        break;
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/jsapi/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */