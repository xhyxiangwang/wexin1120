package com.tencent.mm.plugin.appbrand.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.contact.d.a;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.z.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class MMToClientEvent
  extends MainProcessTask
{
  public static final Parcelable.Creator<MMToClientEvent> CREATOR;
  private static volatile MMToClientEvent iOV;
  private static final Set<a> iOW;
  public String appId;
  String fAs;
  int ftv;
  public int iOS;
  String iOT;
  Object iOU;
  public int type;
  
  static
  {
    GMTrace.i(10276380344320L, 76565);
    iOW = new HashSet();
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(10276380344320L, 76565);
  }
  
  private MMToClientEvent()
  {
    GMTrace.i(10274635513856L, 76552);
    GMTrace.o(10274635513856L, 76552);
  }
  
  public MMToClientEvent(Parcel paramParcel)
  {
    GMTrace.i(10274769731584L, 76553);
    f(paramParcel);
    GMTrace.o(10274769731584L, 76553);
  }
  
  private static MMToClientEvent VA()
  {
    GMTrace.i(10274903949312L, 76554);
    if (iOV == null) {}
    try
    {
      if (iOV == null) {
        iOV = new MMToClientEvent();
      }
      MMToClientEvent localMMToClientEvent = iOV;
      GMTrace.o(10274903949312L, 76554);
      return localMMToClientEvent;
    }
    finally {}
  }
  
  public static void a(a parama)
  {
    GMTrace.i(10275440820224L, 76558);
    synchronized (iOW)
    {
      iOW.add(parama);
      GMTrace.o(10275440820224L, 76558);
      return;
    }
  }
  
  private void aL(final Object paramObject)
  {
    GMTrace.i(14428674195456L, 107502);
    if (paramObject == null)
    {
      GMTrace.o(14428674195456L, 107502);
      return;
    }
    final LinkedList localLinkedList = new LinkedList();
    synchronized (iOW)
    {
      Iterator localIterator = iOW.iterator();
      if (localIterator.hasNext()) {
        localLinkedList.add((a)localIterator.next());
      }
    }
    com.tencent.mm.plugin.appbrand.o.d.xC().C(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(16153774653440L, 120355);
        Iterator localIterator = localLinkedList.iterator();
        while (localIterator.hasNext()) {
          ((MMToClientEvent.a)localIterator.next()).aG(paramObject);
        }
        GMTrace.o(16153774653440L, 120355);
      }
    });
    GMTrace.o(14428674195456L, 107502);
  }
  
  public static void b(a parama)
  {
    GMTrace.i(10275575037952L, 76559);
    if (parama != null) {
      synchronized (iOW)
      {
        iOW.remove(parama);
        GMTrace.o(10275575037952L, 76559);
        return;
      }
    }
    GMTrace.o(10275575037952L, 76559);
  }
  
  public static void pO(String paramString)
  {
    GMTrace.i(10275172384768L, 76556);
    VA().iOS = 1;
    VA().appId = paramString;
    AppBrandMainProcessService.a(VA());
    GMTrace.o(10275172384768L, 76556);
  }
  
  public static void pP(String paramString)
  {
    GMTrace.i(10275306602496L, 76557);
    VA().iOS = 2;
    VA().appId = paramString;
    AppBrandMainProcessService.a(VA());
    GMTrace.o(10275306602496L, 76557);
  }
  
  public final void RS()
  {
    GMTrace.i(10275038167040L, 76555);
    switch (this.iOS)
    {
    }
    for (;;)
    {
      GMTrace.o(10275038167040L, 76555);
      return;
      d.a(this);
      GMTrace.o(10275038167040L, 76555);
      return;
      d.b(this);
    }
  }
  
  public final void VB()
  {
    GMTrace.i(10275843473408L, 76561);
    switch (this.iOS)
    {
    }
    for (;;)
    {
      GMTrace.o(10275843473408L, 76561);
      return;
      Object localObject = new z.a();
      HashMap localHashMap = new HashMap();
      localHashMap.put("type", Integer.valueOf(this.type));
      localHashMap.put("data", this.fAs);
      ((z.a)localObject).aj(this.appId, 0).r(localHashMap).VI();
      GMTrace.o(10275843473408L, 76561);
      return;
      localObject = new d.a();
      localHashMap = new HashMap();
      localHashMap.put("count", Integer.valueOf(this.ftv));
      localHashMap.put("data", this.fAs);
      ((d.a)localObject).aj(this.appId, 0).r(localHashMap).VI();
      GMTrace.o(10275843473408L, 76561);
      return;
      aL(this.iOU);
    }
  }
  
  public final void f(Parcel paramParcel)
  {
    GMTrace.i(10275977691136L, 76562);
    this.iOS = paramParcel.readInt();
    this.appId = paramParcel.readString();
    this.type = paramParcel.readInt();
    this.fAs = paramParcel.readString();
    this.ftv = paramParcel.readInt();
    try
    {
      this.iOT = paramParcel.readString();
      if (!bg.mZ(this.iOT))
      {
        Class localClass = Class.forName(this.iOT);
        if (localClass != null) {
          this.iOU = paramParcel.readParcelable(localClass.getClassLoader());
        }
      }
      GMTrace.o(10275977691136L, 76562);
      return;
    }
    catch (Exception paramParcel)
    {
      w.v("MicroMsg.MMToClientEvent", "unparcel custom data e %s", new Object[] { paramParcel });
      GMTrace.o(10275977691136L, 76562);
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(10276111908864L, 76563);
    paramParcel.writeInt(this.iOS);
    paramParcel.writeString(this.appId);
    paramParcel.writeInt(this.type);
    paramParcel.writeString(this.fAs);
    paramParcel.writeInt(this.ftv);
    if ((!bg.mZ(this.iOT)) && (this.iOU != null))
    {
      paramParcel.writeString(this.iOT);
      paramParcel.writeParcelable((Parcelable)this.iOU, paramInt);
    }
    GMTrace.o(10276111908864L, 76563);
  }
  
  public static abstract interface a
  {
    public abstract void aG(Object paramObject);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ipc/MMToClientEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */