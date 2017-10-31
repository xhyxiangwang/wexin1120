package com.tencent.mm.ipcinvoker.wx_extension;

import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  implements com.tencent.mm.ipcinvoker.extension.a
{
  public a()
  {
    GMTrace.i(18685657874432L, 139219);
    GMTrace.o(18685657874432L, 139219);
  }
  
  public final void a(Object paramObject, Parcel paramParcel)
  {
    GMTrace.i(18685926309888L, 139221);
    paramObject = (b)paramObject;
    com.tencent.mm.ipcinvoker.extension.c.a(((b)paramObject).hlU.hmc, paramParcel);
    if (ab.bNe()) {
      com.tencent.mm.ipcinvoker.extension.c.a(((b)paramObject).hlV.hmc, paramParcel);
    }
    for (;;)
    {
      paramParcel.writeString(((b)paramObject).uri);
      paramParcel.writeInt(((b)paramObject).hlW);
      paramParcel.writeInt(((b)paramObject).hlU.cmdId);
      paramParcel.writeInt(((b)paramObject).hlV.cmdId);
      GMTrace.o(18685926309888L, 139221);
      return;
      paramParcel.writeString(((b)paramObject).hlV.hmc.getClass().getName());
    }
  }
  
  public final boolean an(Object paramObject)
  {
    GMTrace.i(18685792092160L, 139220);
    boolean bool = paramObject instanceof b;
    GMTrace.o(18685792092160L, 139220);
    return bool;
  }
  
  public final Object d(Parcel paramParcel)
  {
    GMTrace.i(18686060527616L, 139222);
    b.a locala1 = new b.a();
    locala1.hlX = ((com.tencent.mm.bl.a)com.tencent.mm.ipcinvoker.extension.c.a(c.class.getName(), paramParcel));
    String str;
    if (ab.bNe()) {
      str = paramParcel.readString();
    }
    for (;;)
    {
      try
      {
        locala1.hlY = ((com.tencent.mm.bl.a)Class.forName(str).newInstance());
        locala1.uri = paramParcel.readString();
        locala1.hlW = paramParcel.readInt();
        locala1.hlZ = paramParcel.readInt();
        locala1.hma = paramParcel.readInt();
        paramParcel = locala1.DA();
        GMTrace.o(18686060527616L, 139222);
        return paramParcel;
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.XIPC.CommReqRespTransfer", "readFromParcel, mm process initiate resp e = %s", new Object[] { localException });
        locala1.hlY = new com.tencent.mm.bl.a();
        continue;
      }
      com.tencent.mm.bl.a locala = (com.tencent.mm.bl.a)com.tencent.mm.ipcinvoker.extension.c.a(c.class.getName(), paramParcel);
      Object localObject = locala;
      if (locala == null) {
        localObject = new com.tencent.mm.bl.a();
      }
      locala1.hlY = ((com.tencent.mm.bl.a)localObject);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/ipcinvoker/wx_extension/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */