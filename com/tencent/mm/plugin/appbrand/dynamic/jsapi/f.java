package com.tencent.mm.plugin.appbrand.dynamic.jsapi;

import android.os.Bundle;
import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.mm.ipcinvoker.g;
import com.tencent.mm.ipcinvoker.h;
import com.tencent.mm.jsapi.b.b.a;
import com.tencent.mm.modelappbrand.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.x.q.b;
import org.json.JSONObject;

public final class f
  extends com.tencent.mm.jsapi.b.a
{
  public f()
  {
    super("makePhoneCall", 327);
    GMTrace.i(19928648253440L, 148480);
    GMTrace.o(19928648253440L, 148480);
  }
  
  protected final void b(com.tencent.mm.jsapi.core.a parama, JSONObject paramJSONObject, final b.a parama1)
  {
    GMTrace.i(19928782471168L, 148481);
    parama = parama.ww();
    a locala = new a();
    locala.id = parama.getString("__page_view_id", "");
    locala.fOd = paramJSONObject.optString("phoneNumber", "");
    XIPCInvoker.a(parama.getString("__process_name", ab.vR()), locala, b.class, new h() {});
    GMTrace.o(19928782471168L, 148481);
  }
  
  private static final class a
    implements com.tencent.mm.ipcinvoker.extension.f
  {
    String fOd;
    String id;
    
    public a()
    {
      GMTrace.i(19939519889408L, 148561);
      GMTrace.o(19939519889408L, 148561);
    }
    
    public final void e(Parcel paramParcel)
    {
      GMTrace.i(19939654107136L, 148562);
      paramParcel.writeString(this.id);
      paramParcel.writeString(this.fOd);
      GMTrace.o(19939654107136L, 148562);
    }
    
    public final void readFromParcel(Parcel paramParcel)
    {
      GMTrace.i(19939788324864L, 148563);
      this.id = paramParcel.readString();
      this.fOd = paramParcel.readString();
      GMTrace.o(19939788324864L, 148563);
    }
  }
  
  private static class b
    implements g<f.a, Bundle>
  {
    private b()
    {
      GMTrace.i(19939251453952L, 148559);
      GMTrace.o(19939251453952L, 148559);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/jsapi/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */