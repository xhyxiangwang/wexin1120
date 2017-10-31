package com.tencent.mm.plugin.appbrand.permission;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bl.b;
import com.tencent.mm.protocal.c.lq;
import java.util.LinkedList;

public final class AppRuntimeApiPermissionBundle
  implements Parcelable
{
  public static final Parcelable.Creator<AppRuntimeApiPermissionBundle> CREATOR;
  final byte[] jnA;
  final byte[] jnB;
  final byte[] jnz;
  
  static
  {
    GMTrace.i(18832223633408L, 140311);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(18832223633408L, 140311);
  }
  
  public AppRuntimeApiPermissionBundle(Parcel paramParcel)
  {
    GMTrace.i(18832089415680L, 140310);
    this.jnz = paramParcel.createByteArray();
    this.jnA = paramParcel.createByteArray();
    this.jnB = paramParcel.createByteArray();
    GMTrace.o(18832089415680L, 140310);
  }
  
  public AppRuntimeApiPermissionBundle(lq paramlq)
  {
    GMTrace.i(18831686762496L, 140307);
    this.jnz = paramlq.tId.toByteArray();
    this.jnA = ((b)paramlq.tIe.get(0)).toByteArray();
    this.jnB = ((b)paramlq.tIe.get(1)).toByteArray();
    GMTrace.o(18831686762496L, 140307);
  }
  
  public final int describeContents()
  {
    GMTrace.i(18831820980224L, 140308);
    GMTrace.o(18831820980224L, 140308);
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(18831955197952L, 140309);
    paramParcel.writeByteArray(this.jnz);
    paramParcel.writeByteArray(this.jnA);
    paramParcel.writeByteArray(this.jnB);
    GMTrace.o(18831955197952L, 140309);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/permission/AppRuntimeApiPermissionBundle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */