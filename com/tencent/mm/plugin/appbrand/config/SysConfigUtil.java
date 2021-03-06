package com.tencent.mm.plugin.appbrand.config;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Pair;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.bls;
import com.tencent.mm.protocal.c.cq;
import com.tencent.mm.protocal.c.cw;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public enum SysConfigUtil
{
  static
  {
    GMTrace.i(10589241868288L, 78896);
    iJp = new SysConfigUtil[0];
    GMTrace.o(10589241868288L, 78896);
  }
  
  static String a(cw paramcw)
  {
    GMTrace.i(10588839215104L, 78893);
    if (paramcw == null)
    {
      GMTrace.o(10588839215104L, 78893);
      return "AppRunningFlagInfo{null}";
    }
    paramcw = "AppRunningFlagInfo{RunningFlag=" + paramcw.two + ", StopServiceTime" + paramcw.twp + ", AppForbiddenReason" + paramcw.twq + ", SessionOpenForbiddenReason" + paramcw.twr + ", TimelineOpenForbiddenReason" + paramcw.tws + "}";
    GMTrace.o(10588839215104L, 78893);
    return paramcw;
  }
  
  public static <L extends List<T>, T> L e(L paramL, List<T> paramList)
  {
    GMTrace.i(15539996983296L, 115782);
    if (paramList != null) {
      paramL.addAll(paramList);
    }
    GMTrace.o(15539996983296L, 115782);
    return paramL;
  }
  
  static cq g(JSONObject paramJSONObject)
  {
    GMTrace.i(15539862765568L, 115781);
    Object localObject = paramJSONObject.optJSONObject("AppConfig");
    paramJSONObject = new cq();
    if (localObject != null)
    {
      localObject = ((JSONObject)localObject).optJSONArray("VersionList");
      paramJSONObject.tvV = new LinkedList();
      if (localObject != null)
      {
        int i = 0;
        while (i < ((JSONArray)localObject).length())
        {
          JSONObject localJSONObject = ((JSONArray)localObject).optJSONObject(i);
          bls localbls = new bls();
          localbls.type = localJSONObject.optInt("type");
          localbls.version = localJSONObject.optInt("version");
          paramJSONObject.tvV.add(localbls);
          i += 1;
        }
      }
    }
    GMTrace.o(15539862765568L, 115781);
    return paramJSONObject;
  }
  
  private static final class StringPair
    extends Pair<String, String>
    implements Parcelable
  {
    public static final Parcelable.Creator<StringPair> CREATOR;
    
    static
    {
      GMTrace.i(15530735960064L, 115713);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(15530735960064L, 115713);
    }
    
    StringPair(Parcel paramParcel)
    {
      super(paramParcel.readString());
      GMTrace.i(15530601742336L, 115712);
      GMTrace.o(15530601742336L, 115712);
    }
    
    public final int describeContents()
    {
      GMTrace.i(15530333306880L, 115710);
      GMTrace.o(15530333306880L, 115710);
      return 0;
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(15530467524608L, 115711);
      paramParcel.writeString((String)this.first);
      paramParcel.writeString((String)this.second);
      GMTrace.o(15530467524608L, 115711);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/config/SysConfigUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */