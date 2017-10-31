package com.tencent.mm.plugin.appbrand.dynamic.debugger;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public class DebuggerInfo
  implements Parcelable
{
  public static final Parcelable.Creator<DebuggerInfo> CREATOR;
  public boolean iLe;
  public boolean iLf;
  public boolean iLg;
  
  static
  {
    GMTrace.i(18316693340160L, 136470);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(18316693340160L, 136470);
  }
  
  public DebuggerInfo()
  {
    GMTrace.i(18316290686976L, 136467);
    GMTrace.o(18316290686976L, 136467);
  }
  
  public int describeContents()
  {
    GMTrace.i(18316424904704L, 136468);
    GMTrace.o(18316424904704L, 136468);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    GMTrace.i(18316559122432L, 136469);
    if (this.iLe)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      if (!this.iLf) {
        break label66;
      }
      paramInt = 1;
      label33:
      paramParcel.writeInt(paramInt);
      if (!this.iLg) {
        break label71;
      }
    }
    label66:
    label71:
    for (paramInt = i;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      GMTrace.o(18316559122432L, 136469);
      return;
      paramInt = 0;
      break;
      paramInt = 0;
      break label33;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/debugger/DebuggerInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */