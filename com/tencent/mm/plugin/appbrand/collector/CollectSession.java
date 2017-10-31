package com.tencent.mm.plugin.appbrand.collector;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import junit.framework.Assert;

public class CollectSession
  implements Parcelable
{
  public static final Parcelable.Creator<CollectSession> CREATOR;
  public final Bundle fCU;
  String groupId;
  TimePoint iGw;
  TimePoint iGx;
  final Map<String, TimePoint> iGy;
  String iGz;
  String id;
  
  static
  {
    GMTrace.i(20004212834304L, 149043);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(20004212834304L, 149043);
  }
  
  CollectSession()
  {
    GMTrace.i(20003407527936L, 149037);
    this.iGy = new HashMap();
    this.fCU = new Bundle();
    GMTrace.o(20003407527936L, 149037);
  }
  
  public CollectSession(String paramString)
  {
    GMTrace.i(20003541745664L, 149038);
    this.iGy = new HashMap();
    this.fCU = new Bundle();
    this.id = paramString;
    GMTrace.o(20003541745664L, 149038);
  }
  
  public int describeContents()
  {
    GMTrace.i(20003944398848L, 149041);
    GMTrace.o(20003944398848L, 149041);
    return 0;
  }
  
  public final void ox(String paramString)
  {
    GMTrace.i(20003675963392L, 149039);
    Assert.assertNull(this.iGw);
    this.iGw = new TimePoint(paramString, System.nanoTime());
    this.iGx = this.iGw;
    this.iGw.iGI.set(1);
    this.iGy.put(paramString, this.iGw);
    GMTrace.o(20003675963392L, 149039);
  }
  
  public final void oy(String paramString)
  {
    GMTrace.i(20003810181120L, 149040);
    Assert.assertNotNull(this.iGx);
    long l = System.nanoTime();
    TimePoint localTimePoint = (TimePoint)this.iGy.get(paramString);
    if (localTimePoint == null)
    {
      localTimePoint = new TimePoint(paramString, l);
      localTimePoint.iGI.set(1);
      this.iGy.put(paramString, localTimePoint);
      this.iGx.iGK.set(localTimePoint);
      this.iGx = localTimePoint;
      GMTrace.o(20003810181120L, 149040);
      return;
    }
    localTimePoint.iGJ.set((l + localTimePoint.iGJ.get() * localTimePoint.iGI.get()) / (localTimePoint.iGI.get() + 1));
    localTimePoint.iGI.incrementAndGet();
    GMTrace.o(20003810181120L, 149040);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(20004078616576L, 149042);
    paramParcel.writeString(this.groupId);
    paramParcel.writeString(this.id);
    paramParcel.writeParcelable(this.iGw, paramInt);
    paramParcel.writeString(this.iGz);
    paramParcel.writeBundle(this.fCU);
    GMTrace.o(20004078616576L, 149042);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/collector/CollectSession.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */